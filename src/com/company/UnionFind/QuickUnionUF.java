package com.company.UnionFind;

/**
 * Created by Duan on 2015/12/3.
 */
public class QuickUnionUF extends UF {

    public QuickUnionUF(int N) {
        super(N);
    }
    @Override
    public int find(int p) {
        while (p != super.id[p]) p = super.id[p];
        return p;
    }

    @Override
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);

        if (pRoot == qRoot) return;

        id[pRoot] = qRoot;

        count--;
    }
}
