/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAFIQ
 */
public class FilenotFound_Demo {
    public static void main(String args[]) {		
      File file = new File("E://file.txt");
        try { 
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilenotFound_Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
}
