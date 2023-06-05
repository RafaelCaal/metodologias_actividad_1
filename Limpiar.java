public class Limpiar {
    
    public static void limpiarPantalla(){
        try{	
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception E){
            System.out.println(E);
        }
    }
    

}
