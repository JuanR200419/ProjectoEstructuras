/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.time.LocalDate;
import java.util.ArrayList;
import modelado.Administrativo;
import modelado.Personal;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class ControladorIniciarSesion {

    Administrativo admin;
    Lista<Personal> listaPersonal;

    public ControladorIniciarSesion() {
        this.admin = Administrativo.getAdminGenerl();
        this.listaPersonal = Serializador.Serializador.getSeri().getPersonas();
    }

    public Personal login(String usuario, String contrasena) {
        if (usuario.equals("") && contrasena.equals("")) {
            System.out.println("exception de llenar campos");
        }

        if (usuario.equalsIgnoreCase(admin.getNommbreUsuario()) && contrasena.equalsIgnoreCase(admin.getContrasena())) {
            return admin;
        }
        Personal persona = buscarUsuario(usuario, contrasena);
        if (persona.getNommbreUsuario().equals(usuario)) {
            if (persona.getContrasena().equals(contrasena)) {
                return persona;
            } else {
                System.out.println("contraseña invalida");
            }
        } else {
            System.out.println("Nombre usuario invalido");
        }
        // acaba va exception de usuario no existente
        return null;
    }

    public Personal buscarUsuario(String usuario, String contrasena) {
        for (int i = 0; i < listaPersonal.size(); i++) {
            if (listaPersonal.get(i).getNommbreUsuario().equals(usuario)) {
                return listaPersonal.get(i);
            }
        }
        throw new NullPointerException();
    }
}
