/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.claseinterna;

/**
 *
 * @author Lab-IoT
 */
public class Mama {
    
    String alimento= "nutrientes";
    public void alimentar (){
        System.err.println("alimenta dando "+alimento);
    }
    
    class Bebe{
        double peso=1;
        public void moverse() {
            System.err.println(" su bebe da pataditas..");
            
        }
    }
    
}
