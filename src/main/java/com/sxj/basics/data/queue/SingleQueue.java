package com.sxj.basics.data.queue;

/**
 * @author : sxj
 * create at:  2019-02-16  17:22
 * @description: 单队列
 */
public class SingleQueue {
    private int[] data;
    private int front;
    private int rear;

    public SingleQueue(){
        data = new int[5];
        front = rear = 0;
    }

    //入队
    public void enQueue(int num){
        data[rear] = num;
        if (rear < (data.length-1)){
            rear++;
        }

    }

    //出队
    public int deQueue(){
        if (front < data.length){
            return data[front++];
        }
        return 0;
    }

    //打印队中队数据
    public void printQueue(){
        int tmp = front;
        while (tmp <= rear){
            System.out.println(data[tmp++]);
        }
    }
}

