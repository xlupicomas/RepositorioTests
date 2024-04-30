package gradletests;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public class Libro {
        private String nombre;
        private String autor;

        public Libro(String nombre, String autor) {
            this.nombre = nombre;
            this.autor = autor;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }
    }

    public class Biblioteca {
        private ArrayList<Libro> libros;
    
        public Biblioteca() {
            libros = new ArrayList<>();
        }
    
        public ArrayList<Libro> anadirLibros(Libro libro) {
            libros.add(libro);
            return libros;
        }
    
        public ArrayList<Libro> eliminarLibros(String nombre) {
            if (nombre == null) {
                libros.removeIf(libro -> libro.getNombre() == null);
            } else {
                libros.removeIf(libro -> nombre.equals(libro.getNombre()));
            }
            return libros;
        }
    
        public ArrayList<Libro> llistar_llibres() {
            return libros;
        }
    }

    public class Usuario {
        private String nombre;
        private String correo;

        public Usuario(String nombre, String correo) {
            this.nombre = nombre;
            this.correo = correo;
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
    }

    public class Usuarios {
        private ArrayList<Usuario> usuarios;

        public Usuarios() {
            usuarios = new ArrayList<Usuario>();
        }

        public String getNombre(int i) {
            return usuarios.get(i).getNombre();
        }

        public String getCorreo(int i) {
            return usuarios.get(i).getCorreo();
        }

        public ArrayList<Usuario> anadirUsuario(Usuario usuario) {
            usuarios.add(usuario);
            return usuarios;
        }

        public void verUsuarios() {
            for (Usuario usuario : usuarios) {
                System.out.println(usuario.getNombre() + " - " + usuario.getCorreo());
            }
        }

        public ArrayList<Usuario> eliminarUsuario(String nombre) {
            if (nombre == null) {
                usuarios.removeIf(usuario -> usuario.getNombre() == null);
            } else {
                usuarios.removeIf(usuario -> nombre.equals(usuario.getNombre()));
            }
            return usuarios;
        }
    }

    public class Lecturas {
        private HashMap<Object, ArrayList<Libro>> leidos;

        public Lecturas() {
            leidos = new HashMap<>();
        }

        public HashMap<Object, ArrayList<Libro>> anadirLibro(ArrayList<Libro> libros, Object usuario) {
            leidos.put(usuario, libros);
            return leidos;
        }

        public ArrayList<Libro> getLibrosLeidos(Object usuario) {
            return leidos.get(usuario);
        }
    }
}
