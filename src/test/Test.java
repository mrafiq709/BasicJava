/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAFIQ
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException {
         BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\frsher.txt")));
         System.out.println(" "+ br.toString());
    }
}
