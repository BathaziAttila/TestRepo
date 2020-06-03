package teszt;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class tesztes1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer ;
		do {
			System.out.print("Szöveg : ");
			answer = sc.next();
		}while(!(answer.equals("mars") || answer.equals("vénusz")));

	}
}
