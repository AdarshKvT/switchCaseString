package com.kvt;

import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {

		String key = "fuckoff";
		System.out.println("Enter kr bhai..");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();

		switch (inputString) {
		case "Saktiman":
			System.out.println("Mukesh Khanna hi saktiman h");
			break;

		case "SpiderMan":
			System.out.println("Peter Parker hi SpiderMan h");
			break;

		default:
			System.out.println("Nikal...pheli fursat m nikal!!!");
			break;
		}
	}

}
