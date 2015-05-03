package com.aegean.arthematic;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class daa1
{
	public static void daa()
	{
		c_f1.c_f(4);
		int a = HEX_DEC1.HEX_DEC(SIM_VAR.AT.getText());
		int b1 = Integer.parseInt(SIM_VAR.CYT.getText());
		int c = Integer.parseInt(SIM_VAR.ACT.getText());
		int d = a & 0xf;
		int e5 = a & 0xf0;
		int e = e5 >> 4;
		int d1 = 0;
		int d2 = 0;
		int e1 = 0;
		int e2 = 0;
	
		if(c == 1 || d > 9)
		{
			d = d + 0x6;
			int s = d;
			d1 = s & 0xf;
			d2 = s & 0xf0;
			if(d2 != 0)
			{
				e += 1;
				SIM_VAR.ACT.setText("1");
			}
			else
			{
				SIM_VAR.ACT.setText("0");
			}
		}
		else
		{
			d1 = d & 0xf;
		}
		if(b1 == 1 || e > 9) 
		{
			e = e + 0x6;
			e1 = e & 0xf;
			e2 = e & 0xf0;
			if(e2 != 0 || b1 == 1)
			{
				SIM_VAR.CYT.setText("1");
			}
			else
			{
				SIM_VAR.CYT.setText("0");
			}
		}
		else
		{
			e1 = e & 0xf;
		}
		
		int b = e1 * 0x10 + d1;
		
		if((b)== 0){SIM_VAR.ZT.setText("1");}
		else{SIM_VAR.ZT.setText("0");}
		
		if((b & 0x80) == 0){SIM_VAR.ST.setText("0");}
		else{SIM_VAR.ST.setText("1");}
		
		int x1 = 0;
		int x = 0x80;
		for(int i=0;i<8;i++)
		{
			int y = b & x;
			if(y != 0)
			{
				x1++;
			}
			x = x >> 1;
		}
		if((x1 % 2)== 0){SIM_VAR.PT.setText("0");}
		else{SIM_VAR.PT.setText("1");}
		
		SIM_VAR.AT.setText(DEC_HEX1.DEC_HEX(b));
	}
}