package application;

import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Triângulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Triângulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areax = x.area();
		double areay = y.area();
		
		System.out.printf("Área do triângulo x: %.4f%n", areax);
		System.out.printf("Área do triângulo y: %.4f%n", areay);
		
		if(areax > areay) {
			System.out.println("Triângulo x tem a maior área");
		}
		else {
			System.out.println("Triângulo y tem a maior área");
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
