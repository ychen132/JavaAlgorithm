package com.company;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[7];
        intArray[0]=20;//start address 0f array = 12, element size of 4
        intArray[1]=35;//12
        intArray[2]=-15;//12+1*4
        intArray[3]=7;//12+2*4
        intArray[4]=55;
        intArray[5]=1;
        intArray[6]=-22;
        for(int num:intArray){
            System.out.println(num);
        }
        //Contiguous block in memory
        //Every element occupies the same amount of space in memory
        //Retrieve element from array: Address formula = x+ i *y (i = element size, y is the index)
        //Constant time complexity :3 Steps constant

        int index = -1;
        for(int i =0; i<intArray.length;i++){
            if (intArray[i]==7){
                index = i;
                break;
            }
            System.out.println(index);
        }

        //find element in the array without knowing the position
        //retrieve becomes O(n)--linear time
        //Add an element to the full array---O(n)
        //Add an element to the array(still have space) ---O(1)
        //insert or update an element at a specific index ---O(1)
        //Delete an element by setting it to null ---O(1)
        //Delete an element by shifting elements ---O(n)


    }
}