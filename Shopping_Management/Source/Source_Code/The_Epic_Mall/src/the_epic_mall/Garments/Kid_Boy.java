
package the_epic_mall.Garments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import the_epic_mall.Functioning.*;

public class Kid_Boy
{
    public int polo_tshirts()
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
	            FileWriter f0 = new FileWriter("Bpolo_tshirts.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
		    FileReader fstream1 = new FileReader("Bpolo_tshirts.txt");
                    BufferedReader fbr0 = new BufferedReader(fstream1);
                    System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Size\n4.All of the above\n");
                    int ta=c.nextInt();
                    if(ta==1)
                    {
                        System.out.println("Enter the Brand Name from the one given below........\n1.Gkidz\n2.Allen\n3.Cherokee\n4.United\n5.Batman\n6.Disney\n7.Mickey\n8.Pantaloons\n9.Marvel\n10.Puma\n11.Kidsville\n12.Poppers\n13.League\n14.Montecarlo\n15.Benetton\n16.Max\n17.Sturdy\n18.Benorganik\n19.Adidas\n20.Aedi\n21.Ginijony");                   //"1.Polo&T-shirts\n2Shirts.\n3.Shorts&3/4th\n4.Trousers&Cargos\n5.Ethnic wears\n
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
                    if(ta==2)
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
                                                    if(ta==3)
                                                    {
                                                            System.out.println("Enter the Size choices that are given below........\n1.XS\n2.S\n3.M\n4.L\n5.XL\n");
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
                                                    
                                                    if(ta==4)
                                                    {
                                                          
                                                        System.out.println("Enter the Brand Name from the one given below........\n1.Gkidz\n2.Allen\n3.Cherokee\n4.United\n5.Batman\n6.Disney\n7.Mickey\n8.Pantaloons\n9.Marvel\n10.Puma\n11.Kidsville\n12.Poppers\n13.League\n14.Montecarlo\n15.Benetton\n16.Max\n17.Sturdy\n18.Benorganik\n19.Adidas\n20.Aedi\n21.Ginijony");                   //"1.Polo&T-shirts\n2Shirts.\n3.Shorts&3/4th\n4.Trousers&Cargos\n5.Ethnic wears\n

                                                            String new1 = c.next();
                                                           System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                                                            String new2 = c.next();
                                                              System.out.println("Enter the Size choices that are given below........\n1.XS\n2.S\n3.M\n4.L\n5.XL\n");
                                                            String new3 = c.next();
                                                             while((s = fbr0.readLine()) != null) 
		    {
		    	if(new1.equalsIgnoreCase(s)|| new2.equalsIgnoreCase(s)||new3.equalsIgnoreCase(s))
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
    public int shirts()
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
                    FileWriter f0 = new FileWriter("Bshirts.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
                    FileReader fstream1 = new FileReader("Bshirts.txt");
                    BufferedReader fbr0 = new BufferedReader(fstream1);
                    System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Size\n4.All of the above\n");
                    int ta=c.nextInt();
                    
                    if(ta == 1)
                    {
                        System.out.println("Enter The Brand Name From The One Given Below.....\n1.)Gkidz\n2.)Allen\n3.)Cherokee\n4.)Batman\n5.)Disney\n6.)Mickey\n7.)Pantaloons\n8.)Marvel\n9.)Puma\n10.)Kidsville\n11.)Poppers\n12.)League\n13.)Montecarlo\n14.)Benetton\n15.)Max\n16.)Sturdy\n17.)Benorganik\n18.))Adidas\n19.)Aedi\n20.)Ginijony\n");
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
                         System.out.println("Enter the Size choices that are given below........\n1.XS\n2.S\n3.M\n4.L\n5.XL\n");
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
                        System.out.println("Enter The Brand Name From The One Given Below.....\n1.)Gkidz\n2.)Allen\n3.)Cherokee\n4.)Batman\n5.)Disney\n6.)Mickey\n7.)Pantaloons\n8.)Marvel\n9.)Puma\n10.)Kidsville\n11.)Poppers\n12.)League\n13.)Montecarlo\n14.)Benetton\n15.)Max\n16.)Sturdy\n17.)Benorganik\n18.))Adidas\n19.)Aedi\n20.)Ginijony\n");
                        String new1 = c.next();
                        System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                        String new2 = c.next();
                        System.out.println("Enter the Size choices that are given below........\n1.XS\n2.S\n3.M\n4.L\n5.XL\n");
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
                    FileWriter f0 = new FileWriter("Bshorts.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
                    FileReader fstream1 = new FileReader("Bshorts.txt");
                    BufferedReader fbr0 = new BufferedReader(fstream1);
                    System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Price\n4.All of the above\n");
                    int ta=c.nextInt();
                    
                    if(ta == 1)
                    {
                        System.out.println("Enter The Brand Name From The One Given Below.....\n1.)Nike\n2.)Bellamoda\n3.)Allen\n4.)Biokid\n5.)Doller\n6.)Batman\n7.)British\n8.)Pantaloons\n9.)Cub\n10.)Dongli\n11.)Sela\n12.)Pepito\n13.)Nike\n14.)Bellamoda\n");
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
                         System.out.println("Enter the Price choices that are given below........\n1.670\n2.2000\n3.800\n4.900\n5.1200\n6.1320\n7.1350\n8.500\n9.850\n10.1950\n");
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
                        System.out.println("Enter The Brand Name From The One Given Below.....\n1.)Nike\n2.)Bellamoda\n3.)Allen\n4.)Biokid\n5.)Doller\n6.)Batman\n7.)British\n8.)Pantaloons\n9.)Cub\n10.)Dongli\n11.)Sela\n12.)Pepito\n13.)Nike\n14.)Bellamoda\n");
                        String new1 = c.next();
                        System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                        String new2 = c.next();
                        System.out.println("Enter the Price choices that are given below........\n1.670\n2.2000\n3.800\n4.900\n5.1200\n6.1320\n7.1350\n8.500\n9.850\n10.1950\n");
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
      
    public   int trousers_cargos()
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
                    FileWriter f0 = new FileWriter("Btrouser_cargos.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
                    FileReader fstream1 = new FileReader("Btrouser_cargos.txt");
                    BufferedReader fbr0 = new BufferedReader(fstream1);
                    System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Price\n4.All of the above\n");
                    int ta=c.nextInt();
                    
                    if(ta == 1)
                    {
                        System.out.println("Enter The Brand Name From The One Given Below.....\n1.)Aomi\n2.)Allen\n3.)Globe\n4.)Super\n5.)Superman\n6.)Sodacan\n7.)Yellowkite\n8.)Uber\n9.)Puma\n10.)Coffeebean\n11.)O2\n12.)FSmini\n13.)Oxolloxo\n14.)Cherokee\n15.)United\n");
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
                         System.out.println("Enter the Price choices that are given below........\n1.670\n2.2000\n3.800\n4.900\n5.1200\n6.1320\n7.1350\n8.500\n9.850\n10.1950\n");
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
                        System.out.println("Enter The Brand Name From The One Given Below.....\n1.)Aomi\n2.)Allen\n3.)Globe\n4.)Super\n5.)Superman\n6.)Sodacan\n7.)Yellowkite\n8.)Uber\n9.)Puma\n10.)Coffeebean\n11.)O2\n12.)FSmini\n13.)Oxolloxo\n14.)Cherokee\n15.)United\n");
                        String new1 = c.next();
                        System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                        String new2 = c.next();
                        System.out.println("Enter the Price choices that are given below........\n1.670\n2.2000\n3.800\n4.900\n5.1200\n6.1320\n7.1350\n8.500\n9.850\n10.1950\n");
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
       
     public   int ethnic()
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
                    FileWriter f0 = new FileWriter("Bethnic.txt", true);
		    BufferedWriter fbw0 = new BufferedWriter(f0);
                    FileReader fstream1 = new FileReader("Bethnic.txt");
                    BufferedReader fbr0 = new BufferedReader(fstream1);
                    System.out.println("\tWanna search by....???\n1.Brand\n2.Colour\n3.Price\n4.All of the above\n");
                    int ta=c.nextInt();
                    
                    if(ta == 1)
                    {
                        System.out.println("Enter The Brand Name From The One Given Below.....\n1.)Akkriti\n2.)Deepak\n3.)Dhrohar\n4.)Divinee\n5.)Dreamszone\n6.)Jelly\n7.)Mint\n8.)Peaches\n9.)Twisha\n10.)Veda\n11.)Yelcon\n12.)Gkidz\n");
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
                         System.out.println("Enter the Price choices that are given below........\n1.670\n2.2000\n3.800\n4.900\n5.1200\n6.1320\n7.1350\n8.500\n9.850\n10.1950\n");
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
                        System.out.println("Enter The Brand Name From The One Given Below.....\n1.)Akkriti\n2.)Deepak\n3.)Dhrohar\n4.)Divinee\n5.)Dreamszone\n6.)Jelly\n7.)Mint\n8.)Peaches\n9.)Twisha\n10.)Veda\n11.)Yelcon\n12.)Gkidz\n");
                        String new1 = c.next();
                        System.out.println("Enter the Colour choice that are given below........\n1.Red\n2.Blue\n3.Yellow\n4.White\n5.Multi\n6.Grey\n7.Black\n8.Green\n");
                        String new2 = c.next();
                        System.out.println("Enter the Price choices that are given below........\n1.670\n2.2000\n3.800\n4.900\n5.1200\n6.1320\n7.1350\n8.500\n9.850\n10.1950\n");
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