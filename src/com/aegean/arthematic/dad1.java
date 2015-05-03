package com.aegean.arthematic;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class dad1
{
	public static void dad()
	{
		c_f1.c_f(10);
		String s  = SIM_VAR.st.nextToken("\n");
		int c = 0;
		int d = 0;
		int a = HEX_DEC1.HEX_DEC(SIM_VAR.LT.getText());
		int b = HEX_DEC1.HEX_DEC(SIM_VAR.HT.getText());
		if(s.equals(" d")) 
		{
			c = a + HEX_DEC1.HEX_DEC(SIM_VAR.ET.getText());
			d = b + HEX_DEC1.HEX_DEC(SIM_VAR.DT.getText());
		}
		else if(s.equals(" h"))
		{
			c = a + a;
			d = b + b;
		}
		else if(s.equals(" b"))
		{
			c = a + HEX_DEC1.HEX_DEC(SIM_VAR.CT.getText());
			d = b + HEX_DEC1.HEX_DEC(SIM_VAR.BT.getText());
		}
		
		if(c > 0xff)
		{
			do
			{
				c-=0x100;
			}
			while(c > 0xff);
			d += 1;
		}
		if(d > 0xff)
		{
			do
			{
				d-=0x100;
			}
			while(d > 0xff);
			SIM_VAR.CYT.setText("1");			
		}
		SIM_VAR.HT.setText(DEC_HEX1.DEC_HEX(d));
		SIM_VAR.LT.setText(DEC_HEX1.DEC_HEX(c));
	}
}