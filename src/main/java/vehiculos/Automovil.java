package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo{

    static int nAutomoviles;

    int puestos;

    public Automovil(){
        super.setPuertas(4);
        super.setVelocidadMaxima(100);
        super.setTraccion("FWD");
        Vehiculo.cantidadVehiculos++;
        nAutomoviles++;
    }
    public Automovil(String placa,String nombre,int precio,int peso,Fabricante fabricante,int puestos){
        super.setPuertas(4);
        super.setVelocidadMaxima(100);
        super.setTraccion("FWD");
        super.setPlaca(placa);
        super.setNombre(nombre);
        super.setPrecio(precio);
        super.setPeso(peso);
        super.setFabricante(fabricante);
        this.puestos=puestos;
        Vehiculo.cantidadVehiculos++;
        nAutomoviles++;
        Fabricante.fb.add(fabricante.getNombre());
        Pais.ps.add(fabricante.getPais().getNombre());
    }

    public int getPuestos(){
        return puestos;
    }
    public static int getNAutomoviles(){
        return nAutomoviles;
    }
    public void setPuestos(int puestos){
        this.puestos=puestos;
    }
}