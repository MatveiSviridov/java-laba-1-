package com.levelp.jb2;

public class List {
    private Node list;

    public List ()
    {
        list = null;
    }

    private boolean IsEmpty()
    {
       return list == null;
    }

    public void add (int data)
    {
        Node tmp = new Node(data);
        tmp.next = list;
        list = tmp;
    }

    public int delete (int data)
    {
        Node tmp = list;
        list = list.next;
        int elem = tmp.data;
        tmp.next = null;
        return elem;
    }

    public void print()
    {
        Node tmp = list;
        while(tmp != null)
        {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
}
