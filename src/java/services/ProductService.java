/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Usuario;
import entities.Contactame;
import entities.citas;

/**
 *
 * @author Jairo
 */
public interface ProductService {
    
    void saveProduct(Usuario usuario);
    void saveProduct(Contactame contact);
    void saveProduct(citas cita);
    
}
