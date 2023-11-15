/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicesar.proyectoaulafx.logica;

import co.edu.unicesar.proyectoaulafx.entidades.Persona;
import co.edu.unicesar.proyectoaulafx.persistencia.*;
import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class LogicaListaPersona {
    
    private IPersona data;
    
    //Constructor
    public LogicaListaPersona() {
        this.data = new ListaPersona();
    }
    
    
    //Methods
    public void agregarPersona(Persona p){
        this.data.agregarPersona(p);
    }
    
    public void eliminarPersona(String cedula) {
        this.data.eliminarPersona(cedula);
    }
    
    public void actualizarPersona(String cedula) {
        this.data.actualizarPersona(cedula);
    }
    
    public ArrayList<Persona> informarPersona(){
        return this.data.informarPersona();
    }
}
