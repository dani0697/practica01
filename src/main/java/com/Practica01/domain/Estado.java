
package com.Practica01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;
    private String capital;
    private String poblacion;
    private String idioma;
    private String codigo;
    private String moneda;

    public Estado() {
    }

    public Estado(String capital, String poblacion, String idioma, String codigo, String moneda) {
        this.capital = capital;
        this.poblacion = poblacion;
        this.idioma = idioma;
        this.codigo = codigo;
        this.moneda = moneda;
    }
    
    
    
}