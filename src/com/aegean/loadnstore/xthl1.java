package com.aegean.loadnstore;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class xthl1
{
	public static void xthl()
	{
		c_f1.c_f(16);
		String s0 = SIM_VAR.HT.getText();
		String s1 = SIM_VAR.LT.getText();
		String s2 = (String)SIM_VAR.v.elementAt(0);
		SIM_VAR.v.removeElementAt(0);
		String s3 = (String)SIM_VAR.v.elementAt(0);
		SIM_VAR.v.removeElementAt(0);
		SIM_VAR.v.insertElementAt(s1,0);
		SIM_VAR.v.insertElementAt(s0,0);
		SIM_VAR.HT.setText(s2);
		SIM_VAR.LT.setText(s3);
	}
}	