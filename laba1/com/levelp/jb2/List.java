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


    public void add_after_node (int n, int data) //добавление после конкретного узла
    {
        Node p = new Node(data);
        if (n == 0)
        {
            p.next = list;
            list = p;
        }
        else {
            Node tmp = list;
            for (int i = 0; i < n - 1; i++) {
                tmp = tmp.next;
            }
            p.next = tmp.next;
            tmp.next = p;
        }
    }


    public int delete_node (int n) //удаление конкретного элемента
    {
        Node tmp = list;
        int res;
        if(n==1)
        {
            res = list.data;
            list = tmp.next;
            tmp.next= null;
        }
        else {
            for (int i = 0; i < n - 2; i++) {
                tmp = tmp.next;
            }
            res = tmp.data;
            Node tmp2 = tmp.next;
            tmp.next = tmp2.next;
            tmp2.next = null;
        }

        return res;
    }

    public int get (int n) //извлечение конкретного элемента
    {
        Node tmp = list;
        for (int i = 0; i < n-1; i++)
        {
            tmp = tmp.next;
        }
        //int x = tmp.data;
        return tmp.data;
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
