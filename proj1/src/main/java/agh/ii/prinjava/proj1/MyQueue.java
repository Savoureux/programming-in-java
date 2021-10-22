package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/**
 * interface, they have method,
 * @param, <E>, type of element
 */
public interface MyQueue<E> {
    /**
     * place the first element at the end of the queue
     * @param x, the element
     */
    void enqueue(E x);

    /**
     * remove the first element at the front of the queue
     * @return <E>
     */
    E dequeue();

    /**
     * default method,the methode isEmpty check if the q is empty, it is a test
     * @return rather true or false, true if the queue is empty , false if the queue is not empty
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    int numOfElems();

    /**
     * peek, watch what is value at the first of the queue
     * @return the value at the first of the queue thanks to peek, first in first out
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    /**
     *
     * @param <T>, type of MyQueue
     * @return the queue, create a new queue, return a new instance of MyQueue
     */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
