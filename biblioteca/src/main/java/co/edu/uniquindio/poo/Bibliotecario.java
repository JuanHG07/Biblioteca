package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Bibliotecario extends Persona {
    public int salario;
    public int añosAntiguedad;
    public LinkedList<Prestamo> prestamosRealizados = new LinkedList<>();

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, int salario,
            int añosAntiguedad) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        this.añosAntiguedad = añosAntiguedad;
    }

    public void agregarPrestamoBibliotecario(Prestamo prestamo) {
        prestamosRealizados.add(prestamo);
    }

    public int LibrosPrestadosBibliotecario() {
        int total = 0;
        for (Prestamo prestamo : prestamosRealizados) {
            total += prestamo.getCantidadLibros();
        }
        return total;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }

}