package com.mascotasweb.app.springbootmascotasapp.service;

import com.mascotasweb.app.springbootmascotasapp.entity.Mascota;

import java.util.List;

public interface MascotaService {
    public List<Mascota> todos();
    public void guardar (Mascota mascota);
    public Mascota buscarId(int id);
    public void eliminar(int id);
}
