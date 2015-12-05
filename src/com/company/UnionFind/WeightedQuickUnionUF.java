package com.company.UnionFind;

/**
 * Created by Duan on 2015/12/3.
 */
public class WeightedQuickUnionUF extends UF {

    private int[] sz;

    public WeightedQuickUnionUF(int N) {
        super(N);
        sz = new int[N];
        for (int i = 0; i < N; i++) sz[i] = 1;
    }
    @Override
    public int find(int p) {
        while (p != super.id[p]) p = super.id[p];
        return p;
    }

    @Override
    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);

        if (i == j) return;

        if (sz[i] < sz[j]) {super.id[i] = j;sz[j] += sz[i];}
        else {super.id[j] = i;sz[i] += sz[j];}
        count--;
    }
}
