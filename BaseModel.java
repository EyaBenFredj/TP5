/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author eyabe
 */
abstract class BaseModel implements MachineLearningModel {

    protected String name;
    protected int version;
    protected String description;
    protected String device = "cpu";

    public BaseModel(String name, int version, String description) {
        this.name = name;
        this.version = version;
        this.description = description;
    }

    public void displayDetails() {
        System.out.println("Nom du modèle: " + name);
        System.out.println("Version: " + version);
        System.out.println("Description: " + description);
        System.out.println("Paramètre de périphérique: " + device);
    }

    // Méthodes abstraites à implémenter dans les classes concrètes
    public abstract void train(Dataset dataset);
    public abstract double[] predict(ClassificationDataset data);
}