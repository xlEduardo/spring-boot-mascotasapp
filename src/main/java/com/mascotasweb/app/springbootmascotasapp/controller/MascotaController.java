package com.mascotasweb.app.springbootmascotasapp.controller;

import com.mascotasweb.app.springbootmascotasapp.entity.Mascota;
import com.mascotasweb.app.springbootmascotasapp.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.List;

@Controller
@RequestMapping("/views")
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    @GetMapping("/")
    public String mostrarMascotas(Model model){


        List<Mascota> listaMascotas = mascotaService.todos();
        model.addAttribute("titulo", "Lista de Mascotas");
        model.addAttribute("mascotas", listaMascotas);
        return "views/mostrar";
    }


    @GetMapping("/create")
    public String crear(Model model){
        model.addAttribute("titulo", "Formulario: Nueva Mascota");
        Mascota mascota = new Mascota();
        model.addAttribute(mascota);
        return "views/agregar";
    }

    @PostMapping("/save")
    public String guardar(@ModelAttribute Mascota mascota){
        if(mascota.getDueno().equals("") || mascota.getDueno().equals("Ninguno") || mascota.getAdoptado().equals("No")){
            mascota.setDueno("Ninguno");
            mascota.setAdoptado("No");
        }


        mascotaService.guardar(mascota);
        System.out.println("Mascota guardada");
        return "redirect:/views/";
    }


    @GetMapping("/edit/{id}")
    public String editar(@PathVariable("id") int idMascota, Model model){
        Mascota mascota = mascotaService.buscarId(idMascota);
        model.addAttribute(mascota);
        return "views/agregar";
    }

    @GetMapping("/adoptar/{id}")
    public String adoptar(@PathVariable("id") int idMascota, Model model){

        Mascota mascota = mascotaService.buscarId(idMascota);
        model.addAttribute(mascota);

        return "views/adoptar";
    }


    @GetMapping("/delete/{id}")
    public String borrar(@PathVariable("id") int idMascota){
        mascotaService.eliminar(idMascota);
        System.out.println("Se ha eliminado con exito");
        return "redirect:/views/";
    }
}
