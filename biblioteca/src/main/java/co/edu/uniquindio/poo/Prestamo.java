package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.time.Period;

public class Prestamo {
    public String codigo;
    public LocalDate fechaPrestamo;
    public LocalDate fechaEntrega;
    public LinkedList<Libro> librosPrestados;
    public LinkedList<Estudiante> estudiantes;

    public Prestamo(String codigo, LocalDate fechaPrestamo, LocalDate fechaEntrega) {
        this.codigo = codigo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.librosPrestados = new LinkedList<>();
        this.estudiantes = new LinkedList<>();
    }

    public void agregarLibroPrestamo(Libro libro) {
        librosPrestados.add(libro);
        int cantidad = libro.getUnidadesDisponibles();
        libro.setUnidadesDisponibles(cantidad - 1);
        libro.cambiarEstado();
    }

    public int calcularDiasPrestamo() {
        Period period = Period.between(fechaPrestamo, fechaEntrega);
        int dias = period.getYears() * 365 + period.getMonths() * 30 + period.getDays();
        return dias;
    }

    public int dineroPrestamos() {
        int costoDelPrestamo = 1000;
        int dias = calcularDiasPrestamo();
        int costoTotalPrestamo = costoDelPrestamo * dias;
        return costoTotalPrestamo;
    }

    public void EntregarPrestamo(Libro libro) {
        dineroPrestamos();
        System.out.println("El costo del prestamo es:" + dineroPrestamos());
        int cantidad = libro.getUnidadesDisponibles();
        libro.setUnidadesDisponibles(cantidad + 1);
        libro.cambiarEstado();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LinkedList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(LinkedList<Libro> libros) {
        this.librosPrestados = libros;
    }

    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
