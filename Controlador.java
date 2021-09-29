

public class Controlador {

    public static void main(String[] args) {
        Sistema sistem = new Sistema();
        Vista vis = new Vista();
        int opcion = 0;
        String turno = "jugador";

        String[] datos = vis.inicio();
        sistem.crearJugador(datos);
        sistem.crearEnemigos();
        vis.iniciar(sistem.getEnemigos(), sistem.getJugador());
        
        while (opcion != 7){
            if (sistem.getPerdedor() != null){
                vis.perdedor(sistem.getPerdedor());
                vis.despedida();
                System.exit(0);//Se sale del programa
            }
            else {
                vis.desplegarEstadisticas(sistem.getEnemigos(), sistem.getJugador());
                opcion = vis.menu(turno);
                if (opcion == 1){
                    if (turno.equalsIgnoreCase("jugador")){
                        turno = sistem.atacarEnemigo(vis.enemigoAAtacar(sistem.getEnemigos()), turno);
                    }
                    else if (turno.equalsIgnoreCase("enemigo")){
                        turno = sistem.atacarJugador(turno);
                    }
                }
                else if (opcion == 2){
                    turno = sistem.pasarTurno(turno);
                }
                else if (opcion == 3){
                    turno = sistem.usarHabilidad(turno);
                }
                else if (opcion == 4){
                    System.exit(0);//Se sale del programa
                }
                else{
                    System.out.println("Elija una opcion valida");
                }
            }
            
        }
    }
}
