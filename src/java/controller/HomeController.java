/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Usuario;
import entities.Contactame;
import entities.citas;
import services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Jairo
 */
@Controller
public class HomeController {
    
    @Autowired
    private ProductService productService;
    
   
    
    
    
    
    @RequestMapping(value = "crear", method=RequestMethod.GET)
    public ModelAndView crear() {
        ModelAndView modelAndView=new ModelAndView("Usuario-crear");
        Usuario usuario =new Usuario();
        
        modelAndView.addObject("usuario",usuario);
        
        return modelAndView;
    }
    
    @RequestMapping(value = "crear", method=RequestMethod.GET)
    public ModelAndView crear() {
        ModelAndView modelAndView=new ModelAndView("Usuario-crear");
        Usuario usuario =new Usuario();
        
        modelAndView.addObject("usuario",usuario);
        
        return modelAndView;
    }
    
    
    @RequestMapping(value="crear-cita", method=RequestMethod.POST)
    public ModelAndView crearPost(citas cita) {
        ModelAndView modelAndView=new ModelAndView("confirm");       
        
        productService.saveProduct(cita);
        modelAndView.addObject("cita",cita);
        
        return modelAndView;
    }
    
    @RequestMapping(value="COntactame", method=RequestMethod.POST)
    public ModelAndView crearPost(Contactame contact) {
        ModelAndView modelAndView=new ModelAndView("confirm");       
        
        productService.saveProduct(contact);
        modelAndView.addObject("contact",contact);
        
        return modelAndView;
    }

}
