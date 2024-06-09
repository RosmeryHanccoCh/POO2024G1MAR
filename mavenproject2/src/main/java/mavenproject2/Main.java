/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject2;


public class Main {
    public static void main (String args[]){
    ModeloGame modelo =new ModeloGame ();
    Vista  View = new Vista();
    Controlador controlador=new Controlador(View,modelo);
    View.setLocationRelativeTo(null);  
    View.setVisible(true);
}
}
