package modelos;

import acciones.Alimentarse;
import acciones.Divertirse;
import acciones.Dormir;
import acciones.HacerPopo;
import enumerados.AlmacenAlimentos;
import enumerados.EntretenimientoEnum;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Mascota {
    public Object setActaDeNacimiento;
    protected String nombre;
    protected LocalDateTime fechaNacimiento;
   protected LocalDateTime fechaMuerte;
   protected static boolean isLive;
   protected int nivelEnergia;
   protected int nivelHambre;
   protected int nivelCansancio;
   protected int nivelFelicidad;
   protected int nivelAburrimiento;
   protected String propietario;

   protected int id;
   protected Alimentarse alimentarse;
   protected Divertirse divertirse;
   public static LocalDateTime ultimoDescanso;
   protected Dormir descansar;
   protected int comidasIngeridas;
   protected HacerPopo popo;
protected ArrayList<String> causaDeMuerte = new ArrayList<>();
protected String actaDefuncion;
protected String actaNacimiento;

    public static boolean isLive() { return isLive;}
    public static void setComidasIngeridas(int i) {}


    public void comer(AlmacenAlimentos alimentos)
    {alimentarse.ingerirAlimentos(alimentos, this);}

    public void dormir(LocalTime tiempo) {
        descansar.hacerDormir(tiempo, this);
    };

    public void jugar(EntretenimientoEnum entretenimiento)
    { divertirse.entretenerseCon(entretenimiento, this);};

    public void irAlBaño(){
        popo.evacuar(this);}
    public void setCausaDeMuerte( String causaDeMuerte){
        this.causaDeMuerte.add(causaDeMuerte);
    }

    public String getNombre() {
        return nombre;
    }
    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }
    public LocalDateTime getFechaMuerte() {
        return fechaMuerte;
    }
    public int getNivelEnergia() {
        return nivelEnergia;
    }
    public int getNivelHambre() {
        return nivelHambre;
    }

    public int getNivelCansancio() {
        return nivelCansancio;
    }

    public int getNivelFelicidad() {
        return nivelFelicidad;
    }
    public int getNivelAburrimiento() {
        return nivelAburrimiento;
    }

    public String getPropietario() {
        return propietario;
    }
    public int getComidasIngeridas(){return comidasIngeridas;}
    public String getActaDefuncion(){return actaDefuncion;}
    public String getActaDeNacimiento(){return actaNacimiento;}
public ArrayList<String> getCausaDeMuerte(){return causaDeMuerte;}

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private void setFechaNacimiento(LocalDateTime fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaMuerte(LocalDateTime fechaMuerte){
        this.fechaMuerte = fechaMuerte;
    }
    public void setLive(Boolean live){
        isLive = live;
    }
    public void setNivelEnergia(int nivelEnergia){
        this.nivelEnergia = nivelEnergia;
    }
    private void setNivelHambre(int nivelHambre){
        this.nivelHambre = nivelHambre;
    }
    private void setNivelCansancio(int nivelCansancio){
        this.nivelCansancio = nivelCansancio;
    }
    private void setNivelFelicidad(int nivelFelicidad){
        this.nivelFelicidad = nivelFelicidad;
    }
    public void setNivelAburrimiento(int nivelAburrimiento){
        this.nivelAburrimiento = nivelAburrimiento;
    }
    private void setPropietario(String propietario){
        this.propietario = propietario;
    }
    public void setActaDefuncion(String actaDefuncion) { this.actaDefuncion = actaDefuncion; }

    public void setActaDeNacimiento(String actaNacimiento) {this.actaNacimiento = actaNacimiento; }



    public Mascota(String nombre, String propietario){
        setNombre(nombre);
        setPropietario(propietario);
        setLive(true);
        setNivelEnergia(20);
        setNivelHambre((int) (Math.random() * 100));
        setNivelCansancio((int) (Math.random() * 100));
        setNivelFelicidad((int) (Math.random() * 100));
        setNivelAburrimiento((int) (Math.random() * 100));
        setFechaNacimiento(LocalDateTime.now());
        this.alimentarse = new Alimentarse();
        this.divertirse = new Divertirse();
        this.descansar = new Dormir();
        this.popo = new HacerPopo();
    }
    private int energiaAportada;
    Mascota(int energia){
        this.energiaAportada = energia;
    }

    public int getEnergiaAportada() {
        return energiaAportada;
    }

    public HacerPopo getPopo() {
        return popo;
    }
}


