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
import modelado.Personal;
import modelado.Reserva;
import util.Lista;

/**
 *
 * @author Juan Manuel
 */
public class Serializador {
    private static Serializador INSTANCIA = new Serializador();
    Lista<Curso>cursos;
    Lista<Personal>personas;
    Lista<Reserva>reservas;
    Laboratorio[][] laboratorios ;
    
    private Serializador() {
        this.cursos = leerCursos();
        this.personas = leerPersonal();
        this.reservas = leerReservas();
        this.laboratorios = leerLaboratorios();
    }

    public static Serializador getSeri() {
        return INSTANCIA;
    }

    public Lista<Personal> getPersonas() {
        return personas;
    }

    public Lista<Reserva> getReservas() {
        return reservas;
    }

    public Lista<Curso> getCursos() {
        return cursos;
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

    public Lista<Curso> leerCursos() {
        try {
            FileInputStream archivo = new FileInputStream("Cursos.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (Lista<Curso>) lector.readObject();
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

    public Lista<Personal> leerPersonal() {
        try {
            FileInputStream archivo = new FileInputStream("Personas.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (Lista<Personal>) lector.readObject();
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

    public Lista<Reserva> leerReservas() {
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
            FileOutputStream archivo = new FileOutputStream("Reserva.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(laboratorios);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Laboratorio[][] leerLaboratorios() {
        try {
            FileInputStream archivo = new FileInputStream("Reserva.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (Laboratorio[][]) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return new Laboratorio[3][5];
        }
    }
    
}
