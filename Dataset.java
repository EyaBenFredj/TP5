/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author eyabe
 */
abstract class Dataset {

    protected boolean isTrain;
    protected String path;

    public Dataset(boolean isTrain, String path) {
        this.isTrain = isTrain;
        this.path = path;
    }

    // Méthodes abstraites à implémenter dans les classes concrètes
    
    public abstract void preprocess();
    public abstract void load();
    
}