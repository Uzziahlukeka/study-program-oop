/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.propara;

/**
 *
 * @author Uzziah_Lukeka
 */
public class Human {
    private String name;
    private String surname;
    private int age;
    
    public String yourname(){
        return this.name ;
    }
    public String yoursurname(){
    
        return this.surname;
    }
    public int yourage(){
    
        return this.age;
    }
    
    public void setname(String name){
    
        this.name=name;
    }
    public void setsurname(String surname){
    
        this.surname=surname;
    }
    public void setage(int age){
    
        this.age=age;
    }
    
    public String yourfullname(){
    
        return this.name + this.surname;
    }
}
