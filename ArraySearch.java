package com.datastructures.Arrays;

public class ArraySearch {

    int[] array ={1,2,3,4,5,6,7,8,9};

    void arraySearch(int value){
        for(int index=0;index<array.length;index++){
            if(value==array[index]){
                System.out.println("The value is "+array[index]+" at index "+index);
            }

        }
    }

    public static void main(String[] arg){
        ArraySearch as = new ArraySearch();
        as.arraySearch(9);
    }
}
