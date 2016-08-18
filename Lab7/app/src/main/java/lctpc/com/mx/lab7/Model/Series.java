package lctpc.com.mx.lab7.Model;

/**
 * Created by android on 18/08/2016.
 */
public class Series {
    int imagen;
    String nombre;
    int visitas;
    public Series(int imagen,String nombre,int visitas){
        this.imagen=imagen;
        this.nombre = nombre;
        this.visitas = visitas;
    }

    public int getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVisitas() {
        return visitas;
    }
}
