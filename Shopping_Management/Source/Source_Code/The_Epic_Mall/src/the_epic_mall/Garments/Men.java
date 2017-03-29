
package the_epic_mall.Garments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import the_epic_mall.Functioning.*;
import static the_epic_mall.Main_Class.*;

public class Men
{
    public int tshirt()
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
			FileWriter f0 = new FileWriter("Mtshirt.txt", true);
		        BufferedWriter fbw0 = new BufferedWriter(f0);
			FileReader fstream1 = new FileReader("Mtshirt.txt");
			BufferedReader fbr0 = new BufferedReader(fstream1);
                        System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Size\n4.All of the above\n");
                        int ta=c.nextInt(); 
			
                        if(ta == 1)
                        {
                            System.out.println("Enter The Brand Name From The One Given Below....\n1.)UCB\n2.)Duke\n3.)Levis\n4.)Arrow\n5.)Lee\n6.)Fila\n7.)USPolo\n8.)KCR\n9.)Bendiesel\n10.)Bolt\n11.)Champion\n12.)CMYK\n13.)Edge\n14.)Fabindia\n15.)Fox\n16.)Funk\n17.)Gant\n18.)Gas\n19.)Globus\n20.)GolfClub\n21.)Hack\n22.)Gypsum\n23.)Hancock\n24.)Hap\n25.)Hardys\n26.)Harvard\n27.)Icon\n28.)Imagica\n29.)Nike\n30.)JackJones\n31.)PaulStreet\n32.)JDC\n33.)Pepe\n34.)Rebel\n35.)Reebok\n36.)Texas\n37.)Woodside\n38.)Yepme\n");
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
		    	PdObject.Stock=8;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
                                                        if(i==5)
                                                        {
                                                            System.out.println("\n");
                                                            return 0;
                                                        }
                                                        else
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
		    	PdObject.Stock=8;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
                                                        if(i==5)
                                                        {
                                                            System.out.println("\n");
                                                            return 0;
                                                        }
                                                        else
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
		    	PdObject.Stock=5;
				if(i1==7)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
                                                        if(i==5)
                                                        {
                                                            System.out.println("\n");
                                                            return 0;
                                                        }
                                                        else
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                   }
                        
