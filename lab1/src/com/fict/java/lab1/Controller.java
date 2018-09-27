package com.fict.java.lab1;

import java.util.Scanner;

public class Controller {
    View view = new View();
    Matrix matrix = new Matrix();
    private static int dimension;
    private static int step_shift;
    private static int currentmatrix[][];

  public void start(){
      dimension = view.chooseDimension();
      step_shift = view.chooseStepShift();
      currentmatrix = matrix.createMatrix(dimension);
      System.out.println("Ваша матрица:");
      view.outputMatrix(dimension, currentmatrix);
      System.out.println("Новая матрица:");
      currentmatrix = matrix.shiftLeft(step_shift);
      view.outputMatrix(dimension, currentmatrix);

  }

}
