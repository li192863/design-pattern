package com.pattern.behavioral_patterns.observer;

import java.util.Vector;

/**
 * 观察者（Observer）
 * *定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。*
 * * 特点
 *   * 观察者模式，又称发布-订阅模式，是一种一对多的通知机制，使得双方无需关心对方，只关心通知本身。
 * @author: Chestnut
 * @since: 2023-07-01
 **/

/**
 * 可观察对象
 **/
public class Observable {
    private boolean changed = false;
    private Vector<Observer> obs;

    /**
     * 创建一个拥有0个观察者的可观察对象
     */
    public Observable() {
        obs = new Vector<>();
    }

    /**
     * 向此对象的观察者集合中添加观察者，前提是它与集合中已有的某个观察者不相同。
     * 不指定将通知发送到多个观察者的顺序。请参阅类注释。
     *
     * @param o 要添加的观察者
     * @throws NullPointerException 如果参数 o 为 null
     */
    public synchronized void addObserver(Observer o) {
        if (o == null) throw new NullPointerException();
        if (!obs.contains(o)) {
            obs.addElement(o);
        }
    }

    /**
     * 从此对象的观察者集合中删除一个观察者
     * 将 <CODE>null</CODE> 传递给此方法将不产生任何效果
     *
     * @param o 要删除的观察者
     */
    public synchronized void deleteObserver(Observer o) {
        obs.removeElement(o);
    }

    /**
     * 如果此对象已更改，如<code>hasChanged</code>方法所示，
     * 则通知其所有观察者，然后调用<code>clearChanged</code>方法，
     * 表示此对象不再更改。
     * <p>
     * 每个观察者的<code>update</code>方法将被调用，传递两个参数：
     * 此可观察对象和<code>null</code>。换句话说，此方法相当于：
     * <blockquote><tt>
     * notifyObservers(null)</tt></blockquote>
     *
     * @see java.util.Observable#hasChanged()
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    public void notifyObservers() {
        notifyObservers(null);
    }

    /**
     * 如果此对象已更改，如<code>hasChanged</code>方法所示，
     * 则通知其所有观察者，然后调用<code>clearChanged</code>方法，
     * 表示此对象不再更改。
     * <p>
     * 每个观察者的<code>update</code>方法将被调用，传递两个参数：
     * 此可观察对象和<code>arg</code>参数。
     *
     * @param arg 任意对象
     * @see java.util.Observable#hasChanged()
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    public void notifyObservers(Object arg) {
        /*
         * a temporary array buffer, used as a snapshot of the state of
         * current Observers.
         */
        Object[] arrLocal;

        synchronized (this) {
            /* We don't want the Observer doing callbacks into
             * arbitrary code while holding its own Monitor.
             * The code where we extract each Observable from
             * the Vector and store the state of the Observer
             * needs synchronization, but notifying observers
             * does not (should not).  The worst result of any
             * potential race-condition here is that:
             * 1) a newly-added Observer will miss a
             *   notification in progress
             * 2) a recently unregistered Observer will be
             *   wrongly notified when it doesn't care
             */
            if (!changed) return;
            arrLocal = obs.toArray();
            clearChanged();
        }

        for (int i = arrLocal.length - 1; i >= 0; i--)
            ((Observer) arrLocal[i]).update(this, arg);
    }

    /**
     * 清除观察者列表，使此对象不再具有任何观察者
     */
    public synchronized void deleteObservers() {
        obs.removeAllElements();
    }

    /**
     * 将此<tt>Observable</tt>对象标记为已更改；<tt>hasChanged</tt>方法现在将返回<tt>true</tt>。
     */
    protected synchronized void setChanged() {
        changed = true;
    }

    /**
     * 表示此对象不再更改，或者它已经通知了所有观察者其最近的更改，
     * 因此<tt>hasChanged</tt>方法现在将返回<tt>false</tt>。
     * 此方法由<code>notifyObservers</code>方法自动调用。
     *
     * @see java.util.Observable#notifyObservers()
     * @see java.util.Observable#notifyObservers(java.lang.Object)
     */
    protected synchronized void clearChanged() {
        changed = false;
    }

    /**
     * 测试此对象是否已更改
     *
     * @return <code>true</code> 当且仅当在此对象上最近调用<code>setChanged</code>方法而不是<code>clearChanged</code>方法时
     * 否则返回<code>false</code>
     */
    public synchronized boolean hasChanged() {
        return changed;
    }

    /**
     * 返回此<tt>Observable</tt>对象的观察者数量
     *
     * @return 此对象的观察者数量
     */
    public synchronized int countObservers() {
        return obs.size();
    }
}
