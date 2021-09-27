import java.util.Random;

public class Jugador extends Combatiente {
    private String Rol;
    private int Items;
    private Random random = new Random();

    Jugador(String nombre, String Rol){
        super(nombre);
        this.Rol = Rol;
        if (Rol.equalsIgnoreCase("guerrero")){
            setPuntosVida(random.nextInt((300 - 250)+1)+250);
            setPoderAtaque(random.nextInt((100 - 80)+1)+80);
            Items = random.nextInt((5 - 3)+1)+3;
        }
        else if(Rol.equalsIgnoreCase("explorador")){
            setPuntosVida(random.nextInt((150 - 100)+1)+100);
            setPoderAtaque(random.nextInt((60 - 50)+1)+50);
            Items = random.nextInt((15 - 10)+1)+10;
        }
    }

    public String getRol() {
        return Rol;
    }

    public int getItems() {
        return Items;
    }

    public void setItems(int items) {
        Items = items;
    }

    public void habilidadEspecial(){
        
    }
}
