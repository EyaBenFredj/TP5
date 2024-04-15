/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author eyabe
 */
class ClassificationDataset extends Dataset {

    private String[] labels;
    private final int numClasses;
    int length;

    public ClassificationDataset(String path, boolean isTrain) {
        super(isTrain, path);
        this.labels = labels;
        this.numClasses = labels.length;
    }

    @Override
    public void load() {
        // Implémentation du chargement des données spécifiques à la classification
        System.out.println("Chargement des données de classification...");
    }

    @Override
    public void preprocess() {
        // Implémentation du prétraitement des données spécifiques à la classification
        System.out.println("Prétraitement des données de classification...");
    }

    public String[] getLabels() {
        return labels;
    }

    public int getNumClasses() {
        return numClasses;
    }
}
