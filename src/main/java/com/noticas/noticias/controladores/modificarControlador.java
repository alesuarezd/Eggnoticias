/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noticas.noticias.controladores;

import com.noticas.noticias.entidades.Noticia;
import com.noticas.noticias.servicios.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alejandrasuarez
 */
@Controller
@RequestMapping("/noticia")

public class modificarControlador {
    @Autowired
    private NoticiaService noticiaService;
    
    @GetMapping("/modificar")
    
    public String modificar(){
    
        return "modificar_noticia.html";
        
    }
    
    
    
 
 
        
    
   
    }
    
    
