package ToolKit;

import java.util.*;

import javax.naming.*;

public class Tool {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
      System.out.println("Menu:");
      System.out.println("1.User details");
      System.out.println("2.Update User details ");
      System.out.println("3.Delete User");
      System.out.println("4.Add Group");
      System.out.println("5.Remove Group");
      System.out.println("6.Provide Groupmembership to group");
      System.out.println("7.Update Password");
      System.out.println("8.Exit");
      System.out.println("Enter an option:");
      
      Scanner sc= new Scanner(System.in);
      int opt = sc.nextInt();
    
      switch(opt) {
      case 1 :
    	 // Fetch user details 
         System.out.println("Enter user details:");
         System.out.println("username");
         Scanner sc1 = new Scanner(System.in);
         String dname = sc1.nextLine();
         
         UserDetails udetail = UserDetails.getInstance();
         udetail.ldapConnection();
  //     udetail.getUser(dname);
         udetail.SearchUser(dname);
         break;
      case 2 :
    	  // Update user details
    	  System.out.println("Enter user details to be updated");
    	  System.out.println("username");
    	  Scanner sc2 = new Scanner(System.in);
          String uname = sc2.nextLine();
    	  System.out.println("countryCode");
    	  Scanner sc3 = new Scanner(System.in);
          String code = sc3.nextLine();
          UserDetails upd = UserDetails.getInstance();
          upd.ldapConnection();
          upd.UpdateUser(uname,code);   
          break;
      case 3 :
    	  // Delete user
    	  UserDetails duser = UserDetails.getInstance();
          System.out.println("Enter User name");
          Scanner sc6 = new Scanner(System.in);
          String duname = sc6.nextLine();
          duser.ldapConnection();
          duser.deleteUser(duname); 
          break;
      case 4 :
    	 // Add Group 
         Group grp = Group.getInstance();
         System.out.println("Enter Group name");
         Scanner sc4 = new Scanner(System.in);
         String gname = sc4.nextLine();
         grp.ldapConnection();
         grp.addGroup(gname); 
         break;
      case 5 :
    	  // Delete Group
    	  Group dgrp = Group.getInstance();
          System.out.println("Enter Group name");
          Scanner sc5 = new Scanner(System.in);
          String dgname = sc5.nextLine();
          dgrp.ldapConnection();
          dgrp.deleteGroup(dgname); 
          break;
      case 6 :
          //Provide group membership to a group
    	  Group agrpmem = Group.getInstance();
          System.out.println("Enter Group1 name");
          Scanner sc9 = new Scanner(System.in);
          String grp1 = sc9.nextLine();
          System.out.println("Enter Group2 name");
          Scanner sc10 = new Scanner(System.in);
          String grp2 = sc10.nextLine();
          agrpmem.ldapConnection();
          agrpmem.AddGrouptoGroup(grp1,grp2); 
          break;
      case 7 :
    	  //Change user password
    	  UserDetails cpass = UserDetails.getInstance();
          System.out.println("Enter User name");
          Scanner sc7 = new Scanner(System.in);
          String cuser = sc7.nextLine();
          System.out.println("Enter new password");
          Scanner sc8 = new Scanner(System.in);
          String psw = sc8.nextLine();
          cpass.ldapConnection();
          cpass.changePswd(cuser,psw); 
          break;
      case 8 :
          System.out.println("exit");
          break;
       }
      
    }

}
