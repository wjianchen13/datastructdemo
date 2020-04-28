package com.cold.datastruct.d3_queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * boolean add(E var1); // 增加一个元索 如果队列已满，则抛出一个IIIegaISlabEepeplian异常
 * boolean offer(E var1); // 添加一个元素并返回true 如果队列已满，则返回false
 * E remove(); // 移除并返回队列头部的元素 如果队列为空，则抛出一个NoSuchElementException异常
 * E poll(); // 移除并返问队列头部的元素 如果队列为空，则返回null
 * E element(); // 返回队列头部的元素 如果队列为空，则抛出一个NoSuchElementException异常
 * E peek(); // 返回队列头部的元素 如果队列为空，则返回null
 */
public class QueueTest {

    public static void main(String[] args) {
//        testNull();
        testQueue();
    }

    private static void testNull() {
        Queue<String> queue = new LinkedList<>();
        System.out.println(queue.poll());
    }

    private static void testQueue() {
        //add()和remove()方法在失败的时候会抛出异常(不推荐)
        Queue<String> queue = new LinkedList<>();
        //添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer(null);
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("====================");
        String p = queue.poll();
        System.out.println(p);
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("====================");
        String pe = queue.peek();
        System.out.println(pe);
        for(String q : queue){
            System.out.println(q);
        }
    }
}
