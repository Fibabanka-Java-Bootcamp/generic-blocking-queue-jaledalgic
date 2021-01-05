package org.kodluyoruz;

public class Node<T>{
    T obj;
    private Node<T> next;
    public Node(T obj) {
        this.obj = obj;
    }
    public Node(T obj, Node<T> next) {
        this.obj = obj;
        this.next = next;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
