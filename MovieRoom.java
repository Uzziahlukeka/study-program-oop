/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.propara;

/**
 *
 * @author Uzziah_Lukeka
 */
public class MovieRoom extends Rooms
{

    public void drinks(String boiss){
        System.out.println("your table will content water " + boiss);
    }
    @Override
    public void table(){
        
    }
    @Override
    public void seat(){
       System.out.println("Please seat on every empty seat");
    }
    @Override
    public void foods(){
    
        System.out.println("Sorry for this Categorie you dont have free foods");
        
    }
    
}
