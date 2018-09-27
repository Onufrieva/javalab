package com.fict.java.lab1;
public class Matrix {
   private int [][] currentmatrix;
    private int a;

    protected int[][] createMatrix(int a){
    currentmatrix = new int [a][a];

        for (int i=0; i<a; i++){
        for (int j=0; j<a; j++){
            currentmatrix[i][j]= 100+(int) (Math.random() *(-200));
        }

    }
    return currentmatrix;
}
    protected int[][] shiftLeft(int steps) {
        for (int i=0; i<currentmatrix.length; i++) {
          int realSteps = steps % currentmatrix[i].length;
            while(realSteps-- > 0) {
                int temp = currentmatrix[i][0];
                for (int j=currentmatrix[i].length-1; j>=0; j--) {
                    int val = currentmatrix[i][j];
                    currentmatrix[i][j] = temp;
                    temp = val;
                }
            }
        }
        return currentmatrix;
    }

}
