/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloodtestproject;

import java.util.ArrayList;

/**
 *
 * @author Ross
 */
public class DeletedPatients implements stackInterface {
    private ArrayList<patient> theStack;

    public DeletedPatients() {
        theStack = new ArrayList<>();
    }

    @Override
    public void push(Object newItem) {
        if (theStack.size() >= 5) {
            theStack.remove(4); // Maintain only last 5 records
        }
        theStack.add(0, (patient) newItem);
    }

    @Override
    public Object pop() {
        return theStack.isEmpty() ? null : theStack.remove(0);
    }

    @Override
    public Object peek() {
        return theStack.isEmpty() ? null : theStack.get(0);
    }

    @Override
    public boolean isEmpty() {
        return theStack.isEmpty();
    }

    @Override
    public int size() {
        return theStack.size();
    }
    @Override
    public String displayStack() {
        if (theStack.isEmpty()) {
            return "No deleted patients.";
    }
    return displayRecursive(0);
}

    private String displayRecursive(int index) { // Recursive function
        if (index >= theStack.size()) return "";
        return theStack.get(index).toString() + "\n" + displayRecursive(index + 1); // Ensure .toString()
}
}