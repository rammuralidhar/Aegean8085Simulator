package com.aegean.dec2hex;

public class DEC_HEX16
{
	public static String s = "";
	static String dec = "";
	
	static String XX(int y)
	{
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
		return dec;
	}
	public static String DEC_HEX8(int x)
	{
		int temp = x & 0xf000;
		temp = temp >> 12;
		s = XX(temp);
		temp = x & 0x0f00;
		temp = temp >> 8;
		s += XX(temp);
		temp = x & 0x00f0;
		temp = temp >> 4;
		s += XX(temp);
		temp = x & 0x000f;
		s += XX(temp);
		return s;
	}
}