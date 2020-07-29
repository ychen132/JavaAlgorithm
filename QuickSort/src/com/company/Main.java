package com.company;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        QuickSort(intArray,0,intArray.length);

        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
    public static void QuickSort(int[] input, int start, int end){
        if(end -start<2){
            return;
        }
        int pivotIndex =partition(input,start,end);
        QuickSort(input,start,pivotIndex);
        QuickSort(input,pivotIndex+1,end);
    }
    public static int partition(int[] input, int start, int end){
        //this is using the first element
        int pivot = input[start];
        int i = start;
        int j = end;
        while(i<j){
            //empty loop body;
            while(i<j && input[--j]>= pivot);
            if(i<j){
                input[i]=input[j];
            }
            while(i<j &&input[++i]<=pivot);
                input[j]=input[i];

        }
        input[j]=pivot;
        return j;
    }

}
