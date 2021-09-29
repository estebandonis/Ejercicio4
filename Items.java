import java.util.Random;

public class Items {
    private int cantidad;
    Random randomint = new Random();

    Items(int cantidad){
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Jugador usar(Jugador player){
        int random = randomint.nextInt((2-1)+1)+1;
        if (random == 1){
            player = curar(player);
        }
        else{
            player = mejorar(player);
        }
        return player;
    }

    private Jugador curar(Jugador player){
        int vida = player.getPuntosVida();
        vida += 150;
        player.setPuntosVida(vida);
        return player; 
    }

    private Jugador mejorar(Jugador player){
        int fuerza = player.getPoderAtaque();
        fuerza += 60;
        player.setPoderAtaque(fuerza);
        return player;
    }
}
