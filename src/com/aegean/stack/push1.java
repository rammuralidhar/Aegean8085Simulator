package com.aegean.stack;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class push1
{
	public static void push()
	{
		c_f1.c_f(12);
		int a = Integer.parseInt(SIM_VAR.SPT.getText());
		a+=2;
		SIM_VAR.SPT.setText(String.valueOf(a));
		
		String s  = SIM_VAR.st.nextToken("\n");
		String s1,s2;
		int x = 0;
		if(s.equals(" b")) 
		{
			s1 = new String(SIM_VAR.BT.getText());
			s2 = new String(SIM_VAR.CT.getText());
			SIM_VAR.v.insertElementAt(s2,0);
			SIM_VAR.v.insertElementAt(s1,0);
		}
		else if(s.equals(" d")) 
		{
			s1 = new String(SIM_VAR.DT.getText());
			s2 = new String(SIM_VAR.ET.getText());
			SIM_VAR.v.insertElementAt(s2,0);
			SIM_VAR.v.insertElementAt(s1,0);
		}
		else if(s.equals(" h"))
		{
			s1 = new String(SIM_VAR.HT.getText());
			s2 = new String(SIM_VAR.LT.getText());
			SIM_VAR.v.insertElementAt(s2,0);
			SIM_VAR.v.insertElementAt(s1,0);
		}
		else if(s.equals(" psw"))
		{
			if(SIM_VAR.ST.getText().equals("1"))
			{
				x = x | 0x80;
			}
			if(SIM_VAR.ZT.getText().equals("1"))
			{
				x = x | 0x40;
			}
			if(SIM_VAR.ACT.getText().equals("1"))
			{
				x = x | 0x10;
			}
			if(SIM_VAR.PT.getText().equals("1"))
			{
				x = x | 0x04;
			}
			if(SIM_VAR.CYT.getText().equals("1"))
			{
				x = x | 0x01;
			}
			s2 = new String(SIM_VAR.AT.getText());
			SIM_VAR.v.insertElementAt(DEC_HEX1.DEC_HEX(x),0);
			SIM_VAR.v.insertElementAt(s2,0);
		}
		else{}
	}
}