import java.util.ArrayList;
import java.util.Random;

public class Sistema {
    private ArrayList<String> Acciones = new ArrayList<String>();
    private Jugador jugador;
    private ArrayList<Enemigo> Enemigos = new ArrayList<Enemigo>();
    private Random random;
    private int numEnemigos;

    public void crearJugador(String[] datos){
        Jugador newJugador = new Jugador(datos[0], datos[1]);
        jugador = newJugador;
    }

    public void crearEnemigos(){
        int randomint = random.nextInt((3-1)+1)+1;
        int randomint2 = random.nextInt((2-1)+1)+1;
        for (int i = 0; i<randomint; i++){
            if (randomint2 == 1){
                crearEnemigo();
            }
            else if(randomint2 == 2){
                crearJefe();
            }
        }
    }

    public void crearEnemigo(){
        int randomTipo = random.nextInt((4 - 1)+1)+1;
        Enemigo newEnemigo = new Enemigo("Enemigo"+numEnemigos, randomTipo);
        Enemigos.add(newEnemigo);
    }

    public void crearJefe(){

    }

    public void atacar(){
        
    }
}
