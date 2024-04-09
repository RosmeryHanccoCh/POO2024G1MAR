/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.claseinterna;

/**
 *
 * @author Lab-IoT
 */
public class Principal {
    public static void main(String[] args) {
        Mama objM=new Mama();
        objM.alimentar();
        Mama.Bebe bb=objM.new Bebe();
        bb.moverse();
    }
    
}
