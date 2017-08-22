// Print Simple Array Sum 

import java.io.*;

class SumOfArray
{
    int sum=0;
    int[] array = {1,2,3,4,10,11};
    
    void sumOfArray()
    {
        for(int i =0; i<array.length;i++)
        {
            sum += array[i];
        }
        System.out.println(sum);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        SumOfArray soa = new SumOfArray();
        soa.sumOfArray();
    }
}


//Output = 31