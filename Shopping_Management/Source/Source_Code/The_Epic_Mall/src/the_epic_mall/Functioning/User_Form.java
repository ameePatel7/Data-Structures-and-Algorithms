
package the_epic_mall.Functioning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class User_Form
{
	public int form()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter if 1 you are new user.\n Enter 2 if you are existing user.");
		int choiceUser = input.nextInt();
		
		if(choiceUser == 1)
		{
			try 
			{
                FileWriter fstream5 = new FileWriter("User Data.txt", true);
                BufferedWriter fbw5 = new BufferedWriter(fstream5);
				
				FileWriter fstream6 = new FileWriter("UserName.txt", true);
				BufferedWriter fbw6 = new BufferedWriter(fstream6);
				
				System.out.println("Enter your Name:");
				String name = input.nextLine();
				System.out.println("Enter the UserName By which you can handle your account:");
				String uName = input.nextLine();
				
				String s;
				int count = 1;
				while(count>0)
				{
					FileReader fstream61 = new FileReader("UserName.txt");
					BufferedReader fbr6 = new BufferedReader(fstream61);
					count = 0;
	                while((s = fbr6.readLine()) != null) 
					{ 
						if(s.equals(uName))
						{
							count++;
						}
					} 
					if(count>0)
					{
						System.out.println("Username Already Exist.. Enter Other Username please");
						uName = input.nextLine();
					}
				}
				
				System.out.println("Enter Contact number:");
				String cNumber = input.nextLine();
				System.out.println("Enter your House number (Block Number):");
				String hNumber = input.nextLine();
				System.out.println("Enter your Area name:");
				String area = input.nextLine();
				System.out.println("Enter your City name:");
				String city = input.nextLine();
				System.out.println("Enter the PinCode:");
				String PinCode = input.nextLine();
				System.out.println("Enter your Country name:");
				String country = input.nextLine();
				
                /* Writing system date into the file */
                fbw5.write("Name			:			" + name);
                fbw5.newLine();

                fbw5.write("User Name		:			" + uName);
                fbw5.newLine();

                fbw5.write("Contact Number		:			" + cNumber);
                fbw5.newLine();

                fbw5.write("House Number		:			" + hNumber);
                fbw5.newLine();

                fbw5.write("Area			:			" + area);
                fbw5.newLine();

                fbw5.write("City			:			" + city);
                fbw5.newLine();

                fbw5.write("Pincode			:			" + PinCode);
                fbw5.newLine();

				fbw5.write("Country Name		:			" + country);
                fbw5.newLine();
                
                fbw5.newLine();
                fbw5.newLine();
                fbw5.newLine();
                fbw5.newLine();
                fbw5.newLine();

                fbw5.close();
                
                fbw6.write(uName);
                fbw6.newLine();
                
                fbw6.close();
            } 
			catch (Exception r)
			{
                System.out.println("File Not Found...");
            }
		}
		else
		{
			try 
			{
				System.out.println("Enter the UserName:");
				String existing = input.next();
				String s;
				int count = 1;
				while(count!=0)
				{
					FileReader fstream61 = new FileReader("UserName.txt");
					BufferedReader fbr6 = new BufferedReader(fstream61);
					count = 1;
	                while((s = fbr6.readLine()) != null) 
					{ 
						//System.out.println("Hello");
						if(s.equals(existing))
						{
							count=0;
						}
					} 
					if(count==0)
					{
						System.out.println("USERNAME Found in our Data");
						//uName = input.next();
					}
					else
					{
						System.out.println("Invalid Username");
						System.out.println("Enter the UserName again:");
						existing = input.nextLine();
					}
				}
			} 
			catch (Exception r)
			{
                System.out.println("File Not Found...");
            }
		}
		return 0;
	}
}

