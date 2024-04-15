/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.exexceptions;

/**
 *
 * @author eyabe
 */
public class UserValidator {

    public void validateAge(int age) throws UserAgeException {
        if (age < 18) {
            throw new UserAgeException(age);
        }
    }
}
