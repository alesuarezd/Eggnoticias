/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noticas.noticias.controladores;

import com.noticas.noticias.excepciones.MiException;
import com.noticas.noticias.servicios.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author alejandrasuarez
 */

@Controller
@RequestMapping("/noticia")
public class noticiaControlador {
    
    @Autowired 
    private NoticiaService noticiaServicio;
    
   
    
    @GetMapping("/registrar")
    
    public String registrar(){
        
        return "noticia_form.html";
    }
    
    @PostMapping("/registro")
    
    public String registro(@RequestParam String titulo, @RequestParam String cuerpo , ModelMap modelo) throws MiException{
        
        try{
            System.out.println("Titulo: "+titulo+ "La noticia: "+cuerpo);
            
            noticiaServicio.CrearNoticia(titulo, cuerpo);
            modelo.put("exito", "La noticia fue cargada correctamente");
             
        }
        
        catch (MiException ex){
            modelo.put("error", ex.getMessage());
            
            return "noticia_form.html";
            
        }
           modelo.put("exito", "La noticia fue cargada correctamente");
           return "index.html";
           
    }
    
    
}
