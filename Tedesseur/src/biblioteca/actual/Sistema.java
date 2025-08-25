package biblioteca.actual;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Usuario> usuarios;
    private HashSet<LibroVirtual> todosLosLibros;

    public Sistema(HashSet<Usuario> usuarios, HashSet<LibroVirtual> todosLosLibros) {
        this.usuarios = usuarios;
        this.todosLosLibros = todosLosLibros;
    }

    public Sistema() {
        this.usuarios = new HashSet<>();
        this.todosLosLibros = new HashSet<>();
    }

    public HashSet<Usuario> getusuarios() {
        return usuarios;
    }

    public void setusuarios(HashSet<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public HashSet<LibroVirtual> getTodosLosLibros() {
        return todosLosLibros;
    }

    public void setTodosLosLibros(HashSet<LibroVirtual> todosLosLibros) {
        this.todosLosLibros = todosLosLibros;
    }

    public void agregarLibro(LibroVirtual libro){
        this.todosLosLibros.add(libro);
    }

    public void borrarLibro(LibroVirtual libro){
        this.todosLosLibros.remove(libro);
    }

    public void modificarLibro(LibroVirtual libroNuevo, LibroVirtual libroViejo){
        this.agregarLibro(libroNuevo);
        this.borrarLibro(libroViejo);
    }

    public void agregarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

    public void borrarUsuario(Usuario usuario){
        this.usuarios.remove(usuario);
    }

    public void modificarUsuarios(Usuario usuarioNuevo, Usuario usuarioViejo){
        this.agregarUsuario(usuarioNuevo);
        this.borrarUsuario(usuarioViejo);
    }
}
