import java.util.Random;

public class Jugador extends Combatiente {
    private String Rol;
    private Items item;
    private Random random = new Random();

    Jugador(String nombre, String Rol){
        super(nombre);
        this.Rol = Rol;
        if (Rol.equalsIgnoreCase("guerrero")){
            setPuntosVida(random.nextInt((300 - 250)+1)+250);
            setPoderAtaque(random.nextInt((100 - 80)+1)+80);
            int cantidadItems = random.nextInt((5 - 3)+1)+3;
            item = new Items(cantidadItems);
        }
        else if(Rol.equalsIgnoreCase("explorador")){
            setPuntosVida(random.nextInt((150 - 100)+1)+100);
            setPoderAtaque(random.nextInt((60 - 50)+1)+50);
            int cantidadItems = random.nextInt((15 - 10)+1)+10;
            item = new Items(cantidadItems);
        }
    }

    public String getRol() {
        return Rol;
    }

    public Items getItem() {
        return item;
    }

    public void setItem(Items item) {
        this.item = item;
    }

    public void habilidadEspecial(){
        Jugador jugador = item.usar(this);
        this.setPoderAtaque(jugador.getPoderAtaque());
        this.setPuntosVida(jugador.getPuntosVida());
    }

    public Enemigo atacar(Enemigo enemy){
        int cantidadVida = enemy.getPuntosVida();
        cantidadVida -= super.getPoderAtaque();
        enemy.setPuntosVida(cantidadVida);
        return enemy;
    }

    public String toString(){
        return "'Iniciemos la batalla con valentia'";
    }
}
