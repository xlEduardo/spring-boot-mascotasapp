package com.mascotasweb.app.springbootmascotasapp.service;

import com.mascotasweb.app.springbootmascotasapp.entity.Mascota;
import com.mascotasweb.app.springbootmascotasapp.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaServiceImp implements MascotaService {

    @Autowired
    private MascotaRepository mascotaRepository;

    @Override
    public List<Mascota> todos() {

        return (List<Mascota>) mascotaRepository.findAll();
    }

    @Override
    public void guardar(Mascota mascota) {

        mascotaRepository.save(mascota);
    }

    @Override
    public Mascota buscarId(int id) {

        return mascotaRepository.findById(Math.toIntExact(id)).orElse(null);
    }

    @Override
    public void eliminar(int id) {

        mascotaRepository.deleteById(Math.toIntExact(id));
    }
}
