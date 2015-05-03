package com.aegean.loadnstore;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class shld1
{
	public static void shld()
	{
		c_f1.c_f(16);
		String s  = SIM_VAR.st.nextToken("\n").trim();
		String s1 = s,s2 = s;
		int w1 = (HEX_DEC1.HEX_DEC(s1.substring(0,2)) << 8) + (HEX_DEC1.HEX_DEC(s2.substring(2,4)));
		Memory.memoryT[w1].setText(SIM_VAR.LT.getText());
		w1++;
		Memory.memoryT[w1].setText(SIM_VAR.HT.getText());
	}
}