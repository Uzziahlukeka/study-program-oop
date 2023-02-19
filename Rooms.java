/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.propara;

/**
 *
 * @author Uzziah_Lukeka
 */
abstract public class Rooms {
    
    protected String boiss;
 
    abstract void foods();
    abstract void seat();
    abstract void table();
    public void drinks(){
        
    };
    public void whereismytable(){
    
        System.out.println("please find your table under your seat press a buttom on your left");
    }
    public void buydrink(){
        
        System.out.println("All drinks cost 25.5 pln");
        
    }
}
