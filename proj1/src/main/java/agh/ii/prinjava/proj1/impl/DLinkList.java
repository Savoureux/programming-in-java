package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    private Node<E> head;


    /**
     * Structure of Node
     * @param <T>, type of element
     */
    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        public Node(T elem, Node<T> next, Node<T> prev) {
            this.elem = elem;
            this.next = next;
            this.prev = prev;
        }
    }

    /**
     * place element at the front of the DLinkList
     * @param e which is the element that will be inserted
     */
    public void addFirst(E e) {
        Node<E> first = new Node<>(e,null,null);
        first.elem = e;
        if (head == null) head = first;
        else {
            first.next = head;
            head.prev = first;
            first.prev = null;
            head = first;
        }
    }
    /**
     * place element at the end of the DLinkList (or doubly linked list)
     * @param e which is the element that will be inserted
     */
    public void addLast(E e) {
        Node<E> last = new Node<>(e, null, null);
        last.elem = e;
        if (head == null) {
            head = last;
        }
        else {
            Node<E> lastCurrent = head;
            while (lastCurrent.next != null) {lastCurrent = lastCurrent.next;}
            lastCurrent.next = last;
            last.prev = lastCurrent;
        }
    }

    /**
     * remove first element of DLinkList (or doubly linked list)
     * @return the element at the front of the list
     */
    public E removeFirst() {
        Node<E> removefirst = head;
        if (head == null || head.next == null) {
            head = null;
            return removefirst.elem;
        }
        head = head.next;
        removefirst.prev = null;
        return removefirst.elem;
    }

    /**
     * removes last element of the DLinkList (or doubly linked list)
     * @return the element at the end of the list
     */
    public E removeLast() {
        Node<E> removelast = head;
        if (head == null || head.next == null) {
            head = null;
            return removelast.elem;
        }
        while (removelast.next != null) {removelast = removelast.next;}
        removelast.prev.next = null;
        return removelast.elem;
    }

    /**
     *with this method, we can represent an object as string with StringBuilder (component of Java)
     * @return head element as a string
     */
    @Override
    public String toString() {
        StringBuilder changeString = new StringBuilder();
        Node<E> elemcurr = head;
        changeString.append("[");
        while (elemcurr != null) {
            changeString.append(elemcurr.elem).append(",");
            elemcurr = elemcurr.next;
        }
        if (changeString.length() > 1) {
            changeString.deleteCharAt(changeString.length()-1);
        }
        changeString.append("]");
        return changeString.toString();
    }
}
