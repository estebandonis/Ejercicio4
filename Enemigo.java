public class Enemigo extends Combatiente{
    private String tipo;
    private Habilidades habilidad;

    Enemigo(String nombre, int tipo){
        super(nombre);

        if (tipo == 1){
            this.tipo = "Venenoso";
            habilidad = new Habilidades(this.tipo);
        }
        else if (tipo == 2){
            this.tipo = "Fuego";
        }
    }

    public String getTipo() {
        return tipo;
    }
    public Habilidades getHabilidad() {
        return habilidad;
    }

    public void habilidadEspecial(){
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
        return "'No dejen al jugador salir con vida'";
    }
}
