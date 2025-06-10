package proyecto_final;

import java.util.Scanner;

public class Proyecto_final {
    public static void main(String[] args) {
        // Declarar variables
        String nombreCliente;
        double compra1, compra2, compra3;
        double totalCompras, promedioCompras;
        Scanner lectura = new Scanner(System.in);
        
        // Entrada de datos
        System.out.println("SISTEMA DE VENTAS");
        System.out.println();
        
        System.out.print("Ingrese el nombre del cliente: ");
        nombreCliente = lectura.nextLine();
        
        System.out.print("Ingrese el monto de la compra 1: ");
        compra1 = lectura.nextDouble();
        
        System.out.print("Ingrese el monto de la compra 2: ");
        compra2 = lectura.nextDouble();
        
        System.out.print("Ingrese el monto de la compra 3: ");
        compra3 = lectura.nextDouble();
        
        // Procesamiento - Aplicar fórmulas
        totalCompras = compra1 + compra2 + compra3;  // tc = compra1 + compra2 + compra3
        promedioCompras = totalCompras / 3;          // pc = tc / 3
        
        // Salida de datos
        System.out.println();
        System.out.println("RESULTADOS");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Total compras: " + totalCompras);
        System.out.println("Promedio compras: " + promedioCompras);
        
        // Cerrar scanner
        lectura.close();
    }
}