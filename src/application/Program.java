package application;

import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Tri�ngulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Tri�ngulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areax = x.area();
		double areay = y.area();
		
		System.out.printf("�rea do tri�ngulo x: %.4f%n", areax);
		System.out.printf("�rea do tri�ngulo y: %.4f%n", areay);
		
		if(areax > areay) {
			System.out.println("Tri�ngulo x tem a maior �rea");
		}
		else {
			System.out.println("Tri�ngulo y tem a maior �rea");
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
