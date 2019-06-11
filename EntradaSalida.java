/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiassemana;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class EntradaSalida {
    static int preguntarNumeroDia()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número del 1 al 7");
        int n=sc.nextInt();
        return n;
    }
}
