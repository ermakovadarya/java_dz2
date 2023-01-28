package org.example;

import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {

        ex1();
    }

            /*
            1. Напишите метод, который принимает на вход строку (String)
            и определяет является ли строка палиндромом (возвращает boolean значение).
             */
    public static void ex1() {
        System.out.println("Введите текст: ");
        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine();
        str=str.replaceAll(" ","");
        boolean flag=false;
        for (int i = 0; i <=str.length()/2; i++) {
            if (str.charAt(i)==str.charAt(str.length()-1-i)){
                flag=true;
            }
            else {
                flag=false;
                break;
            }
        }
        System.out.println("Выражение "+str+" "+flag);
    }
}