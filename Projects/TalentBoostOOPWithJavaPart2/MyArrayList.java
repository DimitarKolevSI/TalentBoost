package com.company;

import java.util.ArrayList;

public class MyArrayList implements List {
    private int[] array;
    public MyArrayList()
    {
        array = new int[0];
    }

    @Override
    public Integer get(int index) {
        if(index<0||index>array.length-1) return -1;
        return array[index];
    }

    @Override
    public void put(int index, Integer value) {
        int []newArray = new int[1];
        if(index<0||index>=array.length+1) return;
        if(index>=array.length) {
            newArray = new int[array.length + 1];
            for (int i = 0; i < index; i++) newArray[i] = array[i];
            newArray[index] = value;
            for (int i = index; i < array.length; i++) newArray[i + 1] = array[i];
            array = newArray;
        }
    }

    @Override
    public void add(Integer value) {
        put(array.length,value);
    }

    @Override
    public int size() {
        return array.length;
    }
}
