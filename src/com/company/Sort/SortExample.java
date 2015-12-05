package com.company.Sort;

/**
 * Created by Duan on 2015/12/3.
 */
public class SortExample {
    public static void sort(Comparable[] a){}
    protected static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    protected static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    private static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    public static boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }
}
