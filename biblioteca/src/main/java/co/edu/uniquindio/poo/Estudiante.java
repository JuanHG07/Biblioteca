package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Estudiante extends Persona {
    public String correo;
    public LinkedList<Prestamo> prestamos = new LinkedList<>();

    /**
     * Metodo constructor de estudiante
     * @param nombre
     * @param cedula
     * @param telefono
     * @param correo
     */
    public Estudiante(String nombre, String cedula, String telefono, String correo) {
        super(nombre, cedula, telefono);
        this.correo = correo;
    }

    /**
     * Metodo para obtener los prestamos realizados por el estudiante
     * @return
     */
    public LinkedList<Prestamo> getPrestamos() {
        return prestamos;
    }

    /**
     * Metodo para cambiar los prestamos realizados por el estudiante
     * @param prestamos
     */
    public void setPrestamos(LinkedList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    /**
     * Metodo para obtener el correo del estudiante
     * @return
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Metodo para cambiar el correo del estudiante
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

}