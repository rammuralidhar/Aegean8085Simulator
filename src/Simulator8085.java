import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;

import com.aegean.aci.aci1;
import com.aegean.adc.adc1;
import com.aegean.adi.adi1;
import com.aegean.arthematic.add1;
import com.aegean.arthematic.cmc1;
import com.aegean.arthematic.cmp1;
import com.aegean.arthematic.cpi1;
import com.aegean.arthematic.daa1;
import com.aegean.arthematic.dad1;
import com.aegean.arthematic.dcr1;
import com.aegean.arthematic.dcx1;
import com.aegean.arthematic.inc1;
import com.aegean.arthematic.inx1;
import com.aegean.arthematic.lxi1;
import com.aegean.arthematic.sbb1;
import com.aegean.arthematic.sbi1;
import com.aegean.arthematic.stc1;
import com.aegean.arthematic.sub1;
import com.aegean.arthematic.sui1;
import com.aegean.dec2hex.Memory;
import com.aegean.dec2hex.SIM_VAR;
import com.aegean.dec2hex.c_f1;
import com.aegean.delay.delay1;
import com.aegean.flowcontrol.jc1;
import com.aegean.flowcontrol.jm1;
import com.aegean.flowcontrol.jmp1;
import com.aegean.flowcontrol.jnc1;
import com.aegean.flowcontrol.jnz1;
import com.aegean.flowcontrol.jp1;
import com.aegean.flowcontrol.jpe1;
import com.aegean.flowcontrol.jpo1;
import com.aegean.flowcontrol.jz1;
import com.aegean.functions.call1;
import com.aegean.functions.cc1;
import com.aegean.functions.cm1;
import com.aegean.functions.cnc1;
import com.aegean.functions.cnz1;
import com.aegean.functions.cp1;
import com.aegean.functions.cpe1;
import com.aegean.functions.cpo1;
import com.aegean.functions.cz1;
import com.aegean.functions.rc1;
import com.aegean.functions.ret1;
import com.aegean.functions.rm1;
import com.aegean.functions.rnc1;
import com.aegean.functions.rnz1;
import com.aegean.functions.rp1;
import com.aegean.functions.rpe1;
import com.aegean.functions.rpo1;
import com.aegean.functions.rz1;
import com.aegean.loadnstore.lda1;
import com.aegean.loadnstore.ldax1;
import com.aegean.loadnstore.lhld1;
import com.aegean.loadnstore.mov1;
import com.aegean.loadnstore.mvi1;
import com.aegean.loadnstore.shld1;
import com.aegean.loadnstore.sta1;
import com.aegean.loadnstore.stax1;
import com.aegean.loadnstore.xchg1;
import com.aegean.loadnstore.xthl1;
import com.aegean.logical.ana1;
import com.aegean.logical.ani1;
import com.aegean.logical.cma1;
import com.aegean.logical.ora1;
import com.aegean.logical.ori1;
import com.aegean.logical.ral1;
import com.aegean.logical.rar1;
import com.aegean.logical.rlc1;
import com.aegean.logical.rrc1;
import com.aegean.logical.xra1;
import com.aegean.logical.xri1;
import com.aegean.stack.pop1;
import com.aegean.stack.push1;

public class Simulator8085 extends Applet 
{
	Button b = new Button("RUN");
	Choice oc = new Choice();
	Memory m0 = new Memory(0);
	Memory m1 = new Memory(200);
	Memory m2 = new Memory(400);
	Memory m3 = new Memory(600);
	Memory m4 = new Memory(800);

