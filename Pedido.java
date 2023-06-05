import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import java.util.ArrayList;

public class Pedido {
    
   
    ArrayList <Pedido> listaPedidos;
    String idPedido = "";
    String nomPedidoEnvia = "";
    String tipoPedido = "";
    String Descripcion = "";
    String fechaEntrega = "";
    String fechaRecoleccion = "";
    String cantidad = "";
    String costo = "";
    String leer = "";
    Scanner scanner = new Scanner(System.in);
    

    public Pedido(String idPedido, String nomPedidoEnvia,
            String tipoPedido, String descripcion, String fechaEntrega, String fechaRecoleccion, String cantidad,
            String costo) {
        this.idPedido = idPedido;
        this.nomPedidoEnvia = nomPedidoEnvia;
        this.tipoPedido = tipoPedido;
        Descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.fechaRecoleccion = fechaRecoleccion;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    //constructor vacio
    public Pedido(){

    }


    public void crearPedido(){

        //inicializamos el arreglo
        listaPedidos = new ArrayList<Pedido>();

        Pedido pedidoUno = new Pedido("1", "Luis Guerra", "Golosinas", "Chocolates con fresa", "16/06/2023", "16/06/2023", "2", "45.80");
        Pedido pedidoDos = new Pedido("2", "Luis Guerra", "Golosinas", "Chocolates con fresa", "16/06/2023", "16/06/2023", "2", "45.80");
        Pedido pedidoTres = new Pedido("3", "Luis Guerra", "Golosinas", "Chocolates con fresa", "16/06/2023", "16/06/2023", "2", "45.80");
        Pedido pedidoCuatro = new Pedido("4", "Luis Guerra", "Golosinas", "Chocolates con fresa", "16/06/2023", "16/06/2023", "2", "45.80");
        Pedido pedidoCinco = new Pedido("5", "Luis Guerra", "Golosinas", "Chocolates con fresa", "16/06/2023", "16/06/2023", "2", "45.80");
        Pedido pedidoSeis = new Pedido("6", "Luis Guerra", "Golosinas", "Chocolates con fresa", "16/06/2023", "16/06/2023", "2", "45.80");
        Pedido pedidoSiete = new Pedido("7", "Luis Guerra", "Golosinas", "Chocolates con fresa", "16/06/2023", "16/06/2023", "2", "45.80");
        Pedido pedidoOcho = new Pedido("8", "Luis Guerra", "Golosinas", "Chocolates con fresa", "16/06/2023", "16/06/2023", "2", "45.80");

        this.listaPedidos.add(pedidoUno);
        this.listaPedidos.add(pedidoDos);
        this.listaPedidos.add(pedidoTres);
        this.listaPedidos.add(pedidoCuatro);
        this.listaPedidos.add(pedidoCinco);
        this.listaPedidos.add(pedidoSeis);
        this.listaPedidos.add(pedidoSiete);
        this.listaPedidos.add(pedidoOcho);
       
    
    }
 
public void verListaPedidos(){
    crearPedido();
    
    System.out.println(listaPedidos.get(0));
    
    for(int i=0; i<listaPedidos.size(); i++){
        System.out.println(listaPedidos.get(i));
    }   

    System.out.print("\nIngrese 0 para regresar:\t");
    leer = scanner.nextLine();
}

@Override
public String toString() {
    return "Pedido [idPedido=" + idPedido + ", nomPedidoEnvia=" + nomPedidoEnvia + ", tipoPedido=" + tipoPedido
            + ", Descripcion=" + Descripcion + ", fechaEntrega=" + fechaEntrega + ", fechaRecoleccion="
            + fechaRecoleccion + ", cantidad=" + cantidad + ", costo=" + costo + "]";
}







}
