
package com.Practica01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado {
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private Long idEstado;
    String capital;
    String poblacion;
    String idioma;
    String codigoPais;
    String moneda;

    public Estado() {
    }

    public Estado(Long idEstado, String capital, String poblacion, String idioma, String codigoPais, String moneda) {
        this.idEstado = idEstado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.idioma = idioma;
        this.codigoPais = codigoPais;
        this.moneda = moneda;
    }
    
    
    
}