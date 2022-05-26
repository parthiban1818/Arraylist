package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Insert {
	 
	static ArrayList <Pojo>al=new ArrayList();
	
	//code for inserting the new student details
	public static void insert() { 
		Scanner sc=new Scanner(System.in);
		Pojo p=new Pojo();
		 System.out.println("ented student Id :");
		 p.setId(sc.nextInt());
		 System.out.println("ented student NAME :");
		 p.setName(sc.next());
		 System.out.println("ented student GENDER :");
		 p.setGender(sc.next());
		 System.out.println("ented student MOBILE :");
         p.setMobile(sc.nextLong());
         System.out.println("enter student mail id :");
         p.setMail(sc.next());
         al.add(p);
        System.out.println("***DETAILS ADDED SUCESSFULLY***");
        System.out.println();
	} 
	//code for insert the student details in first position
	public static void insertFirst() {
		Scanner sc=new Scanner(System.in);
		Pojo p=new Pojo();
		 System.out.println("ented student Id :");
		 p.setId(sc.nextInt());
		 System.out.println("ented student NAME :");
		 p.setName(sc.next());
		 System.out.println("ented student GENDER :");
		 p.setGender(sc.next());
		 System.out.println("ented student MOBILE :");
         p.setMobile(sc.nextLong());
         System.out.println("enter student mail id :");
         p.setMail(sc.next());
         al.add(0,p);
        System.out.println("***DETAILS ADDED SUCESSFULLY***");
        System.out.println();
	}
	public static void reverse() {
		Collections.reverse(al);
		Display.allDetails();
	}
	public static void shuffle() {
		Collections.shuffle(al);
		Display.allDetails();
	}
	public static void swap(int first,int second) { 
		Collections.swap(al,first, second);
	}
}
