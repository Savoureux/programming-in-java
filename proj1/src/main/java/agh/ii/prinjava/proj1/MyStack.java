package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;


/**
 * interface, they have method,
 * @param, <E>, type of element
 */

public interface MyStack<E> {
    /**
     * remove a element at the top of the stack
     * @return
     */
    E pop();

    /**
     * place a new element at the top of the stack
     * @param x, the element
     */
    void push(E x);

    /**
     * default method, test if the stack is empty or not, the methode isEmpty check if the stack is empty
     * @return rather true or false, true if the stack is empty , false if the stack is not empty
     */

    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    int numOfElems();
    /**
     * peek, watch what is value at the top of the stack
     * @return the value at the top of the stack thanks to peek
     */
    E peek();


    /** Consider pros and cons of having a factory method in the interface */
    /**
     *
     * @param <T>, type of MyQueue
     * @return MyStackeDLLBImpl, new instance of MyStack, creat a new pile
     */
    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        final MyStackDLLBImpl<T> tMyStackDLLB = new MyStackDLLBImpl<>();
        return tMyStackDLLB;
    }
}
