package com.mycompany.objectes;

import mvm.daw.activities.animalshop.Animal;

/**
 * @author alumne
 */
public class Tiburones extends Animal{
    private String teeth;
    
    public Tiburones(String n, String bd, String c, String th, double w){
        super(n,bd,c,w);
        this.teeth = th;
    }
    
    public String getTeeth(){
        return teeth;
    }
    public void setTeeth(String th){
        teeth = th;
    }
    
    public void printValue(){
        System.out.println("El tiburo te: " + teeth);
    }

    @Override
    public double calculate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
