package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class pr2 {
    public static void main(String[] args) {
        ex2();
    }

    /*
    2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
    и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
     */
    public static void ex2() {
        String str="TEST";
        StringBuilder strResult=new StringBuilder();
        for (int i = 0; i < 99; i++) {
            strResult.append(str+" ");
        }

        try (FileWriter writer=new FileWriter("TEST.txt")){
            writer.write(String.valueOf(strResult));
        }
        catch (IOException e){
            System.out.println("Ошибка");
            //System.out.println(e.getMessage());
        }

    }
}
