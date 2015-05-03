package com.aegean.loadnstore;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class lda1
{
	public static void lda()
	{
		c_f1.c_f(13);
		String s  = SIM_VAR.st.nextToken("\n").trim();
		String s1 = s,s2 = s;
		int w1 = (HEX_DEC1.HEX_DEC(s1.substring(0,2)) << 8) + (HEX_DEC1.HEX_DEC(s2.substring(2,4)));
		SIM_VAR.AT.setText(Memory.memoryT[w1].getText());
	}
}