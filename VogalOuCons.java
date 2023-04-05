package com.vitorcamara.projetos;

import java.util.Scanner;

public class VogalOuCons {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com uma letra:");
		String letra = scan.next();

		if (letra.length() > 1) {
			System.out.println("Não é uma letra valida!");
		} else {
			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("Vogal");
				break;
			default:
				System.out.println("Consoante");

			}

		}

	}
}