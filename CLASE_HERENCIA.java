package Ejercicioclase23_05;

public class CLASE_HERENCIA {
    public String nombre;
    public String apellido;
    public int telefono;

    public CLASE_HERENCIA(String nombre, String apellido,int telefono) {
        this.nombre = nombre;
        this.apellido = nombre;
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
    public void imprimir_completo(){
        super.imprimir_info();
        System.out.println("Hobbie "+hobbie);
        System.out.println("Comida Favorita "+comi_favo);
    }
}