package com.levelp.jb2;

public class Container {
    public static void main(String[] args)
    {
        List list = new List();

        list.add_after_node(0,1);
        list.add_after_node(0,2);
        list.add_after_node(0,3);
        list.add_after_node(0,4);
        list.print();
        System.out.println("------------");
        //list.delete(30);
        list.delete_node(4);
        list.print();
        System.out.println("------------");
        list.add_after_node(0,50);
        list.print();
    }
}
