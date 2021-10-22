package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();
    /**
     * the list that is expected is: [1;2;3]
     * @throws Exception
     */
    @Test
    public void addFirst() throws Exception {
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);
        System.out.println("Doubly LinkedList elements are:");
    }



    /**
     * the list that is expected is: [4;5;6]
     * @throws Exception
     */
    @Test
    public void addLast() throws Exception {
        dLinkList.addLast(4);
        dLinkList.addLast(5);
        dLinkList.addLast(6);
        System.out.println("Doubly LinkedList elements are:\n");
    }

    /**
     * expect [1];
     * @throws Exception
     */
    @Test
    public void removeFirst() throws Exception {
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);
        dLinkList.removeFirst();
        dLinkList.removeFirst();
        System.out.println("Doubly LinkedList elements are:\n");
    }

    /**
     * expect [3]
     * @throws Exception
     */
    @Test
    public void removeLast() throws Exception {
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);
        dLinkList.removeLast();
        dLinkList.removeLast();
        System.out.println("Doubly LinkedList elements are:\n");
    }


    /**
     * expect "3"
     * @throws Exception
     */
    @Test
    public void testToString() throws Exception {
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);
        dLinkList.removeLast();
        dLinkList.removeLast();
        System.out.println("Doubly LinkedList elements are:\n");
    }

    @BeforeEach
    void setUp() {}

    @AfterEach
    void tearDown() {}
}