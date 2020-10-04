package vehiculos;

import java.util.ArrayList;
import java.util.HashMap;

public class Fabricante {

    String nombre;
    Pais pais;
    static ArrayList<String> fb= new ArrayList<String>();

    public Fabricante(String nombre){
        this.nombre=nombre;

    }
    public Fabricante(String nombre,Pais pais){
        this.nombre=nombre;
        this.pais=pais;
    }

    public String getNombre(){
        return nombre;
    }
    public Pais getPais(){
        return pais;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPais(Pais pais){
        this.pais=pais;
    }


    public static Fabricante fabricaMayorVentas(){
        int maximaVecesQueSeRepite = 0;
        String moda = "";

        for(int i=0; i<fb.size(); i++){
            int vecesQueSeRepite = 0;
            for(int j=0; j<fb.size(); j++){
                if(fb.get(i) == fb.get(j))
                    vecesQueSeRepite++;
            }
            if(vecesQueSeRepite > maximaVecesQueSeRepite){
                moda = fb.get(i);
                maximaVecesQueSeRepite = vecesQueSeRepite;
            }
        }

        return new Fabricante(moda);
    }
}