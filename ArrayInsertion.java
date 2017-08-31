package com.datastructures.Arrays;

import java.util.Scanner;

public class ArrayInsertion {
   //int size=5;
   int[] array = {1,2,4,5,6};
  // int[] array = new int[size]; // declaring an array

   void print(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }


    void insertValue(int position, int value){
       int sizenew = array.length*2;
       int temparray[] = new int[sizenew];
        //System.out.println(temparray);
        for(int i=0;i<array.length;i++){
            temparray[i]=array[i];
        }

        int index= sizenew-1; //4
        while(index>position){// position = 2
            temparray[index]=temparray[index-1];
            index--;
        }
        temparray[position]=value;
        System.out.println();
        for(int i = 0;i<sizenew;i++){
            System.out.print(temparray[i]+" ");
        }



   }
    public static void main(String[] arg){
        ArrayInsertion ai = new ArrayInsertion();
        ai.print();
        ai.insertValue(2,3);

    }
}


