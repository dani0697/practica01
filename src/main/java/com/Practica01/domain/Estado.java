
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
    private Long id_estado;
    String capital;
    String poblacion;
    String idioma;
    String codigoPais;
    String moneda;

    public Estado() {
    }

    public Estado(Long id_estado, String capital, String poblacion, String idioma, String codigoPais, String moneda) {
        this.id_estado = id_estado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.idioma = idioma;
        this.codigoPais = codigoPais;
        this.moneda = moneda;
    }
    
    
    
}