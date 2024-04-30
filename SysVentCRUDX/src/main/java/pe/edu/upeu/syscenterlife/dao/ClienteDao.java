/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.syscenterlife.connx.connx.ConnS;
import pe.edu.upeu.syscenterlife.modelo.Cliente;

public class ClienteDao {

    ConnS instance = ConnS.getInstance();
    Connection connection = instance.getConnection();
    PreparedStatement ps;
    ResultSet rs = null;

    public List<Cliente> addCliente() {
        List<Cliente> lista = new ArrayList<>();
        try {
            ps = connection.prepareStatement("SELECT * From cliente");
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(Cliente.builder()
                        .dniruc(rs.getString("dniruc"))
                        .nombre(rs.getString("nombre"))
                        .documento(rs.getString("documento"))
                        .build());
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public int guardarCliente(Cliente c){
        int result=0;
        try {
              ps=connection.prepareStatement("INSERT INTO cliente(dniruc, nombre, documento)"
                      +"VALUES('"+c.getDniruc()+"','"+c.getNombre()+"' , '"+c.getDocumento()+"')");
        ps.executeUpdate();
        
        } catch (Exception e) {
            System.err.println("Error:"+e.getMessage());
        }
        return result;
    }
}
