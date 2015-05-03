package com.aegean.dec2hex;

public class HEX_DEC1
{	
	public static int x2 = 0;
	public static int HEX_DEC(String hex)
	{	
		String s = hex.trim().toUpperCase();
		int x = 0;
		
		if(s.length() == 2)
		{
			if(s.charAt(1) == 'F'){x=15;}
			if(s.charAt(1) == 'E'){x=14;}
			if(s.charAt(1) == 'D'){x=13;}
			if(s.charAt(1) == 'C'){x=12;}
			if(s.charAt(1) == 'B'){x=11;}
			if(s.charAt(1) == 'A'){x=10;}
			if(s.charAt(1) == '0'){x=0;}
			if(s.charAt(1) == '1'){x=1;}
			if(s.charAt(1) == '2'){x=2;}
			if(s.charAt(1) == '3'){x=3;}
			if(s.charAt(1) == '4'){x=4;}
			if(s.charAt(1) == '5'){x=5;}
			if(s.charAt(1) == '6'){x=6;}
			if(s.charAt(1) == '7'){x=7;}
			if(s.charAt(1) == '8'){x=8;}
			if(s.charAt(1) == '9'){x=9;}
		}
		int x1 = 0;
		if(s.charAt(0) == 'F'){x1=15;}
		if(s.charAt(0) == 'E'){x1=14;}
		if(s.charAt(0) == 'D'){x1=13;}
		if(s.charAt(0) == 'C'){x1=12;}
		if(s.charAt(0) == 'B'){x1=11;}
		if(s.charAt(0) == 'A'){x1=10;}
		if(s.charAt(0) == '0'){x1=0;}
		if(s.charAt(0) == '1'){x1=1;}
		if(s.charAt(0) == '2'){x1=2;}
		if(s.charAt(0) == '3'){x1=3;}
		if(s.charAt(0) == '4'){x1=4;}
		if(s.charAt(0) == '5'){x1=5;}
		if(s.charAt(0) == '6'){x1=6;}
		if(s.charAt(0) == '7'){x1=7;}
		if(s.charAt(0) == '8'){x1=8;}
		if(s.charAt(0) == '9'){x1=9;}
		if(s.length() == 2)
		{
			x2 = x1*16+x;
		}
		else
		{
			x2 = x*16+x1;
		}
		return x2;
	}
}