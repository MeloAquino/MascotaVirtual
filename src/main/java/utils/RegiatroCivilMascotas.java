package utils;

import modelos.Mascota;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class RegiatroCivilMascotas {

    static FileInputStream input;
    static FileOutputStream output;

    private static final String RUTA = "src/main/java/utils/actas/";

    public static void confeccionarActa(Mascota mascota){
        if(!mascota.isLive()){
            String actaDefuncion = "ACTA DEFUNCION DE " + mascota.getNombre()
                    +"\nFECHA DE FALLECIMIENTO : " + mascota.getFechaMuerte().toLocalDate()
                    + "\nA LA HORA : " + mascota.getFechaMuerte().toLocalTime().getHour()
                    + " : " + + mascota.getFechaMuerte().toLocalTime().getMinute()
                    + "\nCAUSA DE MUERTE :" +mascota.getCausaDeMuerte().toString();
            mascota.setActaDefuncion(actaDefuncion);
        }

        String actaNacimiento = "ACTA DE NACIMIENTO DE " + mascota.getNombre()
                +"\nFEHA DE NACIMIENTO : " + mascota.getFechaNacimiento().toLocalDate()
                +"\nA LA HORA : " + mascota.getFechaNacimiento().toLocalTime().getHour()
                + " : " +mascota.getFechaNacimiento().toLocalTime().getMinute()
                +"\n SU FAMILIAR MAS CERCANO ES : " + mascota.getPropietario();
        mascota.setActaDeNacimiento(actaNacimiento);
    }

    public static void guardarActa(Mascota mascota){
        System.out.println();
        if (!mascota.isLive() && mascota.getActaDefuncion() != null){
            try {
                output = new FileOutputStream(RUTA + mascota.getNombre() + "Defuncion " + ".txt");
                output.write(mascota.getActaDefuncion().getBytes());
             System.out.println("Acta defuncion archivada");
             output.close();
        } catch (IOException e){
                throw new RuntimeException(e);
            }
    }
        try {output= new FileOutputStream(RUTA + mascota.getNombre() + "Nacimiento " + ".txt");
            output.write(mascota.getActaDeNacimiento().getBytes());
            System.out.println("Acta Nacimiento archivada");
            output.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        }

}

