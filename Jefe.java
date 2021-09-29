public class Jefe extends Enemigo {
    Jefe (String nombre, int tipo){
        super(nombre, tipo);
        super.setPoderAtaque(super.getPoderAtaque()*2);
        super.setPuntosVida(super.getPuntosVida()*2);
    }

    public void habilidadEspecial2(){
        Habilidades habilidad = getHabilidad();
        Enemigo enemy = habilidad.usar(this);
        this.setPoderAtaque(enemy.getPoderAtaque());
        this.setPuntosVida(enemy.getPuntosVida());
    }

    public Jugador atacar(Jugador player){
        int cantidadVida = player.getPuntosVida();
        cantidadVida -= super.getPoderAtaque();
        player.setPuntosVida(cantidadVida);
        return player;
    }

    public String toString(){
        return "'Te destruire de un golpe'";
    }
}
