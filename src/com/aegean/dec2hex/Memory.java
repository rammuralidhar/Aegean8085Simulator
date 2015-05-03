package com.aegean.dec2hex;
import java.awt.*;
import java.util.*;
public class Memory extends Frame
{
	public static TextField memoryT[] = new TextField[1101];
	public static Label memory[] = new Label[1101];
	
	public Memory()
	{
	}
	
	public Memory(int n)
	{
		resize(800,800);
		setLayout(new GridLayout(21,21));
		for(int i = n;i < (n+200);i++)
		{
			memoryT[i] = new TextField(2);
		}
		
		for(int i = n;i < (n+200);i++)
		{
			memoryT[i].setText("00");
		}
		for(int i = n;i < (n+200);i++)
		{
			memory[i] = new Label(DEC_HEX16.DEC_HEX8(i));
		}
		for(int i = n;i < (n+200);i++)
		{
			add(memory[i]);
			add(memoryT[i]);
		}
	}
}