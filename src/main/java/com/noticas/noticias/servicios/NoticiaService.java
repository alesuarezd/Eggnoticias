/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noticas.noticias.servicios;

import com.noticas.noticias.entidades.Noticia;
import com.noticas.noticias.excepciones.MiException;
import com.noticas.noticias.repositorios.NoticiasRepositorio;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alejandrasuarez
 */

@Service
public class NoticiaService {
    
    @Autowired
    private NoticiasRepositorio noticiasRepositorio;
    @Transactional
    public void CrearNoticia(String titulo, String cuerpo) throws MiException{
        
        validar(titulo, cuerpo);
        Noticia noticia=new Noticia();
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticiasRepositorio.save(noticia);
        
        
    }
    
    public void validar(String titulo, String cuerpo) throws MiException{
        
        if(titulo.isEmpty() || titulo==null){
            
            throw new MiException("El título no puede estar vacío o ser nulo");
        }
        
         if(cuerpo.isEmpty() || cuerpo==null){
            
            throw new MiException("El cuerpo no puede estar vacío o ser nulo");
        }
    }
    
    public List <Noticia> listarNoticias(){
        
        List <Noticia> noticias = new ArrayList();
        noticias=noticiasRepositorio.findAll();
        
        return noticias;
        
    }
    
    public Noticia modificarNoticia(Noticia noticia){
        
        
        
        
        
        
    }
    
   
     
}
