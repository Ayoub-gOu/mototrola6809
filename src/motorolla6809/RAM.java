package motorolla6809;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import convertirNombres.Nombre;

public class RAM extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Object[][] data =new Object[1024][2];
    private String[] columnNames = {"Clé", "Valeur"};
    private JTable table;
    public RAM() {
        setTitle("RAM");
        setSize(150, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB));
        setResizable(false);
        table = new JTable(new DefaultTableModel(data, columnNames));
        int k=0;
        for (int i = 0; i <= 1023; i++) {
        	String N = i + "";
            String hexValue = new Nombre(N).Base1ToBase2(10, 16);
            data[k][0] = String.format("%4s", hexValue).replace(' ', '0');
            data[k][1] = "00";
            k++;
            
        }
        DefaultTableModel model = new DefaultTableModel(data, columnNames) ;
    
        table = new JTable(model);
        table.setTableHeader(null);
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.rowAtPoint(e.getPoint());
                int column = table.columnAtPoint(e.getPoint());
                if (row >= 0 && column == 1) {
                    String key = (String) model.getValueAt(row, 0);
                    Object currentValue = model.getValueAt(row, column);

                    String newValue = JOptionPane.showInputDialog(
                        RAM.this,
                        "Changer la valeur pour la clé " + key + ":",
                        currentValue
                    );

                    if (newValue != null) {
                        if (isValidHexValue(newValue)) {
                            model.setValueAt(newValue.toUpperCase(), row, column);
                            data[row][1] = newValue.toUpperCase();  

                        } else {
                            java.awt.Toolkit.getDefaultToolkit().beep();
                            JOptionPane.showMessageDialog(
                                RAM.this,
                                "Erreur : erreur de verification d'etendue ",
                                "Valeur invalide",
                                JOptionPane.ERROR_MESSAGE
                            );
                        }
                    }
                }
            }
        });
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }
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
                        "Erreur : La valeur doit contenir exactement 2 caractères (1-9 ou A-F).",
                        "Valeur invalide",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                return; 
            }
        }}

    private boolean isValidHexValue(String value) {
        return value.matches("^[0-9A-Fa-f]{2}$");
    }
    public String getValueByKey(String key) {
        for (Object[] row : data) {
            if (row[0].equals(key)) {
                return (String) row[1]; 
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RAM frame = new RAM();
            frame.setVisible(true);
        });
    }
}
