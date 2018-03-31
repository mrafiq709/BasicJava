/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections.Properties;

import java.io.FileWriter;
import java.util.Properties;

/**
 *
 * @author RAFIQ
 */
public class PropertiesCreate {

    public static void main(String[] args) throws Exception {

        Properties p = new Properties();
        p.setProperty("name", "Rafiq");
        p.setProperty("email", "mrafiq709@gmail.com");

        p.store(new FileWriter("info.properties"), "Properties Example");

    }
}
