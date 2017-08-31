package com.datastructures.Arrays;

public class ArrayDeletion {

    int[] array = {1,2,3,4,5,6};
    int size=6;

    void delete(int index){

        for(int i = index;i<size;i++){
            array[i]=array[i+1];
            size--;
        }



        for(int i=0;i<array.length-1;i++){
            System.out.print(array[i]+" ");
        }

    }

    public static void main(String arg[]){
        ArrayDeletion ad = new ArrayDeletion();
        ad.delete(3);
    }



}
