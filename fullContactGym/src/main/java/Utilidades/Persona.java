package Utilidades;

import java.io.Serializable;

public class Persona implements Serializable {
    private String id;
    private String nombre;
    private String sexo;
    private String contrasenna;
    private String email;
    private String celular;
    private String fechaDeNacimiento;
    private boolean membresiaActiva;

    public Persona() {
    }

    public Persona(String id, String nombre, String sexo, String contrasenna, String email, String celular, String fechaDeNacimiento, boolean membresiaActiva) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.contrasenna = contrasenna;
        this.email = email;
        this.celular = celular;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.membresiaActiva = membresiaActiva;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public boolean isMembresiaActiva() {
        return membresiaActiva;
    }

    public void setMembresiaActiva(boolean membresiaActiva) {
        this.membresiaActiva = membresiaActiva;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", contrasenna='" + contrasenna + '\'' +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", membresiaActiva=" + membresiaActiva +
                '}';
    }
}