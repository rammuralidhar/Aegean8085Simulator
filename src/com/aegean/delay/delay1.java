package com.aegean.delay;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class delay1
{
	public static void delay()
	{
		String s  = SIM_VAR.st.nextToken("\n").trim();
		int a = Integer.parseInt(s);
		
		try
		{
			Thread.sleep(a);
		}
		catch(InterruptedException e){}
	}
}