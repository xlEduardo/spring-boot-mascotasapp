package com.mascotasweb.app.springbootmascotasapp.repository;

import com.mascotasweb.app.springbootmascotasapp.entity.Mascota;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepository extends CrudRepository<Mascota, Integer> {

}
