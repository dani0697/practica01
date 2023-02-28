package com.Practica01.controller;

import com.Practica01.domain.Estado;
import com.Practica01.service.EstadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexControler {
    
    @Autowired
    EstadoService estadoService;
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Usando una arquitectura MVC");
        
        var estado=estadoService.getEstado();
           
        model.addAttribute("estado",estado);
        return "index";
    }
    
    @GetMapping("/nuevoEstado")
    public String nuevoEstado (Estado estado){
        return "modificarEstado";
    }
    
    @PostMapping("/guardarEstado")
    public String guardarEstado (Estado estado){
        estadoService.save(estado);
        return "redirect:/";
    }
    
    @GetMapping("/modificarEstado/{idEstado}")
    public String modificarEstado (Estado estado, Model model){
        estado = estadoService.getEstado(estado);
        model.addAttribute("estado",estado);
        return "modificarEstado";
    }
    
    @GetMapping("/eliminarEstado/{idEstado}")
    public String modificarEstado (Estado estado){
        estadoService.delete(estado);
        return "redirect:/";
    }
}
