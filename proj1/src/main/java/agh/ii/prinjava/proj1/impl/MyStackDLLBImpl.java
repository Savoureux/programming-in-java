package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems;
    private int numOfelems;

    public MyStackDLLBImpl() {
        this.elems = new DLinkList<>();
        this.numOfelems = 0;
    }
    /**
     * remove a element at the top of the stack
     * @return
     */
    @Override
    public E pop() {
        if(!isEmpty()){
            E elemsup = peek();
            elems.removeLast();
            numOfelems--;
            return elemsup;
        }
        return null;
    }

    /**
     * place a new element at the top of the stack
     * @param x, the element
     */
    @Override
    public void push(E x) {
        elems.addFirst(x);
        numOfelems++;
    }


    /**
     *
     * @return numOfelems, which is the size of the stack
     */
    @Override
    public int numOfElems() {return numOfelems;}

    /**
     * peek, watch what is value at the top of the stack
     * @return the value at the top of the stack thanks to peek
     */
    @Override
    public E peek() {throw new IllegalStateException("To be implemented");}

    @Override
    public String toString() {
        return "MyStackDLLBImpl{" +
                "elems=" + elems +
                ", numOfelems=" + numOfelems +
                '}';
    }
}
