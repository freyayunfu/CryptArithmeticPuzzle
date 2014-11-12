/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptarithmeticpuzzle;

/**
 *
 * This class calculated the digit of T, G, O, D in a crypt-arithmetic puzzle
 * which satisfied TOO + TOO + TOO + TOO = GOOD;
 * @author fuyun
 * @version 1.0.0
 * @since 06/09/2014
 */
public class CryptArithmeticPuzzle {

    /**
     *
     * This class calculated the digit of T, G, O, D in a crypt-arithmetic
     * puzzle which satisfied TOO + TOO + TOO + TOO = GOOD;
     *
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int T, O, G, D;
        //int TOO = 100 * T + 10 * O + O;

        for (T = 0; T < 10; T++) {
            for (G = 0; G < 10; G++) {
                for (O = 0; O < 10; O++) {
                    D = 400 * T - 1000 * G - 66 * O;
                    if (D == 0 | D == 1 | D == 2 | D == 3 | D == 4 | D == 5 | D == 6 | D == 7 | D == 8 | D == 9 && D != T && D != G && D != O && T != G && T != O && O != G) {
                        System.out.println("T=" + T + " G=" + G + " O=" + O + " D=" + D);
                    }
                }
            }
        }

    }

}
