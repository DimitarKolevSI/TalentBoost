package com.company;

import java.util.LinkedList;

public class MyLinkedList implements List{
    class Node
    {
        Node next;
        int value;
    }
    private LinkedList list;
    MyLinkedList()
    {
        list = new LinkedList();
    }

    @Override
    public Integer get(int index) {
        return (Integer)list.get(index);
    }

    @Override
    public void put(int index, Integer value) {
        list.add(index,value);
    }

    @Override
    public void add(Integer value) {
        list.add(value);
    }

    @Override
    public int size() {
        return list.size();
    }


}
