package acciones;

import enumerados.EntretenimientoEnum;
import modelos.Mascota;

public class Divertirse {
    public void entretenerseCon(EntretenimientoEnum entretenimiento, Mascota mascota){
        if(mascota.isLive()){
            int nivelOriginal = mascota.getNivelAburrimiento();
            if(nivelOriginal != 0){
                mascota.setNivelAburrimiento(mascota.getNivelAburrimiento() - entretenimiento.getDesaburrimiento());
                System.out.println("duke acaba de entretenerse con "
                +entretenimiento
                + " y su aburrimiento que estaba en " + nivelOriginal
                + " descendio a " + mascota.getNivelAburrimiento());
            }else{
                System.out.println("Esta mascota no tiene necesidad de entretenerse su nivel de aburrimiento es cero ");
            }
        }else{
                System.out.println("Lo siengto, esta mascota se encunetra operativa desde " + mascota.getFechaMuerte());
            }
        }

}

