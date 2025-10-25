package motorolla6809;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import convertirNombres.Nombre;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ROM extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Object[][] data = new Object[256][2];
    public Object[][] getData() {
		return data;
	}
	public void setData(Object[][] data) {
		this.data = data;
	}
    private String[] columnNames = {"Clé", "Valeur"};
    private JTable table;
    public ROM() {
        setTitle("ROM");
        setSize(150, 300);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB));
        setResizable(false);
        int k=0;
        for (int i = 64512; i <= 64512+255; i++) {
            
        	String N = i + "";
            
            String hexValue = new Nombre(N).Base1ToBase2(10, 16);  
            data[k][0] = String.format("%4s", hexValue).replace(' ', '0'); 
            
            data[k][1] = "00";
            k++;
        }
        

        DefaultTableModel model = new DefaultTableModel(data, columnNames) ;

      table = new JTable(model);
        table.setTableHeader(null);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }
    public void reset() {
       
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            int rowCount = model.getRowCount();

            for (int i = 0; i < rowCount; i++) {
                model.setValueAt("00", i, 1); 
                data[i][1] = "00";
            model.fireTableDataChanged();
        } }


    public void updateValueByKey(String key, String newValue) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();
        key = key.trim().toUpperCase();  
        for (int i = 0; i < rowCount; i++) {
            String currentKey = (String) model.getValueAt(i, 0);
            currentKey = currentKey.trim().toUpperCase(); 

            if (currentKey.equals(key)) {
                if (isValidHexValue(newValue)) {
                    model.setValueAt(newValue.toUpperCase(), i, 1);
                    data[i][1] = newValue.toUpperCase();
                    break; 
                } else {
                    JOptionPane.showMessageDialog(
                        this,
                        "Erreur : VERIFIEZ VOTRE CODE.",
                        "Valeur invalide",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                return; 
            }
        }

    }



    public JTable getTable() {
		return table;
	}
	public void setTable(JTable table) {
		this.table = table;
	}
	public String getValueByKey(String key) {
        for (Object[] row : data) {
            if (row[0].equals(key)) {
                return (String) row[1]; 
            }
        }
        return null; 
    }
    public void setValueByKey(String key, String value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i][0].equals(key)) {
                data[i][1] = value;
                break;
            }
        }
    }
    private boolean isValidHexValue(String value) {
        return value.matches("^[0-9A-Fa-f]{2}$");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ROM frame = new ROM();
            frame.setVisible(true);
        });
    }
}
