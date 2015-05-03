package com.aegean.loadnstore;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class ldax1
{
	public static void ldax()
	{
		c_f1.c_f(7);
		String s  = SIM_VAR.st.nextToken("\n").trim();
		int w1 =0;
		if(s.equals("b"))
		{
			w1 = (HEX_DEC1.HEX_DEC(SIM_VAR.BT.getText()) << 8)
			+ (HEX_DEC1.HEX_DEC(SIM_VAR.CT.getText()));
		}
		if(s.equals("d"))
		{
			w1 = (HEX_DEC1.HEX_DEC(SIM_VAR.DT.getText()) << 8)
			+ (HEX_DEC1.HEX_DEC(SIM_VAR.ET.getText()));
		}
		SIM_VAR.AT.setText(Memory.memoryT[w1].getText());
	}
}