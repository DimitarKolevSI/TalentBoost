package com.company;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack implements MyList {
    private ArrayList<Integer> list;
    public MyStack()
    {
        this.list = new ArrayList();
    }
    public MyStack(int size)
    {
        this.list = new ArrayList(size);
    }
    public void push (int newElement)
    {
        list.add(newElement);
    }
    @Override
    public int peek()
    {
        if(list.size()==0)
        {
            try{
                throw new EmptyStackException();
            }
            catch(EmptyStackException e){
                System.out.println("The stack is empty!");
            }
            finally {
                return -1;
            }
        }
        return list.get(list.size()-1);
    }
    public int pop()
    {
        if(list.size()==0) return -1;
        int temp = list.get(list.size()-1);
        list.remove(list.size()-1);
        return temp;
    }
    public int size()
    {
        return list.size();
    }
}
