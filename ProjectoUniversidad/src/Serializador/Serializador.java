/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serializador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelado.Curso;
import modelado.Laboratorio;
import modelado.Mantenimiento;
import modelado.Notificacion;
import modelado.Persona;
import modelado.Reserva;
import util.IList;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class Serializador {

    private static Serializador INSTANCIA = new Serializador();
    IList<Curso> cursos;
    IList<Persona> personas;
    IList<Reserva> reservas;
     IList<Mantenimiento>mantenimientos;
     IList<Notificacion>notificaciones;
    Laboratorio[][] laboratorios;
    int numPuesto;
    private Serializador() {
        this.cursos = leerCursos();
        this.personas = leerPersonal();
        this.reservas = leerReservas();
        this.laboratorios = leerLaboratorios();
        this.numPuesto = leerNumPuesto();
        this.mantenimientos= leerMantenimiento();
        this.notificaciones = leerNotificacion();
    }

    public IList<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public IList<Mantenimiento> getMantenimientos() {
        return mantenimientos;
    }

    public int getNumPuesto() {
        return numPuesto;
    }

    public static Serializador getSeri() {
        return INSTANCIA;
    }

    public IList<Curso> getCursos() {
        return cursos;
    }

    public IList<Persona> getPersonas() {
        return personas;
    }

    public IList<Reserva> getReservas() {
        return reservas;
    }

    public Laboratorio[][] getLaboratorios() {
        return laboratorios;
    }

    public void escribirCurso() {
        try {
            FileOutputStream archivo = new FileOutputStream("Curso.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(cursos);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public IList<Curso> leerCursos() {
        try {
            FileInputStream archivo = new FileInputStream("Curso.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (Lista<Curso>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return new Lista<>();
        }
    }
    
        public void escribirNotificacion() {
        try {
            FileOutputStream archivo = new FileOutputStream("Notificacion.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(notificaciones);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public IList<Notificacion> leerNotificacion() {
        try {
            FileInputStream archivo = new FileInputStream("Notificacion.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (IList<Notificacion>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return new Lista<>();
        }
    }
    
    
    public void escribirPersonal() {
        try {
            FileOutputStream archivo = new FileOutputStream("Personas.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(personas);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public IList<Persona> leerPersonal() {
        try {
            FileInputStream archivo = new FileInputStream("Personas.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (Lista<Persona>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return new Lista<>();
        }
    }

    public void escribirReserva() {
        try {
            FileOutputStream archivo = new FileOutputStream("Reserva.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(reservas);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public IList<Reserva> leerReservas() {
        try {
            FileInputStream archivo = new FileInputStream("Reserva.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (Lista<Reserva>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return new Lista<>();
        }
    }

    public void escribirLaboratorio() {
        try {
            FileOutputStream archivo = new FileOutputStream("Laboratorios.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(laboratorios);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Laboratorio[][] leerLaboratorios() {
        try {
            FileInputStream archivo = new FileInputStream("Laboratorios.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (Laboratorio[][]) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return new Laboratorio[3][5]; // O el tamaño predeterminado que desees
        }
    }
    
          public void escribirNumPuesto(int numPuesto) {
        try {
            FileOutputStream archivo = new FileOutputStream("numPuesto.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(numPuesto);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public int leerNumPuesto() {
        try {
            FileInputStream archivo = new FileInputStream("numPuesto.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (int) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return 0;
        }
    }
    
      public void escribirMantenimiento() {
        try {
            FileOutputStream archivo = new FileOutputStream("mantenimiento.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(mantenimientos);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public IList<Mantenimiento> leerMantenimiento() {
        try {
            FileInputStream archivo = new FileInputStream("mantenimiento.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (Lista<Mantenimiento>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return new Lista<>();
        }
    }
    
    
    
}
