package com.company.DataStruct;

import java.util.Iterator;

/**
 * Created by Duan on 2015/12/3.
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] a = (Item[]) new Object[1];
    private int N = 0;
    public boolean isEmpty() {return N == 0;}
    public int size() {return N;}
    //将栈移动到大小为max的新数组。
    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = a[i];
        a = temp;
    }
    public void push(Item item) {
        if (N == a.length) resize(2 * a.length);
        a[N++] = item;
    }
    public Item pop() {
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) resize(a.length / 2);
        return item;
    }
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }
    //支持后进先出的迭代
    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;
        public boolean hasNext() {
            return  i > 0;
        }
        public  Item next() {
            return a[--i];
        }
        public void remove() {
        }
    }
}
