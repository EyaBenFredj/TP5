/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.exexceptions;

/**
 *
 * @author eyabe
 */
class UserAgeException extends Exception {

    public UserAgeException(int age) {
        super("L'âge de l'utilisateur (" + age + ") doit être supérieur ou égal à 18 ans.");
    }
}
