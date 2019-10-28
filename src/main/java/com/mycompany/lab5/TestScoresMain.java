
package com.mycompany.lab5;

public class TestScoresMain {
    public static void main(String[] args) {
        int size = 5;
        double[] testScores = new double[size];
        testScores[0] = 65;
        testScores[1] = 90;
        testScores[2] = 95;
       testScores[3] = 90;
       testScores[4] = 65;

        
        TestScores classScores = new TestScores(testScores, size);
        System.out.println(classScores.testScoreAverage());
        
        
        
        
    }
}
