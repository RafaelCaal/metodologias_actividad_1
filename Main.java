import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 6;
        String leer = "";
       
        while(opcion != 4){
            Limpiar.limpiarPantalla();

            System.out.println("<> Control de pedidos <>\n");
            System.out.println("1. Registrarse");
            System.out.println("2. Ingresar");
            System.out.println("3. Ver pedidos");
            System.out.println("4. Salir\n");
            System.out.print("Ingrese una opcion:\t");
            leer =  scanner.nextLine();
            opcion = Integer.parseInt(leer);

            if(opcion == 1){
                Registro registrarNuevo = new Registro();
                registrarNuevo.registrarUsuario();
               
            }

            if(opcion == 3){
                Pedido ver = new Pedido();
                ver.verListaPedidos();
            }


        }

    }

}