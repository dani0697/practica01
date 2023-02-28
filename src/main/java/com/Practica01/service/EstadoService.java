/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Practica01.service;


import com.Practica01.domain.Estado;
import java.util.List;

/**
 *
 * @author candr
 */
public interface EstadoService {
   public List<Estado> getEstado();
   
   public void save(Estado estado);
   public void delete(Estado estado);
   public Estado getEstado(Estado estado);
}
