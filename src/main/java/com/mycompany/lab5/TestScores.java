/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

/**
 *
 * @author Deric
 */
public class TestScores {
    private int size;
    private double[] array;

    
    public TestScores (double[] array, int size){
      this.size = size; 
      int counter = 0;
      while (counter < size){
          if (array[counter]>100 | array[counter]<0){
              throw new IllegalArgumentException("This is not a valid test score");
          }
          counter++;
      }
      counter = 0;
      while (counter < size){
          this.array[counter] = array[counter];
          counter++;
      }
      
    }
    
    public double getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        
        this.array = array;
    }
    
    public double testScoreAverage(){
        double scoreTotal = 0;
        int counter = 0;
        while (counter<size){
            scoreTotal = this.array[counter] + scoreTotal;
            counter++;
        }
        double scoreAverage = scoreTotal/(size+1);
        return scoreAverage;
        
    }
    
    
    
    
}
