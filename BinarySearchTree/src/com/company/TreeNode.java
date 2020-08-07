package com.company;

public class TreeNode {
    private int data;
    private TreeNode LeftChild;
    private  TreeNode RightChild;


    public void insert(int value){
        if(value==data){
            return;
        }
        if(value<data){
            if(LeftChild==null){
                LeftChild=new TreeNode(value);
            }
            else{
                LeftChild.insert(value);
            }
        }
        else {
            if(RightChild==null){
                RightChild=new TreeNode(value);
            }
            else{
                RightChild.insert(value);
            }
        }
    }

    public void traverseInOrder(){
        if(LeftChild!=null){
            LeftChild.traverseInOrder();
        }
        System.out.print("Data = "+ data+ " , " );
        if(RightChild!=null){
            RightChild.traverseInOrder();
        }
    }
    public TreeNode get(int value){
        if(value==data){
            return this;
        }
        if(value<data){
            if(LeftChild!=null){
                return LeftChild.get(value);
            }
        }
        else{
            if(RightChild!=null){
                return RightChild.get(value);
            }
        }

        return null;
    }
  public String toString(){
        return "Data =" + data;
  }
  public int max(){
        if(RightChild==null){
            return data;
        }
        else{
            return RightChild.max();
        }
  }
    public int min(){
        if(LeftChild==null){
            return data;
        }
        else{
            return LeftChild.min();
        }
    }




    public TreeNode(int data){
        this.data = data;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return LeftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        LeftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return RightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        RightChild = rightChild;
    }
}
