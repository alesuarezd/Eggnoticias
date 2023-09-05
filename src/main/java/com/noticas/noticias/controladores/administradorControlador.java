/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noticas.noticias.controladores;

import com.noticas.noticias.entidades.Noticia;
import com.noticas.noticias.excepciones.MiException;
import com.noticas.noticias.servicios.NoticiaService;
import java.util.List;
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
public class administradorControlador {
    
    @Autowired
    private NoticiaService noticiaServicio;
    
    @GetMapping("/administrador")
    
    public String administrar(ModelMap modelo){
         List <Noticia> noticias=noticiaServicio.listarNoticias();
         modelo.addAttribute("noticias", noticias);
        
        return "noticia_administrador.html";
    }
    
    public void prueba(){
        System.out.println("Prueba");
    }
    
   
    
    
}
