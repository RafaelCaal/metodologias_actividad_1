import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Registro {
    String nombre = "";
    String correo = "";
    String usuario = "";
    String password ="";
    Scanner scanner = new Scanner(System.in);
    ArrayList<Usuario> Usuarios;

    public void registrarUsuario(){
        this.Usuarios = new ArrayList<Usuario>();
        Limpiar.limpiarPantalla();
        System.out.print("Ingrese su nombre completo:\t");
        nombre = scanner.nextLine();
        System.out.print("Ingrese su correo electronico:\t");
        correo = scanner.nextLine();
        System.out.print("Ingrese un nombre de usuario:\t");
        usuario = scanner.nextLine();
        System.out.print("Ingrese una contrasena:\t");
        password = scanner.nextLine();
        
        Usuario nuevoUsuario = new Usuario(nombre, correo, usuario, password);
        Usuarios.add(nuevoUsuario);
        
    }
    


}
