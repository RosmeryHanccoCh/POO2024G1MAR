package pe.edu.upeu.syscenterlife.service;

import java.util.ArrayList;
import java.util.List;

import pe.edu.upeu.syscenterlife.modelo.Cliente;


public class ClienteService {

    List<Cliente> listaCli = new ArrayList<>();

    public boolean saveEntidad(Cliente cliente) {
        return this.listaCli.add(cliente);
    }

    public List<Cliente> listarEntidad() {
        return listaCli;
    }

    public Cliente buscarCliente(String codigox) {
        return listaCli.stream()
                .filter(cliente -> cliente.getCodigo().equals(codigox))
                .findFirst()
                .orElse(null); // Devuelve null si no se encuentra ningún cliente
    }

    public Cliente updateEntidad(Cliente clientex) {
        listaCli.stream()
                .filter(cliente
                        -> cliente.getCodigo().equals(clientex.getCodigo())) // Filtrar por codigo
                .findFirst() // Obtener el primer cliente que cumpla con el filtro
                .ifPresent(cliente-> 
                        cliente.setProducto(clientex.getProducto()));
        return buscarCliente((String) clientex.getCodigo());
    }

    public void deleteRegistEntdad(String dato) {
        listaCli.remove(listaCli.stream()
                .filter(cliente -> cliente.getCodigo().equals(dato))
                .findFirst().orElse(null));
    }
}
