package com.aegean.functions;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class call1
{
	public static void call()
	{
		c_f1.c_f(18);
		String s  = SIM_VAR.st.nextToken(",").trim();
		if(s.equals("upddt"))
		{
			SIM_VAR.v1.removeElementAt(0);
			SIM_VAR.ADT.setText(Memory.memoryT[999].getText());
			return;
		}
		if(s.equals("updad"))
		{
			SIM_VAR.v1.removeElementAt(0);
			SIM_VAR.AFT1.setText(Memory.memoryT[997].getText());
			SIM_VAR.AFT2.setText(Memory.memoryT[998].getText());
			return;
		}
		int a = Integer.parseInt(SIM_VAR.SPT.getText());
		a+=2;
		SIM_VAR.SPT.setText(String.valueOf(a));
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