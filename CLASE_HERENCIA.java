package Ejercicioclase23_05;

public class CLASE_HERENCIA {
    public String nombre;
    public String apellido;
    public int telefono;

    public CLASE_HERENCIA(String nombre, String apellido,int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    public void imprimir_info(){
        System.out.println("Se imprime los datos");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Telefono: "+telefono);
    }
}
class Herencia1 extends CLASE_HERENCIA{
    public String hobbie;
    public String comi_favo;

    public Herencia1 (String nombre, String apellido, int telefono, String hobbie,String comi_favo){
        super(nombre,apellido,telefono);
        this.hobbie=hobbie;
        this.comi_favo=comi_favo;
    }
    public void imprimir_completo() {
        super.imprimir_info();
        System.out.println("Hobbie " + hobbie);
        System.out.println("Comida Favorita " + comi_favo);
    }
}
class Herencia2 extends Herencia1{
    public String tiempo_en_redes;
    public String redes_favo;

    public Herencia2 (String nombre, String apellido, int telefono,String hobbie, String comi_favo, String tiempo_en_redes,String redes_favo){
        super(nombre,apellido,telefono,hobbie,comi_favo);
        this.tiempo_en_redes=tiempo_en_redes;
        this.redes_favo=redes_favo;
    }
    public void imprimir_red_social() {
        System.out.println("Información con Red Social ");
        super.imprimir_info();
        System.out.println("Tiempo en redes  " + tiempo_en_redes);
        System.out.println("Red social Favorita " + redes_favo);
    }
}
