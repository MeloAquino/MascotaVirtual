import enumerados.AlmacenAlimentos;
import enumerados.EntretenimientoEnum;
import modelos.DukeMascota;
import modelos.Mascota;
import persistenciaCollections.MascotaPersistenceUseList;
import utils.RegiatroCivilMascotas;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        MascotaPersistenceUseList persistence = new MascotaPersistenceUseList();

        DukeMascota duke = new DukeMascota("Duke-Merlina", "Melody");
        DukeMascota duke2 = new DukeMascota("Duke-Cordobes", "Melody");
        DukeMascota duke3 = new DukeMascota("Duke-Porteño" , "Melody;");
        DukeMascota duke4 = new DukeMascota("Duke-Litoral" , "Melody");
        persistence.guardar(duke);
        persistence.guardar(duke2);
        persistence.guardar(duke3);
        persistence.guardar(duke4);

    duke.jugar(EntretenimientoEnum.BAILAR);
    duke.jugar(EntretenimientoEnum.LEER);
    duke.jugar(EntretenimientoEnum.PASEAR);
    duke.jugar(EntretenimientoEnum.COMPRAR);

        System.out.println("Antes de dormir " + duke.getNivelEnergia());
        duke.dormir(LocalTime.of(0,25));
        System.out.println("Despues de dormir " + duke.getNivelEnergia());

        duke.comer(AlmacenAlimentos.ASADO);
        duke.comer(AlmacenAlimentos.ASADO);
        duke.comer(AlmacenAlimentos.ASADO);
        duke.comer(AlmacenAlimentos.ASADO);
        duke.comer(AlmacenAlimentos.ASADO);
        duke.comer(AlmacenAlimentos.ASADO);
        duke.comer(AlmacenAlimentos.ASADO);
        duke.comer(AlmacenAlimentos.ASADO);
        duke.comer(AlmacenAlimentos.ASADO);
        duke.comer(AlmacenAlimentos.ASADO);
        RegiatroCivilMascotas.guardarActa(duke);

    }


}
