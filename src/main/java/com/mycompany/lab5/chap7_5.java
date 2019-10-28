package com.mycompany.lab5;



import java.util.Scanner;


public class chap7_5 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int size = 20;
        int[] array = new int[size];
        int counter = 0;
        System.out.println("Please enter an integer");
        int userNumber = keyboard.nextInt();
        
        while (counter <=19){
            array[counter] = 3*counter;
            counter++;
        }
        
            chap7_5.largerThan(array, userNumber);
        
  
}
  public static void largerThan (int[] array, int userNumber){
      int counter = 0;
     
      while (counter<=19){
          if(userNumber<array[counter]){
              System.out.println(array[counter]);
          }
      counter++;
  } 
  }
}
    

