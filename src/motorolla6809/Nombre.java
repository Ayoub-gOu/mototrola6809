package motorolla6809;

public class Nombre {
    private String N;
  
public Nombre( String N)
    {
    	this.N=N;
    }
     
public String Base1ToDec(int base1)  
{
	 if (N == null || N.isEmpty()) { 
	        return "0"; 
	    }
	int S=0;
	StringBuilder C=new StringBuilder(N);
	int l;
	for(int i=0;i<C.length();i++)
	{
		l=C.charAt(i)-'0';
		if(C.charAt(i)>='A')
		{
			l=10+(C.charAt(i)-'A');
		}
		else
		{
			l=C.charAt(i)-'0';
		}
		S+=l*Math.pow(base1,C.length()-(i+1));
	}
	String R=S+"";
	return R;
	
}
public String DecToBase2(int base2)
	{
  	int X=Integer.parseInt(N);
  	if(X==0) {
  		return "0";
  		}
	char S='A';
	String Str="";
	while(X!=0)
	{
		S= (char) ((X%base2) + '0'); 
		if(X%base2>=10)
		{
			int k=X%base2-10;
			S=(char) ('A'+k);
		}
    	
	Str+=S;
	X/=base2;
	}
StringBuilder Strr=new StringBuilder(Str);
return (Strr.reverse().toString());

}
    


	
	public void setNombre(String N)
	{
		this.N=N;
	}
	public String getNombre()
	{
		return N;
	}
	
public String Base1ToBase2(int base1,int base2)
  {
	 
	String A=this.Base1ToDec(base1);
	this.setNombre(A);
	String S=this.DecToBase2(base2);
	
	return S;
  }
public int NombreChiffres()
{
int X=0,i=0;
while(X!=0)
{
i++;
X/=10;
}
return i;
}
}
