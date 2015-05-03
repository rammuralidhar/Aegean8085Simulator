package com.aegean.aci;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class aci1
{
	public static void aci()
	{
		c_f1.c_f(7);
		String s  = SIM_VAR.st.nextToken("\n").trim();
		int a = HEX_DEC1.HEX_DEC(SIM_VAR.AT.getText());
		int c = HEX_DEC1.HEX_DEC(s);
		int d = Integer.parseInt(SIM_VAR.CYT.getText());
		int b = a + c + d;
				
				
		if(b > 0xff) {SIM_VAR.CYT.setText("1");} 
		else{SIM_VAR.CYT.setText("0");}
		
		int c1 = (a & 0xf) + (c & 0xf) + d;
		if(c1 > 0xf) {SIM_VAR.ACT.setText("1");}
		else{ SIM_VAR.ACT.setText("0");}
		
		if(b > 0xff)
		{
			do
			{
				b-=0x100;
			}
			while(b > 0xff);
		}
		
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