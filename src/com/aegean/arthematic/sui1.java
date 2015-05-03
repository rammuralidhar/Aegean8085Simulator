package com.aegean.arthematic;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class sui1
{
	public static void sui()
	{
		c_f1.c_f(7);
		String s  = SIM_VAR.st.nextToken("\n").trim();
		int a = HEX_DEC1.HEX_DEC(SIM_VAR.AT.getText());
		int b = 0;
		int c = HEX_DEC1.HEX_DEC(s);
		b = a - c;
		
		if(b < 0) {SIM_VAR.CYT.setText("1");} 
		else{SIM_VAR.CYT.setText("0");}
		
		int c1 =(a & 0xf) - (c & 0xf);
		if(c1 < 0) {SIM_VAR.ACT.setText("1");}
		else{ SIM_VAR.ACT.setText("0");}
		
		if(b == 0){SIM_VAR.ZT.setText("1");}
		else{SIM_VAR.ZT.setText("0");}
		
		if(b < 0)
		{
			b += 256;
		}
		
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