/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiassemana;

/**
 *
 * @author Admin
 */
public class EjercicioDiasSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] dias={"Lunes", "Martes", "miércoles",
            "Jueves", "Viernes", "Sábado", "Domingo"};
        int n_dia=EntradaSalida.preguntarNumeroDia();//El usuario introducirá un número entre 1 y 7
        System.out.println("El día "+n_dia+" se llama "+dias[n_dia-1]);
        }
    
    
}
