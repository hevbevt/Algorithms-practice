package com.company.Sort;

/**
 * Created by Duan on 2015/12/3.
 */
public class Insertion extends SortExample {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1;i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
                exch(a, j , j-1);
        }
    }
}
