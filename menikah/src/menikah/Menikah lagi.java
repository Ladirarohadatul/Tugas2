/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menikah;

/**
 *
 * @author Lenovo
 */
public class Menikah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int umur = 27;
        String paras = "jelek";
        String otak = "tidak pintar";

        if (umur>=20&&umur<=23&&paras=="ganteng"&&otak=="pintar") {
            System.out.println("ya pasti mau lah");
        } else if (umur>=20&&umur<=23&&(paras=="ganteng"&&otak=="tidak pintar")) {
            System.out.println("okelah nggak papa");
        } else if ((umur>23&&otak=="tidak pintar")&&paras=="ganteng") {
            System.out.println("saya pikir dulu");
        } else {
            System.out.println("saya tidak mau");
        }

    }
}

}
