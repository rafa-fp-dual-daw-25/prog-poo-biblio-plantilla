import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Autor> autores = new ArrayList<>();
    static ArrayList<Libro> libros = new ArrayList<>();
    static ArrayList<Revista> revistas = new ArrayList<>();

    public static void main(String[] args) {
        // ----------------IMPORTANTE-------------------:
        // Cuando tengas las clases creadas descomenta las lineas de arriba (inicialización de arrays)
        // y el método createBD();
        createBD();
        start();
    }


    public static void start() {
        while (true) {

            System.out.println("\n********************** Biblioteca *****************************");
            System.out.println("\n\t1. Crear libro.\t\t\t\t\t5. Ver libros.");
            System.out.println("\n\t2. Crear revista.\t\t\t\t6. Ver revistas.");
            System.out.println("\n\t3. Crear autor.\t\t\t\t\t7. Ver libros de un autor.");
            System.out.println("\n\t4. Asignar autor a libro.\t\t0. Exit.");
            System.out.println("\n**************************************************************************");

            Scanner scanner = new Scanner(System.in);
            try {

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:
                        System.out.println("--- Listado de Libros (" + libros.size() + " en total) ---");
                        if (libros.isEmpty()) {
                            System.out.println("No hay libros registrados en la biblioteca.");
                        } else {
                            for (Libro libro : libros) {
                                System.out.println("• " + libro.info());
                            }
                        }
                        break;
                    case 6:
                        System.out.println("--- Listado de Revistas (" + revistas.size() + " en total) ---");
                        if (revistas.isEmpty()) {
                            System.out.println("No hay revistas registradas en la biblioteca.");
                        } else {
                            for (Revista revista : revistas) {
                                System.out.println("• " + revista.info());
                            }
                        }
                        break;
                    case 7:
                        System.out.println("--- Ver libros por autor ---");
                        System.out.println("Autores disponibles:");
                        for (Autor autor : autores) {
                            System.out.println("ID: " + autor.getId() + " - " + autor.getNombre() + " " + autor.getApellido());
                        }

                        System.out.println("\nIngrese el ID del autor:");
                        int idBuscado = scanner.nextInt();

                        Autor autorEncontrado = null;

                        for (Autor autor : autores) {
                            if (autor.getId() == idBuscado) {
                                autorEncontrado = autor;
                                break;
                            }
                        }

                        if (autorEncontrado != null) {
                            System.out.println("\nLibros de " + autorEncontrado.getNombre() + " " + autorEncontrado.getApellido() + ":");
                            if (autorEncontrado.libros.isEmpty()) {
                                System.out.println("Este autor no tiene libros asignados.");
                            } else {
                                for (Libro libro : libros) {
                                    System.out.println("• " + libro.info());
                                }
                            }
                        } else {
                            System.err.println("[ERROR] Autor con ID " + idBuscado + " no encontrado.");
                        }

                        break;
                    case 0:
                        System.out.println("Adios!");
                        System.exit(0);
                    default:
                        System.err.println("[ERROR] Your option is incorrect!! Try again!!");
                }

            } catch (InputMismatchException var2) {
                System.err.println("[ERROR] You must type a number!!!");
                scanner.next();
            } catch (Exception var3) {
                System.err.println(var3.getMessage());
            }
        }
    }

    public static void createBD() {

        // =====================
        // AUTORES
        // =====================
        Autor autor1 = new Autor(1, "Gabriel", "García Márquez");
        Autor autor2 = new Autor(2, "John", "Tolkien");
        Autor autor3 = new Autor(3, "George", "Orwell");
        Autor autor4 = new Autor(4, "Isaac", "Asimov");
        Autor autor5 = new Autor(5, "Stephen", "King");
        Autor autor6 = new Autor(6, "Jules", "Verne");

        autores.add(autor1);
        autores.add(autor2);
        autores.add(autor3);
        autores.add(autor4);
        autores.add(autor5);
        autores.add(autor6);

        // =====================
        // LIBROS
        // =====================
        Libro libro1 = new Libro("Cien años de soledad", 1967, Genero.FICTION, "111-111-111", 417);
        Libro libro2 = new Libro("El amor en los tiempos del cólera", 1985, Genero.FICTION, "111-111-112", 490);

        Libro libro3 = new Libro("El señor de los anillos", 1954, Genero.FANTASY, "222-222-222", 1200);
        Libro libro4 = new Libro("El Hobbit", 1937, Genero.FANTASY, "222-222-223", 310);

        Libro libro5 = new Libro("1984", 1949, Genero.FICTION, "333-333-333", 328);
        Libro libro6 = new Libro("Rebelión en la granja", 1945, Genero.FICTION, "333-333-334", 112);

        Libro libro7 = new Libro("Fundación", 1951, Genero.SCIENCE_FICTION, "444-444-444", 255);
        Libro libro8 = new Libro("Yo, Robot", 1950, Genero.SCIENCE_FICTION, "444-444-445", 272);

        Libro libro9 = new Libro("It", 1986, Genero.FICTION, "555-555-555", 1138);
        Libro libro10 = new Libro("El resplandor", 1977, Genero.FICTION, "555-555-556", 447);

        Libro libro11 = new Libro("Viaje al centro de la Tierra", 1864, Genero.SCIENCE_FICTION, "666-666-666", 320);
        Libro libro12 = new Libro("La vuelta al mundo en 80 días", 1872, Genero.FICTION, "666-666-667", 300);


        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        libros.add(libro5);
        libros.add(libro6);
        libros.add(libro7);
        libros.add(libro8);
        libros.add(libro9);
        libros.add(libro10);
        libros.add(libro11);
        libros.add(libro12);


        // =====================
        // REVISTAS
        // =====================
        Revista revista1 = new Revista("National Geographic", 2023, Genero.HISTORY, 101, Frecuencia.MONTHLY);
        Revista revista2 = new Revista("Science", 2024, Genero.SCIENCE_FICTION, 58, Frecuencia.WEEKLY);
        Revista revista3 = new Revista("MIT Technology Review", 2023, Genero.TECHNOLOGY, 12, Frecuencia.MONTHLY);
        Revista revista4 = new Revista("Historia y Vida", 2022, Genero.HISTORY, 744, Frecuencia.MONTHLY);
        Revista revista5 = new Revista("Muy Interesante", 2023, Genero.TECHNOLOGY, 452, Frecuencia.MONTHLY);
        Revista revista6 = new Revista("Año Cero", 2023, Genero.FANTASY, 300, Frecuencia.MONTHLY);

        revistas.add(revista1);
        revistas.add(revista2);
        revistas.add(revista3);
        revistas.add(revista4);
        revistas.add(revista5);
        revistas.add(revista6);


        // ===== Añadir libros a autores =====
        autor1.addLibro(libro1);
        autor1.addLibro(libro2);

        autor2.addLibro(libro3);
        autor2.addLibro(libro4);

        autor3.addLibro(libro5);
        autor3.addLibro(libro6);

        autor4.addLibro(libro7);
        autor4.addLibro(libro8);

        autor5.addLibro(libro9);
        autor5.addLibro(libro10);

        autor6.addLibro(libro11);
        autor6.addLibro(libro12);

        // ===== Establecer autor en cada libro =====
        libro1.setAutor(autor1);
        libro2.setAutor(autor1);

        libro3.setAutor(autor2);
        libro4.setAutor(autor2);

        libro5.setAutor(autor3);
        libro6.setAutor(autor3);

        libro7.setAutor(autor4);
        libro8.setAutor(autor4);

        libro9.setAutor(autor5);
        libro10.setAutor(autor5);

        libro11.setAutor(autor6);
        libro12.setAutor(autor6);

    }
}