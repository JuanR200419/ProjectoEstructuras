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

/**
 *
 * @author Juan Manuel
 */
public class Serializador {
    private static Serializador INSTANCIA = new Serializador();
    ArrayList<Curso>cursos;
    ArrayList<Personal>personas;
    ArrayList<Reserva>reservas;
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

    public ArrayList<Personal> getPersonas() {
        return personas;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public Laboratorio[][] getLaboratorios() {
        return laboratorios;
    }

    public void escribirLocal() {
        try {
            FileOutputStream archivo = new FileOutputStream("Curso.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(cursos);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Curso> leerCursos() {
        try {
            FileInputStream archivo = new FileInputStream("Cursos.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ArrayList<Curso>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }
    
      public void escribirPersonal() {
        try {
            FileOutputStream archivo = new FileOutputStream("Personal.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(personas);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Personal> leerPersonal() {
        try {
            FileInputStream archivo = new FileInputStream("Personal.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ArrayList<Personal>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
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

    public ArrayList<Reserva> leerReservas() {
        try {
            FileInputStream archivo = new FileInputStream("Reserva.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ArrayList<Reserva>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
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
