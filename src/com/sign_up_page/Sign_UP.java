package com.sign_up_page;


import java.util.*; 
import java.util.regex.Pattern;

public class Sign_UP {
	 
	

	public static ArrayList <String> list = new ArrayList<String>();
    static String gmail;
    static String name;
	
    static String gender;
    static String password;
    static String mobile;
    static String alternate_mobileNumber;
    static String alternate_gmailId;
    static String dateOfBirth;
     static final String MOBILE_NUMBER_PATTERN = "^[9|8|7|6]\\d{9}$";
	  
	
	public static void main(String[] args)
	  
	   { 
		list.add("1.Name");
		 list.add("2.Gender");
		 list.add("3.password");
		 list.add("4.Mobile Number");
		 list.add("5.Alternate Number" );
		 list.add("6.gmail id" );
		 list.add("7.Alternate gmail id" );
		 list.add("8.Date of birth" );
		 list.add("0 to Submit");
		Sign_UP a= new Sign_UP();
		
	  }

	
		public  Sign_UP()
		{	
			
		Iterator<String> i = list.iterator();
		 while(i.hasNext())
		  {
			System.out.println(i.next());
		  }
		
	     System.out.println(" Choose the number");
		
	     Scanner scan= new Scanner(System.in);
	      int a= scan.nextInt();
	       
	      switch(a)
	      {
	      case 1: name= Nam.display();
	              new Sign_UP();
	              
	      case 2: gender= Gender.display();
	              new Sign_UP();
	              
	      case 3: password= Password.display(); 
	               new Sign_UP();
	               
	      case 4: mobile=MobileNumber.display();
	      			new Sign_UP();
	      			
	      case 5: alternate_mobileNumber= AlternateMobileNumber.display();
	                new Sign_UP();
	                
	      case 6: gmail = GmailId.display();
	               new Sign_UP();
	               
	      case 7: alternate_gmailId =AlternateGmailId.display();
	               new Sign_UP();
	               
	      case 8: dateOfBirth= DateOfBirth.display(); 
	               new Sign_UP();
	             
	      case 0: Submits.display();
	      }
		
		}

		


class Nam  extends Sign_UP
{
	public static String display()
	{
		System.out.println("Enter your name");
		Scanner scan= new Scanner(System.in);
		String name= scan.next();
	
		System.out.println("You have entered your name ");
	
		
		list.remove("1.Name");
		return name;
		
		
		
		
	}
}
class Gender extends Sign_UP
{
	 public static String display()
	 {
		 System.out.println("Enter your Gender");
		  Scanner scan = new Scanner(System.in);
		  String gender = scan.nextLine();
		  String m="male";
		  String f="female";
		  if(gender.equalsIgnoreCase(m)|| gender.equalsIgnoreCase(f))
		  {
			  System.out.println("Your gender is" +gender);
			  list.remove("2.Gender");
		
		  }
		  else 
		  {
			  System.out.println("Enter your gender correctly i.e either male or female with any case letters");
			  display();
		  }
		  return gender;
		
	 }
}
class Password extends Sign_UP
{
	public static String display()
	{
		System.out.println("Enter your Password");
		Scanner scan = new Scanner(System.in);
		String password= scan.nextLine();
		if(password.length()<8)
		{
			System.out.println("the password length must be of atleast8 characters");
		            display();
		}
		int upperCount=0;
		int lowerCount=0;
		int digitCount=0;
		for(int i=0; i<password.length();i++)
		{
			char ch=password.charAt(i);
			if(Character.isUpperCase(ch))
			{
				
				upperCount++;
			}
			 if(Character.isLowerCase(ch))
			{
				lowerCount++;
			}
			 if(Character.isDigit(ch))
			{
				
				digitCount++;
			}
		}
			
			 if(lowerCount==0||upperCount==0||digitCount==0)
			 {
					System.out.println("Your password should contain atleast one Upper case , one lower case and one  Numeric character");
					display();

			 }
			 else
			 {
				 System.out.println("You have Entered your password");
				 list.remove("3.password");
			
			 }
			 return password;
		
	}
	
}
class MobileNumber extends Sign_UP
{
	   public static String display()
	   {
		   System.out.println("Enter your Mobile number");
		   Scanner scan = new  Scanner(System.in);
		   String mobileNumber= scan.nextLine();
		   if(mobileNumber.length()!=10)
		   {
			   System.out.println("mobile length must should be 10 numbers");
		   }
		  if(mobileNumberValidator(mobileNumber))
		  {
			  System.out.println("succesfully entere mobile number");
		    	list.remove("4.Mobile Number");
			  
		  }
		  else {
			  System.out.println("Your Phone number should be started with 9 or 8 or 7 or 6 ");
			  display();
		  }
		return mobileNumber;
		   
	   }
		public static boolean mobileNumberValidator(String number) {
			// TODO Auto-generated method stub
			
		       return Pattern.matches(MOBILE_NUMBER_PATTERN, number);
		    }


}
class AlternateMobileNumber extends Sign_UP
{
	 public static String display()
	   {
		   System.out.println("Enter your Alternate Mobile number");
		   Scanner scan = new  Scanner(System.in);
		   String alternate_mobileNumber= scan.nextLine();
		 if(validate_alternameNUmber(alternate_mobileNumber))
		 {
			 System.out.println("both mobile number and alternate mobile number are valid");
			 list.remove("5.Alternate Number");
		 }
		 else {
			 System.out.println("alternate number is not match with mobile nuber");
			 display();
		 }
		return alternate_mobileNumber;
	   }

