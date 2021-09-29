import java.util.Random;

public class Combatiente {
    private String nombre;
    private int PuntosVida;
    private int PoderAtaque;
    private Random randomint = new Random();

    Combatiente(String nombre){
        this.nombre = nombre;
        this.PuntosVida = randomint.nextInt((150 - 100) + 1) + 100;
        this.PoderAtaque = randomint.nextInt((30 - 20) + 1) + 20;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosVida() {
        return PuntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        PuntosVida = puntosVida;
    }

    public int getPoderAtaque() {
        return PoderAtaque;
    }

    public void setPoderAtaque(int poderAtaque) {
        PoderAtaque = poderAtaque;
    }

    public void habilidadEspecial(){
        
    }
}
