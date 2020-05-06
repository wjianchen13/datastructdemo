package com.cold.datastruct.d4_linkedlist.linkedliststack;

public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
