package org.kodluyoruz;

public interface QueueInterface<T> {
    void add(T obj);
    T poll();
    T peek();

}
