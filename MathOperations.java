/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.exexceptions;

/**
 *
 * @author eyabe
 */
public class MathOperations {

    public int calculateFactorial(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Le nombre ne doit pas être négatif");
        }

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public double calculateSquareRoot(double number) throws ArithmeticException {
        if (number < 0) {
            throw new ArithmeticException("Impossible de calculer la racine carrée d'un nombre négatif");
        }
        return Math.sqrt(number);
    }
}
