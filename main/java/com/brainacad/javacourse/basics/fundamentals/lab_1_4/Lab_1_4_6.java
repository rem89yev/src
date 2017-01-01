package com.brainacad.javacourse.basics.fundamentals.lab_1_4;

/**
 * @author Dmytro_Adonin
 * @since 8/8/16
 */
public class Lab_1_4_6 {

    public static void main(String[] args) {

        int firstOperand = 10, secondOperand = 12;
        String binaryFirstOperand = Integer.toBinaryString(firstOperand);
        String binarySecondOperand = Integer.toBinaryString(secondOperand);

        System.out.println(binaryFirstOperand + " & " + binarySecondOperand + " = "
                + (Integer.toBinaryString((firstOperand & secondOperand))));
        System.out.println(binaryFirstOperand + " | " + binarySecondOperand + " = "
                + (Integer.toBinaryString((firstOperand | secondOperand))));
        System.out.println(binaryFirstOperand + " ^ " + binarySecondOperand + " = "
                + (Integer.toBinaryString((firstOperand ^ secondOperand))));
        System.out.println(" ~ " + binaryFirstOperand + " = " + Integer.toBinaryString((~ firstOperand)));

    }

}
