package hoidanit;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double a = scanner.nextDouble();
		Double theTich = Math.pow(a, 3);
		System.out.println("The tich: " + theTich);
	}
}
