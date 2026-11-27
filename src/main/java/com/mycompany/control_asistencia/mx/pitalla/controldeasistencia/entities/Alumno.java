
 
package com.mycompany.control_asistencia.mx.pitalla.controldeasistencia.entities;


public class Alumno {
    private int id;
    private Carrera carrera; //por carrera id
    private String itson_id;
    private String nombre;
    private String fecha_nacimiento;
    private String telefono;
    private String correo;
    private int semestre;
    private double adeudo;
    private boolean becado;
    private String created_at;
    private String password;

    public Alumno(int id, Carrera carrera, String itson_id, String nombre, String fecha_nacimiento, String telefono, String correo, int semestre, double adeudo, boolean becado, String created_at, String password) {
        this.id = id;
        this.carrera = carrera;
        this.itson_id = itson_id;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.semestre = semestre;
        this.adeudo = adeudo;
        this.becado = becado;
        this.created_at = created_at;
        this.password = password;
    }

    public Alumno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String getItson_id() {
        return itson_id;
    }

    public void setItson_id(String itson_id) {
        this.itson_id = itson_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getAdeudo() {
        return adeudo;
    }

    public void setAdeudo(double adeudo) {
        this.adeudo = adeudo;
    }

    public boolean isBecado() {
        return becado;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", carrera=" + carrera + ", itson_id=" + itson_id + ", nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + ", telefono=" + telefono + ", correo=" + correo + ", semestre=" + semestre + ", adeudo=" + adeudo + ", becado=" + becado + ", created_at=" + created_at + ", password=" + password + '}';
    }
    
    
    
}
