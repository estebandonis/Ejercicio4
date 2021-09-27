public class Controlador {
    private Sistema sistem = new Sistema();
    private Vista vista = new Vista();
    private int opcion;

    public void menu(){
        while (opcion != 7){
            opcion = vista.menu();
            if (opcion == 1){
                
            }
            else if (opcion == 2){
                
            }
            else if (opcion == 3){
                
            }
            else if (opcion == 4){
                
            }
            else if (opcion == 5){
                
            }
            else if (opcion == 6){
                
            }
            else if (opcion == 7){
                System.exit(0);//Se sale del programa
            }
            else{
                System.out.println("Elija una opcion valida");
            }
        }
    }
}
