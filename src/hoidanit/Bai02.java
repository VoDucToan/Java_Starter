package hoidanit;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double a = scanner.nextDouble();
		Double b = scanner.nextDouble();
		Double chuVi = (a + b) * 2;
		System.out.println("Chu vi: " + chuVi);
		Double dienTich = a * b;
		System.out.println("Dien tich: " + dienTich);
		System.out.println("Canh nho nhat: " + Math.min(a, b));
	}
}
