package com.company;
import java.io.*;
import java.util.*;
import com.company.MyStack;
import com.company.MyQueue;
import com.company.MyList;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyStack test = new MyStack();
        test.push(1);
        test.push(2);
        test.push(3);
        System.out.println(test.peek());
        System.out.println(test.pop());
        System.out.println(test.peek());
        System.out.println(test.pop());
        System.out.println(test.peek());
        System.out.println(test.pop());
        MyQueue test1 = new MyQueue();
        test1.enqueue(1);
        test1.enqueue(2);
        test1.enqueue(3);
        System.out.println(test1.peek());
        System.out.println(test1.dequeue());
        System.out.println(test1.peek());
        System.out.println(test1.dequeue());
        System.out.println(test1.peek());
        System.out.println(test1.dequeue());
    }
}