package Arraylist;

import java.util.Scanner;

public class Update {
      static Scanner sc=new Scanner(System.in);
      //code for update student details 
      public static  void update() {
    	  System.out.println("\nenter student id\n"); 
    	  int id=sc.nextInt();
    	  Display.displayById(id);
    	  System.out.println("<press 1> for change the name");
    	  System.out.println("<press 2> for change the gender");
    	  System.out.println("<press 3> for change the mobile");
    	  System.out.println("<press 4> for change the mail"); 
    	  int option=sc.nextInt();
    	  int index=0;
    	  
    	  for(int i=0;i<Insert.al.size();i++) {
    		  if(id==Insert.al.get(i).getId())
    			  index=i;
    	  }
    	  
    	  switch(option) {
    	  case 1:{
    		  System.out.println("\n enter new name :");
    		  String newName=sc.next();  
    			  Insert.al.get(index).setName(newName); 
    		      Display.displayById(id);
    		      break;
    	  }
    	  case 2:{
    		  System.out.println("\nenter new gender");
    		  String newGender=sc.next();
    		 
    			  Insert.al.get(index).setGender(newGender);
    		     Display.displayById(id);
    		     break;
    	  }
    	  case 3:{
    		  System.out.println("\nenter new mobile number");
    		  long newMobile=sc.nextLong();
    		   
    			  Insert.al.get(index).setMobile(newMobile);
    		  Display.displayById(id);
    		  break;
    	  }
    	  case 4:{
    		  System.out.println("\nenter new mail id");
    		  String newMail=sc.next();
    		   
    			 Insert.al.get(index).setMail(newMail);
    		  Display.displayById(id);
    		  break;
    	  }
    	  default:
    		  System.err.println("choose the correct option");
    	  }
      }
}
