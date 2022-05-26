package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
           
public class Display {
	     static Scanner sc=new Scanner(System.in);
	//code for to display the all the student details
	public static void allDetails() {
		if(Insert.al.isEmpty()==true) {
			System.err.println("THE DATABASE IS EMPTY ");
		    System.out.println("***FIRST ADD STUDENT DETAILS BY PRESSING 1***\n");
		}
		else {
		for(Pojo p: Insert.al) {
			 System.out.println();
			 System.out.println("ID\t:"+p.getId()+"\nNAME\t:"+p.getName()+"\nGENDER\t:"+p.getGender()+"\nMOBILE\t:"+p.getMobile()+"\nMAIL ID\t:"+p.getMail()+"\n");
		 }
		}
	} 
	//code for display the  student details by given id
	public static void displayById(int id) {
		
		if(Insert.al.isEmpty()==true) {
			System.err.println("THE DATABASE IS EMPTY ");
		    System.out.println("***FIRST ADD STUDENT DETAILS BY PRESSING 1***\n");
		}
		else { 
		boolean flag=true;
		for(Pojo p: Insert.al) { 
			flag=false;
			if(id==p.getId()) {
				System.out.println();
				System.out.println("ID\t:"+p.getId()+"\nNAME\t:"+p.getName()+"\nGENDER\t:"+p.getGender()+"\nMOBILE\t:"+p.getMobile()+"\nMAIL ID\t:"+p.getMail()+"\n");
			    flag=true;
				break;
			}
		 }
		if(flag==false)
		System.err.println("***NO RECORD FOUND***\n");
		}
	} 
	//code for display the student detail by given index 
	public static void displayByIndex() {
		System.out.println("enter the index value");
		int index=sc.nextInt();
		for(Pojo p:Insert.al) {
			if(index==Insert.al.indexOf(p))
				System.out.println("ID\t:"+p.getId()+"\nNAME\t:"+p.getName()+"\nGENDER\t:"+p.getGender()+"\nMOBILE\t:"+p.getMobile()+"\nMAIL ID\t:"+p.getMail()+"\n"); 
		}
	}
	public static void iterate() {
		Iterator ir=Insert.al.iterator(); 
		while(ir.hasNext()) {
			Object p1=ir.next();
			System.out.println("ID\t:"+((Pojo) p1).getId()+"\nNAME\t:"+((Pojo) p1).getName()+"\nGENDER\t:"+((Pojo) p1).getGender()+"\nMOBILE\t:"+((Pojo) p1).getMobile()+"\nMAIL ID\t:"+((Pojo) p1).getMail()+"\n");
		}
	}
	//sort  student details by name
	public static void sort() {
		Comparator<Pojo> compare = Comparator.comparing(Pojo::getName); 
		Collections.sort(Insert.al,compare);
		for(Pojo p: Insert.al) {
			System.out.println("ID\t:"+p.getId()+"\nNAME\t:"+p.getName()+"\nGENDER\t:"+p.getGender()+"\nMOBILE\t:"+p.getMobile()+"\nMAIL ID\t:"+p.getMail()+"\n"); 
		}
	}
	//extract some portion in student details
	public static void extract() {
		if(Insert.al.isEmpty()) {
			System.err.println("database is empty");
		    System.out.println("***first add student details***\n");
		}
		else {
		System.out.println("<press 1> for get all the student names");
		System.out.println("<press 2> for get all the student mail id");
		System.out.println("<press 3> for get all the student mobile no");
		int option=sc.nextInt();
		
		for(Pojo p:Insert.al) {
			 switch(option) {
			 case 1: System.out.println(p.getId()+":"+p.getName()+"\n");break;
			 case 2:System.out.println(p.getId()+":"+p.getMail()+"\n");break;
			 case 3:System.out.println(p.getId()+":"+p.getMobile()+"\n");break;
			 default:System.err.println("you entered wrong input");
			 }
		}
	}
  }
}
