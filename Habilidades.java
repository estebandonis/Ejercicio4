import java.util.Random;

public class Habilidades {
    private String tipo;
    Random randomint = new Random();

    Habilidades(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public Enemigo usar(Enemigo enemy){
        int random = randomint.nextInt((2-1)+1)+1;
        if (random == 1){
            enemy = curar(enemy);
        }
        else{
            enemy = mejorar(enemy);
        }
        return enemy;
    }

    private Enemigo curar(Enemigo enemy){
        int vida = enemy.getPuntosVida();
        vida += 100;
        enemy.setPuntosVida(vida);
        return enemy; 
    }

    private Enemigo mejorar(Enemigo enemy){
        int fuerza = enemy.getPoderAtaque();
        fuerza += 30;
        enemy.setPoderAtaque(fuerza);
        return enemy;
    }
}
