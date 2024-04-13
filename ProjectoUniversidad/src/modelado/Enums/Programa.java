/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package modelado.Enums;

/**
 *
 * @author Juan Manuel
 */
public enum Programa {
    Elige_Tu_Programa ("Elije tu programa"),
    Diseño_Visual_Digital("Diseño Visual"),
    Publicidad_Digital_y_Mercadeo("Publicidad Digital Mercadeo "),
    Administracion_De_Empresas("Administracion de Empresas"),
    Administracion_De_Negocios_Internacionales("Administracion De Negocios Internacionales"),
    Contaduria_Publica("Contaduria Publica"),
    Hoteleria_Y_Turismo("Hoteleria Y Turismo"),
    Ingenieria_De_Software("Ingenieria De Software"),
    Ingenieria_Mecatronica("Ingenieria Mecatronica"),
    Ingenieria_Industrial("Ingenieria Industrial");
    
    private String valor;
    
    Programa(String valor){
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    
    
    
    
}
