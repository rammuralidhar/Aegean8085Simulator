package com.aegean.dec2hex;

public class DEC_HEX1
{
	public static String dec = "";
	public static String DEC_HEX(int x)
	{
		int y = x / 16;
		switch(y)
		{
			case 15: dec = "F";break;
			case 14: dec = "E";break;
			case 13: dec = "D";break;
			case 12: dec = "C";break;
			case 11: dec = "B";break;
			case 10: dec = "A";break;
			case 9: dec = "9";break;
			case 8: dec = "8";break;
			case 7: dec = "7";break;
			case 6: dec = "6";break;
			case 5: dec = "5";break;
			case 4: dec = "4";break;
			case 3: dec = "3";break;
			case 2: dec = "2";break;
			case 1: dec = "1";break;
			case 0: dec = "0";break;
		}
		int z = x % 16;
		switch(z)
		{
			case 15: dec+= "F";break;
			case 14: dec+= "E";break;
			case 13: dec+= "D";break;
			case 12: dec+= "C";break;
			case 11: dec+= "B";break;
			case 10: dec+= "A";break;
			case 9: dec+= "9";break;
			case 8: dec+= "8";break;
			case 7: dec+= "7";break;
			case 6: dec+= "6";break;
			case 5: dec+= "5";break;
			case 4: dec+= "4";break;
			case 3: dec+= "3";break;
			case 2: dec+= "2";break;
			case 1: dec+= "1";break;
			case 0: dec+= "0";break;
		}
		return dec;
	}
}