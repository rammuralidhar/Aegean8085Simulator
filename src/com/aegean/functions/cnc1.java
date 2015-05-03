package com.aegean.functions;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class cnc1
{
	public static void cnc()
	{
		int a1 = Integer.parseInt(SIM_VAR.CYT.getText());
		c_f1.c_f(9);
		if(a1 == 0)
		{
			c_f1.c_f(9);
			int a = Integer.parseInt(SIM_VAR.SPT.getText());
			a+=2;
			SIM_VAR.SPT.setText(String.valueOf(a));
			String s  = SIM_VAR.st.nextToken(",").trim();
			SIM_VAR.v.insertElementAt(s,0);
			String s1 = SIM_VAR.st.nextToken("\n").trim();
			SIM_VAR.v.insertElementAt(s1,0);

			try
			{
				SIM_VAR.f.close();
				SIM_VAR.f = new DataInputStream(new FileInputStream("XXX.txt"));
			}
			catch(IOException e){}

			aa: for(;;)
			{
				try
				{	
					SIM_VAR.st = new StringTokenizer(SIM_VAR.f.readLine());
				}
				catch(IOException e){}
				String x = SIM_VAR.st.nextToken(":");

				if(x.equals(s)) 
				{
					break aa;
				}
			}
		}
	}
}