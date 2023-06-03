package org.example;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
    private T value;//the value of the node

    private boolean hasParent; //is not the root

    private List<TreeNode<T>> children;

    public TreeNode(T value) {
        if(value == null){
            throw new IllegalArgumentException("Cannot insert null value!");
        }
        this.value = value;
        this.children = new ArrayList<>();
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int getChildrenCount(){
        return this.children.size();
    }

    public void addChild(TreeNode<T> child){
        if(child == null){
            throw new IllegalArgumentException("Cannot insert null value!");
        }

        if(child.hasParent){
            throw new IllegalArgumentException("The node already has a parent!");
        }

        child.hasParent = true;
        this.children.add(child);
    }

    public TreeNode<T> getChild(int index){
        return this.children.get(index);
    }
}
