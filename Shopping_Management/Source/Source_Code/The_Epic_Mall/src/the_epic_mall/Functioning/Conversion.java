
package the_epic_mall.Functioning;

public class Conversion 
{
 	public double toFloat(String data) //method for converting string into float
	{
		double value = 0;
		double code = 0;
		int count2 = 0;
		for (int i=0 ; i<data.length() ; i++)
		{
			if(data.charAt(i)==' ' || data.charAt(i)=='.')    //assigning values
			{
				value = 0;
			}
			if(data.charAt(i)=='0')
			{
				value = 1;
			}
			if(data.charAt(i)=='1')
			{
				value = 2;
			}
			if(data.charAt(i)=='2')
			{
				value = 3;
			}
			if(data.charAt(i)=='3')
			{
				value = 4;
			}
			if(data.charAt(i)=='4')
			{
				value = 5;
			}
			if(data.charAt(i)=='5')
			{
				value = 6;
			}
			if(data.charAt(i)=='6')
			{
				value = 7;
			}
			if(data.charAt(i)=='7')
			{
				value = 8;
			}
			if(data.charAt(i)=='8')
			{
				value = 9;
			}
			if(data.charAt(i)=='9')
			{
				value = 11;
			}
			if(data.charAt(i)=='a' || data.charAt(i)=='A')
			{
				value = 12;
			}
			if(data.charAt(i)=='b' || data.charAt(i)=='B')
			{
				value = 13;
			}
			if(data.charAt(i)=='c' || data.charAt(i)=='C')
			{
				value = 14;
			}
			if(data.charAt(i)=='d' || data.charAt(i)=='D')
			{
				value = 15;
			}
			if(data.charAt(i)=='e' || data.charAt(i)=='E')
			{
				value = 16;
			}
			if(data.charAt(i)=='f' || data.charAt(i)=='F')
			{
				value = 17;
			}
			if(data.charAt(i)=='g' || data.charAt(i)=='G')
			{
				value = 18;
			}
			if(data.charAt(i)=='h' || data.charAt(i)=='H')
			{
				value = 19;
			}
			if(data.charAt(i)=='i' || data.charAt(i)=='I')
			{
				value = 21;
			}
			if(data.charAt(i)=='j' || data.charAt(i)=='J')
			{
				value = 22;
			}
			if(data.charAt(i)=='k' || data.charAt(i)=='K')
			{
				value = 23;
			}
			if(data.charAt(i)=='l' || data.charAt(i)=='L')
			{
				value = 24;
			}
			if(data.charAt(i)=='m' || data.charAt(i)=='M')
			{
				value = 25;
			}
			if(data.charAt(i)=='n' || data.charAt(i)=='N')
			{
				value = 26;
			}
			if(data.charAt(i)=='o' || data.charAt(i)=='O')
			{
				value = 27;
			}
			if(data.charAt(i)=='p' || data.charAt(i)=='P')
			{
				value = 28;
			}
			if(data.charAt(i)=='q' || data.charAt(i)=='Q')
			{
				value = 29;
			}
			if(data.charAt(i)=='r' || data.charAt(i)=='R')
			{
				value = 31;
			}
			if(data.charAt(i)=='s' || data.charAt(i)=='S')
			{
				value = 32;
			}
			if(data.charAt(i)=='t' || data.charAt(i)=='T')
			{
				value = 33;
			}
			if(data.charAt(i)=='u' || data.charAt(i)=='U')
			{
				value = 34;
			}
			if(data.charAt(i)=='v' || data.charAt(i)=='V')
			{
				value = 35;
			}
			if(data.charAt(i)=='w' || data.charAt(i)=='W')
			{
				value = 36;
			}
			if(data.charAt(i)=='x' || data.charAt(i)=='X')
			{
				value = 37;
			}
			if(data.charAt(i)=='y' || data.charAt(i)=='Y')
			{
				value = 38;
			}
			if(data.charAt(i)=='z' || data.charAt(i)=='Z')
			{
				value = 39;
			}
			if(i==0)
			{
				code = value;
			}
			else
			{
				code = code + (value/Math.round(Math.pow(10,2*i)));
				count2++;
			}
		}
		if(count2 == 1)
		{
			String s = String.format("%.2f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 2)
		{
			String s = String.format("%.4f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 3)
		{
			String s = String.format("%.6f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 4)
		{
			String s = String.format("%.8f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 5)
		{
			String s = String.format("%.10f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 6)
		{
			String s = String.format("%.12f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 7)
		{
			String s = String.format("%.14f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 8)
		{
			String s = String.format("%.16f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 9)
		{
			String s = String.format("%.18f", code);
    	 	code = Double.parseDouble(s);
		}
		if(count2 == 10)
		{
			String s = String.format("%.20f", code);
    	 	code = Double.parseDouble(s);
		}
		return code;
	} 
	public String toString(double data)			//method for converting codeword into string
	{
		int a = (int)data;
		String remaining = Double.toString(data);
		String newR = remaining.substring(3,remaining.length());
		long long1 = Long.parseLong(newR);
		long check;
		String answer = " ";
		String part = " ";
		String fc = " ";
		while(long1!=0)
		{
			check = long1%100;
			long1 = long1/100;
			if(check == 0)
			{
				part = " ";
			}
			else if(check == 1)
			{
				part = "0";
			}
			else if(check == 2)
			{
				part = "1";
			}
			else if(check == 3)
			{
				part = "2";
			}
			else if(check == 5)
			{
				part = "4";
			}
			else if(check == 6)
			{
				part = "5";
			}
			else if(check == 7)
			{
				part = "6";
			}
			else if(check == 8)
			{
				part = "7";
			}
			else if(check == 9)
			{
				part = "8";
			}
			else if(check == 4)
			{
				part = "3";
			}
			else if(check == 11)
			{
				part = "9";
			}
			else if(check == 12)
			{
				part = "A";
			}
			else if(check == 13)
			{
				part = "B";
			}
			else if(check == 14)
			{
				part = "C";
			}
			else if(check == 15)
			{
				part = "D";
			}
			else if(check == 16)
			{
				part = "E";
			}
			else if(check == 17)
			{
				part = "F";
			}
			else if(check == 18)
			{
				part = "G";
			}
			else if(check == 19)
			{
				part = "H";
			}
			else if(check == 21)
			{
				part = "I";
			}
			else if(check == 22)
			{
				part = "J";
			}
			else if(check == 23)
			{
				part = "K";
			}
			else if(check == 24)
			{
				part = "L";
			}
			else if(check == 25)
			{
				part = "M";
			}
			if(check == 26)
			{
				part = "N";
			}
			if(check == 27)
			{
				part = "O";
			}
			if(check == 28)
			{
				part = "P";
			}
			if(check == 29)
			{
				part = "Q";
			}
			if(check == 31)
			{
				part = "R";
			}
			if(check == 32)
			{
				part = "S";
			}
			if(check == 33)
			{
				part = "T";
			}
			if(check == 34)
			{
				part = "U";
			}
			if(check == 35)
			{
				part = "V";
			}
			if(check == 36)
			{
				part = "W";
			}
			if(check == 37)
			{
				part = "X";
			}
			if(check == 38)
			{
				part = "Y";
			}
			if(check == 39)
			{
				part = "Z";
			}
			answer = answer + part;
		}
			if(a == 0)
			{
				fc = " ";
			}
			if(a == 1)
			{
				fc = "0";
			}
			if(a == 2)
			{
				fc = "1";
			}
			if(a == 3)
			{
				fc = "2";
			}
			if(a == 5)
			{
				fc = "4";
			}
			if(a == 6)
			{
				fc = "5";
			}
			if(a == 7)
			{
				fc = "6";
			}
			if( a== 8)
			{
				
				fc = "7";
			}
			if(a == 9)
			{
				fc = "8";
			}
			if(a == 4)
			{
				fc = "3";
			}
			if(a == 11)
			{
				fc = "9";
			}
			if(a == 12)
			{
				fc = "A";
			}
			if(a == 13)
			{
				fc = "B";
			}
			if(a == 14)
			{
				fc = "C";
			}
			if(a == 15)
			{
				fc = "D";
			}
			if(a == 16)
			{
				fc = "E";
			}
			if(a == 17)
			{
				fc = "F";
			}
			if(a == 18)
			{
				fc = "G";
			}
			if(a == 19)
			{
				fc = "H";
			}
			if(a == 21)
			{
				fc = "I";
			}
			if(a == 22)
			{
				fc = "J";
			}
			if(a == 23)
			{
				fc = "K";
			}
			if(a == 24)
			{
				fc = "L";
			}
			if(a == 25)
			{
				fc = "M";
			}
			if(a == 26)
			{
				fc = "N";
			}
			if(a == 27)
			{
				fc = "O";
			}
			if(a == 28)
			{
				fc = "P";
			}
			if(a == 29)
			{
				fc = "Q";
			}
			if(a == 31)
			{
				fc = "R";
			}
			if(a == 32)
			{
				fc = "S";
			}
			if(a == 33)
			{
				fc = "T";
			}
			if(a == 34)
			{
				fc = "U";
			}
			if(a == 35)
			{
				fc = "V";
			}
			if(a == 36)
			{
				fc = "W";
			}
			if(a == 37)
			{
				fc = "X";
			}
			if(a == 38)
			{
				fc = "Y";
			}
			if(a == 39)
			{
				fc = "Z";
			}
		System.out.print(fc);
		for(int i=answer.length()-1; i>=0 ;i--)
		{
			System.out.print(answer.charAt(i));
		}
		System.out.println("");
		return "Thanks";
	}
}
