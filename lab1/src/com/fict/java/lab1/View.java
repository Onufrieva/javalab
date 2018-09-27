package com.fict.java.lab1;

import java.util.Scanner;

public class View {

    private static int dimension;
    private static int step_shift;
    protected void outputMatrix(int dimension, int chengematrix[][]) {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(chengematrix[i][j] + "\t");
            }
            System.out.print("\n");

        }
    }
    public static int chooseDimension() {
        System.out.println("Введите размерность матрицы:");
        dimension = checkDumbs();

        return dimension;
    }
    public static int chooseStepShift() {

        System.out.println("Введите сдвиг влево:");
        step_shift = checkDumbs();
        return step_shift;
    }

    public static int checkDumbs() {
        int check_variable;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите целое положительное число!");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не целое положительное число!");
                scanner.next();
            }
            check_variable = scanner.nextInt();
        } while (check_variable <= 0);
        return check_variable;
    }
}
