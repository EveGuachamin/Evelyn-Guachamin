package Ejercicioclase23_05;

public class Class_print {
    public static void main (String[] args){
        //Heredado del Padre
        Herencia1 person1 = new Herencia1("Eve","Guachamin",3393346,"Ver Series","Seco de pollo");
        person1.imprimir_completo();
        System.out.println("----------------------------------");
        //Herencia de la hija
        Herencia2 persona2 = new Herencia2("Taty","Guachamin",992801667,"Jugar Basket","Lasaña","4 horas por dia","Tik Tok");
        persona2.imprimir_red_social();
    }
}
