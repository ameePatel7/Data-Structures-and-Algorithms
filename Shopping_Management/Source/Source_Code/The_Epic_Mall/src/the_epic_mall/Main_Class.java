
package the_epic_mall;

import java.io.IOException;
import java.util.Scanner;
import the_epic_mall.Garments.*;
import the_epic_mall.Functioning.*;

public class Main_Class 
{
    public static int choice;
    public static int lappyChoice,menchoice;
	static String choiceStr;
	static int k1 = 1;
	static int choiceBuy;
	static String [] wishList = new String[5];
	static Scanner input = new Scanner(System.in);	
    public void main_func()
    {
			//variabl declairation 
				//Scanner object
		
                Kid_Boy Obj2=new Kid_Boy();
                Kid_Girl Obj3=new Kid_Girl();
		Women Obj1=new Women();
                Men Obj = new Men();			//various objects are created
		Tree TreeObject = new Tree();
		Property PdObject=new Property();
		User_Form formObject = new User_Form();
		int choiceLPG = 1;
		
		System.out.println("Welcome to the Epic Mall...");
		System.out.println("Here are the categories of all things we are selling....");
		while(choiceLPG != 0)   //runs untill choice is not zero
		{
			System.out.println("Enter the appropriate number for category...");
			System.out.println("1. MEN");
			System.out.println("2. WOMEN");
			System.out.println("3. KIDS");
			choice = input.nextInt();			//choice for the catagories
			System.out.print("Choice is: "); 
			if(choice==1)				//select searching for laptop
			{
				System.out.println("MEN");
				System.out.println("Now you can go according to the following categories..");
				while(k1!=0)
				{
					System.out.println("Enter Respective number for category...");
					System.out.println("1.T.shirt\n2.Casual & Party wear\n3.Trousers\n4.Blazers\n5.Kurta\n6.Formals\n7.Suits\n");
					menchoice=input.nextInt();
					if(menchoice==1)
					Obj.tshirt();
                                        else if(menchoice==2)
                                            Obj.casual();
                                        else if(menchoice==3)
                                            Obj.trousers();
                                        else if(menchoice==4)
                                           Obj.blazers();                                     
                                        else if(menchoice==5)
                                           Obj.kurta();
                                        else if(menchoice==6)
                                            Obj.formals();
                                        else if(menchoice==7)
                                            Obj.suits();
					
					System.out.println("Enter 1 to continue searching...0 to exit from this product");
					k1 = input.nextInt();
				}
			}
			k1 = 1;
			if(choice==2)				
			{
				System.out.println("WOMEN");
				System.out.println("Now you can go according to the following categories..");
				while(k1!=0)
				{
					System.out.println("Enter Respective number for category...");
					System.out.println("1.Saree\n2.Kurtis\n3.Tunics\n4.Tops\n5.Party wears\n6.Jeans\n7.Shorts\n");
					menchoice=input.nextInt();
					
					if(menchoice==1)
					Obj1.saree();
                                        else if(menchoice==2)
                                            Obj1.kurtis();
                                        else if(menchoice==3)
                                            Obj1.tunics();
                                        else if(menchoice==4)
                                            Obj1.tops();
                                        else if(menchoice==5)
                                            Obj1.party_wear();                                     
                                        else if(menchoice==6)
                                            Obj1.jeans();
                                        else if(menchoice==7)
                                            Obj1.shorts();
                                       
					System.out.println("Enter 1 to continue searching...0 to exit from this product");
					k1 = input.nextInt();
				}
				
			}
			k1=1;
			if(choice==3)			//kids section
			{
				System.out.println("KIDS");
				System.out.println("Now you can go according to the following categories..");
				while(k1!=0)
				{
					System.out.println("Enter Respective number for category...");
					System.out.println("1. Boys\n2.Girls\n");
					lappyChoice= input.nextInt(); 
					if(lappyChoice==1)
                                        {
                                            System.out.println("Want to search by...???");
                                            
                                            System.out.println("1.Polo&T-shirts\n2.Shirts.\n3.Shorts&3/4th\n4.Trousers&Cargos\n5.Ethnic wears\n");
                                            menchoice=input.nextInt();
                                            System.out.println("1.BY BRANDS\n2.BY PRICE \n3.BY TYPE\n4.BY SIZE\n5.BY COLOUR");
                                            int lchoice=input.nextInt();
                                            if(lchoice==1)
                                            {
                                                System.out.println("1.Adidas\n2.Puma\n3.Allen");
                                            }
                                            if(menchoice==1)
                                                Obj2.polo_tshirts();
                                             if(menchoice==2)
                                                Obj2.shirts();
                                              if(menchoice==3)
                                                Obj2.shorts();
                                               if(menchoice==4)
                                                Obj2.trousers_cargos();
                                                if(menchoice==5)
                                                Obj2.ethnic();
                                        }
                                        
                                        if(lappyChoice==2)
                                        {
                                            System.out.println("1.Tshirts & tops\n2.Dresses & skirts\n3.Shorts & capris\n4.Leggings & trousers\n5.Ethnic wear\n");
                                            menchoice=input.nextInt();
                                            if(menchoice==1)
                                                Obj3.tshirts_tops();
                                            if(menchoice==2)
                                                Obj3.dresses_skirts();
                                            if(menchoice==3)
                                                Obj3.shorts_capris();
                                            if(menchoice==4)
                                                Obj3.leggings_trousers();
                                            if(menchoice==5)
                                                Obj3.ethnic();
                                            
                                        }
					System.out.println("Enter 1 to continue searching...0 to exit from this product");
					k1 = input.nextInt();
				}
			}
			System.out.println("Enter 0 to exit or 1 to change the product....");
			choiceLPG = input.nextInt();			//exit when zero
		}				
		int h = 1;
		System.out.println("Enter product name to make wishList");
		System.out.println("Enter 1 to make wishlist 0 otherwise..");
		h = input.nextInt();						//for making the wishlist
		int m=0;
		while(h!=0)
		{
			wishList[m] = input.next();
			System.out.println("Enter 1 to add add another wishlist 0 to finish..");
			h = input.nextInt();
			m++;
		}
		while(m!=0)
		{
			m--;
			System.out.println(wishList[m]);
		}
		System.out.println("Do you want to buy that product?");
		System.out.println("Enter 1 if you want to buy and 0 otherwise");
		choiceBuy = input.nextInt();			//for buying the product
		if(choiceBuy == 1)
		{
			System.out.println("Enter the name of product...");
			String product = input.next();
			System.out.println("The product you are buying is...."+product);
			formObject.form();
			System.out.println("Thank you So much for Shopping...");
		}
		else
		{
			System.out.println("See you Soon... Thank you for visit...");
		}
	}

}
