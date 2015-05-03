package com.aegean.logical;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class rlc1
{
	public static void rlc()
	{
		c_f1.c_f(4);
		int a = HEX_DEC1.HEX_DEC(SIM_VAR.AT.getText());
		int a1 = Integer.parseInt(SIM_VAR.CYT.getText());
		if((a & 0x80) == 0)
		{
			SIM_VAR.CYT.setText("0");
		}
		else
		{
			SIM_VAR.CYT.setText("1");
		}
		int b = a << 1;
		b = b & 0xff;
		if(a1 == 1)
		{
			b = b | 0x1;
		}
		SIM_VAR.AT.setText(DEC_HEX1.DEC_HEX(b));
	}
}