package motorolla6809;


public class Indexe {

	
	public String Coder_STA(String PC,ROM romFrame,String Operande)
	{
		System.out.println(PC);
		System.out.println(Operande);
		romFrame.updateValueByKey(PC,"A7");
		String S7="0";
		String S4="0";
		String S65="00";
		String S3210="0000";
		String avantVirgule=Operande.split(",")[0];
		char apresVirgule=Operande.split(",")[1].charAt(0);
		Operande=Operande.replace(',', ' ');
		if(avantVirgule.isEmpty())
		{
			S7="1";
		}
		else
		{
			
			S7="0";
			if((Double.parseDouble(avantVirgule)<0))
			{
				S4="1";
			}
			else
			{
				S4="0";
			}
		
		}
		if(apresVirgule=='X')
		{
			S65="00";
		}
		else if (apresVirgule=='Y')
		{
			S65="01";
		}
		else if (apresVirgule=='U')
		{
			S65="01";
		}
		else if (apresVirgule=='S')
		{
			S65="11";
		}
		if(Operande.trim().equals("X") ||Operande.trim().equals("Y")||Operande.trim().equals("S")||Operande.trim().equals("U"))
		{
			S3210="0100";
		}
		if(Operande.trim().equals("X+"))
		{
			S3210="0000";
		}
		if(Operande.trim().equals("X++"))
		{
			S3210="0001";
		}
		if(Operande.trim().equals("-X"))
		{
			S3210="0010";
		}
		if(Operande.trim().equals("--X"))
		{
			S3210="0011";
		}
		System.out.println(S7+S65+S4+S3210);
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,new Nombre(S7+S65+S4+S3210).Base1ToBase2(2, 16));
		PC=new Direct().IncrHexaVal(PC);
		return PC;
		
	}

	public String Coder_STB(String PC,ROM romFrame,String Operande)
	{
		System.out.println(PC);
		System.out.println(Operande);
		romFrame.updateValueByKey(PC,"E7");
		String S7="0";
		String S4="0";
		String S65="00";
		String S3210="0000";
		String avantVirgule=Operande.split(",")[0];
		char apresVirgule=Operande.split(",")[1].charAt(0);
		Operande=Operande.replace(',', ' ');
		if(avantVirgule.isEmpty())
		{
			S7="1";
		}
		else
		{
			
			S7="0";
			if((Double.parseDouble(avantVirgule)<0))
			{
				S4="1";
			}
			else
			{
				S4="0";
			}
		
		}
		if(apresVirgule=='X')
		{
			S65="00";
		}
		else if (apresVirgule=='Y')
		{
			S65="01";
		}
		else if (apresVirgule=='U')
		{
			S65="01";
		}
		else if (apresVirgule=='S')
		{
			S65="11";
		}
		if(Operande.trim().equals("X") ||Operande.trim().equals("Y")||Operande.trim().equals("S")||Operande.trim().equals("U"))
		{
			S3210="0100";
		}
		if(Operande.trim().equals("X+"))
		{
			S3210="0000";
		}
		if(Operande.trim().equals("X++"))
		{
			S3210="0001";
		}
		if(Operande.trim().equals("-X"))
		{
			S3210="0010";
		}
		if(Operande.trim().equals("--X"))
		{
			S3210="0011";
		}
		System.out.println(S7+S65+S4+S3210);
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,new Nombre(S7+S65+S4+S3210).Base1ToBase2(2, 16));
		PC=new Direct().IncrHexaVal(PC);
		return PC;
		
	}

	public String Coder_STD(String PC,ROM romFrame,String Operande)
	{
		System.out.println(PC);
		System.out.println(Operande);
		romFrame.updateValueByKey(PC,"ED");
		String S7="0";
		String S4="0";
		String S65="00";
		String S3210="0000";
		String avantVirgule=Operande.split(",")[0];
		char apresVirgule=Operande.split(",")[1].charAt(0);
		Operande=Operande.replace(',', ' ');
		if(avantVirgule.isEmpty())
		{
			S7="1";
		}
		else
		{
			
			S7="0";
			if((Double.parseDouble(avantVirgule)<0))
			{
				S4="1";
			}
			else
			{
				S4="0";
			}
		
		}
		if(apresVirgule=='X')
		{
			S65="00";
		}
		else if (apresVirgule=='Y')
		{
			S65="01";
		}
		else if (apresVirgule=='U')
		{
			S65="01";
		}
		else if (apresVirgule=='S')
		{
			S65="11";
		}
		if(Operande.trim().equals("X") ||Operande.trim().equals("Y")||Operande.trim().equals("S")||Operande.trim().equals("U"))
		{
			S3210="0100";
		}
		if(Operande.trim().equals("X+"))
		{
			S3210="0000";
		}
		if(Operande.trim().equals("X++"))
		{
			S3210="0001";
		}
		if(Operande.trim().equals("-X"))
		{
			S3210="0010";
		}
		if(Operande.trim().equals("--X"))
		{
			S3210="0011";
		}
		System.out.println(S7+S65+S4+S3210);
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,new Nombre(S7+S65+S4+S3210).Base1ToBase2(2, 16));
		PC=new Direct().IncrHexaVal(PC);
		return PC;
		
	}

	public String Coder_STS(String PC,ROM romFrame,String Operande)
	{
		System.out.println(PC);
		System.out.println(Operande);
		romFrame.updateValueByKey(PC,"10");
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,"EF");
		PC=new Direct().IncrHexaVal(PC);
		String S7="0";
		String S4="0";
		String S65="00";
		String S3210="0000";
		String avantVirgule=Operande.split(",")[0];
		char apresVirgule=Operande.split(",")[1].charAt(0);
		Operande=Operande.replace(',', ' ');
		if(avantVirgule.isEmpty())
		{
			S7="1";
		}
		else
		{
			
			S7="0";
			if((Double.parseDouble(avantVirgule)<0))
			{
				S4="1";
			}
			else
			{
				S4="0";
			}
		
		}
		if(apresVirgule=='X')
		{
			S65="00";
		}
		else if (apresVirgule=='Y')
		{
			S65="01";
		}
		else if (apresVirgule=='U')
		{
			S65="01";
		}
		else if (apresVirgule=='S')
		{
			S65="11";
		}
		if(Operande.trim().equals("X") ||Operande.trim().equals("Y")||Operande.trim().equals("S")||Operande.trim().equals("U"))
		{
			S3210="0100";
		}
		if(Operande.trim().equals("X+"))
		{
			S3210="0000";
		}
		if(Operande.trim().equals("X++"))
		{
			S3210="0001";
		}
		if(Operande.trim().equals("-X"))
		{
			S3210="0010";
		}
		if(Operande.trim().equals("--X"))
		{
			S3210="0011";
		}
		System.out.println(S7+S65+S4+S3210);
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,new Nombre(S7+S65+S4+S3210).Base1ToBase2(2, 16));
		PC=new Direct().IncrHexaVal(PC);
		return PC;
		
	}
	
	public String Coder_STU(String PC,ROM romFrame,String Operande)
	{
		System.out.println(PC);
		System.out.println(Operande);
		romFrame.updateValueByKey(PC,"DF");
		String S7="0";
		String S4="0";
		String S65="00";
		String S3210="0000";
		String avantVirgule=Operande.split(",")[0];
		char apresVirgule=Operande.split(",")[1].charAt(0);
		Operande=Operande.replace(',', ' ');
		if(avantVirgule.isEmpty())
		{
			S7="1";
		}
		else
		{
			
			S7="0";
			if((Double.parseDouble(avantVirgule)<0))
			{
				S4="1";
			}
			else
			{
				S4="0";
			}
		
		}
		if(apresVirgule=='X')
		{
			S65="00";
		}
		else if (apresVirgule=='Y')
		{
			S65="01";
		}
		else if (apresVirgule=='U')
		{
			S65="01";
		}
		else if (apresVirgule=='S')
		{
			S65="11";
		}
		if(Operande.trim().equals("X") ||Operande.trim().equals("Y")||Operande.trim().equals("S")||Operande.trim().equals("U"))
		{
			S3210="0100";
		}
		if(Operande.trim().equals("X+"))
		{
			S3210="0000";
		}
		if(Operande.trim().equals("X++"))
		{
			S3210="0001";
		}
		if(Operande.trim().equals("-X"))
		{
			S3210="0010";
		}
		if(Operande.trim().equals("--X"))
		{
			S3210="0011";
		}
		System.out.println(S7+S65+S4+S3210);
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,new Nombre(S7+S65+S4+S3210).Base1ToBase2(2, 16));
		PC=new Direct().IncrHexaVal(PC);
		return PC;
		
	}

	
	public String Coder_STX(String PC,ROM romFrame,String Operande)
	{
		System.out.println(PC);
		System.out.println(Operande);
		romFrame.updateValueByKey(PC,"AF");
		String S7="0";
		String S4="0";
		String S65="00";
		String S3210="0000";
		String avantVirgule=Operande.split(",")[0];
		char apresVirgule=Operande.split(",")[1].charAt(0);
		Operande=Operande.replace(',', ' ');
		if(avantVirgule.isEmpty())
		{
			S7="1";
		}
		else
		{
			
			S7="0";
			if((Double.parseDouble(avantVirgule)<0))
			{
				S4="1";
			}
			else
			{
				S4="0";
			}
		
		}
		if(apresVirgule=='X')
		{
			S65="00";
		}
		else if (apresVirgule=='Y')
		{
			S65="01";
		}
		else if (apresVirgule=='U')
		{
			S65="01";
		}
		else if (apresVirgule=='S')
		{
			S65="11";
		}
		if(Operande.trim().equals("X") ||Operande.trim().equals("Y")||Operande.trim().equals("S")||Operande.trim().equals("U"))
		{
			S3210="0100";
		}
		if(Operande.trim().equals("X+"))
		{
			S3210="0000";
		}
		if(Operande.trim().equals("X++"))
		{
			S3210="0001";
		}
		if(Operande.trim().equals("-X"))
		{
			S3210="0010";
		}
		if(Operande.trim().equals("--X"))
		{
			S3210="0011";
		}
		System.out.println(S7+S65+S4+S3210);
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,new Nombre(S7+S65+S4+S3210).Base1ToBase2(2, 16));
		PC=new Direct().IncrHexaVal(PC);
		return PC;
		
	}

	public String Coder_STY(String PC,ROM romFrame,String Operande)
	{
		System.out.println(PC);
		System.out.println(Operande);
		romFrame.updateValueByKey(PC,"10");
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,"AF");
		String S7="0";
		String S4="0";
		String S65="00";
		String S3210="0000";
		String avantVirgule=Operande.split(",")[0];
		char apresVirgule=Operande.split(",")[1].charAt(0);
		Operande=Operande.replace(',', ' ');
		if(avantVirgule.isEmpty())
		{
			S7="1";
		}
		else
		{
			
			S7="0";
			if((Double.parseDouble(avantVirgule)<0))
			{
				S4="1";
			}
			else
			{
				S4="0";
			}
		
		}
		if(apresVirgule=='X')
		{
			S65="00";
		}
		else if (apresVirgule=='Y')
		{
			S65="01";
		}
		else if (apresVirgule=='U')
		{
			S65="01";
		}
		else if (apresVirgule=='S')
		{
			S65="11";
		}
		if(Operande.trim().equals("X") ||Operande.trim().equals("Y")||Operande.trim().equals("S")||Operande.trim().equals("U"))
		{
			S3210="0100";
		}
		if(Operande.trim().equals("X+"))
		{
			S3210="0000";
		}
		if(Operande.trim().equals("X++"))
		{
			S3210="0001";
		}
		if(Operande.trim().equals("-X"))
		{
			S3210="0010";
		}
		if(Operande.trim().equals("--X"))
		{
			S3210="0011";
		}
		System.out.println(S7+S65+S4+S3210);
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,new Nombre(S7+S65+S4+S3210).Base1ToBase2(2, 16));
		PC=new Direct().IncrHexaVal(PC);
		return PC;
		
	}

	public String Coder_LDA(String PC,ROM romFrame,String Operande)
	{
		System.out.println(PC);
		System.out.println(Operande);
		romFrame.updateValueByKey(PC,"A6");
		String S7="0";
		String S4="0";
		String S65="00";
		String S3210="0000";
		String avantVirgule=Operande.split(",")[0];
		char apresVirgule=Operande.split(",")[1].charAt(0);
		Operande=Operande.replace(',', ' ');
		if(avantVirgule.isEmpty())
		{
			S7="1";
		}
		else
		{
			
			S7="0";
			if((Double.parseDouble(avantVirgule)<0))
			{
				S4="1";
			}
			else
			{
				S4="0";
			}
		
		}
		if(apresVirgule=='X')
		{
			S65="00";
		}
		else if (apresVirgule=='Y')
		{
			S65="01";
		}
		else if (apresVirgule=='U')
		{
			S65="01";
		}
		else if (apresVirgule=='S')
		{
			S65="11";
		}
		if(Operande.trim().equals("X") ||Operande.trim().equals("Y")||Operande.trim().equals("S")||Operande.trim().equals("U"))
		{
			S3210="0100";
		}
		if(Operande.trim().equals("X+"))
		{
			S3210="0000";
		}
		if(Operande.trim().equals("X++"))
		{
			S3210="0001";
		}
		if(Operande.trim().equals("-X"))
		{
			S3210="0010";
		}
		if(Operande.trim().equals("--X"))
		{
			S3210="0011";
		}
		System.out.println(S7+S65+S4+S3210);
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,new Nombre(S7+S65+S4+S3210).Base1ToBase2(2, 16));
		PC=new Direct().IncrHexaVal(PC);
		return PC;
		
	}

	public String Coder_LDB(String PC,ROM romFrame,String Operande)
	{
		System.out.println(PC);
		System.out.println(Operande);
		romFrame.updateValueByKey(PC,"E6");
		String S7="0";
		String S4="0";
		String S65="00";
		String S3210="0000";
		String avantVirgule=Operande.split(",")[0];
		char apresVirgule=Operande.split(",")[1].charAt(0);
		Operande=Operande.replace(',', ' ');
		if(avantVirgule.isEmpty())
		{
			S7="1";
		}
		else
		{
			
			S7="0";
			if((Double.parseDouble(avantVirgule)<0))
			{
				S4="1";
			}
			else
			{
				S4="0";
			}
		
		}
		if(apresVirgule=='X')
		{
			S65="00";
		}
		else if (apresVirgule=='Y')
		{
			S65="01";
		}
		else if (apresVirgule=='U')
		{
			S65="01";
		}
		else if (apresVirgule=='S')
		{
			S65="11";
		}
		if(Operande.trim().equals("X") ||Operande.trim().equals("Y")||Operande.trim().equals("S")||Operande.trim().equals("U"))
		{
			S3210="0100";
		}
		if(Operande.trim().equals("X+"))
		{
			S3210="0000";
		}
		if(Operande.trim().equals("X++"))
		{
			S3210="0001";
		}
		if(Operande.trim().equals("-X"))
		{
			S3210="0010";
		}
		if(Operande.trim().equals("--X"))
		{
			S3210="0011";
		}
		System.out.println(S7+S65+S4+S3210);
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,new Nombre(S7+S65+S4+S3210).Base1ToBase2(2, 16));
		PC=new Direct().IncrHexaVal(PC);
		return PC;
		
	}

	public String Coder_LDD(String PC,ROM romFrame,String Operande)
	{
		System.out.println(PC);
		System.out.println(Operande);
		romFrame.updateValueByKey(PC,"EC");
		String S7="0";
		String S4="0";
		String S65="00";
		String S3210="0000";
		String avantVirgule=Operande.split(",")[0];
		char apresVirgule=Operande.split(",")[1].charAt(0);
		Operande=Operande.replace(',', ' ');
		if(avantVirgule.isEmpty())
		{
			S7="1";
		}
		else
		{
			
			S7="0";
			if((Double.parseDouble(avantVirgule)<0))
			{
				S4="1";
			}
			else
			{
				S4="0";
			}
		
		}
		if(apresVirgule=='X')
		{
			S65="00";
		}
		else if (apresVirgule=='Y')
		{
			S65="01";
		}
		else if (apresVirgule=='U')
		{
			S65="01";
		}
		else if (apresVirgule=='S')
		{
			S65="11";
		}
		if(Operande.trim().equals("X") ||Operande.trim().equals("Y")||Operande.trim().equals("S")||Operande.trim().equals("U"))
		{
			S3210="0100";
		}
		if(Operande.trim().equals("X+"))
		{
			S3210="0000";
		}
		if(Operande.trim().equals("X++"))
		{
			S3210="0001";
		}
		if(Operande.trim().equals("-X"))
		{
			S3210="0010";
		}
		if(Operande.trim().equals("--X"))
		{
			S3210="0011";
		}
		System.out.println(S7+S65+S4+S3210);
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,new Nombre(S7+S65+S4+S3210).Base1ToBase2(2, 16));
		PC=new Direct().IncrHexaVal(PC);
		return PC;
		
	}

	public String Coder_LDS(String PC,ROM romFrame,String Operande)
	{
		System.out.println(PC);
		System.out.println(Operande);
		romFrame.updateValueByKey(PC,"10");
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,"EE");
		PC=new Direct().IncrHexaVal(PC);
		String S7="0";
		String S4="0";
		String S65="00";
		String S3210="0000";
		String avantVirgule=Operande.split(",")[0];
		char apresVirgule=Operande.split(",")[1].charAt(0);
		Operande=Operande.replace(',', ' ');
		if(avantVirgule.isEmpty())
		{
			S7="1";
		}
		else
		{
			
			S7="0";
			if((Double.parseDouble(avantVirgule)<0))
			{
				S4="1";
			}
			else
			{
				S4="0";
			}
		
		}
		if(apresVirgule=='X')
		{
			S65="00";
		}
		else if (apresVirgule=='Y')
		{
			S65="01";
		}
		else if (apresVirgule=='U')
		{
			S65="01";
		}
		else if (apresVirgule=='S')
		{
			S65="11";
		}
		if(Operande.trim().equals("X") ||Operande.trim().equals("Y")||Operande.trim().equals("S")||Operande.trim().equals("U"))
		{
			S3210="0100";
		}
		if(Operande.trim().equals("X+"))
		{
			S3210="0000";
		}
		if(Operande.trim().equals("X++"))
		{
			S3210="0001";
		}
		if(Operande.trim().equals("-X"))
		{
			S3210="0010";
		}
		if(Operande.trim().equals("--X"))
		{
			S3210="0011";
		}
		System.out.println(S7+S65+S4+S3210);
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,new Nombre(S7+S65+S4+S3210).Base1ToBase2(2, 16));
		PC=new Direct().IncrHexaVal(PC);
		return PC;
		
	}
	
	public String Coder_LDU(String PC,ROM romFrame,String Operande)
	{
		System.out.println(PC);
		System.out.println(Operande);
		romFrame.updateValueByKey(PC,"DE");
		String S7="0";
		String S4="0";
		String S65="00";
		String S3210="0000";
		String avantVirgule=Operande.split(",")[0];
		char apresVirgule=Operande.split(",")[1].charAt(0);
		Operande=Operande.replace(',', ' ');
		if(avantVirgule.isEmpty())
		{
			S7="1";
		}
		else
		{
			
			S7="0";
			if((Double.parseDouble(avantVirgule)<0))
			{
				S4="1";
			}
			else
			{
				S4="0";
			}
		
		}
		if(apresVirgule=='X')
		{
			S65="00";
		}
		else if (apresVirgule=='Y')
		{
			S65="01";
		}
		else if (apresVirgule=='U')
		{
			S65="01";
		}
		else if (apresVirgule=='S')
		{
			S65="11";
		}
		if(Operande.trim().equals("X") ||Operande.trim().equals("Y")||Operande.trim().equals("S")||Operande.trim().equals("U"))
		{
			S3210="0100";
		}
		if(Operande.trim().equals("X+"))
		{
			S3210="0000";
		}
		if(Operande.trim().equals("X++"))
		{
			S3210="0001";
		}
		if(Operande.trim().equals("-X"))
		{
			S3210="0010";
		}
		if(Operande.trim().equals("--X"))
		{
			S3210="0011";
		}
		System.out.println(S7+S65+S4+S3210);
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,new Nombre(S7+S65+S4+S3210).Base1ToBase2(2, 16));
		PC=new Direct().IncrHexaVal(PC);
		return PC;
		
	}

	
	public String Coder_LDX(String PC,ROM romFrame,String Operande)
	{
		System.out.println(PC);
		System.out.println(Operande);
		romFrame.updateValueByKey(PC,"AE");
		String S7="0";
		String S4="0";
		String S65="00";
		String S3210="0000";
		String avantVirgule=Operande.split(",")[0];
		char apresVirgule=Operande.split(",")[1].charAt(0);
		Operande=Operande.replace(',', ' ');
		if(avantVirgule.isEmpty())
		{
			S7="1";
		}
		else
		{
			
			S7="0";
			if((Double.parseDouble(avantVirgule)<0))
			{
				S4="1";
			}
			else
			{
				S4="0";
			}
		
		}
		if(apresVirgule=='X')
		{
			S65="00";
		}
		else if (apresVirgule=='Y')
		{
			S65="01";
		}
		else if (apresVirgule=='U')
		{
			S65="01";
		}
		else if (apresVirgule=='S')
		{
			S65="11";
		}
		if(Operande.trim().equals("X") ||Operande.trim().equals("Y")||Operande.trim().equals("S")||Operande.trim().equals("U"))
		{
			S3210="0100";
		}
		if(Operande.trim().equals("X+"))
		{
			S3210="0000";
		}
		if(Operande.trim().equals("X++"))
		{
			S3210="0001";
		}
		if(Operande.trim().equals("-X"))
		{
			S3210="0010";
		}
		if(Operande.trim().equals("--X"))
		{
			S3210="0011";
		}
		System.out.println(S7+S65+S4+S3210);
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,new Nombre(S7+S65+S4+S3210).Base1ToBase2(2, 16));
		PC=new Direct().IncrHexaVal(PC);
		return PC;
		
	}

	public String Coder_LDY(String PC,ROM romFrame,String Operande)
	{
		System.out.println(PC);
		System.out.println(Operande);
		romFrame.updateValueByKey(PC,"10");
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,"9E");
		String S7="0";
		String S4="0";
		String S65="00";
		String S3210="0000";
		String avantVirgule=Operande.split(",")[0];
		char apresVirgule=Operande.split(",")[1].charAt(0);
		Operande=Operande.replace(',', ' ');
		if(avantVirgule.isEmpty())
		{
			S7="1";
		}
		else
		{
			
			S7="0";
			if((Double.parseDouble(avantVirgule)<0))
			{
				S4="1";
			}
			else
			{
				S4="0";
			}
		
		}
		if(apresVirgule=='X')
		{
			S65="00";
		}
		else if (apresVirgule=='Y')
		{
			S65="01";
		}
		else if (apresVirgule=='U')
		{
			S65="01";
		}
		else if (apresVirgule=='S')
		{
			S65="11";
		}
		if(Operande.trim().equals("X") ||Operande.trim().equals("Y")||Operande.trim().equals("S")||Operande.trim().equals("U"))
		{
			S3210="0100";
		}
		if(Operande.trim().equals("X+"))
		{
			S3210="0000";
		}
		if(Operande.trim().equals("X++"))
		{
			S3210="0001";
		}
		if(Operande.trim().equals("-X"))
		{
			S3210="0010";
		}
		if(Operande.trim().equals("--X"))
		{
			S3210="0011";
		}
		System.out.println(S7+S65+S4+S3210);
		PC=new Direct().IncrHexaVal(PC);
		romFrame.updateValueByKey(PC,new Nombre(S7+S65+S4+S3210).Base1ToBase2(2, 16));
		PC=new Direct().IncrHexaVal(PC);
		return PC;
		
	}

	
	
}
