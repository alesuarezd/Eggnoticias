/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noticas.noticias.controladores;

import com.noticas.noticias.entidades.Noticia;
import com.noticas.noticias.repositorios.NoticiasRepositorio;
import com.noticas.noticias.servicios.NoticiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alejandrasuarez
 */
@Controller
@RequestMapping("/")
public class portalControlador {
    
   @Autowired
   
   private NoticiaService noticiaService;
   
    @GetMapping("/")
    
    public String index(ModelMap modelo){
         List <Noticia> noticias=noticiaService.listarNoticias();
         modelo.addAttribute("noticias", noticias);
        
        return "index.html";
    }
    
   
    
}
