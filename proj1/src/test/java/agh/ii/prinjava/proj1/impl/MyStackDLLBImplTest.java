package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test class for stack
 */
class MyStackDLLBImplTest<stackOfInts> {
    MyStack<Integer> stackOfInts = MyStack.create();

    /**
     * Add number in stack
     */
    @Test
    void push(){
        stackOfInts.push(10);
        stackOfInts.push(10);
        stackOfInts.push(30);
        stackOfInts.push(20);
        stackOfInts.push(5);
        System.out.println("Stack: " + stackOfInts);
    }

    @BeforeEach
    void setUp() {}

    @AfterEach
    void tearDown() {}
}