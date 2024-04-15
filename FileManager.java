/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.exexceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class FileManager {

    public String readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        if (!file.exists() || !file.isFile()) {
            throw new FileNotFoundException("Fichier introuvable : " + filePath);
        }

        // Lecture du contenu du fichier (à implémenter)
        String content = ""; // Simulez la lecture du contenu
        return content;
    }
}
