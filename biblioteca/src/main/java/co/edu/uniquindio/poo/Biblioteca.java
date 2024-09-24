package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Biblioteca {
    public String nombre;
    public LinkedList<Bibliotecario> bibliotecarios;
    public LinkedList<Estudiante> estudiantes;
    public LinkedList<Libro> libros;
    public LinkedList<Prestamo> prestamos;

    /**
     * Metodo Constructor de Biblioteca
     * @param nombre
     */
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        estudiantes = new LinkedList<>();
        bibliotecarios = new LinkedList<>();
        prestamos = new LinkedList<>();
        libros = new LinkedList<>();
    }

    /**
     * Metodo para obtener el nombre de la biblioteca
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para cambiar el nombre de la biblioteca
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para crear un estudiante
     * @param nombre
     * @param cedula
     * @param telefono
     * @param correo
     * @return Estudiante Nuevo
     */
    public static Estudiante crearEstudiante(String nombre, String cedula, String telefono, String correo) {
        Estudiante estudiante = new Estudiante(nombre, cedula, telefono, correo);
        return estudiante;
    }

    /**
     * Metodo para crear un bibliotecario
     * @param nombre
     * @param cedula
     * @param telefono
     * @param correo
     * @param salario
     * @param añosAntiguedad
     * @return Bibliotecario Nuevo
     */
    public static Bibliotecario crearBibliotecario(String nombre, String cedula, String telefono, String correo,
            int salario, int añosAntiguedad) {
        Bibliotecario bibliotecario = new Bibliotecario(nombre, cedula, telefono, correo, salario, añosAntiguedad);
        return bibliotecario;
    }

    /**
     * Metodo para crear un prestamo
     * @param codigo
     * @param fechaPrestamo
     * @param fechaEntrega
     * @return Prestamo Nuevo
     */
    public static Prestamo crearPrestamo(String codigo, LocalDate fechaPrestamo, LocalDate fechaEntrega) {
        Prestamo prestamo = new Prestamo(codigo, fechaPrestamo, fechaEntrega);
        return prestamo;
    }

    /**
     * Metodo para agregar un estudiante a la biblioteca
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    /**
     * Metodo para agregar un bibliotecario a la biblioteca
     * @param bibliotecario
     */
    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }

    /**
     * Metodo para agregar un libro a la biblioteca
     * @param libro
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Metodo para consultar un libro con su codigo
     * @param codigo
     */
    public void consultarLibro(String codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                libro.toString();
            }
        }
    }

    /**
     * Metodo para reemplazar un libro con su codigo a un libro nuevo
     * @param codigo
     * @param libroNuevo
     */
    public void reemplazarLibro(String codigo, Libro libroNuevo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                libros.remove(libro);
            }
        }
        libros.add(libroNuevo);
    }

    /**
     * Metodo para consultar un prestamo con su codigo
     * @param codigo
     */
    public void consultarPrestamo(String codigo) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                prestamo.toString();
            }
        }
    }

    /**
     * Metodo para obetener la cantidad de prestamos que esta incluido un libro por su nombre
     * @param nombre
     * @return Cantidad Prestamos Contenido
     */
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

    /**
     * Metodo que obtiene el estudiante con mayor numero de prestamos
     */
    public void EstudianteMasPrestamos() {
        int mayor = 0;
        int indiceMayor = 0;
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante estudiante = estudiantes.get(i);
            int contador = 0;
            for (@SuppressWarnings("unused")
            Prestamo prestamo : estudiante.getPrestamos()) {
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

    /**
     * Metodo para calcular el dinero obtenido en total por medio de los prestamos
     * @return Dinero Total
     */
    public int dineroRecaudado() {
        int dineroTotalRecaudado = 0;
        for (Prestamo prestamo : prestamos) {
            int dinero = prestamo.dineroPrestamos();
            dineroTotalRecaudado += dinero;
        }
        return dineroTotalRecaudado;
    }

}