
package com.mycompany.control_asistencia.mx.pitalla.controldeasistencia.entities;


public class Carrera {
    private int id;
    private String nombre;
    private String campus;
    private String telefono;
    //constructor completo
    public Carrera(int id, String nombre, String campus, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.campus = campus;
        this.telefono = telefono;
    }
    
    
    
    

    //contructor vacío
    
    
    //getters y setters

    @Override
    public String toString() {
        return "Carrera{" + "id=" + id + ", nombre=" + nombre + ", campus=" + campus + ", telefono=" + telefono + '}';
    }

    //Constructor vacio
    public Carrera() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
         
    
    
}
