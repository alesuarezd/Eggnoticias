/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noticas.noticias.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author alejandrasuarez
 */

@Entity
public class Noticia {
  
    @Id
    private String titulo;
    private String cuerpo;

    public Noticia() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    
    
    
    
    
    
    
}
