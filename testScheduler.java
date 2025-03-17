/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloodtestproject;

import java.util.PriorityQueue;


/**
 *
 * @author Ross
 */
public class testScheduler implements qeueInterface { 
    private PriorityQueue<patient> patientQueue;

    public testScheduler() {
        patientQueue = new PriorityQueue<>();
    }

    @Override
    public boolean isEmpty() {
        return patientQueue.isEmpty();
    }

    @Override
    public int size() {
        return patientQueue.size();
    }

    @Override
    public Object frontElement() {
        return patientQueue.peek();
    }

    @Override
    public void enqueue(int priorityKey, patient p) {
        patientQueue.add(p);
        System.out.println("Patient Added: " + p);
    }

    @Override
    public patient dequeue() {
        return patientQueue.poll();
    }

    @Override
    public String printQueue() {
        if (patientQueue.isEmpty()) {
            return "No patients waiting.";
        }
        StringBuilder sb = new StringBuilder();
        for (patient p : patientQueue) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}