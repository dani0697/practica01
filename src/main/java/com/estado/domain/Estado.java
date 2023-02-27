package com.estado.domain;

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
    private String nombre;
    private int num_provincias;
    private int poblacion;
    private int num_presidentes;

    public Estado(String nombre, int num_provincias, int poblacion, int num_presidentes) {
        this.nombre = nombre;
        this.num_provincias = num_provincias;
        this.poblacion = poblacion;
        this.num_presidentes = num_presidentes;
    }

    public Estado() {
    }
    
}
