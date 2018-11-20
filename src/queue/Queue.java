/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author duminda
 */
public interface Queue<E> {

    public void enqueue(E e);

    public E dequeue();

    public E[] getQueue(Class<E> element);

    public boolean isEmpty();

    public boolean isFull();

    public int size();
}
