package motorolla6809;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

import javax.swing.*;

public class EditeurText extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private boolean isModified = false; 
    public EditeurText(ROM romFrame,String pointerCod) {
        initComponents();
        setupWindowListener();
        this.romFrame=romFrame;
        this.pointerCod=pointerCod;
    
    setIconImage(new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB));
    this.setLocationRelativeTo(null);
    
    
    }
    private void setupWindowListener() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                handleExit();
            }
        });

        jTextArea1.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                isModified = true;
            }

            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                isModified = true;
            }

            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                isModified = true;
            }
        });
    }

    private void handleExit() {
        if (isModified) {
            int choice = JOptionPane.showConfirmDialog(
                    this,
                    "Vous avez des modifications non enregistrées. Voulez-vous les sauvegarder ?",
                    "Quitter",
                    JOptionPane.YES_NO_CANCEL_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {
                saveAction(null);
                this.setVisible(false);
            } else if (choice == JOptionPane.NO_OPTION) {
                this.setVisible(false);
            }
        } else {
            this.setVisible(false);
        }
    }

    private void initComponents() {
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE); 
        setTitle("EditeurText Motorolla6809");
        setResizable(false);

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleExit(); 
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAction(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addContainerGap())
                        .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(jButton1))
                                .addContainerGap())
        );

        pack();
    }

    public void saveAction(ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Enregistrer sous");
        int userChoice = fileChooser.showSaveDialog(null);

        if (userChoice == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            if (!file.getName().endsWith(".txt")) {
                file = new File(file.getAbsolutePath() + ".txt");
            }

            String textToSave = jTextArea1.getText().toUpperCase();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(textToSave);
                JOptionPane.showMessageDialog(this, "Fichier enregistré avec succès !", "Succès", JOptionPane.INFORMATION_MESSAGE);
                isModified = false;
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Erreur lors de l'enregistrement du fichier.", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public void OpenAction(ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Ouvrir");
        int userChoice = fileChooser.showOpenDialog(null);

        if (userChoice == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

             try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                StringBuilder content = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                jTextArea1.setText(content.toString());
                this.setVisible(true);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erreur lors de la lecture du fichier : " + e.getMessage(), 
                                              "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
}
    public HashMap assembler(HashMap instructions) throws SecurityException, IllegalAccessException, InvocationTargetException
    {
    	if (isModified)
   	 {romFrame.reset();
   	 pointerCod="FC00";}
    	int i,j,k=0;
    	String text = jTextArea1.getText().toUpperCase();
    	
    	String line;
    	pointeurs=new HashMap<>();
    	String[] lines = text.split("\n");
    	if(!lines[lines.length-1].equals("END"))
    	{
    		JOptionPane.showMessageDialog(
                    null,
                    "Erreur2 : vous programme manque a l pseudo-Instruction 'END'",
                    "Valeur invalide",
                    JOptionPane.ERROR_MESSAGE
                );
    	}
    	else
    	{
    	line = lines[k];
    	 while (!line.equals("END"))
    	 {
    		 String modeOp;
    		 String Operande;
        	 instructions.put(pointerCod,line);
    		 for(i=0;i<line.length() && line.charAt(i)!=' ';i++)
            	 {}
            	 String codeOp=line.substring(0, i).trim();
            	 if(codeOp.equals("EXG") || codeOp.equals("TFR"))
            	 {
            		 for(j=i;j<line.length() && line.charAt(j)!='A'&& line.charAt(j)!='B'&& line.charAt(j)!='D'&& line.charAt(j)!='X'&& line.charAt(j)!='Y'
            				 && line.charAt(j)!='U'&& line.charAt(j)!='S';j++)
                	 {}
            		 modeOp=line.substring(i, j).trim();
	            	 Operande=line.substring(j, line.length()).trim(); 
            	 }
            	 else
            	 {for(j=i;j<line.length() && line.charAt(j)!='$'&& line.charAt(j)!='X'&& line.charAt(j)!='Y'&& line.charAt(j)!='U'&& line.charAt(j)!='S';j++)
            	 {}
	            	 modeOp=line.substring(i, j).trim();
	            	 
	            	 Operande=line.substring(j, line.length()).trim();
	            	 Operande=Operande.replace("$", "");}
            	 if(modeOp.equals("<"))
            	{
	            	 String Met="Coder_"+codeOp;
	            	 Method method = null;
					try {
						method = Direct.class.getMethod(Met, String.class, ROM.class, String.class);
					} catch (NoSuchMethodException | SecurityException e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(
		                         null,
		                         "Erreur1 : Votre programme comporte des erreurs",
		                         "Valeur invalide",
		                         JOptionPane.ERROR_MESSAGE
		                     );
					}
	         		 pointerCod=(String)method.invoke(new Direct(), pointerCod,romFrame, Operande); 
	         		 pointeurs.put(k,pointerCod);
         		}
            	 if(modeOp.equals(">"))
             	{
	             	String Met="Coder_"+codeOp;
	             	Method method = null;
					try {
						method = Etendu.class.getMethod(Met, String.class, ROM.class, String.class);
					} catch (NoSuchMethodException | SecurityException e) {
						JOptionPane.showMessageDialog(
		                         null,
		                         "Erreur2 : Votre programme comporte des erreurs",
		                         "Valeur invalide",
		                         JOptionPane.ERROR_MESSAGE
		                     );
					}
	        		pointerCod=(String)method.invoke(new Etendu(), pointerCod,romFrame, Operande);
	         		pointeurs.put(k,pointerCod);
	               	System.out.println(pointeurs.get(k));


          		}
            	 if(modeOp.isEmpty())
              	{ 		
	              	String Met="Coder_"+codeOp;
	              	Method method = null;
					try {
						method = Inherent.class.getMethod(Met, String.class, ROM.class, String.class);
					} catch (NoSuchMethodException | SecurityException e) {
						JOptionPane.showMessageDialog(
		                         null,
		                         "Erreur3 : Votre programme comporte des erreurs",
		                         "Valeur invalide",
		                         JOptionPane.ERROR_MESSAGE
		                     );
					}
	              	pointerCod=(String)method.invoke(new Inherent(), pointerCod,romFrame, Operande);
	         		pointeurs.put(k,pointerCod);
	               	System.out.println(pointeurs.get(k));


           		}
             	 if(modeOp.equals(","))
               	{ 		
 	              	String Met="Coder_"+codeOp;
 	              	Method method = null;
 					try {
 						method = Indexe.class.getMethod(Met, String.class, ROM.class, String.class);
 					} catch (NoSuchMethodException | SecurityException e) {
 						JOptionPane.showMessageDialog(
 		                         null,
 		                         "Erreur4 : Votre programme comporte des erreurs",
 		                         "Valeur invalide",
 		                         JOptionPane.ERROR_MESSAGE
 		                     );
 					}
 	              	pointerCod=(String)method.invoke(new Indexe(), pointerCod,romFrame, line.substring(i, line.length()).trim());
 	         		pointeurs.put(k,pointerCod);
            		}
             	 
            	 if(modeOp.equals("#"))
               	{
               	String Met="Coder_"+codeOp;
               	Method method = null;
				try {
					method = Immediat.class.getMethod(Met, String.class, ROM.class, String.class);
				} catch (NoSuchMethodException | SecurityException e) {
					JOptionPane.showMessageDialog(
	                         null,
	                         "Erreur5 : Votre programme comporte des erreurs",
	                         "Valeur invalide",
	                         JOptionPane.ERROR_MESSAGE
	                     );
				}
               	pointerCod=(String)method.invoke(new Immediat(), pointerCod,romFrame, Operande);
               	pointeurs.put(k,pointerCod);
               	System.out.println(pointeurs.get(k));

            		}
            	 if(!modeOp.equals("#") && !modeOp.equals(">") && !modeOp.equals("<") && !modeOp.isEmpty() && !modeOp.equals(","))
         		{JOptionPane.showMessageDialog(
                         null,
                         "Erreur6 : Votre programme comporte des erreurs",
                         "Valeur invalide",
                         JOptionPane.ERROR_MESSAGE
                     );}
            	 k++;
            	 line=lines[k];
             }}
    	 instructions.put(pointerCod,"END");
    	 return pointeurs;
    }

  public javax.swing.JTextArea getjTextArea1() {
		return jTextArea1;
	}

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private ROM romFrame;
    private String pointerCod;
    private HashMap<Integer,String> pointeurs;

}
