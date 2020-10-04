package vehiculos;

import java.util.ArrayList;

public class Pais {

    String nombre;
    static ArrayList<String> ps= new ArrayList<String>();

    public Pais(){

    }
    public Pais(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public static Pais paisMasVendedor(){
        int maximaVecesQueSeRepite = 0;
        String moda = "";

        for(int i=0; i<ps.size(); i++){
            int vecesQueSeRepite = 0;
            for(int j=0; j<ps.size(); j++){
                if(ps.get(i) == ps.get(j))
                    vecesQueSeRepite++;
            }
            if(vecesQueSeRepite > maximaVecesQueSeRepite){
                moda = ps.get(i);
                maximaVecesQueSeRepite = vecesQueSeRepite;
            }
        }

        return new Pais(moda);
    }
}