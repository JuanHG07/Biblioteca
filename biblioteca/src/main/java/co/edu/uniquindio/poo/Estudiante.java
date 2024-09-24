package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Estudiante extends Persona {
    public LinkedList<Prestamo> prestamos = new LinkedList<>();

    public Estudiante(String nombre, String cedula, String telefono, String correo) {
        super(nombre, cedula, telefono, correo);
    }

    public LinkedList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(LinkedList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

}