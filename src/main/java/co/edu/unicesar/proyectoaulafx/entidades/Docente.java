/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicesar.proyectoaulafx.entidades;

import java.time.LocalTime;

/**
 *
 * @author LUIS MANUEL
 */
public class Docente extends Empleado {
    
    String facultad;

    public Docente(String facultad, String id, String nombre, String cedula) {
        super(id, nombre, cedula);
        this.facultad = facultad;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getCedula() {
        return cedula;
    }

    @Override
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public void entrada(LocalTime horaEntrada) {
        super.entrada(horaEntrada); 
        
    }

    @Override
    public void salida(LocalTime horaSalida) {
        super.salida(horaSalida); 
    }
    
    
    
}
