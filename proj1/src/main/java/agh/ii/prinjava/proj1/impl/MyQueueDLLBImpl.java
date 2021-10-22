package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems;
    private int numOfelems;

    public MyQueueDLLBImpl() {
        this.elems = new DLinkList<>();
        this.numOfelems = 0;
    }

    /**
     * place the first element at the end of the queue
     * @param x, the element
     */
    public void enqueue(E x) {
        elems.addLast(x);
        numOfelems++;
    }

    /**
     * remove the first element at the front of the queue
     * @return <E>
     */
    public E dequeue() {
        if(!isEmpty()){
            E elemsup = peek();
            elems.removeFirst();
            numOfelems--;
            return elemsup;
        }
        return null;
    }

    /**
     *
     * @return int, which is the length of the queue
     */
    public int numOfElems() {
        return numOfelems;
    }

    /**
     * peek, watch what is value at the first of the queue
     * @return the value at the first of the queue thanks to peek, first in first out
     */
    public E peek() {
        throw new IllegalStateException("To be implemented");
    }
}
