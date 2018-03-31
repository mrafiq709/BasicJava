/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections.Properties;

import java.io.FileReader;
import java.util.Properties;

/**
 *
 * @author RAFIQ
 */
public class PropertiesTest {

    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("src\\JavaCollections\\Properties\\db.properties");

        Properties p = new Properties();
        p.load(reader);

        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));
    }

}
