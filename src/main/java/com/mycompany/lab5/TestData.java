
package com.mycompany.lab5;

public class TestData {
    public static void main(String[] args) {
        
        int size = 20;
        int[] array = new int[size];
        int counter = 0;
        int arrayNumber = 1;
        
        while (counter <= 19){
            arrayNumber = (counter+1) * 5;
            array[counter] = arrayNumber;
            counter++;
           }
        double totalOfArray = TestData.getTotal(array);
        double averageOfArray = TestData.getAverage(array, totalOfArray);
        int highestNumber = TestData.getHighest(array);
        int lowestNumber = TestData.getLowest(array, highestNumber);
        
        System.out.println("The total of all numbers in the array is: " + totalOfArray);
        System.out.println("The average of the numbers in the array is: " + averageOfArray);
        System.out.println("The highest number in the array is: " + highestNumber);
        System.out.println("The lowest number in the array is: " + lowestNumber);
        
    }
    public static double getTotal (int[] array){
        int counter = 0;
        double runningTotal = 0;
        int currentNumber;
        while (counter<=19){
           currentNumber = array[counter];  
           runningTotal = runningTotal+currentNumber;
            counter++;
        }
        return runningTotal;
    }
    public static double getAverage (int[] array, double totalOfArray){
        double size = array.length;
        double averageOfArray = totalOfArray/size;
        return averageOfArray;
    }
    public static int getHighest (int[] array){
        int counter = 0;
        int currentHighest = 0;
        while(counter <=19){
            if (array[counter]>currentHighest){
                currentHighest = array[counter];
            }
            counter++;
        }
        return currentHighest;
    }
    public static int getLowest(int[] array, int highestNumber){
        int counter = 0;
        int currentLowest = highestNumber;
        while(counter <=19){
            if (array[counter]<currentLowest){
                currentLowest = array[counter];
            }
            counter++;
        }
        return currentLowest;
    }
}
