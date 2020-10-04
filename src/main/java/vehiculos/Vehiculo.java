package vehiculos;

public class Vehiculo {

    //atributos
    String placa;
    int puertas;
    int velocidadMaxima;
    String nombre;
    int precio;
    int peso;
    String traccion;
    Fabricante fabricante;

    static int cantidadVehiculos=0;

    //constructores
    public Vehiculo(){

        cantidadVehiculos++;

    }
    public Vehiculo(String placa,int puertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion,Fabricante fabricante){
        this.placa=placa;
        this.puertas=puertas;
        this.velocidadMaxima=velocidadMaxima;
        this.nombre=nombre;
        this.precio=precio;
        this.peso=peso;
        this.traccion=traccion;
        this.fabricante=fabricante;

        cantidadVehiculos++;
        Fabricante.fb.add(fabricante.getNombre());
        Pais.ps.add(fabricante.getPais().getNombre());

    }

    //getters
    public String getPlaca(){
        return placa;
    }
    public int getPuertas(){
        return puertas;
    }
    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public int getPeso(){
        return peso;
    }
    public String getTraccion(){
        return traccion;
    }
    public Fabricante getFabricante(){
        return fabricante;
    }

    public static  int getCantidadVehiculos(){
        return (cantidadVehiculos/2);
    }

    //setters
    public void setPlaca(String placa){
        this.placa=placa;
    }
    public void setPuertas(int puertas){
        this.puertas=puertas;
    }
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public void setPeso(int peso){
        this.peso=peso;
    }
    public void setTraccion(String traccion){
        this.traccion=traccion;
    }
    public void setFabricante(Fabricante fabricante){
        this.fabricante=fabricante;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos){
        Vehiculo.cantidadVehiculos=cantidadVehiculos;
    }

    public String cantidadPorTipo(){
        return "Automiviles: "+ Automovil.getNAutomoviles()+
                "\nCamionetas: "+ Camioneta.getNCamionetas()+
                "\nCamiones: "+ Camion.getNCamiones();
    }
}