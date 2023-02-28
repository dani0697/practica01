/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Practica01.service;

import com.estado.domain.Estado;
import java.util.List;

/**
 *
 * @author candr
 */
public interface EstadoService {
   public List<Estado> getEstados();
   
   public void save(Estado cliente);
   public void delete(Estado cliente);
   public Estado getEstado(Estado cliente);
}
