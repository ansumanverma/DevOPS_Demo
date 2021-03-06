/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.helloworldapp;

import javax.ejb.Singleton;

/**
 * Singleton session bean used to store the name parameter for "/helloWorld"
 * resource
 */
@Singleton
public class NameStorageBean {

    // name field
    private String name = "GlassFish Server";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
