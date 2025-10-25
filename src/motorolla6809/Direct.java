package motorolla6809;
import javax.swing.JOptionPane;


public class Direct {
	
	public String CompleterZeros(String val,int l)
		{
			
			 int zeros=l-val.length();
			 for(int m=0;m<zeros;m++)
			 {
				val='0'+val;
			 }
			return val;
		}
	public String IncrHexaVal(String HexaVal)
		{	
		 
			Long DecVal=Long.parseLong(new Nombre(HexaVal).Base1ToBase2(16, 10));
			DecVal++;
			HexaVal=DecVal+"";
			HexaVal=new Nombre(HexaVal).Base1ToBase2(10, 16);
			HexaVal=this.CompleterZeros(HexaVal,4);
			return HexaVal;
		}
	
	public String Coder_ADDA(String PC,ROM romFrame,String Operande)
	   
	{
		if(!estValidValeur(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalidddde",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{
		romFrame.updateValueByKey(PC, "9B");
		PC=this.IncrHexaVal(PC);
		romFrame.updateValueByKey(PC, Operande);
		PC=this.IncrHexaVal(PC);
		return PC;
	   }
		return null;
	}
	
	
	public String Coder_ADDD(String PC,ROM romFrame,String Operande)
		
		{
		if(!estValidValeur(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{romFrame.updateValueByKey(PC, "D3");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC, Operande);
			PC=this.IncrHexaVal(PC);
			return PC;
			
		}
		return null;}
			
	
	public String Coder_LDA(String PC,ROM romFrame,String Operande) 
		{
			if(!estValidValeur(Operande))
			{JOptionPane.showMessageDialog(
	                null,
	                "Erreur : Votre programme comporte des erreurs",
	                "Valeur invalide",
	                JOptionPane.ERROR_MESSAGE
	            );}
			else
		    {romFrame.updateValueByKey(PC,"96");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;}
		return null;}
	
	public void Coder_ADCA()
	{}
	public void Coder_ADCB()
	{}
	
	public String Coder_ADDB(String PC,ROM romFrame,String Operande)
		{
			if(!estValidValeur(Operande))
			{JOptionPane.showMessageDialog(
	                null,
	                "Erreur : Votre programme comporte des erreurs",
	                "Valeur invalide",
	                JOptionPane.ERROR_MESSAGE
	            );}
			else
				{
			romFrame.updateValueByKey(PC,"DB");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;}
			return null;
		}
	
	public void Coder_ANDA()
	{}
	public void Coder_ANDB()
	{}
	public void Coder_ASL()
	{}
	public void Coder_ASR()
	{}
	public void Coder_BITA()
	{}
	public void Coder_BITB()
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
	public void Coder_COM()
	{}
	public void Coder_DEC()
	{}
	public void Coder_EORA()
	{}
	public void Coder_EORB()
	{}
	public void Coder_INC()
	{}
	public void Coder_JMP()
	{}
	public void Coder_JSR()
	{}
	
	public String Coder_LDB(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{romFrame.updateValueByKey(PC,"D6");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;
		}
		return null;}
	
	public String Coder_LDD(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{romFrame.updateValueByKey(PC,"DC");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;
		}
		return null;}
	
	public String Coder_LDS(String PC,ROM romFrame,String Operande)
		{
			romFrame.updateValueByKey(PC,"10");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,"DE");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;
		}
	
	public String Coder_LDU(String PC,ROM romFrame,String Operande)
		{
		
			if(!estValidValeur(Operande))
			{JOptionPane.showMessageDialog(
	                null,
	                "Erreur : Votre programme comporte des erreurs",
	                "Valeur invalide",
	                JOptionPane.ERROR_MESSAGE
	            );}
			else
				{romFrame.updateValueByKey(PC,"DE");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;}
			return null;
		}
	
	public String Coder_LDX(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{romFrame.updateValueByKey(PC,"9E");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;
		}
		return null;}
	
	public String Coder_LDY(String PC,ROM romFrame,String Operande)
		{
		
			if(!estValidValeur(Operande))
			{JOptionPane.showMessageDialog(
	                null,
	                "Erreur : Votre programme comporte des erreurs",
	                "Valeur invalide",
	                JOptionPane.ERROR_MESSAGE
	            );}
			else
				{romFrame.updateValueByKey(PC,"10");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,"9E");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;}
			return null;
		}
	
	public void Coder_LSL()
	{}
	public void Coder_LSR()
	{}
	public void Coder_NEG()
	{}
	
	public void Coder_ORA()
	{}
	public void Coder_ORB()
	{}
	public void Coder_ROL()
	{}
	public void Coder_ROR()
	{}
	public void Coder_SBCA()
	{}
	public void Coder_SBCB()
	{}
	public String Coder_STA(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{
			romFrame.updateValueByKey(PC,"97");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;
		}
		return null;}
	public String Coder_STB(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{romFrame.updateValueByKey(PC,"D7");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;
			}
		return null;
		}
	public String Coder_STD(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{
		
			romFrame.updateValueByKey(PC,"D7");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;
		}
		return null;
	}
	public String Coder_STS(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur(Operande))
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
			romFrame.updateValueByKey(PC,"DF");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;
		}
		return null;}
		
	public String Coder_STU(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{
			romFrame.updateValueByKey(PC,"DF");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;}
		return null;
		}
	
	public String Coder_STX(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{
			romFrame.updateValueByKey(PC,"9F");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;}
		return null;}
	
	public String Coder_STY(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur(Operande))
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
			romFrame.updateValueByKey(PC,"9F");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;}
		return null;}
		
	
	public String Coder_SUBA(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{
			romFrame.updateValueByKey(PC,"90");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;}
		return null;
		}
		
	public String Coder_SUBB(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{
			romFrame.updateValueByKey(PC,"D0");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;
		}
		return null;}
	
	public String Coder_SUBD(String PC,ROM romFrame,String Operande)
	{
		if(!estValidValeur(Operande))
		{JOptionPane.showMessageDialog(
                null,
                "Erreur : Votre programme comporte des erreurs",
                "Valeur invalide",
                JOptionPane.ERROR_MESSAGE
            );}
		else
			{
			romFrame.updateValueByKey(PC,"93");
			PC=this.IncrHexaVal(PC);
			romFrame.updateValueByKey(PC,Operande);
			PC=this.IncrHexaVal(PC);
			return PC;}
		return null;
		}
	public void Coder_TST()
	{}
	public boolean estValidValeur(String value) {
        return value.matches("^[0-9A-Fa-f]{2}$");
    }
}



























