package com.sofka;
import java.util.Scanner;
public class Main {


private final static double PI = 3.14;

public Main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Digite su primer numerous");
    int numerous1 = input.nextInt();
    System.out.println("Resultado: " + (numerous1 + PI));
}

}