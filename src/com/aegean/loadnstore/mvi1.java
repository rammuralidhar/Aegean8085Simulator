package com.aegean.loadnstore;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class mvi1
{
	public static void mvi()
	{
		String s  = SIM_VAR.st.nextToken(",").trim();
		String s1 = SIM_VAR.st.nextToken().trim().toUpperCase();
		c_f1.c_f(7);
		if(s.equals("a")) {SIM_VAR.AT.setText(s1);}
		else if(s.equals("b")) {SIM_VAR.BT.setText(s1);}
		else if(s.equals("c")) {SIM_VAR.CT.setText(s1);}
		else if(s.equals("d")) {SIM_VAR.DT.setText(s1);}
		else if(s.equals("e")) {SIM_VAR.ET.setText(s1);}
		else if(s.equals("h")) {SIM_VAR.HT.setText(s1);}
		else if(s.equals("l")) {SIM_VAR.LT.setText(s1);}
		else if(s.equals("m")) 
		{
			c_f1.c_f(3);
			int w1 = (HEX_DEC1.HEX_DEC(SIM_VAR.HT.getText()) << 8) + (HEX_DEC1.HEX_DEC(SIM_VAR.LT.getText()));
			Memory.memoryT[w1].setText(s1);
		}
	}
}
		