
package com.mycompany.control_asistencia.mx.pitalla.controldeasistencia.entities;


public class Materia {
    
    private int id;
    private String nombre;
    private Carrera carrera;
    private String claveMateria; //por clave_materia
    private int creditos;
    private int horas_semana;
    private int semestre;

    public Materia() {
    }

    public Materia(int id, String nombre, Carrera carrera, String claveMateria, int creditos, int horas_semana, int semestre) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
        this.claveMateria = claveMateria;
        this.creditos = creditos;
        this.horas_semana = horas_semana;
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Materia{" + "id=" + id + ", nombre=" + nombre + ", carrera=" + carrera + ", claveMateria=" + claveMateria + ", creditos=" + creditos + ", horas_semana=" + horas_semana + ", semestre=" + semestre + '}';
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

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String getClaveMateria() {
        return claveMateria;
    }

    public void setClaveMateria(String claveMateria) {
        this.claveMateria = claveMateria;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getHoras_semana() {
        return horas_semana;
    }

    public void setHoras_semana(int horas_semana) {
        this.horas_semana = horas_semana;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
}
