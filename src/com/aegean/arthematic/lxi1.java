package com.aegean.arthematic;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class lxi1
{
	public static void lxi()
	{	
		c_f1.c_f(10);
		String s  = SIM_VAR.st.nextToken(",");
		String s1 = SIM_VAR.st.nextToken().trim();
		if(s.equals(" b")) 
		{
			SIM_VAR.BT.setText(s1.substring(0,2));
			SIM_VAR.CT.setText(s1.substring(2));
		}
		if(s.equals(" d")) 
		{
			SIM_VAR.DT.setText(s1.substring(0,2));
			SIM_VAR.ET.setText(s1.substring(2));
		}
		if(s.equals(" h")) 
		{
			SIM_VAR.HT.setText(s1.substring(0,2));
			SIM_VAR.LT.setText(s1.substring(2));
		}
	}
}