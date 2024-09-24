package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Biblioteca {
    public String nombre;
    public LinkedList<Bibliotecario> bibliotecarios;
    public LinkedList<Estudiante> estudiantes;
    public LinkedList<Libro> libros;
    public LinkedList<Prestamo> prestamos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        estudiantes = new LinkedList<>();
        bibliotecarios = new LinkedList<>();
        prestamos = new LinkedList<>();
        libros = new LinkedList<>();
    }

    public static Estudiante crearEstudiante(String nombre, String cedula, String telefono, String correo) {
        Estudiante estudiante = new Estudiante(nombre, cedula, telefono, correo);
        return estudiante;
    }

    public static Bibliotecario crearBibliotecario(String nombre, String cedula, String telefono, String correo, int salario, int añosAntiguedad) {
        Bibliotecario bibliotecario = new Bibliotecario(nombre, cedula, telefono, correo, salario, añosAntiguedad);
        return bibliotecario;
    }

    public static Prestamo crearPrestamo(String codigo, LocalDate fechaPrestamo, LocalDate fechaEntrega) {
        Prestamo prestamo = new Prestamo(codigo, fechaPrestamo, fechaEntrega);
        return prestamo;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void consultarLibro(String codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                libro.toString();
            }
        }
    }

    public void reemplazarLibro(String codigo, Libro libroNuevo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                libros.remove(libro);
            }
        }
        libros.add(libroNuevo);
    }

    public void consultarPrestamo(String codigo) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                prestamo.toString();
            }
        }
    }

    public int consultarLibroEnPrestamoNombre(String nombre) {
        int contador = 0;
        for (Prestamo prestamo : prestamos) {
            LinkedList<Libro> librosPrestados = prestamo.getLibrosPrestados();
            for (Libro libro : librosPrestados) {
                if (libro.getNombre().equals(nombre)) {
                    contador += 1;
                }
            }

        }
        return contador;
    }

    public void EstudianteMasPrestamos() {
        int mayor = 0;
        int indiceMayor = 0;
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante estudiante = estudiantes.get(i);
            int contador = 0;
            for (Prestamo prestamo : estudiante.getPrestamos()) {
                contador += 1;
            }
            if (contador > mayor) {
                mayor = contador;
                indiceMayor = i;
            }
        }
        Estudiante estudianteMayor = estudiantes.get(indiceMayor);
        estudianteMayor.toString();
    }

    public int dineroRecaudado() {
        int dineroTotalRecaudado = 0;
        for (Prestamo prestamo : prestamos) {
            int dinero = prestamo.dineroPrestamos();
            dineroTotalRecaudado += dinero;
        }
        return dineroTotalRecaudado;
    }
}