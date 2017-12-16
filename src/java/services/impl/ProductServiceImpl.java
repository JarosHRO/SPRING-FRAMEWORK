/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.impl;

import entities.Usuario;
import entities.Contactame;
import entities.citas;
import services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.UsuarioRepository;

/**
 *
 * @author Jairo
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService{
    
    @Autowired
    private UsuarioRepository productRepository;

    @Override
    public void saveProduct(Usuario usuario) {
        productRepository.save(usuario);
    }

    @Override
    public void saveProduct(Contactame contact) {
        productRepository.save(contact);
    }

    @Override
    public void saveProduct(citas cita) {
        productRepository.save(cita);
    }
    
}
