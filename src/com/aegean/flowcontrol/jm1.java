package com.aegean.flowcontrol;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class jm1
{
	public static void jm()
	{
		String s  = SIM_VAR.st.nextToken("\n").trim();
		int a = Integer.parseInt(SIM_VAR.ST.getText());
		c_f1.c_f(7);
		if(a == 1)
		{
			c_f1.c_f(3);
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