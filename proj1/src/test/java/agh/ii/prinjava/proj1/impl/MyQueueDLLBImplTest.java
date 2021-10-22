package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Queue
 */
class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    /**
     * Add number in queue
     */
    @Test
    void enqueue(){
        queueOfInts.enqueue(10);
        queueOfInts.enqueue(10);
        queueOfInts.enqueue(30);
        queueOfInts.enqueue(20);
        queueOfInts.enqueue(5);
        System.out.println("Queue: " + queueOfInts);
    }

    @Test
    public void dequeue() {
    }
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
}