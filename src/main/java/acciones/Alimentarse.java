package acciones;

import enumerados.AlmacenAlimentos;
import modelos.Mascota;

public class Alimentarse {
    private AlmacenAlimentos comida;

    public void ingerirAlimentos(AlmacenAlimentos comida, Mascota mascota){
        if(Mascota.isLive()){
            mascota.setNivelEnergia(mascota.getNivelEnergia() + comida.getEnergiaAportada());


            System.out.println("duke come " + comida + "y su energia sube a " + mascota.getEnergiaAportada());
        } else {
            System.out.println("Lo siento, esta mascota no se encuentra operativa desde " + mascota.getFechaMuerte());
        }
}
private void contabilizadorComida(Mascota mascota){
        Mascota.setComidasIngeridas(mascota.getComidasIngeridas() +  1);
}
public void ingerirAlimento(AlmacenAlimentos comida, Mascota mascota){
        if (mascota.isLive()){
            mascota.setNivelEnergia(mascota.getNivelEnergia() + comida.getEnergiaAportada());
            contabilizadorComida(mascota);
            if (mascota.getPopo().tieneQueEvacuar(mascota)){
                mascota.setNivelEnergia(mascota.getNivelEnergia() - 15);
                Morir.ckeckStatusGeneral(mascota);
                if (mascota.isLive()){
                    System.out.println("Esta mascota necesita ir al baño ");
                } else {
                    Morir.ckeckStatusGeneral(mascota);
                    System.out.println("Esta mascota necesita ir al baño ");
                }

            }  else {
                Morir.ckeckStatusGeneral(mascota);
                System.out.println("Lo siento, esta mascota no se encunetra operativa desde "
                        + mascota.getFechaMuerte().toLocalDate());
            }
            } else {
            System.out.println("duke come " + comida + " y su energia sube a " + mascota.getNivelEnergia());
        }
}
}
