package com.aegean.loadnstore;
import java.util.*;
import java.io.*;

import com.aegean.dec2hex.*;

public class mov1
{
	public static void mov()
	{
		String s  = SIM_VAR.st.nextToken(",").trim();
		String s1 = SIM_VAR.st.nextToken().trim();
		c_f1.c_f(4);
		if(s.equals("a"))
		{
			if(s1.equals("b")) {SIM_VAR.AT.setText(SIM_VAR.BT.getText());}
			else if(s1.equals("c")) {SIM_VAR.AT.setText(SIM_VAR.CT.getText());}
			else if(s1.equals("a")) {SIM_VAR.AT.setText(SIM_VAR.AT.getText());}
			else if(s1.equals("d")) {SIM_VAR.AT.setText(SIM_VAR.DT.getText());}
			else if(s1.equals("e")) {SIM_VAR.AT.setText(SIM_VAR.ET.getText());}
			else if(s1.equals("h")) {SIM_VAR.AT.setText(SIM_VAR.HT.getText());}
			else if(s1.equals("l")) {SIM_VAR.AT.setText(SIM_VAR.LT.getText());}
			else if(s1.equals("m")) 
			{
				c_f1.c_f(3);
				int w1 = (HEX_DEC1.HEX_DEC(SIM_VAR.HT.getText()) << 8) + (HEX_DEC1.HEX_DEC(SIM_VAR.LT.getText()));
				SIM_VAR.AT.setText(Memory.memoryT[w1].getText());
			}
			else{ System.out.println("ERROR");}
		}
		else if(s.equals("b"))
		{	
			if(s1.equals("b")) {SIM_VAR.BT.setText(SIM_VAR.BT.getText());}
			else if(s1.equals("c")) {SIM_VAR.BT.setText(SIM_VAR.CT.getText());}
			else if(s1.equals("a")) {SIM_VAR.BT.setText(SIM_VAR.AT.getText());}
			else if(s1.equals("d")) {SIM_VAR.BT.setText(SIM_VAR.DT.getText());}
			else if(s1.equals("e")) {SIM_VAR.BT.setText(SIM_VAR.ET.getText());}
			else if(s1.equals("h")) {SIM_VAR.BT.setText(SIM_VAR.HT.getText());}
			else if(s1.equals("l")) {SIM_VAR.BT.setText(SIM_VAR.LT.getText());}
			else if(s1.equals("m")) 
			{
				c_f1.c_f(3);
				int w1 = (HEX_DEC1.HEX_DEC(SIM_VAR.HT.getText()) << 8) + (HEX_DEC1.HEX_DEC(SIM_VAR.LT.getText()));
				SIM_VAR.BT.setText(Memory.memoryT[w1].getText());
			}
			else{ System.out.println("ERROR");}
		}
		else if(s.equals("c"))
		{	
			if(s1.equals("b")) {SIM_VAR.CT.setText(SIM_VAR.BT.getText());}
			else if(s1.equals("c")) {SIM_VAR.CT.setText(SIM_VAR.CT.getText());}
			else if(s1.equals("a")) {SIM_VAR.CT.setText(SIM_VAR.AT.getText());}
			else if(s1.equals("d")) {SIM_VAR.CT.setText(SIM_VAR.DT.getText());}
			else if(s1.equals("e")) {SIM_VAR.CT.setText(SIM_VAR.ET.getText());}
			else if(s1.equals("h")) {SIM_VAR.CT.setText(SIM_VAR.HT.getText());}
			else if(s1.equals("l")) {SIM_VAR.CT.setText(SIM_VAR.LT.getText());}
			else if(s1.equals("m")) 
			{
				c_f1.c_f(3);
				int w1 = (HEX_DEC1.HEX_DEC(SIM_VAR.HT.getText()) << 8) + (HEX_DEC1.HEX_DEC(SIM_VAR.LT.getText()));
				SIM_VAR.CT.setText(Memory.memoryT[w1].getText());
			}
			else{ System.out.println("ERROR");}
		}
		else if(s.equals("d"))
		{
			if(s1.equals("b")) {SIM_VAR.DT.setText(SIM_VAR.BT.getText());}
			else if(s1.equals("c")) {SIM_VAR.DT.setText(SIM_VAR.CT.getText());}
			else if(s1.equals("a")) {SIM_VAR.DT.setText(SIM_VAR.AT.getText());}
			else if(s1.equals("d")) {SIM_VAR.DT.setText(SIM_VAR.DT.getText());}
			else if(s1.equals("e")) {SIM_VAR.DT.setText(SIM_VAR.ET.getText());}
			else if(s1.equals("h")) {SIM_VAR.DT.setText(SIM_VAR.HT.getText());}
			else if(s1.equals("l")) {SIM_VAR.DT.setText(SIM_VAR.LT.getText());}
			else if(s1.equals("m")) 
			{
				c_f1.c_f(3);
				int w1 = (HEX_DEC1.HEX_DEC(SIM_VAR.HT.getText()) << 8) + (HEX_DEC1.HEX_DEC(SIM_VAR.LT.getText()));
				SIM_VAR.DT.setText(Memory.memoryT[w1].getText());
			}
			else{ System.out.println("ERROR");}
		}
		else if(s.equals("e"))
		{	
			if(s1.equals("b")) {SIM_VAR.ET.setText(SIM_VAR.BT.getText());}
			else if(s1.equals("c")) {SIM_VAR.ET.setText(SIM_VAR.CT.getText());}
			else if(s1.equals("a")) {SIM_VAR.ET.setText(SIM_VAR.AT.getText());}
			else if(s1.equals("d")) {SIM_VAR.ET.setText(SIM_VAR.DT.getText());}
			else if(s1.equals("e")) {SIM_VAR.ET.setText(SIM_VAR.ET.getText());}
			else if(s1.equals("h")) {SIM_VAR.ET.setText(SIM_VAR.HT.getText());}
			else if(s1.equals("l")) {SIM_VAR.ET.setText(SIM_VAR.LT.getText());}
			else if(s1.equals("m")) 
			{
				c_f1.c_f(3);
				int w1 = (HEX_DEC1.HEX_DEC(SIM_VAR.HT.getText()) << 8) + (HEX_DEC1.HEX_DEC(SIM_VAR.LT.getText()));
				SIM_VAR.ET.setText(Memory.memoryT[w1].getText());
			}
			else{ System.out.println("ERROR");}
		}
		else if(s.equals("h"))
		{	
			if(s1.equals("b")) {SIM_VAR.HT.setText(SIM_VAR.BT.getText());}
			else if(s1.equals("c")) {SIM_VAR.HT.setText(SIM_VAR.CT.getText());}
			else if(s1.equals("a")) {SIM_VAR.HT.setText(SIM_VAR.AT.getText());}
			else if(s1.equals("d")) {SIM_VAR.HT.setText(SIM_VAR.DT.getText());}
			else if(s1.equals("e")) {SIM_VAR.HT.setText(SIM_VAR.ET.getText());}
			else if(s1.equals("h")) {SIM_VAR.HT.setText(SIM_VAR.HT.getText());}
			else if(s1.equals("l")) {SIM_VAR.HT.setText(SIM_VAR.LT.getText());}
			else if(s1.equals("m")) 
			{
				c_f1.c_f(3);
				int w1 = (HEX_DEC1.HEX_DEC(SIM_VAR.HT.getText()) << 8) + (HEX_DEC1.HEX_DEC(SIM_VAR.LT.getText()));
				SIM_VAR.HT.setText(Memory.memoryT[w1].getText());
			}
			else{ System.out.println("ERROR");}
		}
		else if(s.equals("l"))
		{	
			if(s1.equals("b")) {SIM_VAR.LT.setText(SIM_VAR.BT.getText());}
			else if(s1.equals("c")) {SIM_VAR.LT.setText(SIM_VAR.CT.getText());}
			else if(s1.equals("a")) {SIM_VAR.LT.setText(SIM_VAR.AT.getText());}
			else if(s1.equals("d")) {SIM_VAR.LT.setText(SIM_VAR.DT.getText());}
			else if(s1.equals("e")) {SIM_VAR.LT.setText(SIM_VAR.ET.getText());}
			else if(s1.equals("h")) {SIM_VAR.LT.setText(SIM_VAR.HT.getText());}
			else if(s1.equals("l")) {SIM_VAR.LT.setText(SIM_VAR.LT.getText());}
			else if(s1.equals("m")) 
			{
				c_f1.c_f(3);
				int w1 = (HEX_DEC1.HEX_DEC(SIM_VAR.HT.getText()) << 8) + (HEX_DEC1.HEX_DEC(SIM_VAR.LT.getText()));
				SIM_VAR.LT.setText(Memory.memoryT[w1].getText());
			}
			else{ System.out.println("ERROR");}
		}
		else if(s.equals("m"))
		{	
			c_f1.c_f(3);
			int w1 = (HEX_DEC1.HEX_DEC(SIM_VAR.HT.getText()) << 8) + (HEX_DEC1.HEX_DEC(SIM_VAR.LT.getText()));
			if(s1.equals("b")) {Memory.memoryT[w1].setText(SIM_VAR.BT.getText());}
			else if(s1.equals("c")) {Memory.memoryT[w1].setText(SIM_VAR.CT.getText());}
			else if(s1.equals("a")) {Memory.memoryT[w1].setText(SIM_VAR.AT.getText());}
			else if(s1.equals("d")) {Memory.memoryT[w1].setText(SIM_VAR.DT.getText());}
			else if(s1.equals("e")) {Memory.memoryT[w1].setText(SIM_VAR.ET.getText());}
			else if(s1.equals("h")) {Memory.memoryT[w1].setText(SIM_VAR.HT.getText());}
			else if(s1.equals("l")) {Memory.memoryT[w1].setText(SIM_VAR.LT.getText());}
			else{ System.out.println("ERROR");}
		}
		else{}
	}
}
		