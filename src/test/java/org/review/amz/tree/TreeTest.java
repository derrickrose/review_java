package org.review.amz.tree;

import org.junit.Test;
import org.review.amz.algo.trees.Tree;


public class TreeTest {

    @Test
    public void addValueOnTree() {
        Tree G = new Tree("G");
        Tree H = new Tree("H");
        Tree I = new Tree("I");
        Tree F = new Tree("F");
        F.getChilds().add(G);
        F.getChilds().add(H);
        F.getChilds().add(I);

        Tree D = new Tree("D");
        Tree E = new Tree("E");
        Tree B = new Tree("B");
        B.getChilds().add(D);
        B.getChilds().add(E);

        Tree C = new Tree("C");
        C.getChilds().add(F);

        Tree A = new Tree("A");
        A.getChilds().add(B);
        A.getChilds().add(C);
        System.out.println(A.size());
        System.out.println(A.height());
        System.out.println(A.getAllValues());
    }
}