	private static boolean validate_alternameNUmber(String alternate_mobileNumber) {
		if(alternate_mobileNumber.equals(mobile))
		{
			return true;
		}
		return false;
		
		
	}
}
class GmailId extends Sign_UP
{
	 public static String display()
	 {
		 System.out.println("Enter your gmail id ");
		 Scanner scan = new Scanner(System.in);
		 String gmailId= scan.nextLine();
		 if(gmailId.endsWith("@gmail.com") && gmailId.length()>11)
		 {
			 System.out.println("You have entered your gmail Id successfully");
			 list.remove("6.gmail id");
			 
		 }
		 else
		 {
			 System.out.println("please enter valid mail id");
			 display();
		 }
		 
		  return gmailId;
		
	 }
}
class AlternateGmailId extends Sign_UP
{
	 public static String display()
	 {
		 System.out.println("Enter your Alternate gmail id ");
		 Scanner scan = new Scanner(System.in);
		 String alternate_gmailId= scan.nextLine();
		if(validate_alternateGmailId(alternate_gmailId))
		{
			System.out.println("both gmail id r matched");
			list.remove("7.Alternate gmail id");
			
		}
		else
		{
			System.out.println("both gmail id r not matches");
			display();
		}
		 return alternate_gmailId;
	 }

	private static boolean validate_alternateGmailId(String alternate_gmailId) {
		// TODO Auto-generated method stub
		if(gmail.equals(alternate_gmailId))
		{
			return true;
		}
		return false;
	}
}
class DateOfBirth extends Sign_UP
{
	public static String display() 
	{
		System.out.println("Enter your Date of Birth");
		Scanner scan = new Scanner(System.in);
		String dob =scan.nextLine();
		System.out.println("You entered your date of birth");
		list.remove("8.Date of birth");
		return dob;
	}
}
class Submits extends Sign_UP
{
	 public static void display()
	 { 
		 if (name==null|| gender==null ||password==null||mobile==null||alternate_mobileNumber==null||gmail==null||alternate_gmailId==null||dateOfBirth==null)
		 {
			 System.out.println("Enter all the details before submition");
			 new Sign_UP();
		 }
		 else {
		 System.out.println(name);
		 System.out.println(gender);
		 System.out.println(password);
		 System.out.println(mobile);
		 System.out.println(alternate_mobileNumber);
		 System.out.println(gmail);
		 System.out.println(alternate_gmailId);
		 System.out.println(dateOfBirth);
		 list.remove("0 to Submit");
		 new Sign_UP();
		 }
		 
		 
		 
	 }
}
}

