package org.example.model;

// https://leetcode.com/problems/implement-stack-using-queues/

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue1;

    public MyStack() {
        this.queue1 = new LinkedList<>();
    }
    
    public void push(int x) {
        Queue<Integer> tempQueue = new LinkedList<>();
        tempQueue.add(x);
        while (!queue1.isEmpty()) {
            tempQueue.add(queue1.poll());
        }
        queue1 = tempQueue;
    }
    
    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */


// first solution - faster
/*
public class MyStack {
    Queue<Integer> queue;

    public MyStack() {
        this.queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        List<Integer> list = (List<Integer>) queue;
        int lastElement = (int) ((List<?>) queue).get(queue.size() - 1);
        ((List<?>) queue).remove(queue.size() - 1);
        return lastElement;
    }

    public int top() {
        List<Integer> list = (List<Integer>) queue;
        return (int) ((List<?>) queue).get(queue.size() - 1);
    }

    public boolean empty() {
        return queue.isEmpty();
    }

//    public void printStack(){
//        System.out.println(queue);
//    }

}
 */