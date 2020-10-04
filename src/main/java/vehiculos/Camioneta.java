package vehiculos;

public class Camioneta extends Vehiculo{

    static int nCamionetas;

    boolean volco;

    public Camioneta(){
        super.setVelocidadMaxima(90);
        super.setTraccion("4X4");
        Vehiculo.cantidadVehiculos++;
        nCamionetas++;
    }
    public Camioneta(String placa,int puertas,String nombre,int precio,int peso,Fabricante fabricante,boolean volco){
        super.setVelocidadMaxima(90);
        super.setTraccion("4X4");
        super.setPlaca(placa);
        super.setPuertas(puertas);
        super.setNombre(nombre);
        super.setPrecio(precio);
        super.setPeso(peso);
        super.setFabricante(fabricante);
        this.volco=volco;
        Vehiculo.cantidadVehiculos++;
        nCamionetas++;
        Fabricante.fb.add(fabricante.getNombre());
        Pais.ps.add(fabricante.getPais().getNombre());
    }
    public boolean isVolco(){
        return volco;
    }
    public static int getNCamionetas(){
        return nCamionetas;
    }
    public void setVolco(boolean volco){
        this.volco=volco;
    }
}