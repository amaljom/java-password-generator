package org.generation.Italy.securityt;

import java.util.Scanner;

public class firstExpercise {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci nome");
		String userName = sc.nextLine();
		
		System.out.println("inserisci cognome");
		String userSurname = sc.nextLine();
		
		System.out.println("inserisci colore preferito");
		String color = sc.nextLine();
		
		System.out.println("inserisci giorno");
		int day = sc.nextInt();
		
		System.out.println("inserisci mese");
		int month = sc.nextInt();
		
		System.out.println("inserisci anno");
		int year = sc.nextInt();
		
		System.out.println(userName + "-" + userSurname + "-" + color + "-" + day + "-" + month + "-" + year);
	}
}