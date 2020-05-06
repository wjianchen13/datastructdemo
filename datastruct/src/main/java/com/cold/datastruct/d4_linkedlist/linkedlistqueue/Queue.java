package com.cold.datastruct.d4_linkedlist.linkedlistqueue;

public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
