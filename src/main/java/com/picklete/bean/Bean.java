/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.picklete.bean;

/**
 *
 * @author Abhi
 */
public class Bean {
    
    String name;
    
    public void setName(String name) {
		this.name = name;
	}
 
	public void printHello() {
		System.out.println("Hello ! " + name);
	}
    
}
