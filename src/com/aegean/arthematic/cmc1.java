package com.aegean.arthematic;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class cmc1
{
	public static void cmc()
	{	
		c_f1.c_f(4);
		if(Integer.parseInt(SIM_VAR.CYT.getText()) == 0)
		{
			SIM_VAR.CYT.setText("1");
		}
		else
		{
			SIM_VAR.CYT.setText("0");
		}
	}
}