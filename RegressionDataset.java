/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author eyabe
 */
class RegressionDataset extends Dataset {

    private final int numFeatures;
    private  double[] targets = null;

    public RegressionDataset(String path, boolean isTrain) {
        super(isTrain, path);
        this.targets = targets;
        this.numFeatures = targets.length ; 
// Assumes all data points have the same number of features
        
    }

    @Override
    public void load() {
        // Implémentation du chargement des données spécifiques à la régression
        System.out.println("Chargement des données de régression...");
    }

    @Override
    public void preprocess() {
        // Implémentation du prétraitement des données spécifiques à la régression
        System.out.println("Prétraitement des données de régression...");
    }

    public int getNumFeatures() {
        return numFeatures;
    }

    public double[] getTargets() {
        return targets;
    }
}