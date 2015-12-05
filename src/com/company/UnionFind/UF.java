package com.company.UnionFind;

/**
 * Created by Duan on 2015/12/3.
 */
public class UF {
    protected int[] id;
    protected int count;
    public UF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }
    public int count() {
        return count;
    }
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
    public int find(int p) {
        return p;
    }
    public void union(int p, int q) {
    }
}
