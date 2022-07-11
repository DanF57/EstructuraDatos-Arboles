/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enlazadabinaria;

/**
 *
 * @author Daniel
 */
public class EnlazadaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MetodosEB obj = new MetodosEB();
        int id, op;
        String nombre;
        do{
            System.out.println("Ingrese id: ");
            id = obj.entrada.nextInt();
            System.out.println("Ingrese nombre: ");
            nombre = obj.entrada.nextLine();

            System.out.println("Ingrese 1 para salir:");
            op = obj.entrada.nextInt();
        }while(op!=1);
    }
    
}
