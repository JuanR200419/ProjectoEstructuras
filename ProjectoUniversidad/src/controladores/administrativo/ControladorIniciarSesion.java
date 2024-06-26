/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores.administrativo;

import excepciones.UsuarioNoEncontradoException;
import excepciones.excepcionContrasenaIgualAnterior;
import java.time.LocalDate;
import java.util.ArrayList;
import modelado.AdminGeneral;
import modelado.Administrativo;
import modelado.Contrasena;
import modelado.Persona;
import util.IList;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class ControladorIniciarSesion {

    IList<Persona> listaPersonal;
    AdminGeneral admin;

    public ControladorIniciarSesion() {
        this.admin = AdminGeneral.getAdmin();
        this.listaPersonal = Serializador.Serializador.getSeri().getPersonas();
    }

    public Persona login(String usuario, String contrasena) throws UsuarioNoEncontradoException {
        if (usuario.equals("") && contrasena.equals("")) {
            System.out.println("exception de llenar campos");
        }

        if (usuario.equalsIgnoreCase(admin.getNommbreUsuario()) && contrasena.equalsIgnoreCase(admin.getContrasena().getIdenContrasena())) {
            return admin;
        }
        Persona persona = buscarUsuario(usuario, contrasena);
        if (persona.getNommbreUsuario().equals(usuario)) {
            if (persona.getContrasena().getIdenContrasena().equals(contrasena)) {
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

    public Persona buscarUsuario(String usuario, String contrasena) throws UsuarioNoEncontradoException {
        for (int i = 0; i < listaPersonal.size(); i++) {
            if (listaPersonal.get(i).getNommbreUsuario().equals(usuario) && listaPersonal.get(i).getContrasena().getIdenContrasena().equals(contrasena)) {
                return listaPersonal.get(i);
            }
        }
        throw new UsuarioNoEncontradoException();
    }

    public boolean cambioContrasena(Persona perso, String contrasena)throws excepcionContrasenaIgualAnterior{
        if (perso.getContrasena().getEstado().equals(Contrasena.TEMPORAL)) {
            if (!perso.getContrasena().getIdenContrasena().equals(contrasena)) {
                perso.getContrasena().setIdenContrasena(contrasena);
                perso.getContrasena().setEstado(Contrasena.NOTEMPORAL);
                Serializador.Serializador.getSeri().escribirPersonal();
                return true;
            }else{
            throw new excepcionContrasenaIgualAnterior();
            }
        }
        return false;
    }

    public boolean solicitudCambioContrasena(Persona perso) {
        if (perso.getContrasena().getEstado().equals(Contrasena.TEMPORAL)) {
            return true;
        }
        return false;
    }
}
