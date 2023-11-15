/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicesar.proyectoaulafx.persistencia;

import co.edu.unicesar.proyectoaulafx.entidades.Registro;
import java.util.*;

/**
 *
 * @author franc
 */
public interface IRegistro {
    
    public void agregarRegistro(Registro r);
    public void eliminarRegistro(String cedula);
    public ArrayList<Registro> informarRegistro();
    public void actualizarRegistro(String cedula);
    
}
