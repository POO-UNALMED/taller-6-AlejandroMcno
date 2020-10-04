package vehiculos;

public class Camion extends Vehiculo{

    static int nCamiones;

    int ejes;

    public Camion(){
        super.setPuertas(2);
        super.setVelocidadMaxima(80);
        super.setTraccion("4X2");
        Vehiculo.cantidadVehiculos++;
        nCamiones++;
    }
    public Camion(String placa,String nombre,int precio,int peso,Fabricante fabricante,int ejes){
        super.setPuertas(2);
        super.setVelocidadMaxima(80);
        super.setTraccion("4X2");
        super.setPlaca(placa);
        super.setNombre(nombre);
        super.setPrecio(precio);
        super.setPeso(peso);
        super.setFabricante(fabricante);
        this.ejes=ejes;
        Vehiculo.cantidadVehiculos++;
        nCamiones++;
        Fabricante.fb.add(fabricante.getNombre());
        Pais.ps.add(fabricante.getPais().getNombre());
    }

    public int getEjes(){
        return ejes;
    }
    public static int getNCamiones(){
        return nCamiones;
    }
    public void setEjes(int ejes){
        this.ejes=ejes;
    }
}