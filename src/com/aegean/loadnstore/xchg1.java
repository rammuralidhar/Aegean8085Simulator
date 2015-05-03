package com.aegean.loadnstore;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class xchg1
{
	public static void xchg()
	{
		c_f1.c_f(4);
		String s0 = SIM_VAR.HT.getText();
		String s1 = SIM_VAR.LT.getText();
		String s2 = SIM_VAR.DT.getText();
		String s3 = SIM_VAR.ET.getText();
		SIM_VAR.HT.setText(s2);
		SIM_VAR.LT.setText(s3);
		SIM_VAR.DT.setText(s0);
		SIM_VAR.ET.setText(s1);
	}
}	