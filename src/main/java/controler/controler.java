package controler;

import org.springframework.ui.Model;
import interfaces.IPlatoservice;
import model.Plato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping
public class controler {

    @Autowired
    private IPlatoservice service;
    @GetMapping("/listar")
    public String listar(Model model){
        List<Plato>platos=service.listar();
        model.addAttribute ("platos", platos);
        return "index";
    }
    @GetMapping("/mi-vista")
    public String miVista(Model model) {
        model.addAttribute("titulo", "Mi Título");
        model.addAttribute("mensaje", "¡Hola desde Thymeleaf!");
        return "mi-vista"; // Retorna el nombre de la plantilla
    }



}
