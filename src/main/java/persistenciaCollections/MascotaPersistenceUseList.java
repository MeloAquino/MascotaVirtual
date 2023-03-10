package persistenciaCollections;
import modelos.Mascota;
import java.util.List;
import persistencia.IMascotaPersistence;



public class MascotaPersistenceUseList implements IMascotaPersistence {

    @Override
    public void guardar(Mascota mascota) {
        bdMascotas.add(mascota);

    }

    @Override
    public Mascota GetMascota(String nombre) {
        return null;
    }


    @Override
    public void updateMascota(Mascota mascota) {

    }


@Override
public Mascota getMascota(int id) {return bdMascotas.get(id);}
    
    @Override
    public Mascota getMascota(String nombre) {
        for (Mascota elemento : bdMascotas) {
            if(elemento.getNombre().equals(nombre)){
                return elemento;
            }
        }
        return null;
    }

    @Override
    public List<Mascota>  getAllMascotas(){
        return  bdMascotas;
    }

   @Override
    public void updateMascota(int id, Mascota mascota){
        bdMascotas.set(id, mascota);
   }
    @Override
    public void deleteMascota(int id){
        bdMascotas.remove(getMascota(id));
    }
}
