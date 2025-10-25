package motorolla6809;
import javax.swing.JOptionPane;


public class Immediat {
	public String CompleterZeros(String val,int l) {
		
		 int zeros=l-val.length();
		 for(int m=0;m<zeros;m++)
		 {
			val='0'+val;
		 }
		return val;
	}
	public String IncrHexaVal(String HexaVal) {
		
		Long DecVal=Long.parseLong(new Nombre(HexaVal).Base1ToBase2(16, 10));
		DecVal++;
		HexaVal=DecVal+"";
		HexaVal=new Nombre(HexaVal).Base1ToBase2(10, 16);
		HexaVal=this.CompleterZeros(HexaVal,4);
	return HexaVal;
	
	}

	public void Coder_ADDA()
	{}
	public void Coder_ADDD()
	{}
	public String Coder_LDA(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur1octet(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{
		romFrame.updateValueByKey(PC,"86");
		PC=this.IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,Operande);
		PC=this.IncrHexaVal(PC);
		return PC;}
		return null;
	}
	public void Coder_ADCA()
	{}
	public void Coder_ADCB()
	{}
	public void Coder_ADDB()
	{}
	public void Coder_ANDA()
	{}
	public void Coder_ANDB()
	{}
	public void Coder_ANDCC()
	{}
	public void Coder_ASLA()
	{}
	public void Coder_ASLB()
	{}
	public void Coder_ASL()
	{}
	public void Coder_BITA()
	{}
	public void Coder_BITB()
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
	
	public void Coder_CWAI()
	{}
	
	public void Coder_EORA()
	{}
	public void Coder_EORB()
	{}
	public void Coder_EXG()
	{}
	
	public String Coder_LDB(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur1octet(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{romFrame.updateValueByKey(PC,"C6");
		PC=this.IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,Operande);
		PC=this.IncrHexaVal(PC);
		return PC;}
		return null;
	}
	public String Coder_LDD(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur2octet(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{romFrame.updateValueByKey(PC,"CC");
		PC=this.IncrHexaVal(PC);
		String op1=Operande.substring(0,Operande.length()-2).trim();
		op1=this.CompleterZeros(op1, 2);
		System.out.println(op1);
		romFrame.updateValueByKey(PC,op1);
		PC=this.IncrHexaVal(PC);
		String op2=Operande.substring(Operande.length()-2).trim();
		op2=this.CompleterZeros(op2, 2);
		romFrame.updateValueByKey(PC,op2);
		PC=this.IncrHexaVal(PC);
		return PC;}
		return null;
	}
	public String Coder_LDS(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur2octet(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{
		romFrame.updateValueByKey(PC,"10");
		PC=this.IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,"CE");
		PC=this.IncrHexaVal(PC);
		String op1=Operande.substring(0,Operande.length()-2).trim();
		op1=op1.replace("$", "");
		op1=op1.replace("#", "");
		op1=this.CompleterZeros(op1, 2);
		romFrame.updateValueByKey(PC,op1);
		PC=this.IncrHexaVal(PC);
		String op2=Operande.substring(Operande.length()-2).trim();
		op2=this.CompleterZeros(op2, 2);
		romFrame.updateValueByKey(PC,op2);
		PC=this.IncrHexaVal(PC);
		return PC;}
		return null;
	}
	public String Coder_LDU(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur2octet(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{romFrame.updateValueByKey(PC,"CE");
		PC=this.IncrHexaVal(PC); 
		romFrame.updateValueByKey(PC,Operande);
		PC=this.IncrHexaVal(PC);
		return PC;}
		return null;
	}
	
	public String Coder_LDX(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur2octet(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
		{romFrame.updateValueByKey(PC,"8E");
		PC=this.IncrHexaVal(PC);
		String op1=Operande.substring(0,Operande.length()-2).trim();
		op1=op1.replace("$", "");
		op1=op1.replace("#", "");
		op1=this.CompleterZeros(op1, 2);
		romFrame.updateValueByKey(PC,op1);
		PC=this.IncrHexaVal(PC);
		String op2=Operande.substring(Operande.length()-2).trim();
		op2=this.CompleterZeros(op2, 2);
		romFrame.updateValueByKey(PC,op2);
		PC=this.IncrHexaVal(PC);
		return PC;}
		return null;
	}
	public String Coder_LDY(String PC,ROM romFrame,String Operande)
	{
		
		if(!estValidValeur2octet(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{romFrame.updateValueByKey(PC,"10");
		PC=this.IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,"8E");
		PC=this.IncrHexaVal(PC);
		String op1=Operande.substring(0,Operande.length()-2).trim();
		op1=op1.replace("$", "");
		op1=op1.replace("#", "");
		op1=this.CompleterZeros(op1, 2);
		romFrame.updateValueByKey(PC,op1);
		PC=this.IncrHexaVal(PC);
		String op2=Operande.substring(Operande.length()-2).trim();
		op2=this.CompleterZeros(op2, 2);
		romFrame.updateValueByKey(PC,op2);
		PC=this.IncrHexaVal(PC);
		return PC;}
		return null;
	}
	
	public void Coder_LSLA()
	{}
	public void Coder_LSLB()
	{}
	public void Coder_LSL()
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
	public void Coder_SBCA()
	{}
	public void Coder_SBCB()
	{}
	public String Coder_SUBA(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur1octet(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{romFrame.updateValueByKey(PC,"80");
		PC=this.IncrHexaVal(PC);  
		romFrame.updateValueByKey(PC,Operande);
		PC=this.IncrHexaVal(PC);
		return PC;}
		return null;
	}
	public String Coder_SUBB(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur1octet(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{romFrame.updateValueByKey(PC,"C0");
		PC=this.IncrHexaVal(PC);  
		romFrame.updateValueByKey(PC,Operande);
		PC=this.IncrHexaVal(PC);
		return PC;}
		return null;
	}
	public String Coder_SUBD(String PC,ROM romFrame,String Operande)
	{
		
		if(!estValidValeur2octet(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{romFrame.updateValueByKey(PC,"83");
		PC=this.IncrHexaVal(PC);
		String op1=Operande.substring(0,Operande.length()-2).trim();
		op1=op1.replace("$", "");
		op1=op1.replace(">", "");
		op1=this.CompleterZeros(op1, 2);
		romFrame.updateValueByKey(PC,op1);
		PC=this.IncrHexaVal(PC);
		String op2=Operande.substring(Operande.length()-2).trim();
		op2=this.CompleterZeros(op2, 2);
		romFrame.updateValueByKey(PC,op2);
		PC=this.IncrHexaVal(PC);
		System.out.println(PC);
		return PC;}
		return null;
	}
	public void Coder_TFR()
	{}
	public boolean estValidValeur1octet(String value) {
        return value.matches("^[0-9A-Fa-f]{2}$");
    }
	public boolean estValidValeur2octet(String value) {
        return value.matches("^[0-9A-Fa-f]{4}$");
    }
	
}
