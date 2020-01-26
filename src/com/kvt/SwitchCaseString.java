package com.kvt;

import java.util.Scanner;

public class SwitchCaseString {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {

			System.out.println("Enter kr na benklode");
			scanner = new Scanner(System.in);
			String dayofWeek = scanner.nextLine();
			String dayOfTheWeek = getTheDay(dayofWeek);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}

	}

	private static String getTheDay(String dayofWeekArg) {
		switch (dayofWeekArg) {
		case "Monday":
			System.out.println("start of a work week");
			break;

		case "Tuesday":
			System.out.println("second day");
			break;

		case "Wednesday":
			System.out.println("Someone kill me day");
			break;

		case "Thrusday":
			System.out.println("waiting for friday day");
			break;

		case "Friday":
			System.out.println("Office se jaldi nikalne wala day");
			break;

		case "Saturday":
			System.out.println("Abhi to party suru hui h day");
			break;

		case "Sunday":
			System.out.println("All day study day");
			break;
			
		default:
			System.out.println("Nikal pheli fursat m nikhal");
			break;

		}
		return dayofWeekArg;
	}
}