	public void init()
	{
		oc.addItem("VEIW MEMORY FROM 0000-00C7");
		oc.addItem("VEIW MEMORY FROM 00C8-018F");
		oc.addItem("VEIW MEMORY FROM 0190-0257");
		oc.addItem("VEIW MEMORY FROM 0258-031F");
		oc.addItem("VEIW MEMORY FROM 0320-03E7");
		SIM_VAR.AFT1 = new TextField(2);
		SIM_VAR.AFT2 = new TextField(2);
		SIM_VAR.ADT = new TextField(2);
		SIM_VAR.SPT = new TextField(10);
		SIM_VAR.AT = new TextField(10);
		SIM_VAR.BT = new TextField(10);
		SIM_VAR.CT = new TextField(10);
		SIM_VAR.DT = new TextField(10);
		SIM_VAR.ET = new TextField(10);
		SIM_VAR.HT = new TextField(10);
		SIM_VAR.LT = new TextField(10);
		SIM_VAR.ST = new TextField(1);
		SIM_VAR.ZT = new TextField(1);
		SIM_VAR.ACT = new TextField(1);
		SIM_VAR.PT = new TextField(1);
		SIM_VAR.CYT = new TextField(1);
		
		SIM_VAR.AFT1.setText("M.R");
		SIM_VAR.AFT2.setText("AM");
		SIM_VAR.ADT.setText("99");
		SIM_VAR.SPT.setText("00");
		SIM_VAR.AT.setText("00");
		SIM_VAR.BT.setText("00");
		SIM_VAR.CT.setText("00");
		SIM_VAR.DT.setText("00");
		SIM_VAR.ET.setText("00");
		SIM_VAR.HT.setText("00");
		SIM_VAR.LT.setText("00");
		SIM_VAR.ST.setText("0");
		SIM_VAR.ZT.setText("0");
		SIM_VAR.ACT.setText("0");
		SIM_VAR.PT.setText("0");
		SIM_VAR.CYT.setText("0");
		
		SIM_VAR.AF1 = new Label("Address Field");
		SIM_VAR.AD = new Label("Data Field");
		SIM_VAR.SP = new Label("SP");
		SIM_VAR.A = new Label("A");
		SIM_VAR.B = new Label("B");
		SIM_VAR.C = new Label("C");
		SIM_VAR.D = new Label("D");
		SIM_VAR.E = new Label("E");
		SIM_VAR.H = new Label("H");
		SIM_VAR.L = new Label("L");
		SIM_VAR.S = new Label("S");
		SIM_VAR.Z = new Label("Z");
		SIM_VAR.AC = new Label("AC");
		SIM_VAR.P = new Label("P");
		SIM_VAR.CY = new Label("CY");
		
		add(SIM_VAR.AF1);
		add(SIM_VAR.AFT1);
		add(SIM_VAR.AFT2);
		add(SIM_VAR.AD);
		add(SIM_VAR.ADT);
		add(SIM_VAR.SP);
		add(SIM_VAR.SP);
		add(SIM_VAR.SPT);
		add(SIM_VAR.A);
		add(SIM_VAR.AT);
		add(SIM_VAR.B);
		add(SIM_VAR.BT);
		add(SIM_VAR.C);
		add(SIM_VAR.CT);
		add(SIM_VAR.D);
		add(SIM_VAR.DT);
		add(SIM_VAR.E);
		add(SIM_VAR.ET);
		add(SIM_VAR.H);
		add(SIM_VAR.HT);
		add(SIM_VAR.L);
		add(SIM_VAR.LT);
		add(SIM_VAR.S);
		add(SIM_VAR.ST);
		add(SIM_VAR.Z);
		add(SIM_VAR.ZT);
		add(SIM_VAR.AC);
		add(SIM_VAR.ACT);
		add(SIM_VAR.P);
		add(SIM_VAR.PT);
		add(SIM_VAR.CY);
		add(SIM_VAR.CYT);
		add(b);
		add(oc);
		
		try
		{
			SIM_VAR.f = new DataInputStream(new FileInputStream("XXX.txt"));
			SIM_VAR.f.close();
		}
		catch(IOException e){}
		
		SIM_VAR.v = new Vector();
		SIM_VAR.v1 = new Vector();
	}
	