                        if(ta == 4)
                        {
                            System.out.println("Enter The Brand Name From The One Given Below....\n1.)UCB\n2.)Duke\n3.)Levis\n4.)Arrow\n5.)Lee\n6.)Fila\n7.)USPolo\n8.)KCR\n9.)Bendiesel\n10.)Bolt\n11.)Champion\n12.)CMYK\n13.)Edge\n14.)Fabindia\n15.)Fox\n16.)Funk\n17.)Gant\n18.)Gas\n19.)Globus\n20.)GolfClub\n21.)Hack\n22.)Gypsum\n23.)Hancock\n24.)Hap\n25.)Hardys\n26.)Harvard\n27.)Icon\n28.)Imagica\n29.)Nike\n30.)JackJones\n31.)PaulStreet\n32.)JDC\n33.)Pepe\n34.)Rebel\n35.)Reebok\n36.)Texas\n37.)Woodside\n38.)Yepme\n");
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
		    	PdObject.Stock=8;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
                                                        if(i==5)
                                                        {
                                                            System.out.println("\n");
                                                            return 0;
                                                        }
                                                        else
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
    
    public int casual()
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
			FileWriter f0 = new FileWriter("Mcasual.txt", true);
		        BufferedWriter fbw0 = new BufferedWriter(f0);
			FileReader fstream1 = new FileReader("Mcasual.txt");
			BufferedReader fbr0 = new BufferedReader(fstream1);
                        System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Size\n4.All of the above\n");
                        int ta=c.nextInt(); 
			
                        if(ta == 1)
                        {
                            System.out.println("Enter The Brand Name From The One Given Below....\n1.)UCB\n2.)Levis\n3.)Roadster\n4.)PEngland\n5.)Lee\n6.)HRX\n7.)JackJones\n8.)Highlander\n9.)ArrowSport\n10.)Parx\n11.)USPolo\n12.)Pepe\n13.)Adventure\n14.)Alreno\n15.)Aquarius\n16.)Bleu\n17.)Celio\n18.)Coaster\n19.)Cowboy\n");
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
		    	PdObject.Stock=8;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
                                                        if(i==5)
                                                        {
                                                            System.out.println("\n");
                                                            return 0;
                                                        }
                                                        else
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
		    	PdObject.Stock=8;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
                                                        if(i==5)
                                                        {
                                                            System.out.println("\n");
                                                            return 0;
                                                        }
                                                        else
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
		    	PdObject.Stock=8;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
                                                        if(i==5)
                                                        {
                                                            System.out.println("\n");
                                                            return 0;
                                                        }
                                                        else
							ObjLaptop1.toString(PdObject.var[i]);
						}
					}
				}
		    }
                   }
                        
                        if(ta == 4)
                        {
                            System.out.println("Enter The Brand Name From The One Given Below....\n1.)UCB\n2.)Levis\n3.)Roadster\n4.)PEngland\n5.)Lee\n6.)HRX\n7.)JackJones\n8.)Highlander\n9.)ArrowSport\n10.)Parx\n11.)USPolo\n12.)Pepe\n13.)Adventure\n14.)Alreno\n15.)Aquarius\n16.)Bleu\n17.)Celio\n18.)Coaster\n19.)Cowboy\n");
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
		    	PdObject.Stock=8;
				if(i1==5)
				{
					i1 = 0;
					TreeObject.insert(PdObject.var[i1],PdObject);
					if(checkR>0)
					{
						checkR=0;
						for(int i=0; i<5 ; i++)
						{
                                                        if(i==5)
                                                        {
                                                            System.out.println("\n");
                                                            return 0;
                                                        }
                                                        else
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
	 
    public int party_wear()
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
                    FileWriter f0 = new FileWriter("Mpartywear.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
                    FileReader fstream1 = new FileReader("Mpartywear.txt");
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
	
	
    public int trousers()
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
                    FileWriter f0 = new FileWriter("MTrousers.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
                    FileReader fstream1 = new FileReader("MTrousers.txt");
                    BufferedReader fbr0 = new BufferedReader(fstream1);
                    System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Type\n4.All of the above\n");
                    int ta=c.nextInt(); 
                    
                    if(ta == 1)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)Aomi\n2.)Allen\n3.)Globe\n4.)Super\n5.)Superman\n6.)Sodacan\n7.)Yellowkite\n8.)Uber\n9.)Puma\n10.)Coffeebean\n11.)O2\n12.)FSmini\n13.)Oxolloxo\n14.)Cherokee\n15.)United\n");              
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
                        System.out.println("Enter the Type choices that are given below........\n1.Full\n2.)Anklet\n");
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
                        System.out.println("Enter the Brand Name from the one given below........\n1.)Aomi\n2.)Allen\n3.)Globe\n4.)Super\n5.)Superman\n6.)Sodacan\n7.)Yellowkite\n8.)Uber\n9.)Puma\n10.)Coffeebean\n11.)O2\n12.)FSmini\n13.)Oxolloxo\n14.)Cherokee\n15.)United\n");              
		   	String new1 = c.next();
                        System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                       String new2 = c.next();
                      System.out.println("Enter the Size choices that are given below........\n1.Full\n2.)Anklet\n");
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
	
    public int blazers()
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
                    FileWriter f0 = new FileWriter("MBlazers.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
                    FileReader fstream1 = new FileReader("MBlazers.txt");
                    BufferedReader fbr0 = new BufferedReader(fstream1);
                    System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Size\n4.All of the above\n");
                    int ta=c.nextInt(); 
                    
                    if(ta == 1)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)UCB\n2.)Duke\n3.)Levis\n4.)Arrow\n5.)Lee\n6.)Fila\n7.)USPolo\n8.)KCR\n9.)Bendiesel\n10.)Bolt\n11.)Champion\n12.)CMYK\n13.)Edge\n14.)Fabindia\n15.)Fox\n16.)Funk\n17.)Gant\n18.)Gas\n19.)Globus\n20.)GolfClub\n21.)Hack\n22.)Gypsum\n23.)Hancock\n24.)Hap\n25.)Hardys\n26.)Harvard\n27.)Icon\n28.)Imagica\n29.)Nike\n30.)JackJones\n31.)PaulStreet\n32.)JDC\n33.)Pepe\n34.)Rebel\n35.)Reebok\n36.)Texas\n37.)Woodside\n38.)Yepme\n");              
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
                        System.out.println("Enter the Brand Name from the one given below........\n1.)UCB\n2.)Duke\n3.)Levis\n4.)Arrow\n5.)Lee\n6.)Fila\n7.)USPolo\n8.)KCR\n9.)Bendiesel\n10.)Bolt\n11.)Champion\n12.)CMYK\n13.)Edge\n14.)Fabindia\n15.)Fox\n16.)Funk\n17.)Gant\n18.)Gas\n19.)Globus\n20.)GolfClub\n21.)Hack\n22.)Gypsum\n23.)Hancock\n24.)Hap\n25.)Hardys\n26.)Harvard\n27.)Icon\n28.)Imagica\n29.)Nike\n30.)JackJones\n31.)PaulStreet\n32.)JDC\n33.)Pepe\n34.)Rebel\n35.)Reebok\n36.)Texas\n37.)Woodside\n38.)Yepme\n");              
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
        
    public int kurta()
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
                    FileWriter f0 = new FileWriter("MKurtas.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
                    FileReader fstream1 = new FileReader("MKurtas.txt");
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
	    
    public  int formals()
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
                    FileWriter f0 = new FileWriter("MFormals.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
                    FileReader fstream1 = new FileReader("MFormals.txt");
                    BufferedReader fbr0 = new BufferedReader(fstream1);
                    System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Size\n4.All of the above\n");
                    int ta=c.nextInt(); 
                    
                    if(ta == 1)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)UCB\n2.)Duke\n3.)Levis\n4.)Arrow\n5.)Lee\n6.)Fila\n7.)USPolo\n8.)KCR\n9.)Bendiesel\n10.)Bolt\n11.)Champion\n12.)CMYK\n13.)Edge\n14.)Fabindia\n15.)Fox\n16.)Funk\n17.)Gant\n18.)Gas\n19.)Globus\n20.)GolfClub\n21.)Hack\n22.)Gypsum\n23.)Hancock\n24.)Hap\n25.)Hardys\n26.)Harvard\n27.)Icon\n28.)Imagica\n29.)Nike\n30.)JackJones\n31.)PaulStreet\n32.)JDC\n33.)Pepe\n34.)Rebel\n35.)Reebok\n36.)Texas\n37.)Woodside\n38.)Yepme\n");              
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
                        System.out.println("Enter the Brand Name from the one given below........\n1.)UCB\n2.)Duke\n3.)Levis\n4.)Arrow\n5.)Lee\n6.)Fila\n7.)USPolo\n8.)KCR\n9.)Bendiesel\n10.)Bolt\n11.)Champion\n12.)CMYK\n13.)Edge\n14.)Fabindia\n15.)Fox\n16.)Funk\n17.)Gant\n18.)Gas\n19.)Globus\n20.)GolfClub\n21.)Hack\n22.)Gypsum\n23.)Hancock\n24.)Hap\n25.)Hardys\n26.)Harvard\n27.)Icon\n28.)Imagica\n29.)Nike\n30.)JackJones\n31.)PaulStreet\n32.)JDC\n33.)Pepe\n34.)Rebel\n35.)Reebok\n36.)Texas\n37.)Woodside\n38.)Yepme\n");              
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
      
    public   int suits()
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
                    FileWriter f0 = new FileWriter("MSuits.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
                    FileReader fstream1 = new FileReader("MSuits.txt");
                    BufferedReader fbr0 = new BufferedReader(fstream1);
                    System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Size\n4.All of the above\n");
                    int ta=c.nextInt(); 
                    
                    if(ta == 1)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.)UCB\n2.)Duke\n3.)Levis\n4.)Arrow\n5.)Lee\n6.)Fila\n7.)USPolo\n8.)KCR\n9.)Bendiesel\n10.)Bolt\n11.)Champion\n12.)CMYK\n13.)Edge\n14.)Fabindia\n15.)Fox\n16.)Funk\n17.)Gant\n18.)Gas\n19.)Globus\n20.)GolfClub\n21.)Hack\n22.)Gypsum\n23.)Hancock\n24.)Hap\n25.)Hardys\n26.)Harvard\n27.)Icon\n28.)Imagica\n29.)Nike\n30.)JackJones\n31.)PaulStreet\n32.)JDC\n33.)Pepe\n34.)Rebel\n35.)Reebok\n36.)Texas\n37.)Woodside\n38.)Yepme\n");              
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
                        System.out.println("Enter the Brand Name from the one given below........\n1.)UCB\n2.)Duke\n3.)Levis\n4.)Arrow\n5.)Lee\n6.)Fila\n7.)USPolo\n8.)KCR\n9.)Bendiesel\n10.)Bolt\n11.)Champion\n12.)CMYK\n13.)Edge\n14.)Fabindia\n15.)Fox\n16.)Funk\n17.)Gant\n18.)Gas\n19.)Globus\n20.)GolfClub\n21.)Hack\n22.)Gypsum\n23.)Hancock\n24.)Hap\n25.)Hardys\n26.)Harvard\n27.)Icon\n28.)Imagica\n29.)Nike\n30.)JackJones\n31.)PaulStreet\n32.)JDC\n33.)Pepe\n34.)Rebel\n35.)Reebok\n36.)Texas\n37.)Woodside\n38.)Yepme\n");              
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
	
}