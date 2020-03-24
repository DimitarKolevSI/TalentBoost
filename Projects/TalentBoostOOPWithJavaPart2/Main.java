package com.company;

public class Main {
    public static void main(String[] args) {
        MyArrayList arr = new MyArrayList();
        System.out.println(arr.size());
        arr.put(0,5);;
        arr.put(1,10);
        arr.put(2,15);
        arr.add(20);
        System.out.println(arr.size());
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));
        System.out.println(arr.get(3));
        MyLinkedList list = new MyLinkedList();
        System.out.println(list.size());
        list.put(0,5);;
        list.put(1,10);
        list.put(2,15);
        list.add(20);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }
}
