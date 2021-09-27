import java.util.Scanner;

public class Vista {
    Scanner scan = new Scanner(System.in);

    public String[] inicio(){
        String[] datos = new String[2];
        System.out.println("Bienvenidos combatientes");
        System.out.println("¿Cual es el nombre del jugador?");
        String nombre = scan.nextLine();
        datos[0] = nombre;
        boolean right = false;
        while (right == false){
            System.out.println("Elija un rol (1. Guerrero, 2 Explorador)");
            String role = scan.nextLine();
            if (role.equalsIgnoreCase("guerrero") & role.equalsIgnoreCase("explorador")){
                right = true;
                datos[1] = role;
            }
        } 
        right = false;
        while (right == false){
            System.out.println("¿Qué tipo de items quiere? (curar, mejorar ataque, )");
            String tipoItem = scan.nextLine();
            if(){

            }
            else if(){

            }
            else if(){

            }
            
        }
        return datos;
    }

    public int menu(){
        System.out.println("Elija una opción:");
		System.out.println("1. Registrar un nuevo carro");//Le damos todas las opciones disponibles
		System.out.println("2. Eliminar un carro del registro");
		System.out.println("3. Mostrar espacios disponibles");
        System.out.println("4. Mostrar el registro completo");
        System.out.println("5. Mostrar las estadisticas del parqueo");
        System.out.println("6. Agregar mas espacios de parqueo");
        System.out.println("7. Salir/n/n");

        boolean paso = false;
        int option = 0;
        while (paso == false){//Aplicamos un metodo para que escriba el 
            try {
                String optionString = scan.nextLine();//Recibimos el valor como String para evitar un bug con el metodo nextLine()
                option = Integer.parseInt(optionString);//Lo cambiamos a int
                paso = true;
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto, por favor");
            }
        }
        return option;//regresamos el valor convertido
    }
}
