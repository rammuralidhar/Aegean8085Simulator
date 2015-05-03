package com.aegean.functions;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class rz1
{
	public static void rz()
	{
		c_f1.c_f(6);
		int a1 = Integer.parseInt(SIM_VAR.ZT.getText());
		if(a1 == 1)
		{	
			c_f1.c_f(6);
			int a = Integer.parseInt(SIM_VAR.SPT.getText());
			a-=2;
			SIM_VAR.SPT.setText(String.valueOf(a));
			String s1 = (String)SIM_VAR.v.elementAt(0);
			SIM_VAR.v.removeElementAt(0);
			String s = (String)SIM_VAR.v.elementAt(0);
			SIM_VAR.v.removeElementAt(0);

			try
			{
				SIM_VAR.f.close();
				SIM_VAR.f = new DataInputStream(new FileInputStream("XXX.txt"));
			}
			catch(IOException e){}

			String s2 = (String)SIM_VAR.v1.elementAt(0);
			s2.trim();
			SIM_VAR.v1.removeElementAt(0);
			aa: for(;;)
			{
				try
				{	
					SIM_VAR.st = new StringTokenizer(SIM_VAR.f.readLine());
				}
				catch(IOException e){}
				String x = SIM_VAR.st.nextToken("\n");
				String x1 = "";
				if(s2.equals("call")){x1 = "call " + s + s1;}
				if(s2.equals("cc")){x1 = "cc " + s + s1;}
				if(s2.equals("cnc")){x1 = "cnc " + s + s1;}
				if(s2.equals("cm")){x1 = "cm " + s + s1;}
				if(s2.equals("cp")){x1 = "cp " + s + s1;}
				if(s2.equals("cz")){x1 = "cz " + s + s1;}
				if(s2.equals("cnz")){x1 = "cnz " + s + s1;}
				if(s2.equals("cpe")){x1 = "cpe " + s + s1;}
				if(s2.equals("cpo")){x1 = "cpo " + s + s1;}
				if(x.equals(x1))
				{
					break aa;
				}
			}
		}
	}
}