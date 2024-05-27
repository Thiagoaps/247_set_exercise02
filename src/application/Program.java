package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Students> set = new HashSet<Students>();

		System.out.print("How many students for course A? ");
		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			int student = sc.nextInt();
			set.add(new Students(student));
		}
		
		System.out.print("How many students for course B? ");
		a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			int student = sc.nextInt();
			set.add(new Students(student));
		}
		
		System.out.print("How many students for course C? ");
		a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			int student = sc.nextInt();
			set.add(new Students(student));
		}
		
		System.out.println("Total students: " + set.size());

		sc.close();
	}

}
