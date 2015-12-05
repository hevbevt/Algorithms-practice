package com.company.UnionFind;

/**
 * Created by Duan on 2015/12/3.
 */
public class QuickFindUF extends UF {

    public QuickFindUF(int N) {
        super(N);
    }
    @Override
    public int find(int p) {
        return super.id[p];
    }

    @Override
    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);

        if (pID == qID) return;

        for (int i = 0; i < id.length; i++) {
            if (super.id[i] == pID) super.id[i] = qID;
        }
        count--;
    }
}
