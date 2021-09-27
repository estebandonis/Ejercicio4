public class Enemigo extends Combatiente{
    String tipo;

    Enemigo(String nombre, int tipo){
        super(nombre);

        if (tipo == 1){
            this.tipo = "Venenoso";
        }
        else if (tipo == 2){
            this.tipo = "Fuego";
        }
        else if (tipo == 3){
            this.tipo = "Hielo";
        }
        else if (tipo == 4){
            this.tipo = "Tierra";
        }
    }

    public void habilidadEspecial(){
        
    }
}
