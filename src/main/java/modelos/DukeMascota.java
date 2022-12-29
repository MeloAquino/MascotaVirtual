package modelos;

public class DukeMascota extends Mascota{

    public DukeMascota(String nombre, String propietario){
        super(nombre, propietario);
    }

    @Override
    public String toString() {
        return " La Mascota de nombre :  " + nombre + '\n'
        + " nacio el dia " + fechaNacimiento.getDayOfWeek() + ","
                + fechaNacimiento.getDayOfMonth() + " de "
                + fechaNacimiento.getMonth() + " del año "
                + fechaNacimiento.getYear() + '\n'
        + " a la hora : " + fechaNacimiento.getHour() + ":"
                + fechaNacimiento.getMinute() + '\n'
        + " actualmente se encuentra " + ( (isLive) ? "vivo\n" : "muerto\n")
                + " su nivel de energia se encuentra en : " + nivelEnergia +  "%\n"
                + " su nivel de hambre en : " + nivelHambre + '\n'
        + " nivel de cansancio : " + nivelCansancio + '\n'
        + " nivel de felicidad : " + nivelFelicidad + '\n'
        + " nivel de aburrimiento : " + nivelAburrimiento + '\n'
        + " Y su actual propietario es : " + propietario + '\n';
    }

    private static int count;
}


