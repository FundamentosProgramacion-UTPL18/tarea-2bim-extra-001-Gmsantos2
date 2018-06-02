/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_2bim_001;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] meses = {"Agosto", "Octubre", "Diciembre"};
        String[] sucursales = {"sucursal 1", "sucursal 2", "sucursal 3", "sucursal 4"};
        double[] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double[] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double[] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};
        double [] venta_total_sucursal = new double [4];
        double [] venta_promedio_sucursal = new double [4];
        double total_ventas_todas_sucursales=0;
        for(int cont =  0; cont < 4; cont ++){
            venta_total_sucursal[cont] = ventas_mes_1[cont]+ventas_mes_2[cont]+ventas_mes_3[cont];
            venta_promedio_sucursal[cont] = venta_total_sucursal[cont]/3;
            total_ventas_todas_sucursales = total_ventas_todas_sucursales+venta_promedio_sucursal[cont];
        } 
        for(int i = 0; i < 3; i ++){
            System.out.printf("\t\t%s",meses[i]);
        }
        System.out.printf("\tTotal\t\tPromedio\n\n");
        for(int j = 0; j < 4; j ++){
            System.out.printf("%s\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\n",sucursales[j],ventas_mes_1[j],ventas_mes_2[j],ventas_mes_3[j],venta_total_sucursal[j],venta_promedio_sucursal[j]);
        }
        System.out.printf("\n%s%.1f\n","Totales de ventas de todas la sucursales es: ",total_ventas_todas_sucursales);
    }
    
}
