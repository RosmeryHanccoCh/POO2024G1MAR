/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.connx.connx;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Lab-IoT
 */
public class UtilsX {
   public File getFileExterno(String carpeta, String filex) {
File newFolder = new File(carpeta);
String ruta = newFolder.getAbsolutePath();
Path CAMINO = Paths.get(ruta + "/" + filex); 
return CAMINO.toFile();
} 
}
