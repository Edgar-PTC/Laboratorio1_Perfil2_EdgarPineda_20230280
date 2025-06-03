package EdgarPineda_20230280;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> productos = new TreeMap<>();

        productos.put("headphones092", 8);
        productos.put("portatil631", 4);
        productos.put("computer156", 9);
        productos.put("reloj365", 13);

        Scanner scn = new Scanner(System.in);
        int option;

        do {
            System.out.println("-----SISTEMA DE ADMINISTRACION DE PRODUCTOS-----");
            System.out.println("(1)-----Agregar stock de productos");
            System.out.println("(2)-----Actualizar stock de producto");
            System.out.println("(3)-----Imprimir stock de productos");
            System.out.println("(4)-----Imprimir bajos stock de productos");
            System.out.println("(5)-----EXIT");
            System.out.println("Seleccione una opcion:");
            option = scn.nextInt();

            switch (option){
                case 1:
                    String name;
                    Integer cant;
                    System.out.println("Ingrese el nombre del nuevo producto:");
                    name = scn.next();
                    System.out.println("Ingrese la cantidad en almacen del producto:");
                    cant = scn.nextInt();

                    productos.put(name, cant);
                    break;

                case 2:
                    String idprd;
                    Integer prdcant;
                    System.out.println("-----Ingrese el id del producto que desea actualizar-----");
                    idprd = scn.next();
                    System.out.println("-----Ingrese la nueva cantidad en almacendel producto-----");
                    prdcant = scn.nextInt();

                    if (productos.containsKey(idprd)) {
                        productos.put(idprd, prdcant);
                        System.out.println("-----" + idprd + " ha sido actualizado-----");
                        System.out.println("----- Nuevo valor en almacén: " + prdcant + " -----");
                    } else {
                        System.out.println("Producto no encontrado");
                    }
                    break;

                case 3:
                    for(Map.Entry<String, Integer> stocks : productos.entrySet()){
                        System.out.println("Id del Producto: " + stocks.getKey() + " Con un valor en almacen de: " + stocks.getValue());
                    }
                    break;

                case 4:
                    for(Map.Entry<String, Integer> stocks : productos.entrySet()){
                        if (stocks.getValue() < 10){
                            System.out.println("Id del Producto: " + stocks.getKey() + " Con un valor en almacen de: " + stocks.getValue());
                        }
                    }
                    break;

                case 5:
                    System.out.println("-----GRACIAS POR SU PARTICIPACION-----");
                    break;

                default:
                    System.out.println("-----ERROR-----");
                    System.out.println("-----Opcion invalida-----");
                    break;
            }

        }while(option != 5);
    }
}