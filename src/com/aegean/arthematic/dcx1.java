package com.aegean.arthematic;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class dcx1
{
	static int c = 0;
	static int d = 0;
	
	static void xx()
	{
		c = c - 1;
		if(c < 0)
		{
			do
			{
				c += 0x100;
			}
			while(c < 0);
			d -= 1;
		}
		if(d < 0)
		{
			do
			{
				d+=0x100;
			}
			while(d < 0);
			SIM_VAR.CYT.setText("1");
		}
	}
	public static void dcx()
	{
		c_f1.c_f(6);
		String s  = SIM_VAR.st.nextToken("\n").trim();
		if(s.equals("d")) 
		{
			c = HEX_DEC1.HEX_DEC(SIM_VAR.ET.getText());
			d = HEX_DEC1.HEX_DEC(SIM_VAR.DT.getText());
			xx();
			SIM_VAR.DT.setText(DEC_HEX1.DEC_HEX(d));
			SIM_VAR.ET.setText(DEC_HEX1.DEC_HEX(c));
		}
		else if(s.equals("h"))
		{
			c = HEX_DEC1.HEX_DEC(SIM_VAR.LT.getText());
			d = HEX_DEC1.HEX_DEC(SIM_VAR.HT.getText());
			xx();
			SIM_VAR.HT.setText(DEC_HEX1.DEC_HEX(d));
			SIM_VAR.LT.setText(DEC_HEX1.DEC_HEX(c));
		}
		else if(s.equals("b"))
		{
			c = HEX_DEC1.HEX_DEC(SIM_VAR.CT.getText());
			d = HEX_DEC1.HEX_DEC(SIM_VAR.BT.getText());
			xx();
			SIM_VAR.BT.setText(DEC_HEX1.DEC_HEX(d));
			SIM_VAR.CT.setText(DEC_HEX1.DEC_HEX(c));
		}
	}
}