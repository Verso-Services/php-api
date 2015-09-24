/**
 * Copyright 2009 Intelligent Sense.
 * 
 * All Rights Reserved.
 * This software is the proprietary information of
 * Intelligent Sense.
 * Use this subject to license terms.
 * 
 * Filename: JavaVersoClientExample.java
 * JavaVersoClientExample
 */
package javaversoclientexample;

/**
 * Project main class
 * This is an example that explains how to connect
 * to the Verso API Service
 */ 
public class JavaVersoClientExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        VersoClient.getInstance().ImportArticlesBatch();
         
    }
    
}
