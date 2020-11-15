
package pbo10119012latihan48;

import java.util.Scanner;

/**
 *  NAMA  : DAMAI SAPUTRA LAOLI
 *  KELAS : IF-1
 *  NIM   : 10119012
 */
public class PBO10119012Latihan48 {

    
    public static void main(String[] args) {
         double val1, val2;
        Scanner scanner = new Scanner(System.in);
        Kalkulator calc = new Kalkulator();

        calc.setValue1(7);
        calc.setValue2(5);
        val1 = calc.getValue1();
        val2 = calc.getValue2();
        System.out.printf("VALUE 1 = %.1f%n",val1);
        System.out.printf("VALUE 2 = %.1f%n",val2);
        calc.setNameProject();
        calc.setNoteProject("This project shown you how to manage project in java");
        System.out.printf("Result Add is\t\t= %.1f%n",calc.add(val1,val2));
        System.out.printf("Result Minus is\t\t= %.1f%n",calc.minus(val1,val2));
        System.out.printf("Result Multiple is\t= %.1f%n",calc.multiplication(val1,val2));
        System.out.printf("Result Division is\t= %.1f%n",calc.division(val1,val2));
    }
}
