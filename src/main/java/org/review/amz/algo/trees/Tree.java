package org.review.amz.algo.trees;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
public class Tree {
    private String name;
    private int value;
    private List<Tree> childs = new ArrayList<>();

    public Tree(String name) {
        this.name = name;
    }

    public int size() {
        int size = 1;
        for (Tree child : childs) {
            size += child.size();
        }
        return size;
    }

    public int height() {
        int maxChildHeight = 0;
        int currentChildHeight = 0;
        for (Tree child : childs) {
            currentChildHeight = child.height();
            if (currentChildHeight > maxChildHeight) {
                maxChildHeight = currentChildHeight;
            }
        }
        return maxChildHeight + 1;
    }

    public List<String> getAllValues() {
        List<String> all = new ArrayList<>();
        all.add(name);
        for (Tree tree : childs) {
            all.addAll(tree.getAllValues());
        }
        return all;
    }
}
