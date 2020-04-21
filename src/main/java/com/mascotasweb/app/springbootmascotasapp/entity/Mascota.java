package com.mascotasweb.app.springbootmascotasapp.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mascotas")
public class Mascota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Tipo;
    private String Raza;
    private String Color;
    private String Pelaje;
    private String Fecha;
    private String Vacunas;
    private String Imagen;

    private String Adoptado;
    private String Dueno;

    @Override
    public String toString() {
        return "Mascota{" +
                "Id=" + Id +
                ", Tipo='" + Tipo + '\'' +
                ", Raza='" + Raza + '\'' +
                ", Color='" + Color + '\'' +
                ", Pelaje='" + Pelaje + '\'' +
                ", Fecha='" + Fecha + '\'' +
                ", Vacunas='" + Vacunas + '\'' +
                ", Imagen='" + Imagen + '\'' +
                ", Adoptado='" + Adoptado + '\'' +
                ", Dueno='" + Dueno + '\'' +
                '}';
    }

    public String getDueno() {
        return Dueno;
    }

    public void setDueno(String dueno) { Dueno = dueno;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getPelaje() {
        return Pelaje;
    }

    public void setPelaje(String pelaje) {
        Pelaje = pelaje;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getVacunas() {
        return Vacunas;
    }

    public void setVacunas(String vacunas) {
        Vacunas = vacunas;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    public String getAdoptado() {
        return Adoptado;
    }

    public void setAdoptado(String adoptado) {
        Adoptado = adoptado;
    }

}
