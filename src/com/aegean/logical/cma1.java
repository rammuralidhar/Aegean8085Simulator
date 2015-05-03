package com.aegean.logical;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class cma1
{
	public static void cma()
	{
		c_f1.c_f(4);
		int a = HEX_DEC1.HEX_DEC(SIM_VAR.AT.getText());
		int b = ~a;
		SIM_VAR.AT.setText(DEC_HEX1.DEC_HEX(b));
	}
}