package com.company;

import java.util.ArrayList;

public class MyQueue implements MyList{
    private ArrayList<Integer> list;
    public MyQueue()
    {
        list = new ArrayList<Integer>();
    }
    public MyQueue(int size)
    {
        list = new ArrayList<Integer>(size);
    }
    public void enqueue(int newElement)
    {
        list.add(newElement);
    }
    public int dequeue()
    {
        if(list.size()==0) return -1;
        int temp = list.get(0);
        list.remove(0);
        return temp;
    }
    @Override
    public int peek()
    {
        if(list.size()==0) return -1;
        return list.get(0);
    }
}
