/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.io.File;

/**
 *
 * @author jvict
 */
public class Utility {

    public static void confirmedByFolder() {
        File folder = new File("confirmations\\");
        File[] listOfFiles = folder.listFiles();
        String[] fileInfo;
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }

    }
}
