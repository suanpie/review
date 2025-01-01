package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String star = "*";
         for (int i = 1; i <= 30; i++) {
            {
                System.out.println(star.repeat(i));
            }
        }
         for (int i = 30; i >= 1; i--) {
             {
                 System.out.println(star.repeat(i));
             }
         }
    }
}