/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import entities.Contactame;
import entities.Usuario;
import entities.citas;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jairo
 */
@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    public void save(Usuario usuario);

    public void save(Contactame contact);

    public void save(citas cita);
    
}
