/*
a) sexo (m e f);

b) cor dos olhos (a (azuis), v (verdes), c (castanhos), p (pretos));

c) cor dos cabelos (l (loiros), c (castanhos), p (pretos), r (ruivos));

d) idade em anos.

e) valor do salário.
*/

package Atividades;

import java.util.Scanner;

public class atividade3 {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numHabitantes = 0;
        int numMulheresEntre18e35ComOlhosECabelosCastanhos = 0;

        //while (true) {
            
            System.out.println("Digite o sexo (m/f):");
            char sexo = sc.next().charAt(0);
            
            while (sexo != 'm' && sexo != 'f') {
                System.out.println("Sexo inválido. Digite novamente.");
                System.out.println("Digite o sexo (m/f):");
                sexo = sc.next().charAt(0);
            }
}
}
