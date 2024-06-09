/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject2;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;



public class Controlador {

    private Vista view;
    private ModeloGame modelo;
    private JLabel[][] casillas;

    public Controlador(Vista view, ModeloGame modelo) {
        this.view = view;
        this.modelo = modelo;
        casillas = view.getCasillas();
        agregarListeners();
        crearJugadores();
    }

    private void agregarListeners() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                agregarEventoMouse(i, j);
            }
        }
    JButton botonReset =view.getBotonReset();
    botonReset.addActionListener ((ActionEvent e) ->{
        modelo.resetGame(casillas);
        });
}

    private void agregarEventoMouse(int i, int j) {
        
        JLabel casillaActual = casillas[i][j];
        casillaActual.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                modelo.marcarcasilla(i, j, casillas);
            }

        });
}
    private void crearJugadores() {
        JLabel j1=view.getVictoria1();
        JLabel j2=view.getVictoria2();
        modelo.setJugadores(j1,j2);
    }
}
