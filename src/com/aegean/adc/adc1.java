package com.aegean.adc;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class adc1
{
	public static void adc()
	{
		c_f1.c_f(4);
		String s  = SIM_VAR.st.nextToken("\n");
		int a = HEX_DEC1.HEX_DEC(SIM_VAR.AT.getText());
		int b = 0;
		int c = 0;
		int d = Integer.parseInt(SIM_VAR.CYT.getText());
		
		if(s.equals(" a")) 
		{
			b = a + a + d;
		}
		else if(s.equals(" b")) 
		{
			c = HEX_DEC1.HEX_DEC(SIM_VAR.BT.getText());
			b = a + d + c;
		}
		else if(s.equals(" c")) 
		{
			c = HEX_DEC1.HEX_DEC(SIM_VAR.CT.getText());
			b = a + d + c;
		}
		else if(s.equals(" d")) 
		{
			c = HEX_DEC1.HEX_DEC(SIM_VAR.DT.getText());
			b = a + d + c;
		}
		else if(s.equals(" e")) 
		{
			c = HEX_DEC1.HEX_DEC(SIM_VAR.ET.getText());
			b = a + d + c;
		}
		else if(s.equals(" h")) 
		{
			c = HEX_DEC1.HEX_DEC(SIM_VAR.HT.getText());
			b = a + d + c;
		}
		else if(s.equals(" l")) 
		{
			c = HEX_DEC1.HEX_DEC(SIM_VAR.LT.getText());
			b = a + d + c;
		}
		else if(s.equals(" m")) 
		{
			c_f1.c_f(3);
			int w1 = (HEX_DEC1.HEX_DEC(SIM_VAR.HT.getText()) << 8) + (HEX_DEC1.HEX_DEC(SIM_VAR.LT.getText()));
			c = HEX_DEC1.HEX_DEC(Memory.memoryT[w1].getText());
			b = a + c + d;
		}
		else
		{
		}
		
		if(b > 0xff) {SIM_VAR.CYT.setText("1");} 
		else{SIM_VAR.CYT.setText("0");}
		
		int c1 =(a & 0xf)+(c & 0xf)+ d;
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