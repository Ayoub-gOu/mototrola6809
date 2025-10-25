package motorolla6809;
public class Inherent {

	public String CompleterZeros(String val,int l) {
		
		if (val==null)
		{
			for(int i=0;i<l;i++)
			{  val="0";}
		}
		int zeros=l-val.length();
		 for(int m=0;m<zeros;m++)
		 {
			val='0'+val;
		 }
		return val;
	}
	public String IncrHexaVal(String HexaVal,int l) {
		
		Long DecVal=Long.parseLong(new Nombre(HexaVal).Base1ToBase2(16, 10));
		DecVal++;
		HexaVal=DecVal+"";
		HexaVal=new Nombre(HexaVal).Base1ToBase2(10, 16);
		HexaVal=this.CompleterZeros(HexaVal,l);
	return HexaVal;
	
	}
	public String decrHexaVal(String HexaVal,int nbDigit) {
		
		Long DecVal=Long.parseLong(new Nombre(HexaVal).Base1ToBase2(16, 10));
		String x="";
		if(DecVal==0)
		{
					for(int i=0;i<nbDigit;i++)
					{
						x+="F";
					}
				return x;
		}
		DecVal--;
		HexaVal=DecVal+"";
		HexaVal=new Nombre(HexaVal).Base1ToBase2(10, 16);
		HexaVal=this.CompleterZeros(HexaVal,nbDigit);
	return HexaVal;
	
	}
	public String Coder_ABX(String PC,ROM romFrame,String Operande)

			{romFrame.updateValueByKey(PC, "3A");
		PC = this.IncrHexaVal(PC,4);
		return PC;}
	
	public void Coder_ASLA()
	{}
	public void Coder_ASLB()
	{}

	public void Coder_ASRA()
	{}
	public void Coder_ASRB()
	{}
	public void Coder_BITA()
	{}
	public void Coder_BITB()
	{}
	public void Coder_CLRA()
	{}
	public void Coder_CLRB()
	{}
	public void Coder_CLR()
	{}
	public void Coder_CMPA()
	{}
	public void Coder_CMPB()
	{}
	public void Coder_CMPD()
	{}
	public void Coder_CMPS()
	{}
	public void Coder_CMPU()
	{}
	public void Coder_CMPX()
	{}
	public void Coder_CMPY()
	{}
	public String Coder_COMA(String PC,ROM romFrame,String Operande)
	{
			romFrame.updateValueByKey(PC, "43");
			
		PC = this.IncrHexaVal(PC,4);
		return PC;
	}
	public String Coder_COMB(String PC,ROM romFrame,String Operande)
	{
		romFrame.updateValueByKey(PC, "53");
		PC = this.IncrHexaVal(PC,4);
		return PC;
	}
	public void Coder_COM()
	{}
	public void Coder_CWAI()
	{}
	public void Coder_DAA()
	{}
	public String Coder_DECA(String PC,ROM romFrame,String Operande)
	{
		romFrame.updateValueByKey(PC, "4A");
		PC = this.IncrHexaVal(PC,4);
		return PC;
	}
	public String Coder_DECB(String PC,ROM romFrame,String Operande)
	{
		
		romFrame.updateValueByKey(PC, "5A");
		PC = this.IncrHexaVal(PC,4);
		return PC;
	}
	public void Coder_DEC()
	{}
	public void Coder_EORA()
	{}
	public void Coder_EORB()
	{}
	public void Coder_EXG()
	{}
	public String Coder_INCA(String PC,ROM romFrame,String Operande)
	{
	
		romFrame.updateValueByKey(PC, "4C");
		PC = this.IncrHexaVal(PC,4);
		return PC;
	}
	public String Coder_INCB(String PC,ROM romFrame,String Operande)
	{
	
		romFrame.updateValueByKey(PC, "5C");
		PC = this.IncrHexaVal(PC,4);
		return PC;}
	public void Coder_INC()
	{}
	public void Coder_JMP()
	{}
	public void Coder_JSR()
	{}
	public void Coder_LDB()
	{}
	public void Coder_LDD()
	{}
	public void Coder_LDS()
	{}
	public void Coder_LDU()
	{}
	