	public void paint(Graphics g)
	{	
		try
		{
			aa: for(;;)
			{
				try
				{	
					SIM_VAR.st = new StringTokenizer(SIM_VAR.f.readLine());
				}
				catch(IOException e){}
				String x = SIM_VAR.st.nextToken();

				if(x.equals(new String("hlt"))) {break aa;}
				if(x.equals("mov")) {mov1.mov();}
				if(x.equals("mvi")) {mvi1.mvi();}
				if(x.equals("add")) {add1.add();}
				if(x.equals("ral")) {rlc1.rlc();}
				if(x.equals("rar")) {rrc1.rrc();}
				if(x.equals("rlc")) {ral1.ral();}
				if(x.equals("rrc")) {rar1.rar();}
				if(x.equals("lxi")) {lxi1.lxi();}
				if(x.equals("jmp")) {jmp1.jmp();}
				if(x.equals("call")) {SIM_VAR.v1.insertElementAt(x,0);call1.call();}
				if(x.equals("cc")) {SIM_VAR.v1.insertElementAt(x,0);cc1.cc();}
				if(x.equals("cnc")) {SIM_VAR.v1.insertElementAt(x,0);cnc1.cnc();}
				if(x.equals("cp")) {SIM_VAR.v1.insertElementAt(x,0);cp1.cp();}
				if(x.equals("cm")) {SIM_VAR.v1.insertElementAt(x,0);cm1.cm();}
				if(x.equals("cpe")) {SIM_VAR.v1.insertElementAt(x,0);cpe1.cpe();}
				if(x.equals("cpo")) {SIM_VAR.v1.insertElementAt(x,0);cpo1.cpo();}
				if(x.equals("cz")) {SIM_VAR.v1.insertElementAt(x,0);cz1.cz();}
				if(x.equals("cnz")) {SIM_VAR.v1.insertElementAt(x,0);cnz1.cnz();}
				if(x.equals("push")) {push1.push();}
				if(x.equals("pop")) {pop1.pop();}
				if(x.equals("ret")) {ret1.ret();}
				if(x.equals("rc")) {rc1.rc();}
				if(x.equals("rnc")) {rnc1.rnc();}
				if(x.equals("rp")) {rp1.rp();}
				if(x.equals("rm")) {rm1.rm();}
				if(x.equals("rpe")) {rpe1.rpe();}
				if(x.equals("rpo")) {rpo1.rpo();}
				if(x.equals("rz")) {rz1.rz();}
				if(x.equals("rnz")) {rnz1.rnz();}
				if(x.equals("delay")) {delay1.delay();}
				if(x.equals("adc")) {adc1.adc();}
				if(x.equals("adi")) {adi1.adi();}
				if(x.equals("aci")) {aci1.aci();}
				if(x.equals("sub")) {sub1.sub();}
				if(x.equals("sbb")) {sbb1.sbb();}
				if(x.equals("sui")) {sui1.sui();}
				if(x.equals("sbi")) {sbi1.sbi();}
				if(x.equals("ana")) {ana1.ana();}
				if(x.equals("ani")) {ani1.ani();}
				if(x.equals("ora")) {ora1.ora();}
				if(x.equals("ori")) {ori1.ori();}
				if(x.equals("xra")) {xra1.xra();}
				if(x.equals("xri")) {xri1.xri();}
				if(x.equals("cma")) {cma1.cma();}
				if(x.equals("cmp")) {cmp1.cmp();}
				if(x.equals("cpi")) {cpi1.cpi();}
				if(x.equals("xchg")) {xchg1.xchg();}
				if(x.equals("xthl")) {xthl1.xthl();}
				if(x.equals("stc")) {stc1.stc();}
				if(x.equals("cmc")) {cmc1.cmc();}
				if(x.equals("jnz")) {jnz1.jnz();}
				if(x.equals("jz")) {jz1.jz();}
				if(x.equals("jp")) {jp1.jp();}
				if(x.equals("jm")) {jm1.jm();}
				if(x.equals("jc")) {jc1.jc();}
				if(x.equals("jnc")) {jnc1.jnc();}
				if(x.equals("jpe")) {jpe1.jpe();}
				if(x.equals("jpo")) {jpo1.jpo();}
				if(x.equals("daa")) {daa1.daa();}
				if(x.equals("inc")) {inc1.inc();}
				if(x.equals("dcr")) {dcr1.dcr();}
				if(x.equals("dad")) {dad1.dad();}
				if(x.equals("inx")) {inx1.inx();}
				if(x.equals("dcx")) {dcx1.dcx();}
				if(x.equals("lda")) {lda1.lda();}
				if(x.equals("sta")) {sta1.sta();}
				if(x.equals("ldax")) {ldax1.ldax();}
				if(x.equals("stax")) {stax1.stax();}
				if(x.equals("lhld")) {lhld1.lhld();}
				if(x.equals("shld")) {shld1.shld();}
				if(x.equals("nop")) {c_f1.c_f(4);}
			}
		}
		catch(Exception e){}
		SIM_VAR.AFT1.setText("M.R");
		SIM_VAR.AFT2.setText("AM");
		SIM_VAR.ADT.setText("99");
	}
	public boolean action(Event e,Object arg)
	{
		if(e.target instanceof Button)
		{
			if(arg.equals("RUN"))
			{
				SIM_VAR.AFT1.setText("");
				SIM_VAR.AFT2.setText("");
				SIM_VAR.ADT.setText(" E");
				try
				{
					SIM_VAR.f.close();
					SIM_VAR.f = new DataInputStream(new FileInputStream("XXX.txt"));
				}
				catch(IOException e1){}
				repaint();
			}
			return true;
		}
		if(e.target instanceof Choice)
		{
			String msg = oc.getSelectedItem();
			
			if(msg.equals("VEIW MEMORY FROM 0000-00C7"))
			{
				m0.show();
				m1.hide();m2.hide();m3.hide();m4.hide();
			}
			if(msg.equals("VEIW MEMORY FROM 00C8-018F"))
			{
				m1.show();
				m0.hide();m2.hide();m3.hide();m4.hide();
			}
			if(msg.equals("VEIW MEMORY FROM 0190-0257"))
			{	
				m2.show();
				m0.hide();m1.hide();m3.hide();m4.hide();
			}
			if(msg.equals("VEIW MEMORY FROM 0258-031F"))
			{
				m3.show();
				m0.hide();m1.hide();m2.hide();m4.hide();
			}
			if(msg.equals("VEIW MEMORY FROM 0320-03E7"))
			{
				m4.show();
				m0.hide();m1.hide();m2.hide();m3.hide();
			}
			return true;
		}
		return false;
	}
}