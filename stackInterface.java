/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloodtestproject;

/**
 *
 * @author Ross
 */
public interface stackInterface {
    public void push(Object e);
    public Object pop();
    public Object peek();
    public boolean isEmpty();
    public int size();
    public String displayStack(); 
}
