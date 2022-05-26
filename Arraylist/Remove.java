package Arraylist;

import java.util.Scanner;

public class Remove {

	static Scanner sc=new Scanner(System.in);
	 //code for remove element in the given index
	 public static void removeElement() {
		 System.out.println("\nenter the index number you want to remove\n");
		 int element=sc.nextInt(); 
		 if(element<Insert.al.size()) {
		   Insert.al.remove(element);
		   System.out.println("\n***DELETED***");
		 }
		 else 
			 System.err.println("\nYOU ENTERED WRONG INPUT\n");
	 }
	 //code for remove all elements in the database
	 public static void removeAll() {
		 System.out.println("\n***Are you sure want to delete all student details***\n<press 1> for yes\n<press 0> for no");
		 int option=sc.nextInt();
		 if(option==1) {
		 Insert.al.clear();
		 System.out.println("\n***ALL STUDENT DETAILS ARE DELETED***\n");
		 }
	 }
	 //code for remove element by given id
	 public static void removeById(int id) {
		 boolean b=false;
		 for(int i=0;i<Insert.al.size();i++) { 
		   if(id==Insert.al.get(i).getId()) {
			   b=true;
			 Insert.al.remove(i);
		   System.out.println("\n***Student detail deleted***\n");
		   break;
		   }
		  }
		 if(b==false)
			 System.err.println("you entered wrong Id");
	 }
}
