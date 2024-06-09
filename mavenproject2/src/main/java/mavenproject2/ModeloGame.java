/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject2;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author CORE i3 MSI
 */
public class ModeloGame {

    private String turno;
    private boolean end;
    private boolean draw;
    private JLabel Cj1;
    private JLabel Cj2;
    private String[][] tablero;
    private int cantMovidas;
    private int victoria1;
    private int victoria2;

    public ModeloGame() {
        turno = "x";
        end = false;
        draw = false;
        tablero = new String[3][3];
        cantMovidas = 0;
        victoria1 = 0;
        victoria2 = 0;
    }

    public void marcarCasilla(int i, int j, JLabel[][] casillas) {
        casillas[i][j].setText("X");

        if (!end) {
            if (tablero[i][j] == null) {
                tablero[i][j] = turno;
                casillas[i][j].setText(turno);
                verificarEstado();
                if (!end) {
                    if (turno.equals("x")) {
                        turno = "o";
                    } else {
                        turno = "x";
                    }
                } else {
                    terminaJuego();
                }
            }
        }
    }

    private void verificarEstado() {
        verificarFilas();
        if (!end) {
            verificarColumnas();
            if (!end) {
                verificarDiagonalP();
                if (!end) {
                    verificarDiagonalS();
                    if (!end) {
                        if (cantMovidas == 9) {
                            draw = true;
                            end = true;
                        }

                    }
                }
            }
        }
    }

    private void verificarFilas() {
        for (int i = 0; i < 3; i++) {
            boolean win = true;
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == null || !tablero[i][j].equals(turno)) {
                    win = false;
                }
                if (win) {
                    end = true;
                }

            }
        }
    }

    private void verificarColumnas() {
        for (int j = 0; j < 3; j++) {
            boolean win = true;
            for (int i = 0; i < 3; i++) {
                if (tablero[i][j] == null || !tablero[i][j].equals(turno)) {
                    win = false;
                }
                if (win) {
                    end = true;
                }

            }
        }
    }

    private void verificarDiagonalP() {

        boolean win = true;
        for (int i = 0; i < 3; i++) {
            if (tablero[i][i] == null || !tablero[i][i].equals(turno)) {
                win = false;
            }
            if (win) {
                end = true;
            }

        }
    }

    private void verificarDiagonalS() {

        boolean win = true;
        int j = 2;
        for (int i = 0; i < 3 && win; i++, j--) {
            if (tablero[i][j] == null || !tablero[i][j].equals(turno)) {
                win = false;
            }
        }
        if (win) {
            end = true;
        }
    }

    private void terminaJuego() {
        if (draw) {
            JOptionPane.showMessageDialog(null, "empate");
        } else {
            if (turno.equals("x")) {
                victoria1++;
                Cj1.setText(String.valueOf(victoria1));
                JOptionPane.showMessageDialog(null, "victoria del jugador 1 ");
            } else {
                victoria2++;
                Cj2.setText(String.valueOf(victoria1));
                JOptionPane.showMessageDialog(null, "victoria del jugador 2 ");
            }
        }
    }

    void setJugadores(JLabel j1, JLabel j2) {
        Cj1 = j1;
        Cj2 = j2;
    }

    void resetGame(JLabel[][]Casillas) {
        turno = "x";
        end = false;
        draw = false;
        cantMovidas = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = null;
                Casillas[i][j].setText("");
            }
        }

    }

    void marcarcasilla(int i, int j, JLabel[][] casillas) {
        casillas [i][j].setText("X");
    }
}
