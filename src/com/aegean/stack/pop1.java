package com.aegean.stack;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class pop1
{	
	public static void pop()
	{	
		c_f1.c_f(10);
		int a = Integer.parseInt(SIM_VAR.SPT.getText());
		a-=2;
		SIM_VAR.SPT.setText(String.valueOf(a));
		String s  = SIM_VAR.st.nextToken("\n");
		String s1 = new String();
		String s2 = new String();
		
		if(s.equals(" b"))
		{
			s1 = (String)SIM_VAR.v.elementAt(0);
			SIM_VAR.v.removeElementAt(0);
			SIM_VAR.BT.setText(s1);
			s2 = (String)SIM_VAR.v.elementAt(0);
			SIM_VAR.v.removeElementAt(0);
			SIM_VAR.CT.setText(s2);
		}
		else if(s.equals(" d"))
		{
			s1 = (String)SIM_VAR.v.elementAt(0);
			SIM_VAR.v.removeElementAt(0);
			SIM_VAR.DT.setText(s1);
			s2 = (String)SIM_VAR.v.elementAt(0);
			SIM_VAR.v.removeElementAt(0);
			SIM_VAR.ET.setText(s2);
		}
		else if(s.equals(" h"))
		{
			s1 = (String)SIM_VAR.v.elementAt(0);
			SIM_VAR.v.removeElementAt(0);
			SIM_VAR.HT.setText(s1);
			s2 = (String)SIM_VAR.v.elementAt(0);
			SIM_VAR.v.removeElementAt(0);
			SIM_VAR.LT.setText(s2);
		}
		else if(s.equals(" psw"))
		{
			s1 = (String)SIM_VAR.v.elementAt(0);
			SIM_VAR.v.removeElementAt(0);
			SIM_VAR.AT.setText(s1);
			s2 = (String)SIM_VAR.v.elementAt(0);
			SIM_VAR.v.removeElementAt(0);
			int x = HEX_DEC1.HEX_DEC(s2);
			if((x & 0x80) != 0)
			{
				SIM_VAR.ST.setText("1");
			}
			if((x & 0x40) != 0)
			{
				SIM_VAR.ZT.setText("1");
			}
			if((x & 0x10) != 0)
			{
				SIM_VAR.ACT.setText("1");
			}
			if((x & 0x04) != 0)
			{
				SIM_VAR.PT.setText("1");
			}
			if((x & 0x01) != 0)
			{
				SIM_VAR.CYT.setText("1");
			}
		}
		else{}
	}
}