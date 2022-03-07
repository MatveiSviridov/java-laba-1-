package com.levelp.jb2;

public class Container {
    public static void main(String[] args)
    {
        List list = new List();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.print();
        System.out.println("------------");
        list.delete(30);
        list.print();
    }
}
