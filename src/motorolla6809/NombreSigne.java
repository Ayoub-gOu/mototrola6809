package motorolla6809;

public class NombreSigne {
   
	private String N;
    private int B;
    
    public NombreSigne(String N,int B)
    {
   this.setB(B);
   this.setN(N);
    }
    public String abs()
    {
    	String M=null;
		if(N.contains("-"))
		{
		M=N.substring(1);
		}
		else
		{M=N;}
		return M;
    }
   
    public String VS()
    {
    	Nombre X=new Nombre(this.abs());
		long S=Integer.parseInt(X.Base1ToBase2(B,2));
		String A=S+"";
		String vs;
		StringBuilder BIN=new StringBuilder(A);
	    while (BIN.length() < 8) {
	        BIN.insert(0, '0'); 
	    						}
	    if(N.contains("-"))
		{
    		
    		vs="1"+BIN.toString();
    	}    	
    	else
    	{
    		vs="0"+BIN.toString();
    	}
    	
    	return vs;
    	
    }
    public String CA1()
    {
    	Nombre X=new Nombre(Math.abs(Integer.parseInt(new Nombre(this.abs()).Base1ToBase2(B, 10)))+"");
    	long S=Integer.parseInt(X.Base1ToBase2(10,2));
		String A=S+"";
		StringBuilder BIN=new StringBuilder(A);
	    while (BIN.length() < 8) {
	        BIN.insert(0, '0'); 
	    						}
		if(!N.contains("-"))
    	{
    		return BIN.toString();
    	}
    	else
    	{
    		for(int i=0;i<BIN.length();i++)
    		{
    			if(BIN.charAt(i)=='0')
    			{
    				BIN.setCharAt(i, '1');
    			}
    			else if(BIN.charAt(i)=='1')
    				
    			{
    				BIN.setCharAt(i, '0');
    			}
    		}
    		
    	}
    	
    	return BIN.toString();
    	
    }
    public String CA2()
    {
    	Nombre X=new Nombre(Math.abs(Integer.parseInt(new Nombre(this.abs()).Base1ToBase2(B, 10)))+"");
    	long S=Integer.parseInt(X.Base1ToBase2(10,2));
		String A=S+"";
		StringBuilder BIN=new StringBuilder(A);
	    while (BIN.length() < 8) {
	        BIN.insert(0, '0'); 
	    						}
		if(!N.contains("-"))
    	{
    		return BIN.toString();
    	}
    	else
    	{		
    	
		for(int i=BIN.length()-1;i>=0;i--)
		{
			if(BIN.charAt(i)=='1')
			{
				for(int j=i-1;j>=0;j--)
				{
					if(BIN.charAt(j)=='1')
					BIN.setCharAt(j, '0');
					else if(BIN.charAt(j)=='0')
					BIN.setCharAt(j, '1');	
				}
				break;
			}
			else if(BIN.charAt(i)=='0')
			{
				BIN.setCharAt(i, '0');	
			}
			
		}
    	}
    	
    	return BIN.toString();
    	
    }

	public String getN() {
		return N;
	}

	public void setN(String n) {
		N = n;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}
	
	
	
	
}
