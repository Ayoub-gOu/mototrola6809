package motorolla6809;
import com.formdev.flatlaf.*;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
public class MOTO6809 {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException{
        
    
    	String PC="FC00";
    	String pointerCod=PC;
    	String DP="00";
    	String RI=null;
    	String A="00";
    	String B="00";
    	String X="0000";
    	String S="0000";
    	String Y="0000";
    	String U="0000";
    	String E="0",F="0",H="0",I="0",N="0",Z="0",V="0",C="0";
            try {
				UIManager.setLookAndFeel(new FlatDarkLaf());
			} catch (UnsupportedLookAndFeelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
          	ROM romFrame = new ROM();
          	RAM ramFrame = new RAM();
          	EditeurText editeur=new EditeurText(romFrame,pointerCod);
           new PublicInterface(editeur, ramFrame, romFrame, PC, A, B, X, Y, DP, S, U, E, F, H, I, N, Z, V, C,RI, pointerCod).setVisible(true);

    }
}