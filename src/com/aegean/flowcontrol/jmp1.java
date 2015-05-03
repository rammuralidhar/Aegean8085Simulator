package com.aegean.flowcontrol;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class jmp1
{
	public static void jmp()
	{
		String s  = SIM_VAR.st.nextToken("\n").trim();
		c_f1.c_f(10);
		
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