	public void Coder_LDX()
	{}
	public void Coder_LDY()
	{}
	public void Coder_LEAS()
	{}
	public void Coder_LEAU()
	{}
	public void Coder_LEAX()
	{}
	public void Coder_LEAY()
	{}
	public void Coder_LSLA()
	{}
	public void Coder_LSLB()
	{}
	public void Coder_LSL()
	{}
	public void Coder_LSRA()
	{}
	public void Coder_LSRB()
	{}
	public void Coder_LSR()
	{}
	public void Coder_MUL()
	{}

	public String Coder_NEGA(String PC,ROM romFrame,String Operande)
		{
	
			romFrame.updateValueByKey(PC, "40");
			PC = this.IncrHexaVal(PC,4);
			return PC;}
	
	public String Coder_NEGB(String PC,ROM romFrame,String Operande)
	   {
	
			romFrame.updateValueByKey(PC, "50");
			PC = this.IncrHexaVal(PC,4);
			return PC;
	   }	

	public void Coder_NEG()
	{}
	public void Coder_NOP()
	{}
	public void Coder_ORA()
	{}
	public void Coder_ORB()
	{}
	public void Coder_ORCC()
	{}
	public void Coder_PSHS()
	{}
	public void Coder_PSHU()
	{}
	public void Coder_PULS()
	{}
	public void Coder_PULU()
	{}
	public void Coder_ROLA()
	{}
	public void Coder_ROLB()
	{}
	public void Coder_ROL()
	{}
	public void Coder_RORA()
	{}
	public void Coder_RORB()
	{}
	public void Coder_ROR()
	{}
	public void Coder_RTI()
	{}
	public void Coder_RTS()
	{}
	public void Coder_SBCA()
	{}
	public void Coder_SBCB()
	{}
	public void Coder_SEX()
	{}
	public void Coder_STA()
	{}
	public void Coder_STB()
	{}
	public void Coder_STD()
	{}
	public void Coder_STS()
	{}
	public void Coder_STU()
	{}
	public void Coder_STX()
	{}
	public void Coder_STY()
	{}
	public void Coder_SUBA()
	{}
	public void Coder_SUBB()
	{}
	public void Coder_SUBD()
	{}
	public void Coder_SWI()
	{}
	public void Coder_SWI2()
	{}
	public void Coder_SWI3()
	{}
	public void Coder_SYNC()
	{}
	public void Coder_TFR()
	{}
	public void Coder_TSTA()
	{}
	public void Coder_TSTB()
	{}
	public void Coder_TST()
	{}
	public String Coder_EXG(String PC,ROM romFrame,String Operande)
	{
		romFrame.updateValueByKey(PC, "1E");
		PC = this.IncrHexaVal(PC,4);
		String op1=Operande.split(",")[0];
		String op2=Operande.split(",")[1];
		String k=postOctet(op1)+postOctet(op2);
		romFrame.updateValueByKey(PC,k);
		PC = this.IncrHexaVal(PC,4);
		return PC;
	}
	public String Coder_TFR(String PC,ROM romFrame,String Operande)
	{
		romFrame.updateValueByKey(PC, "1F");
		PC = this.IncrHexaVal(PC,4);
		String op1=Operande.split(",")[0];
		String op2=Operande.split(",")[1];
		String k=postOctet(op1)+postOctet(op2);
		romFrame.updateValueByKey(PC,k);
		PC = this.IncrHexaVal(PC,4);
		return PC;
	}
	public String postOctet(String G) {
		
		if(G.equals("A"))
			return "8";
		if(G.equals("B"))
			return "9";
		if(G.equals("D"))
			return "0";
		if(G.equals("X"))
			return "1";
		if(G.equals("Y"))
			return "2";
		if(G.equals("U"))
			return "3";
		if(G.equals("S"))
			return "4";
		if(G.equals("PC"))
			return "5";
		if(G.equals("CCR"))
			return "A";
		if(G.equals("DP"))
			return "B";
		
		return null;
	 }

}
