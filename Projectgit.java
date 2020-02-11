/*
* Author: Javier
Fecha: 04/02/2020
*/
package projectgit;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Projectgit {
    public static void main(String[] args) {
        // preguntar dni:
        int dni=12345678;
        char letter= DNIletter(dni);
         System.out.println(dni+":"+letter);
        
    }
    
    //function que recibe dni y devuelve la letra
    private static char DNIletter(int dni){
        char letter='Z';
        String letters="TRWAGMYFPDXBNJZSQVHLCKE";
        int res=dni%23;
        letter = letters.charAt(res);
        return letter;
    }
}