/**
 * This test utility primarily handles the role of interacting with the properties file.  It should also be used to
 * handle anything that is universal to all testing and exists outside of the test logic and outside of the other
 * test tool structures like Page Objects or RestAssured structures.
 *
 * @author      AJ Johnson
 * @author      Charlie Mitchell
 *
 * @version     1.0.0
 */

package com.vertafore.autotest;

import org.junit.Assert;

import java.io.IOException;
import java.util.Properties;

public class Utilities {

    protected static Properties properties;
    private String defaultPropertiesFilePath = "/test.properties";

    /**
     * Constructor loads the properties file as a stream for use by other methods.
     *
     * @throws IOException          Standard exception for InputStream work
     */
    public Utilities() throws IOException {
        // load properties file
        properties = new Properties();
        java.io.InputStream in = properties.getClass().getResourceAsStream(defaultPropertiesFilePath);
        properties.load(in);
    }

    /**
     * Takes in the key value for the parameters file and finds the related value if one exists.  Also asserts that
     * the value was present to catch any incorrect or missing keys.
     *
     * @param key           Key to be searched for
     *
     * @return              Returns the value for given key
     */
    public String getProperty(String key) {
        if(key.charAt(0) == '~') {
            return key.substring(1, key.length());
        }
        String value = properties.getProperty(key);
        Assert.assertNotNull("Cannot find key " + key, value );
        return value;
    }

    /**
     * Takes a path for a file, relative or absolute, and assumes that it is either absolute or a path relative to
     * the test resources folder.  It either leaves it alone if it's an absolute path already or converts it to one
     * if it is not.
     *
     * @param path      The absolute or relative path to the desired file
     *
     * @return          Returns the absolute path to the desired file
     */
    public String getAbsoluteFilePathFromLocation(String path) {
        String absoluteLoc;
        if(path.toLowerCase().contains(":") || path.toLowerCase().charAt(0) == '/') {
            System.out.println("Full file path provided.  Using that.");
            absoluteLoc = path;

        } else {
            System.out.println("Partial path provided.  Assuming it references a location in Test Resources.");
            absoluteLoc = this.getClass().getClassLoader().getResource(path).toString();
            if(System.getProperty("os.name").toLowerCase().contains("windows")) {
                absoluteLoc = absoluteLoc.substring(absoluteLoc.indexOf("/") + 1, absoluteLoc.length());
                absoluteLoc = absoluteLoc.replace("/", "\\");
            }
            else {
                absoluteLoc = absoluteLoc.substring(absoluteLoc.indexOf(":") + 1, absoluteLoc.length());
            }
        }

        return absoluteLoc;
    }
}
