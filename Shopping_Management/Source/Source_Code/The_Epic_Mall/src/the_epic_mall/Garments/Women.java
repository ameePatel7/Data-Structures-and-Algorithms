
package the_epic_mall.Garments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import the_epic_mall.Functioning.*;
import the_epic_mall.Garments.*;
import static the_epic_mall.Main_Class.lappyChoice;

public class Women 
{
public int saree()
	{
		int i1=0;
		String s;
		Scanner c = new Scanner(System.in);
		Conversion ObjLaptop1 = new Conversion();
		Property PdObject=new Property();
		Tree TreeObject=new Tree();
		int checkR=0;
		try
		{
                    FileWriter f0 = new FileWriter("Fsaree.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
                    FileReader fstream1 = new FileReader("Fsaree.txt");
                    BufferedReader fbr0 = new BufferedReader(fstream1);
                    System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Type\n4.All of the above\n");
                    int ta=c.nextInt(); 
                    
                    if(ta == 1)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)Jaypore\n2.)Silkbazar\n3.)Amrapali\n4.)Aanaya\n5.)Aarohii\n6.)Anushree\n7.)Arch\n8.)Ashoka\n9.)Asopalav\n10.)Banarasi\n11.)Bandini\n12.)Villa\n13.)Desi\n14.)Designer\n15.)Diva\n16.)Ere\n17.)Fabdesire\n18.)Favola\n19.)Festive\n20.)Florence\n21.)Hawai\n22.)Indian\n23.)Infini\n24.)Inspira\n25.)Jashn\n26.)Jhalak\n27.)Jiya\n28.)JK\n29.)Kalist\n30.)Kalki\n31.)Kavya\n32.)Kesar\n33.)Ladli\n34.)Lauren\n35.)Mahi\n36.)Navya\n37.)NK\n38.)Odhni\n39.)Paaneri\n40.)Rewa\n41.)Shagun\n42.)Shailey\n43.)TajArt\n44.)Tulsi\n45.)Urban\n46.)Vandana\n");              
		   	String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==4)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<4 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    if(ta == 2)
                    {
                       System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                       String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==4)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<4 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    
                    if(ta == 3)
                    {
                        System.out.println("Enter the Type from the one given below........\n1.)Floral\n2.)Printed\n3.)Geometric\n4.)Graphic\n5.)Polka\n6.)Solid\n7.)Stripped\n8.)Checkered\n");              
		   	String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==4)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<4 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    
                    if(ta == 4)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)Jaypore\n2.)Silkbazar\n3.)Amrapali\n4.)Aanaya\n5.)Aarohii\n6.)Anushree\n7.)Arch\n8.)Ashoka\n9.)Asopalav\n10.)Banarasi\n11.)Bandini\n12.)Villa\n13.)Desi\n14.)Designer\n15.)Diva\n16.)Ere\n17.)Fabdesire\n18.)Favola\n19.)Festive\n20.)Florence\n21.)Hawai\n22.)Indian\n23.)Infini\n24.)Inspira\n25.)Jashn\n26.)Jhalak\n27.)Jiya\n28.)JK\n29.)Kalist\n30.)Kalki\n31.)Kavya\n32.)Kesar\n33.)Ladli\n34.)Lauren\n35.)Mahi\n36.)Navya\n37.)NK\n38.)Odhni\n39.)Paaneri\n40.)Rewa\n41.)Shagun\n42.)Shailey\n43.)TajArt\n44.)Tulsi\n45.)Urban\n46.)Vandana\n");              
		   	String new1 = c.next();
                        System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                       String new2 = c.next();
                       System.out.println("Enter the Type from the one given below........\n1.)Floral\n2.)Printed\n3.)Geometric\n4.)Graphic\n5.)Polka\n6.)Solid\n7.)Stripped\n8.)Checkered\n");              
		   	String new3 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s)  ||  new2.equalsIgnoreCase(s)  ||  new3.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==4)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<4 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
			fbw0.close();
			fbr0.close();	
		}
		catch (Exception r)		//exception occurs 
		{
            System.out.println("File Not Found...");
        }
		return 0;
	}
    
    public int kurtis()
	{
		int i1=0;
		String s;
		Scanner c = new Scanner(System.in);
		Conversion ObjLaptop1 = new Conversion();
		Property PdObject=new Property();
		Tree TreeObject=new Tree();
		int checkR=0;
		try
		{
                    FileWriter f0 = new FileWriter("Fkurtis.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
                    FileReader fstream1 = new FileReader("Fkurtis.txt");
                    BufferedReader fbr0 = new BufferedReader(fstream1);
                    System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Size\n4.All of the above\n");
                    int ta=c.nextInt(); 
                    
                    if(ta == 1)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)Jaypore\n2.)Silkbazar\n3.)Amrapali\n4.)Aanaya\n5.)Aarohii\n6.)Anushree\n7.)Arch\n8.)Ashoka\n9.)Asopalav\n10.)Banarasi\n11.)Bandini\n12.)Villa\n13.)Desi\n14.)Designer\n15.)Diva\n16.)Ere\n17.)Fabdesire\n18.)Favola\n19.)Festive\n20.)Florence\n21.)Hawai\n22.)Indian\n23.)Infini\n24.)Inspira\n25.)Jashn\n26.)Jhalak\n27.)Jiya\n28.)JK\n29.)Kalist\n30.)Kalki\n31.)Kavya\n32.)Kesar\n33.)Ladli\n34.)Lauren\n35.)Mahi\n36.)Navya\n37.)NK\n38.)Odhni\n39.)Paaneri\n40.)Rewa\n41.)Shagun\n42.)Shailey\n43.)TajArt\n44.)Tulsi\n45.)Urban\n46.)Vandana\n");              
		   	String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    if(ta == 2)
                    {
                       System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                       String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    
                    if(ta == 3)
                    {
                        System.out.println("Enter the Size choices that are given below........\n1.S\n2.M\n3.L\n4.XL\n");
                        String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    
                    if(ta == 4)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)Jaypore\n2.)Silkbazar\n3.)Amrapali\n4.)Aanaya\n5.)Aarohii\n6.)Anushree\n7.)Arch\n8.)Ashoka\n9.)Asopalav\n10.)Banarasi\n11.)Bandini\n12.)Villa\n13.)Desi\n14.)Designer\n15.)Diva\n16.)Ere\n17.)Fabdesire\n18.)Favola\n19.)Festive\n20.)Florence\n21.)Hawai\n22.)Indian\n23.)Infini\n24.)Inspira\n25.)Jashn\n26.)Jhalak\n27.)Jiya\n28.)JK\n29.)Kalist\n30.)Kalki\n31.)Kavya\n32.)Kesar\n33.)Ladli\n34.)Lauren\n35.)Mahi\n36.)Navya\n37.)NK\n38.)Odhni\n39.)Paaneri\n40.)Rewa\n41.)Shagun\n42.)Shailey\n43.)TajArt\n44.)Tulsi\n45.)Urban\n46.)Vandana\n");              
		   	String new1 = c.next();
                        System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                       String new2 = c.next();
                      System.out.println("Enter the Size choices that are given below........\n1.S\n2.M\n3.L\n4.XL\n");
                        String new3 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s)  ||  new2.equalsIgnoreCase(s)  ||  new3.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
			fbw0.close();
			fbr0.close();	
		}
		catch (Exception r)		//exception occurs 
		{
            System.out.println("File Not Found...");
        }
		return 0;
	}
    
    public int tunics()
	{
		int i1=0;
		String s;
		Scanner c = new Scanner(System.in);
		Conversion ObjLaptop1 = new Conversion();
		Property PdObject=new Property();
		Tree TreeObject=new Tree();
		int checkR=0;
		try
		{
                    FileWriter f0 = new FileWriter("Ftunics.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
                    FileReader fstream1 = new FileReader("Ftunics.txt");
                    BufferedReader fbr0 = new BufferedReader(fstream1);
                    System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Size\n4.All of the above\n");
                    int ta=c.nextInt(); 
                    
                    if(ta == 1)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)Jaypore\n2.)Silkbazar\n3.)Amrapali\n4.)Aanaya\n5.)Aarohii\n6.)Anushree\n7.)Arch\n8.)Ashoka\n9.)Asopalav\n10.)Banarasi\n11.)Bandini\n12.)Villa\n13.)Desi\n14.)Designer\n15.)Diva\n16.)Ere\n17.)Fabdesire\n18.)Favola\n19.)Festive\n20.)Florence\n21.)Hawai\n22.)Indian\n23.)Infini\n24.)Inspira\n25.)Jashn\n26.)Jhalak\n27.)Jiya\n28.)JK\n29.)Kalist\n30.)Kalki\n31.)Kavya\n32.)Kesar\n33.)Ladli\n34.)Lauren\n35.)Mahi\n36.)Navya\n37.)NK\n38.)Odhni\n39.)Paaneri\n40.)Rewa\n41.)Shagun\n42.)Shailey\n43.)TajArt\n44.)Tulsi\n45.)Urban\n46.)Vandana\n");              
		   	String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    if(ta == 2)
                    {
                       System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                       String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    
                    if(ta == 3)
                    {
                        System.out.println("Enter the Size choices that are given below........\n1.S\n2.M\n3.L\n4.XL\n");
                        String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    
                    if(ta == 4)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)Jaypore\n2.)Silkbazar\n3.)Amrapali\n4.)Aanaya\n5.)Aarohii\n6.)Anushree\n7.)Arch\n8.)Ashoka\n9.)Asopalav\n10.)Banarasi\n11.)Bandini\n12.)Villa\n13.)Desi\n14.)Designer\n15.)Diva\n16.)Ere\n17.)Fabdesire\n18.)Favola\n19.)Festive\n20.)Florence\n21.)Hawai\n22.)Indian\n23.)Infini\n24.)Inspira\n25.)Jashn\n26.)Jhalak\n27.)Jiya\n28.)JK\n29.)Kalist\n30.)Kalki\n31.)Kavya\n32.)Kesar\n33.)Ladli\n34.)Lauren\n35.)Mahi\n36.)Navya\n37.)NK\n38.)Odhni\n39.)Paaneri\n40.)Rewa\n41.)Shagun\n42.)Shailey\n43.)TajArt\n44.)Tulsi\n45.)Urban\n46.)Vandana\n");              
		   	String new1 = c.next();
                        System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                       String new2 = c.next();
                      System.out.println("Enter the Size choices that are given below........\n1.S\n2.M\n3.L\n4.XL\n");
                        String new3 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s)  ||  new2.equalsIgnoreCase(s)  ||  new3.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
			fbw0.close();
			fbr0.close();	
		}
		catch (Exception r)		//exception occurs 
		{
            System.out.println("File Not Found...");
        }
		return 0;
	}
    
     
    public  int tops()
    {
		int i1=0;
		String s;
		Scanner c = new Scanner(System.in);
		Conversion ObjLaptop1 = new Conversion();
		Property PdObject=new Property();
		Tree TreeObject=new Tree();
		int checkR=0;
		try
		{
                    FileWriter f0 = new FileWriter("Ftops.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
                    FileReader fstream1 = new FileReader("Ftops.txt");
                    BufferedReader fbr0 = new BufferedReader(fstream1);
                    System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Size\n4.All of the above\n");
                    int ta=c.nextInt(); 
                    
                    if(ta == 1)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)Jaypore\n2.)Silkbazar\n3.)Amrapali\n4.)Aanaya\n5.)Aarohii\n6.)Anushree\n7.)Arch\n8.)Ashoka\n9.)Asopalav\n10.)Banarasi\n11.)Bandini\n12.)Villa\n13.)Desi\n14.)Designer\n15.)Diva\n16.)Ere\n17.)Fabdesire\n18.)Favola\n19.)Festive\n20.)Florence\n21.)Hawai\n22.)Indian\n23.)Infini\n24.)Inspira\n25.)Jashn\n26.)Jhalak\n27.)Jiya\n28.)JK\n29.)Kalist\n30.)Kalki\n31.)Kavya\n32.)Kesar\n33.)Ladli\n34.)Lauren\n35.)Mahi\n36.)Navya\n37.)NK\n38.)Odhni\n39.)Paaneri\n40.)Rewa\n41.)Shagun\n42.)Shailey\n43.)TajArt\n44.)Tulsi\n45.)Urban\n46.)Vandana\n");              
		   	String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    if(ta == 2)
                    {
                       System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                       String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    
                    if(ta == 3)
                    {
                        System.out.println("Enter the Size choices that are given below........\n1.S\n2.M\n3.L\n4.XL\n");
                        String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    
                    if(ta == 4)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)Jaypore\n2.)Silkbazar\n3.)Amrapali\n4.)Aanaya\n5.)Aarohii\n6.)Anushree\n7.)Arch\n8.)Ashoka\n9.)Asopalav\n10.)Banarasi\n11.)Bandini\n12.)Villa\n13.)Desi\n14.)Designer\n15.)Diva\n16.)Ere\n17.)Fabdesire\n18.)Favola\n19.)Festive\n20.)Florence\n21.)Hawai\n22.)Indian\n23.)Infini\n24.)Inspira\n25.)Jashn\n26.)Jhalak\n27.)Jiya\n28.)JK\n29.)Kalist\n30.)Kalki\n31.)Kavya\n32.)Kesar\n33.)Ladli\n34.)Lauren\n35.)Mahi\n36.)Navya\n37.)NK\n38.)Odhni\n39.)Paaneri\n40.)Rewa\n41.)Shagun\n42.)Shailey\n43.)TajArt\n44.)Tulsi\n45.)Urban\n46.)Vandana\n");              
		   	String new1 = c.next();
                        System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                       String new2 = c.next();
                      System.out.println("Enter the Size choices that are given below........\n1.S\n2.M\n3.L\n4.XL\n");
                        String new3 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s)  ||  new2.equalsIgnoreCase(s)  ||  new3.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
			fbw0.close();
			fbr0.close();	
		}
		catch (Exception r)		//exception occurs 
		{
            System.out.println("File Not Found...");
        }
		return 0;
	}
	
    public   int party_wear()
    {
		int i1=0;
		String s;
		Scanner c = new Scanner(System.in);
		Conversion ObjLaptop1 = new Conversion();
		Property PdObject=new Property();
		Tree TreeObject=new Tree();
		int checkR=0;
		try
		{
                    FileWriter f0 = new FileWriter("Fparty_wear.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
                    FileReader fstream1 = new FileReader("Fparty_wear.txt");
                    BufferedReader fbr0 = new BufferedReader(fstream1);
                    System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Size\n4.All of the above\n");
                    int ta=c.nextInt(); 
                    
                    if(ta == 1)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)Jaypore\n2.)Silkbazar\n3.)Amrapali\n4.)Aanaya\n5.)Aarohii\n6.)Anushree\n7.)Arch\n8.)Ashoka\n9.)Asopalav\n10.)Banarasi\n11.)Bandini\n12.)Villa\n13.)Desi\n14.)Designer\n15.)Diva\n16.)Ere\n17.)Fabdesire\n18.)Favola\n19.)Festive\n20.)Florence\n21.)Hawai\n22.)Indian\n23.)Infini\n24.)Inspira\n25.)Jashn\n26.)Jhalak\n27.)Jiya\n28.)JK\n29.)Kalist\n30.)Kalki\n31.)Kavya\n32.)Kesar\n33.)Ladli\n34.)Lauren\n35.)Mahi\n36.)Navya\n37.)NK\n38.)Odhni\n39.)Paaneri\n40.)Rewa\n41.)Shagun\n42.)Shailey\n43.)TajArt\n44.)Tulsi\n45.)Urban\n46.)Vandana\n");              
		   	String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    if(ta == 2)
                    {
                       System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                       String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    
                    if(ta == 3)
                    {
                        System.out.println("Enter the Size choices that are given below........\n1.S\n2.M\n3.L\n4.XL\n");
                        String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    
                    if(ta == 4)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)Jaypore\n2.)Silkbazar\n3.)Amrapali\n4.)Aanaya\n5.)Aarohii\n6.)Anushree\n7.)Arch\n8.)Ashoka\n9.)Asopalav\n10.)Banarasi\n11.)Bandini\n12.)Villa\n13.)Desi\n14.)Designer\n15.)Diva\n16.)Ere\n17.)Fabdesire\n18.)Favola\n19.)Festive\n20.)Florence\n21.)Hawai\n22.)Indian\n23.)Infini\n24.)Inspira\n25.)Jashn\n26.)Jhalak\n27.)Jiya\n28.)JK\n29.)Kalist\n30.)Kalki\n31.)Kavya\n32.)Kesar\n33.)Ladli\n34.)Lauren\n35.)Mahi\n36.)Navya\n37.)NK\n38.)Odhni\n39.)Paaneri\n40.)Rewa\n41.)Shagun\n42.)Shailey\n43.)TajArt\n44.)Tulsi\n45.)Urban\n46.)Vandana\n");              
		   	String new1 = c.next();
                        System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                       String new2 = c.next();
                      System.out.println("Enter the Size choices that are given below........\n1.S\n2.M\n3.L\n4.XL\n");
                        String new3 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s)  ||  new2.equalsIgnoreCase(s)  ||  new3.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
			fbw0.close();
			fbr0.close();	
		}
		catch (Exception r)		//exception occurs 
		{
            System.out.println("File Not Found...");
        }
		return 0;
	}
   
    public int jeans()
    {
		int i1=0;
		String s;
		Scanner c = new Scanner(System.in);
		Conversion ObjLaptop1 = new Conversion();
		Property PdObject=new Property();
		Tree TreeObject=new Tree();
		int checkR=0;
		try
		{
                    FileWriter f0 = new FileWriter("Fjeans.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
                    FileReader fstream1 = new FileReader("Fjeans.txt");
                    BufferedReader fbr0 = new BufferedReader(fstream1);
                    System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Type\n4.All of the above\n");
                    int ta=c.nextInt(); 
                    
                    if(ta == 1)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)Puma\n2.)UCB\n3.)Levis\n4.)Wrangler\n5.)Allen\n6.)Zovi\n7.)Roadster\n8.)Lee\n9.)Max\n10.)Arrow\n11.)Van\n12.)Pepe\n13.)Vero\n14.)HRX\n15.)PA\n16.)Anouk\n17.)Enamore\n18.)Yepme\n19.)Airways\n20.)Alba\n21.)Hawai\n22.)Indian\n23.)Infini\n24.)Inspira\n25.)Jashn\n26.)Jhalak\n27.)Jiya\n28.)JK\n29.)Kalist\n30.)Kalki\n31.)Kavya\n32.)Kesar\n33.)Ladli\n34.)Lauren\n35.)Mahi\n36.)Navya\n37.)NK\n38.)Odhni\n39.)Paaneri\n40.)Rewa\n41.)Shagun\n42.)Shailey\n43.)TajArt\n44.)Tulsi\n45.)Urban\n46.)Vandana\n");              
		   	String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==4)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<4 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    if(ta == 2)
                    {
                       System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                       String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==4)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<4 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    
                    if(ta == 3)
                    {
                        System.out.println("Enter the Type choices that are given below........\n1.Floral\n2.Printed\n3.Geometric\n4.Graphic\n5.)Polka\n6.)Solid\n7.)Stripped\n8.)Checks\n");
                        String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==4)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<4 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    
                    if(ta == 4)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)Puma\n2.)UCB\n3.)Levis\n4.)Wrangler\n5.)Allen\n6.)Zovi\n7.)Roadster\n8.)Lee\n9.)Max\n10.)Arrow\n11.)Van\n12.)Pepe\n13.)Vero\n14.)HRX\n15.)PA\n16.)Anouk\n17.)Enamore\n18.)Yepme\n19.)Airways\n20.)Alba\n21.)Hawai\n22.)Indian\n23.)Infini\n24.)Inspira\n25.)Jashn\n26.)Jhalak\n27.)Jiya\n28.)JK\n29.)Kalist\n30.)Kalki\n31.)Kavya\n32.)Kesar\n33.)Ladli\n34.)Lauren\n35.)Mahi\n36.)Navya\n37.)NK\n38.)Odhni\n39.)Paaneri\n40.)Rewa\n41.)Shagun\n42.)Shailey\n43.)TajArt\n44.)Tulsi\n45.)Urban\n46.)Vandana\n");              
		   	String new1 = c.next();
                        System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                       String new2 = c.next();
                      System.out.println("Enter the Size choices that are given below........\n1.Floral\n2.Printed\n3.Geometric\n4.Graphic\n5.)Polka\n6.)Solid\n7.)Stripped\n8.)Checks\n");
                        String new3 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s)  ||  new2.equalsIgnoreCase(s)  ||  new3.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==4)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<4 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
			fbw0.close();
			fbr0.close();	
		}
		catch (Exception r)		//exception occurs 
		{
            System.out.println("File Not Found...");
        }
		return 0;
	}
	
    public  int shorts()
    {
		int i1=0;
		String s;
		Scanner c = new Scanner(System.in);
		Conversion ObjLaptop1 = new Conversion();
		Property PdObject=new Property();
		Tree TreeObject=new Tree();
		int checkR=0;
		try
		{
                    FileWriter f0 = new FileWriter("Fshorts.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
                    FileReader fstream1 = new FileReader("Fshorts.txt");
                    BufferedReader fbr0 = new BufferedReader(fstream1);
                    System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Type\n4.All of the above\n");
                    int ta=c.nextInt(); 
                    
                    if(ta == 1)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)Puma\n2.)UCB\n3.)Levis\n4.)Wrangler\n5.)Allen\n6.)Zovi\n7.)Roadster\n8.)Lee\n9.)Max\n10.)Arrow\n11.)Van\n12.)Pepe\n13.)Vero\n14.)HRX\n15.)PA\n16.)Anouk\n17.)Enamore\n18.)Yepme\n19.)Airways\n20.)Alba\n21.)Hawai\n22.)Indian\n23.)Infini\n24.)Inspira\n25.)Jashn\n26.)Jhalak\n27.)Jiya\n28.)JK\n29.)Kalist\n30.)Kalki\n31.)Kavya\n32.)Kesar\n33.)Ladli\n34.)Lauren\n35.)Mahi\n36.)Navya\n37.)NK\n38.)Odhni\n39.)Paaneri\n40.)Rewa\n41.)Shagun\n42.)Shailey\n43.)TajArt\n44.)Tulsi\n45.)Urban\n46.)Vandana\n");              
		   	String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==4)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<4 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    if(ta == 2)
                    {
                       System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                       String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==4)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<4 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    
                    if(ta == 3)
                    {
                        System.out.println("Enter the Type choices that are given below........\n1.Floral\n2.Printed\n3.Geometric\n4.Graphic\n5.)Polka\n6.)Solid\n7.)Stripped\n8.)Checks\n");
                        String new1 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==4)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<4 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
                    
                    if(ta == 4)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)Puma\n2.)UCB\n3.)Levis\n4.)Wrangler\n5.)Allen\n6.)Zovi\n7.)Roadster\n8.)Lee\n9.)Max\n10.)Arrow\n11.)Van\n12.)Pepe\n13.)Vero\n14.)HRX\n15.)PA\n16.)Anouk\n17.)Enamore\n18.)Yepme\n19.)Airways\n20.)Alba\n21.)Hawai\n22.)Indian\n23.)Infini\n24.)Inspira\n25.)Jashn\n26.)Jhalak\n27.)Jiya\n28.)JK\n29.)Kalist\n30.)Kalki\n31.)Kavya\n32.)Kesar\n33.)Ladli\n34.)Lauren\n35.)Mahi\n36.)Navya\n37.)NK\n38.)Odhni\n39.)Paaneri\n40.)Rewa\n41.)Shagun\n42.)Shailey\n43.)TajArt\n44.)Tulsi\n45.)Urban\n46.)Vandana\n");              
		   	String new1 = c.next();
                        System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                       String new2 = c.next();
                      System.out.println("Enter the Type choices that are given below........\n1.Floral\n2.Printed\n3.Geometric\n4.Graphic\n5.)Polka\n6.)Solid\n7.)Stripped\n8.)Checks");
                        String new3 = c.next();
		    while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s)  ||  new2.equalsIgnoreCase(s)  ||  new3.equalsIgnoreCase(s))
		    	{
		    		System.out.println("\nProduct...");
		    		checkR++;
		    	}
		    	PdObject.var[i1] = ObjLaptop1.toFloat(s);
		    	i1++;
		    	PdObject.Stock=6;
				if(i1==4)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<4 ; i++)
						{
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                    }
			fbw0.close();
			fbr0.close();	
		}
		catch (Exception r)		//exception occurs 
		{
            System.out.println("File Not Found...");
        }
		return 0;
	}
    
}