package com.manage;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class TestManager
{
	  public List<String> userstorage;
		  
	  
	   public TestManager()
	   {
		  userstorage= new ArrayList<String>();
	   }
	   
	   public boolean addUser(String email)
	   {
		    return userstorage.add(email);
	   }
	   
	   public String getUser(String email)
	   {
		   for(String s : userstorage)
		   {
			   if(s.equals(email))
			   {
				   return s;
			   }
			   
		   }
		   return null;
	   }
	   @Test
	   public void add()
	   {
		TestManager t = new TestManager();
		t.addUser("sagargraj1@gmail.com");
		System.out.println("Succufully added");
		String name = t.getUser("sagargraj1@gmail.com");
		System.out.println(name);
		   
	   }
	  
}
