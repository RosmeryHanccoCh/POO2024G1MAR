/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.syscenterlife.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.syscenterlife.modelo.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String>{
    
@Query(value = "SELECT c.* FROM Cliente c WHERE c.nombrers like :filter", nativeQuery = true)
List<Cliente> listAutoCompletCliente(@Param("filter") String filter);     
}
