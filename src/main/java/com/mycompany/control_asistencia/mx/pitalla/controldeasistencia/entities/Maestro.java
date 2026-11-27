
package com.mycompany.control_asistencia.mx.pitalla.controldeasistencia.entities;


public class Maestro {
    
    private int id;
    private Carrera carrera;
    itson_id;
    private String nombre;
    private String correo;
    private String telefono;
    private String rfc;
    private String password;

    public Maestro(int id, Carrera carrera, itson_id , String nombre, String correo, String telefono, String rfc, String password) {
        this.id = id;
        this.carrera = carrera;
        this.<error> = <error>;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.rfc = rfc;
        this.password = password;
        
        
        
    }

    public Maestro() {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Maestro{" + "id=" + id + ", carrera=" + carrera + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono + ", rfc=" + rfc + ", password=" + password + '}';
    }
    
    
    
    
    
    
}



