package com.sxj.basics.data.queue;

/**
 * @author : sxj
 * create at:  2019-02-16  17:08
 * @description: 测试单队列
 */
public class Client {
    public static void main(String[] args) {
        testSingleQueue();
    }

    /**
    * create by sxj at 2019-02-16 17:26
    * description: 测试单队列的假溢出
    *     队列：FIFO，尾部添加，头部删除
    */
    private static void testSingleQueue(){
        SingleQueue queue = new SingleQueue();
        queue.printQueue();
        System.out.println("--进队5个数字----");
        for (int i = 0; i <5 ; i++) {
            queue.enQueue(i);
        }
        queue.printQueue();
        System.out.println("---出队6次------");
        for (int i = 0; i <6 ; i++) {
            queue.deQueue();
        }
        queue.printQueue();

        System.out.println("--进队2个数字----");
        for (int i = 10; i < 12 ; i++) {
            queue.enQueue(i);
        }
        queue.printQueue();
    }
}




