package motorolla6809;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import  javax.swing.*;


public class PublicInterface extends JFrame {

	private static final long serialVersionUID = -8586722590531414012L;
	
    public PublicInterface(EditeurText editeurText,RAM sharedRam,ROM sharedRom,String PC,String A,String B,String X,String Y,String DP,String S,String U,
    		String E, String F, String H, String I, String N, String Z, String V, String C,String RI,String pointerCod) {
        this.romFrame = sharedRom;
        this.ramFrame = sharedRam;
        this.PC=PC;
        this.A=A;
        this.B=B;
        this.X=X;
        this.Y=Y;
        this.S=S;
        this.U=U;
        this.DP=DP;
        this.I=I;
        this.E=E;
        this.H=H;
        this.N=N;
        this.F=F;
        this.Z=Z;
        this.V=V;
        this.C=C;
        this.editeurText=editeurText;
      
    	initComponents();
    }
                        
    private void initComponents() {

        jColorChooser1 = new  JColorChooser();
        jLabel1 = new JLabel();
        REG_A = new  JTextField();
        REG_B = new  JTextField();
        REG_PC = new  JTextField();
        REG_RI = new  JTextField();
        POINTEUR_U = new  JTextField();
        POINTEUR_S = new  JTextField();
        REG_CCR = new  JTextField();
        REG_DP = new  JTextField();
        REG_Y = new  JTextField();
        REG_X = new  JTextField();
        jLabel3 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jPanel1 = new  JPanel();
        jLabel2 = new JLabel();
        jMenuBar1 = new  JMenuBar();
        jMenu1 = new JMenu();
        NouveauItem = new  JMenuItem();
        OuvrirItem = new  JMenuItem();
        EnregistrerItem = new  JMenuItem();
        QuitterItem = new  JMenuItem();
        jMenu2 = new JMenu();
        stepbystepItem = new  JMenuItem();
        ExecuteItem = new  JMenuItem();
        resetItem = new  JMenuItem();
        jMenu3 = new JMenu();
        RAMchechBoxMenu = new JCheckBoxMenuItem();
        ROMchechBoxMenu = new JCheckBoxMenuItem();
        ProgrammechechBoxMenu = new JCheckBoxMenuItem();
        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
	    this.setIconImage(new ImageIcon("2704037.png").getImage());
        setSize(320,450);
        setResizable(false);
        setUndecorated(false);
        ExecuteItem.setAccelerator( KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ExecuteItem.setText("en une fois");
        ExecuteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	ExecuteItemActionPerformed(evt);
       }});
        REG_A.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        REG_A.setForeground(new java.awt.Color(0, 153, 255));
        REG_A.setText(A);
        REG_A.setPreferredSize(new java.awt.Dimension(54, 38));
        REG_A.setEditable(false);
        
        REG_B.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        REG_B.setForeground(new java.awt.Color(0, 153, 255));
        REG_B.setText(B);
        REG_B.setPreferredSize(new java.awt.Dimension(54, 31));
        REG_B.setEditable(false);

        REG_PC.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        REG_PC.setForeground(new java.awt.Color(0, 153, 255));
        REG_PC.setText(PC);
        REG_PC.setPreferredSize(new java.awt.Dimension(90, 38));
        REG_PC.setEditable(false);

        REG_RI.setFont(new java.awt.Font("Arial black", 0, 20)); // NOI18N
        REG_RI.setPreferredSize(new java.awt.Dimension(64, 38));
        REG_RI.setForeground(new java.awt.Color(0, 120, 215));
        REG_RI.setEditable(false);
        //REG_RI.setText(instructions.get(PC));
        POINTEUR_U.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        POINTEUR_U.setForeground(new java.awt.Color(0, 153, 255));
        POINTEUR_U.setText(U);
        POINTEUR_U.setPreferredSize(new java.awt.Dimension(90, 38));
        POINTEUR_U.setEditable(false);

        POINTEUR_S.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        POINTEUR_S.setForeground(new java.awt.Color(0, 153, 255));
        POINTEUR_S.setText(S);
        POINTEUR_S.setMinimumSize(new java.awt.Dimension(64, 38));
        POINTEUR_S.setPreferredSize(new java.awt.Dimension(90, 38));
        POINTEUR_S.setEditable(false);

        REG_CCR.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        REG_CCR.setForeground(new java.awt.Color(0, 153, 255));
        REG_CCR.setText(E+F+H+I+N+Z+V+C);
        REG_CCR.setEditable(false);

        REG_DP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        REG_DP.setForeground(new java.awt.Color(0, 153, 255));
        REG_DP.setText(DP);
        REG_DP.setPreferredSize(new java.awt.Dimension(54, 38));
        REG_DP.setEditable(false);
        
        REG_Y.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        REG_Y.setForeground(new java.awt.Color(0, 153, 255));
        REG_Y.setText(Y);
        REG_Y.setPreferredSize(new java.awt.Dimension(90, 38));
        REG_Y.setEditable(false);
        
        REG_X.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        REG_X.setForeground(new java.awt.Color(0, 153, 255));
        REG_X.setText(X);
        REG_X.setEditable(false);
        
        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("PC");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("S");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setText("U");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("A");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setText("B");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("DP");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("E F H I N Z V C");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setText("Y");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel12.setText("X");

        jPanel1.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new  ImageIcon("UAL__4_-removebg-preview.png"));
        jLabel2.setText("");
        jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(200, 200, 200));
        
        jMenu1.setText("File");
        
        NouveauItem.setAccelerator( KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        NouveauItem.setText("Nouveau");
        NouveauItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	editeurText.setVisible(true);
            }
        });
        jMenu1.add(NouveauItem);

        OuvrirItem.setAccelerator( KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        OuvrirItem.setText("Ouvrir");
        OuvrirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editeurText.OpenAction(evt);
            }
        });
        jMenu1.add(OuvrirItem);

        EnregistrerItem.setAccelerator( KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        EnregistrerItem.setText("Enregistrer");
        EnregistrerItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editeurText.saveAction(evt);
            }
        });
        jMenu1.add(EnregistrerItem);

        QuitterItem.setAccelerator( KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        QuitterItem.setText("Assembler");
        QuitterItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
         if(editeurText.getjTextArea1().getText().isEmpty())
         {
        	 JOptionPane.showMessageDialog(
                     null,
                     "Erreur : Saisisser tout d'abord un programme",
                     "Valeur invalide",
                     JOptionPane.ERROR_MESSAGE
                 ); 
        	 
         }	
         else {
            	   
        	  instructions=new HashMap<>();
        	  pointeurs=new HashMap<>();
			  try {
				pointeurs=editeurText.assembler(instructions);
			} catch (SecurityException | IllegalAccessException | InvocationTargetException e) {
				JOptionPane.showMessageDialog(
	                     null,
	                     "Erreur : verifiez votre programme",
	                     "Valeur invalide",
	                     JOptionPane.ERROR_MESSAGE
	                 ); 
	        	 
			}
			  REG_RI.setText(instructions.get("FC00"));
			
		}}
            }
        );
        
        jMenu1.add(QuitterItem);


        jMenuBar1.add(jMenu1);

        jMenu2.setText("Run");

        stepbystepItem.setAccelerator( KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        stepbystepItem.setText("Pas à Pas");
        stepbystepItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	 STEPBYSTEP(evt);
            	
            }} );
            	
  
        jMenu2.add(stepbystepItem);

       
        
        jMenu2.add(ExecuteItem);
        resetItem.setAccelerator( KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        resetItem.setText("Reset");
        resetItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	romFrame.reset(); 
            	Reste(evt);
            	romFrame.setVisible(true);
            }
        });
        jMenu2.add(resetItem);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Fenêtres");

        RAMchechBoxMenu.setSelected(false);
        RAMchechBoxMenu.setText("RAM");
        RAMchechBoxMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Vérifier l'état actuel de la fenêtre
                if (ramFrame.isVisible()) {
                    ramFrame.setVisible(false); // Masquer si déjà visible
                } else {
                    ramFrame.setVisible(true);  // Afficher sinon
                }
            }
        });//hada smito toggle behavior
        jMenu3.add(RAMchechBoxMenu);

        ROMchechBoxMenu.setSelected(false);
        ROMchechBoxMenu.setText("ROM");
        ROMchechBoxMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (romFrame.isVisible()) {
                    romFrame.setVisible(false); // Masquer si déjà visible
                } else {
                    romFrame.setVisible(true);  // Afficher sinon
                }
            }
        });//hada smito toggle behavior
        jMenu3.add(ROMchechBoxMenu);

        ProgrammechechBoxMenu.setSelected(false);
        ProgrammechechBoxMenu.setText("Programme");
        //jMenu3.add(ProgrammechechBoxMenu);
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

         GroupLayout layout = new  GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                            .addGroup( GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5,  GroupLayout.PREFERRED_SIZE, 20,  GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(POINTEUR_S,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup( GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8,  GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7,  GroupLayout.Alignment.TRAILING))
                                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.TRAILING)
                                    .addComponent(REG_A,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                                    .addComponent(REG_B,  GroupLayout.PREFERRED_SIZE, 52,  GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(REG_DP,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(REG_X,  GroupLayout.PREFERRED_SIZE, 90,  GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                                    .addGroup( GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(REG_Y,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup( GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(POINTEUR_U,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup( GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(REG_CCR,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel3)
                                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(REG_PC,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(REG_RI,  GroupLayout.PREFERRED_SIZE, 292,  GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup( GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                            .addGroup( GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(96, 96, 96))
                            .addComponent(jLabel10,  GroupLayout.Alignment.TRAILING,  GroupLayout.PREFERRED_SIZE, 95,  GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(REG_PC,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(REG_RI,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                            .addComponent(POINTEUR_S,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(POINTEUR_U,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                            .addComponent(REG_A,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(REG_B,  GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addGap(5, 5, 5))
                    .addComponent(jPanel1,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(REG_DP,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(REG_CCR,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12,  GroupLayout.Alignment.TRAILING,  GroupLayout.PREFERRED_SIZE, 38,  GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11,  GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(REG_Y,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup( GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(REG_X,  GroupLayout.PREFERRED_SIZE, 38,  GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        //this.pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
                                         

    private void STEPBYSTEP(java.awt.event.ActionEvent evt) {                                           
        Object[][] data = romFrame.getData();
        String p=PC;

    	for (Object[] row : data)
    	{
    		 if(romFrame.getValueByKey(PC).equals("A6") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("84")) 
        	 {
 			    	REG_RI.setText(instructions.get(PC));
    			    PC=new Direct().IncrHexaVal(PC);
        		    A=ramFrame.getValueByKey(X);
        			A=new Inherent().CompleterZeros(A, 2);
        			if(Long.parseLong(new Nombre(A).Base1ToBase2(16,10))==0) 
        			{Z="1";}
        			REG_A.setText(A);
        			PC=new Direct().IncrHexaVal(PC);
        			REG_PC.setText(PC);
        			Z=verifierSiNull(A);
         			N=verifierPoidsFort1OCTET(A);
         			REG_CCR.setText(E+F+H+I+N+Z+V+C);
        			REG_RI.setText(instructions.get(PC));
        			break;
        	}
    		 
    		 if(romFrame.getValueByKey(PC).equals("A6") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("80")) 
        	 {
 			    	REG_RI.setText(instructions.get(PC));
    			    PC=new Direct().IncrHexaVal(PC);
        		    A=ramFrame.getValueByKey(X);
        			A=new Inherent().CompleterZeros(A, 2);
        			if(Long.parseLong(new Nombre(A).Base1ToBase2(16,10))==0) 
        			{Z="1";}
        			REG_A.setText(A);
        			PC=new Direct().IncrHexaVal(PC);
        			REG_PC.setText(PC);
        			X=new Inherent().IncrHexaVal(X, 4);
        			REG_X.setText(X);
        			System.out.println(X);
        			Z=verifierSiNull(A);
         			N=verifierPoidsFort1OCTET(A);
         			REG_CCR.setText(E+F+H+I+N+Z+V+C);
        			REG_RI.setText(instructions.get(PC));
        			break;
        			
        	}
    		 
    		 if(romFrame.getValueByKey(PC).equals("1E") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("89")) 
        	 {
 			    //ECHANGE DES REGISTRES A ET B
    			 REG_RI.setText(instructions.get(PC));
  			     PC=new Direct().IncrHexaVal(PC);
    			 String x;
    			 x=REG_A.getText();
    			 A=REG_B.getText();
     			 A=new Inherent().CompleterZeros(A, 2);
    			 B=x;
     			 B=new Inherent().CompleterZeros(B, 2);
    			 REG_A.setText(A);
    			 REG_B.setText(B);
    			 PC=new Direct().IncrHexaVal(PC);
    			 REG_PC.setText(PC);
     			 REG_RI.setText(instructions.get(PC));
     			 break;
 
        	 }
    		
    		 if(romFrame.getValueByKey(PC).equals("AE") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("01")) 
        	 {
 			    //ECHANGE DES REGISTRES X ET D	
    			 break;
        	 }
    		 
    		 if(romFrame.getValueByKey(PC).equals("A6") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("81")) 
        	 {
    			REG_RI.setText(instructions.get(PC));
 			    PC=new Direct().IncrHexaVal(PC);
     		    A=ramFrame.getValueByKey(X);
     			A=new Inherent().CompleterZeros(A, 2);
     			if(Long.parseLong(new Nombre(A).Base1ToBase2(16,10))==0) 
     			{Z="1";}
     			REG_A.setText(A);
     			PC=new Direct().IncrHexaVal(PC);
     			REG_PC.setText(PC);
     			X=new Inherent().IncrHexaVal(X, 4);
     			X=new Inherent().IncrHexaVal(X, 4);
     			REG_X.setText(X);
     			System.out.println(X);
     			Z=verifierSiNull(A);
      			N=verifierPoidsFort1OCTET(A);
      			REG_CCR.setText(E+F+H+I+N+Z+V+C);
     			REG_RI.setText(instructions.get(PC));
        	    break;		
        	}
    		 
    		 if(romFrame.getValueByKey(PC).equals("A6") && romFrame.getValueByKey(PC).equals("82")) 
        	 {
    			REG_RI.setText(instructions.get(PC));
 			    PC=new Direct().IncrHexaVal(PC);
     		    A=ramFrame.getValueByKey(X);
     			A=new Inherent().CompleterZeros(A, 2);
     			if(Long.parseLong(new Nombre(A).Base1ToBase2(16,10))==0) 
     			{Z="1";}
     			REG_A.setText(A);
     			PC=new Direct().IncrHexaVal(PC);
     			REG_PC.setText(PC);
     			X=new Inherent().decrHexaVal(X, 4);
     			X=new Inherent().IncrHexaVal(X, 4);
     			REG_X.setText(X);
     			System.out.println(X);
     			Z=verifierSiNull(A);
      			N=verifierPoidsFort1OCTET(A);
      			REG_CCR.setText(E+F+H+I+N+Z+V+C);
     			REG_RI.setText(instructions.get(PC));
     			break;
        			
        	}
    		 if(romFrame.getValueByKey(PC).equals("A6") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("83")) 
        	 {
    			REG_RI.setText(instructions.get(PC));
 			    PC=new Direct().IncrHexaVal(PC);
     		    A=ramFrame.getValueByKey(X);
     			A=new Inherent().CompleterZeros(A, 2);
     			if(Long.parseLong(new Nombre(A).Base1ToBase2(16,10))==0) 
     			{Z="1";}
     			REG_A.setText(A);
     			PC=new Direct().IncrHexaVal(PC);
     			REG_PC.setText(PC);
     			X=new Inherent().decrHexaVal(X, 4);
     			X=new Inherent().IncrHexaVal(X, 4);
     			REG_X.setText(X);
     			System.out.println(X);
     			Z=verifierSiNull(A);
      			N=verifierPoidsFort1OCTET(A);
      			REG_CCR.setText(E+F+H+I+N+Z+V+C);
     			REG_RI.setText(instructions.get(PC));
     			break;
        			
        	}


    		
    	 if(romFrame.getValueByKey(PC).equals("86")) 
    	 {
    			REG_RI.setText(instructions.get(PC));
    		    PC=new Direct().IncrHexaVal(PC);
    		    A=romFrame.getValueByKey(PC);
    			A=new Inherent().CompleterZeros(A, 2);
    			if(Long.parseLong(new Nombre(A).Base1ToBase2(16,10))==0) 
    			{Z="1";}
    			REG_A.setText(A);
    			PC=new Direct().IncrHexaVal(PC);
    			REG_PC.setText(PC);
    			Z= verifierSiNull(A);
     			N=verifierPoidsFort1OCTET(A);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
    			break;
    	  }
         if(romFrame.getValueByKey(PC).equals("DB")) {
        	
        	REG_RI.setText(instructions.get(PC));
        	String adress;
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress =DP+romFrame.getValueByKey(PC); 
 			NB=NB+Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			B=NB+"";
 			PC=new Direct().IncrHexaVal(PC);
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			REG_PC.setText(PC);
 			Z= verifierSiNull(B);
 			N=verifierPoidsFort1OCTET(B);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 		}
 	 
 	 if(romFrame.getValueByKey(PC).equals("D3")) 
 	 { 
 			
 		    REG_RI.setText(instructions.get(PC));
 		    String adress;
 			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress =DP+romFrame.getValueByKey(PC); 
 			System.out.println("L'ADRESSE LIGHANHZID LA VALEUR DYALHA L A HYA "+adress);
 			NA=NA+Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			A=NA+"";
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);
 			System.out.println(A);
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			adress =new Direct().IncrHexaVal(adress); 
 			NB=NB+Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			B=NB+"";
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			System.out.println(B);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 		}
 	
 	 if(romFrame.getValueByKey(PC).equals("BB")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    String adress1_OCTET,adress2_OCTET,adress;
 			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 			NA=NA+Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			A=NA+"";
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			Z= verifierSiNull(B);
 			N=verifierPoidsFort1OCTET(B);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 		}
 	 if(romFrame.getValueByKey(PC).equals("FB")) 
 	 {
 		    REG_RI.setText(instructions.get(PC));
 		    String adress1_OCTET,adress2_OCTET,adress;
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 			NB=NB+Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			B=NB+"";
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			Z= verifierSiNull(B);
 			N=verifierPoidsFort1OCTET(B);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("F3")) 
 	 {
 		    REG_RI.setText(instructions.get(PC));
 		    String adress1_OCTET,adress2_OCTET,adress;
 			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 			NA=NA+Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			A=NA+"";
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);
 			NB=NB+Long.parseLong(new Nombre(ramFrame.getValueByKey(new Direct().IncrHexaVal(adress))).Base1ToBase2(16, 10));
 			B=NB+"";
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 
 	 if(romFrame.getValueByKey(PC).equals("3A")) 
 	 {
 		    REG_RI.setText(instructions.get(PC));
 		    Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			Long NX=Long.parseLong(new Nombre(X).Base1ToBase2(16, 10));
 			NX=NX+NB;
 			X=NX+"";
 			System.out.println(X);
 			X=new Nombre(X).Base1ToBase2(10, 16);
 			X=new Direct().CompleterZeros(X, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_X.setText(X);
 			if(new Nombre(X).Base1ToBase2(16, 2).charAt(0)=='1')
	    	{
	    		N="1";
	    	}
			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("43")) 
 	 {
		    	REG_RI.setText(instructions.get(PC));
 		    A=new NombreSigne("-"+A,16).CA1();
 		    A=new Nombre(A).Base1ToBase2(2, 16);
 			C="1";
 			A=new Inherent().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			if((Long.parseLong(new Nombre(A).Base1ToBase2(16,10))==0))
			{Z="1";}
 			if(new Nombre(A).Base1ToBase2(16, 2).charAt(0)=='1')
	    	{
	    		N="1";
	    	}
			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 		
 	  }
 	 if(romFrame.getValueByKey(PC).equals("53")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC)); 
 		 	B=new NombreSigne("-"+B,16).CA1();
 		    B=new Nombre(B).Base1ToBase2(2, 16);
 		    C="1";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			Z= verifierSiNull(B);
 			N=verifierPoidsFort1OCTET(B);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("4A")) 
 	 {
			   REG_RI.setText(instructions.get(PC));
			if(A.equals("00"))
			{	A="FF";}
			else
			{    A=new Inherent().decrHexaVal(A,2);
 		    PC=new Direct().IncrHexaVal(PC);
 		    REG_PC.setText(PC);
 		    REG_A.setText(A);}
			if((Long.parseLong(new Nombre(A).Base1ToBase2(16,10))==0))
			{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	}
 	 
 	 if(romFrame.getValueByKey(PC).equals("5A")) 
 	 {
     		REG_RI.setText(instructions.get(PC));
     		B=new Inherent().decrHexaVal(B,2);
     		PC=new Direct().IncrHexaVal(PC);
     		REG_PC.setText(PC);
     		REG_B.setText(B);
     		Z= verifierSiNull(A);
   			N=verifierPoidsFort1OCTET(A);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
  			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("4C")) 
 	 {
 		REG_RI.setText(instructions.get(PC));
 		 A=new Inherent().IncrHexaVal(A,2);
 		   PC=new Direct().IncrHexaVal(PC);
 		   REG_PC.setText(PC);
 		  if(A.equals("FF"))
 			{	A="00";}
 		   REG_A.setText(A);
 		   Z= verifierSiNull(A);
   			N=verifierPoidsFort1OCTET(A);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
  			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("5C")) 
 	 {
 		   B=new Inherent().IncrHexaVal(B,2);
 		   PC=new Direct().IncrHexaVal(PC);
 		   REG_PC.setText(PC);
 		   if(B.equals("FF"))
 			{	B="00";}
 			else
 		   REG_B.setText(B);
 		    Z= verifierSiNull(B);
			N=verifierPoidsFort1OCTET(B);
			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("50")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    B=new NombreSigne("-"+B,16).CA2();
 		    B=new Nombre(B).Base1ToBase2(2, 16);
 		    C="1";
 			V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			Z= verifierSiNull(B);
   			N=verifierPoidsFort1OCTET(B);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
  			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("40")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    A=new NombreSigne("-"+A,16).CA2();
 		    A=new Nombre(A).Base1ToBase2(2, 16);
 		    C="1";
 			V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			Z= verifierSiNull(A);
   			N=verifierPoidsFort1OCTET(A);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
  			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("96")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 			String adress =DP+romFrame.getValueByKey(PC); 
            A=ramFrame.getValueByKey(adress);
 			V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			Z= verifierSiNull(A);
   			N=verifierPoidsFort1OCTET(A);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
  			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("D6")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 			String adress =DP+romFrame.getValueByKey(PC); 
            B=ramFrame.getValueByKey(adress);
 			V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			Z= verifierSiNull(B);
   			N=verifierPoidsFort1OCTET(B);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
  			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("DC")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		 	PC=new Direct().IncrHexaVal(PC);
 			String adress =DP+romFrame.getValueByKey(PC); 
            A=ramFrame.getValueByKey(adress);
 			V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			adress=new Direct().IncrHexaVal(adress);
 			B=ramFrame.getValueByKey(adress);
 			V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 			
 	  }
 	if(romFrame.getValueByKey(PC).equals("9F")) 
	 {
		    PC=new Direct().IncrHexaVal(PC);
			String adress =DP+romFrame.getValueByKey(PC); 
			ramFrame.updateValueByKey(adress,X.substring(0,1));
	        ramFrame.updateValueByKey(new Direct().IncrHexaVal(adress),X.substring(2));
            V="0";
			X=new Inherent().CompleterZeros(X, 4);
			PC=new Direct().IncrHexaVal(PC);
			REG_PC.setText(PC);
			REG_X.setText(X);
			Z= verifierSiNull(X);
			N=verifierPoidsFort2OCTET(X);
			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
	  }
 	 if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("DE")) 
 	 {
		REG_RI.setText(instructions.get(PC));
 		PC=new Direct().IncrHexaVal(PC);
 		System.out.println(PC);
	 	REG_RI.setText(instructions.get(PC));
	    PC=new Direct().IncrHexaVal(PC);
	    System.out.println(PC);
		String adress =DP+romFrame.getValueByKey(PC); 
        S=ramFrame.getValueByKey(adress)+ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
        V="0";
		S=new Inherent().CompleterZeros(S, 4);
		PC=new Direct().IncrHexaVal(PC);
		System.out.println(PC);
		REG_PC.setText(PC);
		POINTEUR_S.setText(S);
		Z= verifierSiNull(S);
		N=verifierPoidsFort2OCTET(S);
		REG_CCR.setText(E+F+H+I+N+Z+V+C);
		REG_RI.setText(instructions.get(PC));
		break;
 	}
 	 if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("DF"))  
 		 {
 			 	REG_RI.setText(instructions.get(PC));
 			    PC=new Direct().IncrHexaVal(PC);
 			    System.out.println(PC);
 				String adress =DP+romFrame.getValueByKey(PC); 
 	            ramFrame.updateValueByKey(adress,S.substring(0,2));
 	            ramFrame.updateValueByKey(new Direct().IncrHexaVal(adress),S.substring(2));
 	            V="0";
 				S=new Inherent().CompleterZeros(S, 4);
 				PC=new Direct().IncrHexaVal(PC);
 				System.out.println(PC);
 				REG_PC.setText(PC);
 				POINTEUR_S.setText(S);
 				Z= verifierSiNull(S);
     			N=verifierPoidsFort2OCTET(S);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
    			break;
 				 
 		  }
 	if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(PC).equals("9E")) 
 		 {
 			    REG_RI.setText(instructions.get(PC));
 			    PC=new Direct().IncrHexaVal(PC);
 				String adress =DP+romFrame.getValueByKey(PC); 
 	            Y=ramFrame.getValueByKey(adress)+ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
 	            V="0";
 				Y=new Inherent().CompleterZeros(Y, 4);
 				PC=new Direct().IncrHexaVal(PC);
 				REG_PC.setText(PC);
 				REG_Y.setText(Y);
 				Z= verifierSiNull(Y);
     			N=verifierPoidsFort2OCTET(Y);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
    			break;
 		  }
 	if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(PC).equals("9F")) 
 		 {
 			    PC=new Direct().IncrHexaVal(PC);
 				String adress =DP+romFrame.getValueByKey(PC); 
 				ramFrame.updateValueByKey(adress,Y.substring(0,1));
 		        ramFrame.updateValueByKey(new Direct().IncrHexaVal(adress),Y.substring(2));
 	            V="0";
 				Y=new Inherent().CompleterZeros(Y, 4);
 				PC=new Direct().IncrHexaVal(PC);
 				REG_PC.setText(PC);
 				REG_Y.setText(Y);
 				Z= verifierSiNull(Y);
     			N=verifierPoidsFort2OCTET(Y);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
    			break;
 		  }
 	if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(PC).equals("FE")) 
 		 {
 			    String adress1_OCTET,adress2_OCTET,adress;
 			 	PC=new Direct().IncrHexaVal(PC);
 				adress1_OCTET=PC;
 				PC=new Direct().IncrHexaVal(PC);
 				adress2_OCTET=PC;
 				adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 	            S=ramFrame.getValueByKey(adress)+ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
 	            V="0";
 				S=new Inherent().CompleterZeros(S, 4);
 				PC=new Direct().IncrHexaVal(PC);
 				REG_PC.setText(PC);
 				POINTEUR_S.setText(S);
 				Z= verifierSiNull(S);
     			N=verifierPoidsFort2OCTET(S);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
    			break;
 		 }
 	if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(PC).equals("BE")) 
 		 {
 				String adress1_OCTET,adress2_OCTET,adress;
 			    PC=new Direct().IncrHexaVal(PC);
 			    adress1_OCTET=PC;
 				PC=new Direct().IncrHexaVal(PC);
 				adress2_OCTET=PC;
 				adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 	            Y=ramFrame.getValueByKey(adress)+ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
 	            V="0";
 				Y=new Inherent().CompleterZeros(Y, 4);
 				PC=new Direct().IncrHexaVal(PC);
 				REG_PC.setText(PC);
 				REG_Y.setText(Y);
 				Z= verifierSiNull(Y);
     			N=verifierPoidsFort2OCTET(Y);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
    			break;
 		  }
 	if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(PC).equals("FF")) 
 		 {
 				String adress1_OCTET,adress2_OCTET,adress;
 			 	PC=new Direct().IncrHexaVal(PC);
 				adress1_OCTET=PC;
 				PC=new Direct().IncrHexaVal(PC);
 				adress2_OCTET=PC;
 				adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 				ramFrame.updateValueByKey(adress,S.substring(0,2));
 		        ramFrame.updateValueByKey(new Direct().IncrHexaVal(adress),S.substring(2));
 	            V="0";
 				PC=new Direct().IncrHexaVal(PC);
 				REG_PC.setText(PC);
 				POINTEUR_S.setText(S);
 				Z= verifierSiNull(S);
     			N=verifierPoidsFort2OCTET(S);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
    			break;
 		  }
 	if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(PC).equals("BF")) 
 		 {
 				String adress1_OCTET,adress2_OCTET,adress;
 			    PC=new Direct().IncrHexaVal(PC);
 			    adress1_OCTET=PC;
 				PC=new Direct().IncrHexaVal(PC);
 				adress2_OCTET=PC;
 				adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 				ramFrame.updateValueByKey(adress,Y.substring(0,2));
 		        ramFrame.updateValueByKey(new Direct().IncrHexaVal(adress),Y.substring(2));
 	            V="0";
 				PC=new Direct().IncrHexaVal(PC);
 				REG_PC.setText(PC);
 				REG_Y.setText(Y);
 				Z= verifierSiNull(Y);
     			N=verifierPoidsFort2OCTET(Y);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
    			break;
 		  }
 	if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("CE")) 
 		 {
 			    PC=new Direct().IncrHexaVal(PC);
 	            V="0";
 				PC=new Direct().IncrHexaVal(PC);
 				String valeurOctet1=romFrame.getValueByKey(PC);
 				PC=new Direct().IncrHexaVal(PC);
 				String valeurOctet2=romFrame.getValueByKey(PC);
 			    S=valeurOctet1+valeurOctet2;
 		 		S=new Inherent().CompleterZeros(S, 4);
 				POINTEUR_S.setText(S);
 				PC=new Direct().IncrHexaVal(PC);
 				REG_PC.setText(PC);
 				Z= verifierSiNull(S);
     			N=verifierPoidsFort2OCTET(S);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
    			break;
 		  }
 	if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(PC).equals("8E")) 
 		 {
 			    PC=new Direct().IncrHexaVal(PC);
 			    Y=romFrame.getValueByKey(PC)+romFrame.getValueByKey(new Direct().IncrHexaVal(PC));
 	            V="0";
 				Y=new Inherent().CompleterZeros(Y, 4);
 				PC=new Direct().IncrHexaVal(PC);
 				PC=new Direct().IncrHexaVal(PC);
 				REG_PC.setText(PC);
 				REG_Y.setText(Y);
 				Z= verifierSiNull(Y);
     			N=verifierPoidsFort2OCTET(Y);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
    			break;
 		  }
 	  
    if(romFrame.getValueByKey(PC).equals("DE")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 			String adress =DP+romFrame.getValueByKey(PC); 
            U=ramFrame.getValueByKey(adress)+ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
            V="0";
 			U=new Inherent().CompleterZeros(U, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			POINTEUR_U.setText(U);
 			Z= verifierSiNull(U);
 			N=verifierPoidsFort2OCTET(U);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
		
 	  }
    if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(PC).equals("9E")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 			String adress =DP+romFrame.getValueByKey(PC); 
            X=ramFrame.getValueByKey(adress)+ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
            V="0";
 			X=new Inherent().CompleterZeros(X, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_X.setText(X);
 			Z= verifierSiNull(X);
 			N=verifierPoidsFort2OCTET(X);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 			
 	  }
 	 if(romFrame.getValueByKey(PC).equals("B6")) 
 	 {
 		 	String adress1_OCTET,adress2_OCTET,adress;
 			REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            A=ramFrame.getValueByKey(adress);
            V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			Z= verifierSiNull(A);
 			N=verifierPoidsFort1OCTET(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("F6")) 
 	 {
				REG_RI.setText(instructions.get(PC));
 		    String adress1_OCTET,adress2_OCTET,adress;
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            B=ramFrame.getValueByKey(adress);
            V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			Z= verifierSiNull(B);
   			N=verifierPoidsFort1OCTET(B);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
  			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("FC")) 
 	 {
 		 	String adress1_OCTET,adress2_OCTET,adress;
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            A=ramFrame.getValueByKey(adress);
            V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			B=ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
            V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("BE")) 
 	 {
 			String adress1_OCTET,adress2_OCTET,adress;
 			REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            X=ramFrame.getValueByKey(adress)+ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
            V="0";
 			X=new Inherent().CompleterZeros(X, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_X.setText(X);
 			Z= verifierSiNull(X);
   			N=verifierPoidsFort2OCTET(X);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
  			break;
 			
 	  }
 	 if(romFrame.getValueByKey(PC).equals("FE")) 
 	 {
 		 	String adress1_OCTET,adress2_OCTET,adress;
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            U=ramFrame.getValueByKey(adress)+ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
            V="0";
 			U=new Inherent().CompleterZeros(U, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			POINTEUR_U.setText(U);
 			Z= verifierSiNull(U);
 			N=verifierPoidsFort2OCTET(U);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("97")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 			String adress =DP+romFrame.getValueByKey(PC); 
            ramFrame.updateValueByKey(adress,A);
 			V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			Z= verifierSiNull(A);
 			N=verifierPoidsFort1OCTET(A);
			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("D7")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 			String adress =DP+romFrame.getValueByKey(PC); 
            ramFrame.updateValueByKey(adress,B);
 			V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			Z= verifierSiNull(B);
   			N=verifierPoidsFort1OCTET(B);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
  			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("DD")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 			String adress =DP+romFrame.getValueByKey(PC); 
            ramFrame.updateValueByKey(adress,A);
 			V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			adress=new Direct().IncrHexaVal(adress);
 			ramFrame.updateValueByKey(adress,B);
 			V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("90")) {
 			String adress;
 			REG_RI.setText(instructions.get(PC));
 			if(A.equals("00"))
   			{	A="FF";}
 			else {
 			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress =DP+romFrame.getValueByKey(PC); 
 			NA=NA-Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			A=NA+"";
 			PC=new Direct().IncrHexaVal(PC);
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);
 			REG_A.setText(A);}
 			Z=verifierSiNull(A);
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 		}
 	 if(romFrame.getValueByKey(PC).equals("D0")) {
 			String adress;
 			REG_RI.setText(instructions.get(PC));
 			if(B.equals("00"))
   			{	B="FF";}
 			else {
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress =DP+romFrame.getValueByKey(PC); 
 			NB=NB-Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			B=NB+"";
 			PC=new Direct().IncrHexaVal(PC);
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			REG_PC.setText(PC);         			
 			REG_B.setText(B);}
  			Z=verifierSiNull(B);
  			N=verifierPoidsFort1OCTET(B);
  			REG_PC.setText(PC);
  			REG_CCR.setText(E+F+H+I+N+Z+V+C);
 			REG_RI.setText(instructions.get(PC));
 			break;
 		}
 	 if(romFrame.getValueByKey(PC).equals("93")) 
 	 {
 			String adress;
 			String D;
 			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress =DP+romFrame.getValueByKey(PC); 
 			NA=NA-Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			A=NA+"";
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			adress =new Direct().IncrHexaVal(adress); 
 			System.out.println("adress suivant "+adress);
 			NB=NB-Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			B=NB+"";
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			REG_B.setText(B);
 			break;
 		}
 	 if(romFrame.getValueByKey(PC).equals("B7")) 
 	 {
 		 	String adress1_OCTET,adress2_OCTET,adress;
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            ramFrame.updateValueByKey(adress,A);
            V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			Z= verifierSiNull(A);
 			N=verifierPoidsFort1OCTET(A);
			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 			break;
		
 	  }
 	 if(romFrame.getValueByKey(PC).equals("F7")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    String adress1_OCTET,adress2_OCTET,adress;
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            ramFrame.updateValueByKey(adress,B);
            V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			Z= verifierSiNull(B);
   			N=verifierPoidsFort1OCTET(B);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
  			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("FD")) 
 	 {
 		 	String adress1_OCTET,adress2_OCTET,adress;
			REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            ramFrame.updateValueByKey(adress,A);
            V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			ramFrame.updateValueByKey(new Direct().IncrHexaVal(adress),B);
            V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("BF")) 
 	 {
 			String adress1_OCTET,adress2_OCTET,adress;
			REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            ramFrame.updateValueByKey(adress,X.substring(0,2));
            ramFrame.updateValueByKey(new Direct().IncrHexaVal(adress),X.substring(2));
            V="0";
 			X=new Inherent().CompleterZeros(X, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_X.setText(X);
				Z= verifierSiNull(X);
 			N=verifierPoidsFort2OCTET(X);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("FF")) 
 	 {
 		 	String adress1_OCTET,adress2_OCTET,adress;
			REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 			ramFrame.updateValueByKey(adress,U.substring(0,2));
 	        ramFrame.updateValueByKey(new Direct().IncrHexaVal(adress),U.substring(2));
            V="0";
 			U=new Inherent().CompleterZeros(U, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			POINTEUR_U.setText(U);
 			Z= verifierSiNull(U);
 			N=verifierPoidsFort2OCTET(U);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("B0")) 
 	 {
 			String adress1_OCTET,adress2_OCTET,adress;
 			REG_RI.setText(instructions.get(PC));
 			if(A.equals("00"))
   			{	A="FF";}
 			else {
 			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 			NA=NA-Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			A=NA+"";
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);}
 			Z=verifierSiNull(A);
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 		}
 	 if(romFrame.getValueByKey(PC).equals("F0")) 
 	 {
 			String adress1_OCTET,adress2_OCTET,adress;
 			REG_RI.setText(instructions.get(PC));
 			if(B.equals("00"))
   			{	B="FF";}
 			else {
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 			NB=NB-Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			B=NB+"";
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);}
 			Z=verifierSiNull(B);
 			N=verifierPoidsFort1OCTET(B);
 			REG_PC.setText(PC);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
			}
 	 if(romFrame.getValueByKey(PC).equals("B3")) 
 	 {
 			String adress1_OCTET,adress2_OCTET,adress;
			REG_RI.setText(instructions.get(PC));
 			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 			NA=NA-Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			A=NA+"";
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);
 			NB=NB-Long.parseLong(new Nombre(ramFrame.getValueByKey(new Direct().IncrHexaVal(adress))).Base1ToBase2(16, 10));
 			B=NB+"";
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 
 	 if(romFrame.getValueByKey(PC).equals("86")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    A=romFrame.getValueByKey(PC);
 			A=new Inherent().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			Z= verifierSiNull(A);
 			N=verifierPoidsFort1OCTET(A);
			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("C6")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		 	PC=new Direct().IncrHexaVal(PC);
 		    B=romFrame.getValueByKey(PC);
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			Z= verifierSiNull(B);
   			N=verifierPoidsFort1OCTET(B);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
 			REG_B.setText(B);
 			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("CC")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
            A=romFrame.getValueByKey(PC);
            V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			B=romFrame.getValueByKey(PC);
            V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("8E")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		 	PC=new Direct().IncrHexaVal(PC);
            X=romFrame.getValueByKey(PC)+romFrame.getValueByKey(new Direct().IncrHexaVal(PC));
            V="0";
            System.out.println(X);
 			X=new Inherent().CompleterZeros(X, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_X.setText(X);
 			Z= verifierSiNull(X);
 			N=verifierPoidsFort2OCTET(X);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("CE")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		 	PC=new Direct().IncrHexaVal(PC);
 		    U=romFrame.getValueByKey(PC)+romFrame.getValueByKey(new Direct().IncrHexaVal(PC));
            V="0";
 			U=new Inherent().CompleterZeros(U, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			POINTEUR_U.setText(U);
 			Z= verifierSiNull(U);
 			N=verifierPoidsFort2OCTET(U);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("80")) 
 	 {
 		 
	 		REG_RI.setText(instructions.get(PC));
 			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			if(A.equals("00"))
 			{
 				NA=NA-Long.parseLong(new Nombre(romFrame.getValueByKey(PC)).Base1ToBase2(16, 10));
 				A=NA+"";
 				A=new NombreSigne(A, 16).CA2();
 				A=new Nombre(A).Base1ToBase2(2, 16);
 				
 			}
 			else
 			{		
 			NA=NA-Long.parseLong(new Nombre(romFrame.getValueByKey(PC)).Base1ToBase2(16, 10));
 			A=NA+"";
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);}
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			Z= verifierSiNull(A);
 			N=verifierPoidsFort1OCTET(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 		}
 	 if(romFrame.getValueByKey(PC).equals("C0")) 
 	 {
		 	REG_RI.setText(instructions.get(PC));
 		 	Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			NB=NB-Long.parseLong(new Nombre(romFrame.getValueByKey(PC)).Base1ToBase2(16, 10));
 			B=NB+"";
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
			Z= verifierSiNull(A);
 			N=verifierPoidsFort1OCTET(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
 	  }
 	 if(romFrame.getValueByKey(PC).equals("83")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		 	Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			NA=NA-Long.parseLong(new Nombre(romFrame.getValueByKey(PC)).Base1ToBase2(16, 10));
 			A=NA+"";
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);
 			NB=NB-Long.parseLong(new Nombre(romFrame.getValueByKey(new Direct().IncrHexaVal(PC))).Base1ToBase2(16, 10));
 			B=NB+"";
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
 				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			break;
     }
   
 	if(romFrame.getValueByKey(PC).equals("9B"))
 	{
 		REG_RI.setText(instructions.get(PC));
 		String adress;
			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
			PC=new Direct().IncrHexaVal(PC);
			adress =DP+romFrame.getValueByKey(PC); 
			System.out.println(adress);
			NA=NA+Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
			A=NA+"";
			System.out.println(ramFrame.getValueByKey(adress));
			PC=new Direct().IncrHexaVal(PC);
			A=new Nombre(A).Base1ToBase2(10, 16);
			A=new Direct().CompleterZeros(A, 2);
			System.out.println(A);
			REG_PC.setText(PC);
			REG_A.setText(A);
			Z= verifierSiNull(A);
			N=verifierPoidsFort1OCTET(A);
		    REG_CCR.setText(E+F+H+I+N+Z+V+C);
		    REG_RI.setText(instructions.get(PC));
		    break;
 	}}
	    
     }

    public static int detecterDebordement(String bin1, String bin2) {

        if (bin1.length() != 8 || bin2.length() != 8 || !bin1.matches("[01]+") || !bin2.matches("[01]+")) {
            throw new IllegalArgumentException("Les deux nombres doivent être des chaînes binaires de 8 bits.");
        }

        
        int num1 = (bin1.charAt(0) == '1') ? Integer.parseInt(bin1, 2) - 256 : Integer.parseInt(bin1, 2);
        int num2 = (bin2.charAt(0) == '1') ? Integer.parseInt(bin2, 2) - 256 : Integer.parseInt(bin2, 2);
        int somme = num1 + num2;
        boolean bitSigne1 = bin1.charAt(0) == '1';
        boolean bitSigne2 = bin2.charAt(0) == '1';
        boolean bitSigneSomme = ((somme & 0x80) != 0);
        if ((bitSigne1 == bitSigne2) && (bitSigneSomme != bitSigne1)) {
            return 1; 
        }
		return 0;
    }
                                              

        
        
    	private String verifierPoidsFort1OCTET(String a) {
    		if(new Direct().CompleterZeros(new Nombre(a).Base1ToBase2(16, 2),8).charAt(0)=='1')
        	{N="1";}
    		else
    		{N= "0";}
    	return N;}
    	private String verifierPoidsFort2OCTET(String a) {
    		if(new Direct().CompleterZeros(new Nombre(a).Base1ToBase2(16, 2),16).charAt(0)=='1')
        	{N="1";}
    		else
    		{N= "0";}
    	return N;}
    	private String verifierSiNull(String a) {
    		if((Long.parseLong(new Nombre(a).Base1ToBase2(16,10))==0))
    		{Z="1";}
    		else
    		{Z= "0";}
    	return Z;}
    	
    	private String verifierCarry1octet(String a) {
    		
    		String k=new Nombre(a).Base1ToBase2(16,10);
    		
    		double m=Double.parseDouble(k);
    		if(m>255)
    		{
    			return "1";
    		}
    		return "0";
    		
    	}
    	
        private boolean checkOverflow(String binary1, String binary2, int longueur) {
	        if (binary1.length() != longueur || binary2.length() != longueur) {

	        }
	        int num1 = Integer.parseInt(binary1, 2);
	        int num2 = Integer.parseInt(binary2, 2);
	        int sum = num1 + num2;
	        int maxValue = (1 << longueur) - 1; 
	        return sum > maxValue;
	    }
        
    private void ExecuteItemActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	Object[][] data = romFrame.getData();
    	for (Object[] row : data)
    	{
    		 if(romFrame.getValueByKey(PC).equals("A6") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("84")) 
        	 {
 			    	REG_RI.setText(instructions.get(PC));
    			    PC=new Direct().IncrHexaVal(PC);
        		    A=ramFrame.getValueByKey(X);
        			A=new Inherent().CompleterZeros(A, 2);
        			if(Long.parseLong(new Nombre(A).Base1ToBase2(16,10))==0) 
        			{Z="1";}
        			REG_A.setText(A);
        			PC=new Direct().IncrHexaVal(PC);
        			REG_PC.setText(PC);
        			Z=verifierSiNull(A);
         			N=verifierPoidsFort1OCTET(A);
         			REG_CCR.setText(E+F+H+I+N+Z+V+C);
        			REG_RI.setText(instructions.get(PC));	
        	}
    		 
    		 if(romFrame.getValueByKey(PC).equals("A6") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("80")) 
        	 {
 			    	REG_RI.setText(instructions.get(PC));
    			    PC=new Direct().IncrHexaVal(PC);
        		    A=ramFrame.getValueByKey(X);
        			A=new Inherent().CompleterZeros(A, 2);
        			if(Long.parseLong(new Nombre(A).Base1ToBase2(16,10))==0) 
        			{Z="1";}
        			REG_A.setText(A);
        			PC=new Direct().IncrHexaVal(PC);
        			REG_PC.setText(PC);
        			X=new Inherent().decrHexaVal(X, 4);
        			REG_X.setText(X);
        			System.out.println(X);
        			Z=verifierSiNull(A);
         			N=verifierPoidsFort1OCTET(A);
         			REG_CCR.setText(E+F+H+I+N+Z+V+C);
        			REG_RI.setText(instructions.get(PC));
        			
        	}
    		 
    		 if(romFrame.getValueByKey(PC).equals("1E") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("89")) 
        	 {
 			    //ECHANGE DES REGISTRES A ET B
    			 REG_RI.setText(instructions.get(PC));
  			     PC=new Direct().IncrHexaVal(PC);
    			 String x;
    			 x=REG_A.getText();
    			 A=REG_B.getText();
     			 A=new Inherent().CompleterZeros(A, 2);
    			 B=x;
     			 B=new Inherent().CompleterZeros(B, 2);
    			 REG_A.setText(A);
    			 Z=verifierSiNull(A);
     			 N=verifierPoidsFort1OCTET(A);
    			 REG_B.setText(B);
    			 Z=verifierSiNull(B);
     			 N=verifierPoidsFort1OCTET(B);
    			 PC=new Direct().IncrHexaVal(PC);
    			 REG_PC.setText(PC);
     			 REG_RI.setText(instructions.get(PC));
     			 
 
        	 }
    		
    		 if(romFrame.getValueByKey(PC).equals("AE") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("01")) 
        	 {
 			    //ECHANGE DES REGISTRES X ET D	
        	 }
    		 
    		 if(romFrame.getValueByKey(PC).equals("A6") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("81")) 
        	 {
    			REG_RI.setText(instructions.get(PC));
 			    PC=new Direct().IncrHexaVal(PC);
     		    A=ramFrame.getValueByKey(X);
     			A=new Inherent().CompleterZeros(A, 2);
     			if(Long.parseLong(new Nombre(A).Base1ToBase2(16,10))==0) 
     			{Z="1";}
     			REG_A.setText(A);
     			PC=new Direct().IncrHexaVal(PC);
     			REG_PC.setText(PC);
     			X=new Inherent().IncrHexaVal(X, 4);
     			X=new Inherent().IncrHexaVal(X, 4);
     			REG_X.setText(X);
     			System.out.println(X);
     			Z=verifierSiNull(A);
      			N=verifierPoidsFort1OCTET(A);
      			REG_CCR.setText(E+F+H+I+N+Z+V+C);
     			REG_RI.setText(instructions.get(PC));
        			
        	}
    		 
    		 if(romFrame.getValueByKey(PC).equals("A6") && romFrame.getValueByKey(PC).equals("82")) 
        	 {
    			REG_RI.setText(instructions.get(PC));
 			    PC=new Direct().IncrHexaVal(PC);
     		    A=ramFrame.getValueByKey(X);
     			A=new Inherent().CompleterZeros(A, 2);
     			if(Long.parseLong(new Nombre(A).Base1ToBase2(16,10))==0) 
     			{Z="1";}
     			REG_A.setText(A);
     			PC=new Direct().IncrHexaVal(PC);
     			REG_PC.setText(PC);
     			X=new Inherent().decrHexaVal(X, 4);
     			X=new Inherent().IncrHexaVal(X, 4);
     			REG_X.setText(X);
     			System.out.println(X);
     			Z=verifierSiNull(A);
      			N=verifierPoidsFort1OCTET(A);
      			REG_CCR.setText(E+F+H+I+N+Z+V+C);
     			REG_RI.setText(instructions.get(PC));
        			
        	}
    		 if(romFrame.getValueByKey(PC).equals("A6") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("83")) 
        	 {
    			REG_RI.setText(instructions.get(PC));
 			    PC=new Direct().IncrHexaVal(PC);
     		    A=ramFrame.getValueByKey(X);
     			A=new Inherent().CompleterZeros(A, 2);
     			if(Long.parseLong(new Nombre(A).Base1ToBase2(16,10))==0) 
     			{Z="1";}
     			REG_A.setText(A);
     			PC=new Direct().IncrHexaVal(PC);
     			REG_PC.setText(PC);
     			X=new Inherent().decrHexaVal(X, 4);
     			X=new Inherent().IncrHexaVal(X, 4);
     			REG_X.setText(X);
     			System.out.println(X);
     			Z=verifierSiNull(A);
      			N=verifierPoidsFort1OCTET(A);
      			REG_CCR.setText(E+F+H+I+N+Z+V+C);
     			REG_RI.setText(instructions.get(PC));
        			
        	}


    		
    	 if(romFrame.getValueByKey(PC).equals("86")) 
    	 {
    			REG_RI.setText(instructions.get(PC));
    		    PC=new Direct().IncrHexaVal(PC);
    		    A=romFrame.getValueByKey(PC);
    			A=new Inherent().CompleterZeros(A, 2);
    			if(Long.parseLong(new Nombre(A).Base1ToBase2(16,10))==0) 
    			{Z="1";}
    			REG_A.setText(A);
    			PC=new Direct().IncrHexaVal(PC);
    			REG_PC.setText(PC);
    			Z= verifierSiNull(A);
     			N=verifierPoidsFort1OCTET(A);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
    	  }
         if(romFrame.getValueByKey(PC).equals("DB")) {
        	
        	REG_RI.setText(instructions.get(PC));
        	String adress;
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress =DP+romFrame.getValueByKey(PC); 
 			NB=NB+Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			B=NB+"";
 			PC=new Direct().IncrHexaVal(PC);
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			REG_PC.setText(PC);
 			Z= verifierSiNull(B);
 			N=verifierPoidsFort1OCTET(B);
			C=verifierCarry1octet(B);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 		}
 	 
 	 if(romFrame.getValueByKey(PC).equals("D3")) 
 	 {
 		    System.out.println("PC DB F"+PC);
 		    REG_RI.setText(instructions.get(PC));
 		    String adress;
 			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress =DP+romFrame.getValueByKey(PC); 
 			System.out.println("adressLIGHATSTOCKA F A "+adress);
 			NA=NA+Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			A=NA+"";
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			adress =new Direct().IncrHexaVal(adress); 
 			System.out.println("adress LIGHATSTOCKA F B "+adress);
 			NB=NB+Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			B=NB+"";
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 		}
 	
 	 if(romFrame.getValueByKey(PC).equals("BB")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    String adress1_OCTET,adress2_OCTET,adress;
 			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 			NA=NA+Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			A=NA+"";
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			Z= verifierSiNull(B);
 			N=verifierPoidsFort1OCTET(B);
			C=verifierCarry1octet(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 		}
 	 if(romFrame.getValueByKey(PC).equals("FB")) 
 	 {
 		    REG_RI.setText(instructions.get(PC));
 		    String adress1_OCTET,adress2_OCTET,adress;
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 			NB=NB+Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			B=NB+"";
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			Z= verifierSiNull(B);
 			N=verifierPoidsFort1OCTET(B);
			C=verifierCarry1octet(B);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("F3")) 
 	 {
 		    REG_RI.setText(instructions.get(PC));
 		    String adress1_OCTET,adress2_OCTET,adress;
 			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 			NA=NA+Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			A=NA+"";
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);
 			NB=NB+Long.parseLong(new Nombre(ramFrame.getValueByKey(new Direct().IncrHexaVal(adress))).Base1ToBase2(16, 10));
 			B=NB+"";
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 
 	 if(romFrame.getValueByKey(PC).equals("3A")) 
 	 {
 		    REG_RI.setText(instructions.get(PC));
 		    Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			Long NX=Long.parseLong(new Nombre(X).Base1ToBase2(16, 10));
 			NX=NX+NB;
 			X=NX+"";
 			System.out.println(X);
 			X=new Nombre(X).Base1ToBase2(10, 16);
 			X=new Direct().CompleterZeros(X, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_X.setText(X);
 			if(new Nombre(X).Base1ToBase2(16, 2).charAt(0)=='1')
	    	{
	    		N="1";
	    	}
			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("43")) 
 	 {
		    	REG_RI.setText(instructions.get(PC));
 		    A=new NombreSigne("-"+A,16).CA1();
 		    A=new Nombre(A).Base1ToBase2(2, 16);
 			C="1";
 			A=new Inherent().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			if((Long.parseLong(new Nombre(A).Base1ToBase2(16,10))==0))
			{Z="1";}
 			if(new Nombre(A).Base1ToBase2(16, 2).charAt(0)=='1')
	    	{
	    		N="1";
	    	}
			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 		
 	  }
 	 if(romFrame.getValueByKey(PC).equals("53")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC)); 
 		 	B=new NombreSigne("-"+B,16).CA1();
 		    B=new Nombre(B).Base1ToBase2(2, 16);
 		    C="1";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			Z= verifierSiNull(B);
 			N=verifierPoidsFort1OCTET(B);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("4A")) 
 	 {
			   REG_RI.setText(instructions.get(PC));
			if(A.equals("00"))
			{	A="FF";}
			else
			{    A=new Inherent().decrHexaVal(A,2);
 		    PC=new Direct().IncrHexaVal(PC);
 		    REG_PC.setText(PC);
 		    REG_A.setText(A);}
			if((Long.parseLong(new Nombre(A).Base1ToBase2(16,10))==0))
			{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	}
 	 
 	 if(romFrame.getValueByKey(PC).equals("5A")) 
 	 {
     		REG_RI.setText(instructions.get(PC));
     		B=new Inherent().decrHexaVal(B,2);
     		PC=new Direct().IncrHexaVal(PC);
     		REG_PC.setText(PC);
     		REG_B.setText(B);
     		Z= verifierSiNull(A);
   			N=verifierPoidsFort1OCTET(A);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("4C")) 
 	 {
 		REG_RI.setText(instructions.get(PC));
 		 A=new Inherent().IncrHexaVal(A,2);
 		   PC=new Direct().IncrHexaVal(PC);
 		   REG_PC.setText(PC);
 		  if(A.equals("FF"))
 			{	A="00";}
 		   REG_A.setText(A);
 		   Z= verifierSiNull(A);
   			N=verifierPoidsFort1OCTET(A);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("5C")) 
 	 {
 		   B=new Inherent().IncrHexaVal(B,2);
 		   PC=new Direct().IncrHexaVal(PC);
 		   REG_PC.setText(PC);
 		  if(B.equals("FF"))
 			{	B="00";}
 			else
 		   REG_B.setText(B);
 		Z= verifierSiNull(B);
			N=verifierPoidsFort1OCTET(B);
			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("50")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    B=new NombreSigne("-"+B,16).CA2();
 		    B=new Nombre(B).Base1ToBase2(2, 16);
 		    C="1";
 			V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			Z= verifierSiNull(B);
   			N=verifierPoidsFort1OCTET(B);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("40")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    A=new NombreSigne("-"+A,16).CA2();
 		    A=new Nombre(A).Base1ToBase2(2, 16);
 		    C="1";
 			V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			Z= verifierSiNull(A);
   			N=verifierPoidsFort1OCTET(A);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("96")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 			String adress =DP+romFrame.getValueByKey(PC); 
            A=ramFrame.getValueByKey(adress);
 			V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			Z= verifierSiNull(A);
   			N=verifierPoidsFort1OCTET(A);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("D6")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 			String adress =DP+romFrame.getValueByKey(PC); 
            B=ramFrame.getValueByKey(adress);
 			V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			Z= verifierSiNull(B);
   			N=verifierPoidsFort1OCTET(B);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("DC")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		 	PC=new Direct().IncrHexaVal(PC);
 			String adress =DP+romFrame.getValueByKey(PC); 
            A=ramFrame.getValueByKey(adress);
 			V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			adress=new Direct().IncrHexaVal(adress);
 			B=ramFrame.getValueByKey(adress);
 			V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 			
 	  }
 	if(romFrame.getValueByKey(PC).equals("9F")) 
	 {
		    PC=new Direct().IncrHexaVal(PC);
			String adress =DP+romFrame.getValueByKey(PC); 
			ramFrame.updateValueByKey(adress,X.substring(0,1));
	        ramFrame.updateValueByKey(new Direct().IncrHexaVal(adress),X.substring(2));
            V="0";
			X=new Inherent().CompleterZeros(X, 4);
			PC=new Direct().IncrHexaVal(PC);
			REG_PC.setText(PC);
			REG_X.setText(X);
			Z= verifierSiNull(X);
			N=verifierPoidsFort2OCTET(X);
			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
	  }
 	 if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("DE")) 
 	 {
		REG_RI.setText(instructions.get(PC));
 		PC=new Direct().IncrHexaVal(PC);
 		System.out.println(PC);
	 	REG_RI.setText(instructions.get(PC));
	    PC=new Direct().IncrHexaVal(PC);
	    System.out.println(PC);
		String adress =DP+romFrame.getValueByKey(PC); 
        S=ramFrame.getValueByKey(adress)+ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
        V="0";
		S=new Inherent().CompleterZeros(S, 4);
		PC=new Direct().IncrHexaVal(PC);
		System.out.println(PC);
		REG_PC.setText(PC);
		POINTEUR_S.setText(S);
		Z= verifierSiNull(S);
		N=verifierPoidsFort2OCTET(S);
		REG_CCR.setText(E+F+H+I+N+Z+V+C);
		REG_RI.setText(instructions.get(PC));
 	}
 	 if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("DF"))  
 		 {
 			 	REG_RI.setText(instructions.get(PC));
 			    PC=new Direct().IncrHexaVal(PC);
 			    System.out.println(PC);
 				String adress =DP+romFrame.getValueByKey(PC); 
 	            ramFrame.updateValueByKey(adress,S.substring(0,2));
 	            ramFrame.updateValueByKey(new Direct().IncrHexaVal(adress),S.substring(2));
 	            V="0";
 				S=new Inherent().CompleterZeros(S, 4);
 				PC=new Direct().IncrHexaVal(PC);
 				System.out.println(PC);
 				REG_PC.setText(PC);
 				POINTEUR_S.setText(S);
 				Z= verifierSiNull(S);
     			N=verifierPoidsFort2OCTET(S);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
 			
 				 
 		  }
 	if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(PC).equals("9E")) 
 		 {
 			    REG_RI.setText(instructions.get(PC));
 			    PC=new Direct().IncrHexaVal(PC);
 				String adress =DP+romFrame.getValueByKey(PC); 
 	            Y=ramFrame.getValueByKey(adress)+ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
 	            V="0";
 				Y=new Inherent().CompleterZeros(Y, 4);
 				PC=new Direct().IncrHexaVal(PC);
 				REG_PC.setText(PC);
 				REG_Y.setText(Y);
 				Z= verifierSiNull(Y);
     			N=verifierPoidsFort2OCTET(Y);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
 		  }
 	if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(PC).equals("9F")) 
 		 {
 			    PC=new Direct().IncrHexaVal(PC);
 				String adress =DP+romFrame.getValueByKey(PC); 
 				ramFrame.updateValueByKey(adress,Y.substring(0,1));
 		        ramFrame.updateValueByKey(new Direct().IncrHexaVal(adress),Y.substring(2));
 	            V="0";
 				Y=new Inherent().CompleterZeros(Y, 4);
 				PC=new Direct().IncrHexaVal(PC);
 				REG_PC.setText(PC);
 				REG_Y.setText(Y);
 				Z= verifierSiNull(Y);
     			N=verifierPoidsFort2OCTET(Y);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
 		  }
 	if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(PC).equals("FE")) 
 		 {
 			    String adress1_OCTET,adress2_OCTET,adress;
 			 	PC=new Direct().IncrHexaVal(PC);
 				adress1_OCTET=PC;
 				PC=new Direct().IncrHexaVal(PC);
 				adress2_OCTET=PC;
 				adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 	            S=ramFrame.getValueByKey(adress)+ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
 	            V="0";
 				S=new Inherent().CompleterZeros(S, 4);
 				PC=new Direct().IncrHexaVal(PC);
 				REG_PC.setText(PC);
 				POINTEUR_S.setText(S);
 				Z= verifierSiNull(S);
     			N=verifierPoidsFort2OCTET(S);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
 		 }
 	if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(PC).equals("BE")) 
 		 {
 				String adress1_OCTET,adress2_OCTET,adress;
 			    PC=new Direct().IncrHexaVal(PC);
 			    adress1_OCTET=PC;
 				PC=new Direct().IncrHexaVal(PC);
 				adress2_OCTET=PC;
 				adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 	            Y=ramFrame.getValueByKey(adress)+ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
 	            V="0";
 				Y=new Inherent().CompleterZeros(Y, 4);
 				PC=new Direct().IncrHexaVal(PC);
 				REG_PC.setText(PC);
 				REG_Y.setText(Y);
 				Z= verifierSiNull(Y);
     			N=verifierPoidsFort2OCTET(Y);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
 		  }
 	if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(PC).equals("FF")) 
 		 {
 				String adress1_OCTET,adress2_OCTET,adress;
 			 	PC=new Direct().IncrHexaVal(PC);
 				adress1_OCTET=PC;
 				PC=new Direct().IncrHexaVal(PC);
 				adress2_OCTET=PC;
 				adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 				ramFrame.updateValueByKey(adress,S.substring(0,2));
 		        ramFrame.updateValueByKey(new Direct().IncrHexaVal(adress),S.substring(2));
 	            V="0";
 				PC=new Direct().IncrHexaVal(PC);
 				REG_PC.setText(PC);
 				POINTEUR_S.setText(S);
 				Z= verifierSiNull(S);
     			N=verifierPoidsFort2OCTET(S);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
 		  }
 	if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(PC).equals("BF")) 
 		 {
 				String adress1_OCTET,adress2_OCTET,adress;
 			    PC=new Direct().IncrHexaVal(PC);
 			    adress1_OCTET=PC;
 				PC=new Direct().IncrHexaVal(PC);
 				adress2_OCTET=PC;
 				adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 				ramFrame.updateValueByKey(adress,Y.substring(0,2));
 		        ramFrame.updateValueByKey(new Direct().IncrHexaVal(adress),Y.substring(2));
 	            V="0";
 				PC=new Direct().IncrHexaVal(PC);
 				REG_PC.setText(PC);
 				REG_Y.setText(Y);
 				Z= verifierSiNull(Y);
     			N=verifierPoidsFort2OCTET(Y);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
 		  }
 	if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(new Direct().IncrHexaVal(PC)).equals("CE")) 
 		 {
 			    PC=new Direct().IncrHexaVal(PC);
 	            V="0";
 				PC=new Direct().IncrHexaVal(PC);
 				String valeurOctet1=romFrame.getValueByKey(PC);
 				PC=new Direct().IncrHexaVal(PC);
 				String valeurOctet2=romFrame.getValueByKey(PC);
 			    S=valeurOctet1+valeurOctet2;
 		 		S=new Inherent().CompleterZeros(S, 4);
 				POINTEUR_S.setText(S);
 				PC=new Direct().IncrHexaVal(PC);
 				REG_PC.setText(PC);
 				Z= verifierSiNull(S);
     			N=verifierPoidsFort2OCTET(S);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
 		  }
 	if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(PC).equals("8E")) 
 		 {
 			    PC=new Direct().IncrHexaVal(PC);
 			    Y=romFrame.getValueByKey(PC)+romFrame.getValueByKey(new Direct().IncrHexaVal(PC));
 	            V="0";
 				Y=new Inherent().CompleterZeros(Y, 4);
 				PC=new Direct().IncrHexaVal(PC);
 				PC=new Direct().IncrHexaVal(PC);
 				REG_PC.setText(PC);
 				REG_Y.setText(Y);
 				Z= verifierSiNull(Y);
     			N=verifierPoidsFort2OCTET(Y);
     			REG_CCR.setText(E+F+H+I+N+Z+V+C);
    			REG_RI.setText(instructions.get(PC));
 		  }
 	  
    if(romFrame.getValueByKey(PC).equals("DE")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 			String adress =DP+romFrame.getValueByKey(PC); 
            U=ramFrame.getValueByKey(adress)+ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
            V="0";
 			U=new Inherent().CompleterZeros(U, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			POINTEUR_U.setText(U);
 			Z= verifierSiNull(U);
 			N=verifierPoidsFort2OCTET(U);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
		
 	  }
    if(romFrame.getValueByKey(PC).equals("10") && romFrame.getValueByKey(PC).equals("9E")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 			String adress =DP+romFrame.getValueByKey(PC); 
            X=ramFrame.getValueByKey(adress)+ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
            V="0";
 			X=new Inherent().CompleterZeros(X, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_X.setText(X);
 			Z= verifierSiNull(X);
 			N=verifierPoidsFort2OCTET(X);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 			
 	  }
 	 if(romFrame.getValueByKey(PC).equals("B6")) 
 	 {
 		 	String adress1_OCTET,adress2_OCTET,adress;
 			REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            A=ramFrame.getValueByKey(adress);
            V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			Z= verifierSiNull(A);
 			N=verifierPoidsFort1OCTET(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("F6")) 
 	 {
				REG_RI.setText(instructions.get(PC));
 		    String adress1_OCTET,adress2_OCTET,adress;
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            B=ramFrame.getValueByKey(adress);
            V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			Z= verifierSiNull(B);
   			N=verifierPoidsFort1OCTET(B);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("FC")) 
 	 {
 		 	String adress1_OCTET,adress2_OCTET,adress;
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            A=ramFrame.getValueByKey(adress);
            V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			B=ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
            V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("BE")) 
 	 {
 			String adress1_OCTET,adress2_OCTET,adress;
 			REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            X=ramFrame.getValueByKey(adress)+ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
            V="0";
 			X=new Inherent().CompleterZeros(X, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_X.setText(X);
 			Z= verifierSiNull(X);
   			N=verifierPoidsFort2OCTET(X);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
 			
 	  }
 	 if(romFrame.getValueByKey(PC).equals("FE")) 
 	 {
 		 	String adress1_OCTET,adress2_OCTET,adress;
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            U=ramFrame.getValueByKey(adress)+ramFrame.getValueByKey(new Direct().IncrHexaVal(adress));
            V="0";
 			U=new Inherent().CompleterZeros(U, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			POINTEUR_U.setText(U);
 			Z= verifierSiNull(U);
 			N=verifierPoidsFort2OCTET(U);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("97")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 			String adress =DP+romFrame.getValueByKey(PC); 
            ramFrame.updateValueByKey(adress,A);
 			V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			Z= verifierSiNull(A);
 			N=verifierPoidsFort1OCTET(A);
			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("D7")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 			String adress =DP+romFrame.getValueByKey(PC); 
            ramFrame.updateValueByKey(adress,B);
 			V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			Z= verifierSiNull(B);
   			N=verifierPoidsFort1OCTET(B);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));	
 	  }
 	 if(romFrame.getValueByKey(PC).equals("DD")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 			String adress =DP+romFrame.getValueByKey(PC); 
            ramFrame.updateValueByKey(adress,A);
 			V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			adress=new Direct().IncrHexaVal(adress);
 			ramFrame.updateValueByKey(adress,B);
 			V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 			
 	  }
 	 if(romFrame.getValueByKey(PC).equals("90")) {
 			String adress;
 			REG_RI.setText(instructions.get(PC));
 			if(A.equals("00"))
   			{	A="FF";}
 			else {
 			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress =DP+romFrame.getValueByKey(PC); 
 			NA=NA-Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			A=NA+"";
 			PC=new Direct().IncrHexaVal(PC);
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);
 			REG_A.setText(A);}
 			Z=verifierSiNull(A);
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 		}
 	 if(romFrame.getValueByKey(PC).equals("D0")) {
 			String adress;
 			REG_RI.setText(instructions.get(PC));
 			if(B.equals("00"))
   			{	B="FF";}
 			else {
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress =DP+romFrame.getValueByKey(PC); 
 			NB=NB-Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			B=NB+"";
 			PC=new Direct().IncrHexaVal(PC);
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			REG_PC.setText(PC);         			
 			REG_B.setText(B);}
  			Z=verifierSiNull(B);
  			N=verifierPoidsFort1OCTET(B);
  			REG_PC.setText(PC);
  			REG_CCR.setText(E+F+H+I+N+Z+V+C);
 			REG_RI.setText(instructions.get(PC));
 		}
 	 if(romFrame.getValueByKey(PC).equals("93")) 
 	 {
 			String adress;
 			String D;
 			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress =DP+romFrame.getValueByKey(PC); 
 			NA=NA-Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			A=NA+"";
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			adress =new Direct().IncrHexaVal(adress); 
 			System.out.println("adress suivant "+adress);
 			NB=NB-Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			B=NB+"";
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			REG_B.setText(B);
 		}
 	 if(romFrame.getValueByKey(PC).equals("B7")) 
 	 {
 		 	String adress1_OCTET,adress2_OCTET,adress;
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            ramFrame.updateValueByKey(adress,A);
            V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			Z= verifierSiNull(A);
 			N=verifierPoidsFort1OCTET(A);
			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 			
 	  }
 	 if(romFrame.getValueByKey(PC).equals("F7")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    String adress1_OCTET,adress2_OCTET,adress;
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            ramFrame.updateValueByKey(adress,B);
            V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			Z= verifierSiNull(B);
   			N=verifierPoidsFort1OCTET(B);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("FD")) 
 	 {
 		 	String adress1_OCTET,adress2_OCTET,adress;
			REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            ramFrame.updateValueByKey(adress,A);
            V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			ramFrame.updateValueByKey(new Direct().IncrHexaVal(adress),B);
            V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("BF")) 
 	 {
 			String adress1_OCTET,adress2_OCTET,adress;
			REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
            ramFrame.updateValueByKey(adress,X.substring(0,2));
            ramFrame.updateValueByKey(new Direct().IncrHexaVal(adress),X.substring(2));
            V="0";
 			X=new Inherent().CompleterZeros(X, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_X.setText(X);
				Z= verifierSiNull(X);
 			N=verifierPoidsFort2OCTET(X);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("FF")) 
 	 {
 		 	String adress1_OCTET,adress2_OCTET,adress;
			REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 			ramFrame.updateValueByKey(adress,U.substring(0,2));
 	        ramFrame.updateValueByKey(new Direct().IncrHexaVal(adress),U.substring(2));
            V="0";
 			U=new Inherent().CompleterZeros(U, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			POINTEUR_U.setText(U);
 			Z= verifierSiNull(U);
 			N=verifierPoidsFort2OCTET(U);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("B0")) 
 	 {
 			String adress1_OCTET,adress2_OCTET,adress;
 			REG_RI.setText(instructions.get(PC));
 			if(A.equals("00"))
   			{	A="FF";}
 			else {
 			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 			NA=NA-Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			A=NA+"";
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);}
 			Z=verifierSiNull(A);
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 		}
 	 if(romFrame.getValueByKey(PC).equals("F0")) 
 	 {
 			String adress1_OCTET,adress2_OCTET,adress;
 			REG_RI.setText(instructions.get(PC));
 			if(B.equals("00"))
   			{	B="FF";}
 			else {
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 			NB=NB-Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			B=NB+"";
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);}
 			Z=verifierSiNull(B);
 			N=verifierPoidsFort1OCTET(B);
 			REG_PC.setText(PC);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
			}
 	 if(romFrame.getValueByKey(PC).equals("B3")) 
 	 {
 			String adress1_OCTET,adress2_OCTET,adress;
			REG_RI.setText(instructions.get(PC));
 			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			adress1_OCTET=PC;
 			PC=new Direct().IncrHexaVal(PC);
 			adress2_OCTET=PC;
 			adress=romFrame.getValueByKey(adress1_OCTET)+romFrame.getValueByKey(adress2_OCTET);
 			NA=NA-Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
 			A=NA+"";
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);
 			NB=NB-Long.parseLong(new Nombre(ramFrame.getValueByKey(new Direct().IncrHexaVal(adress))).Base1ToBase2(16, 10));
 			B=NB+"";
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 
 	 if(romFrame.getValueByKey(PC).equals("86")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
 		    A=romFrame.getValueByKey(PC);
 			A=new Inherent().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			Z= verifierSiNull(A);
 			N=verifierPoidsFort1OCTET(A);
			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("C6")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		 	PC=new Direct().IncrHexaVal(PC);
 		    B=romFrame.getValueByKey(PC);
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			Z= verifierSiNull(B);
   			N=verifierPoidsFort1OCTET(B);
   			REG_CCR.setText(E+F+H+I+N+Z+V+C);
  			REG_RI.setText(instructions.get(PC));
 			REG_B.setText(B);
 	  }
 	 if(romFrame.getValueByKey(PC).equals("CC")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		    PC=new Direct().IncrHexaVal(PC);
            A=romFrame.getValueByKey(PC);
            V="0";
 			A=new Inherent().CompleterZeros(A, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			B=romFrame.getValueByKey(PC);
            V="0";
 			B=new Inherent().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("8E")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		 	PC=new Direct().IncrHexaVal(PC);
            X=romFrame.getValueByKey(PC)+romFrame.getValueByKey(new Direct().IncrHexaVal(PC));
            V="0";
            System.out.println(X);
 			X=new Inherent().CompleterZeros(X, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_X.setText(X);
 			Z= verifierSiNull(X);
 			N=verifierPoidsFort2OCTET(X);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("CE")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		 	PC=new Direct().IncrHexaVal(PC);
 		    U=romFrame.getValueByKey(PC)+romFrame.getValueByKey(new Direct().IncrHexaVal(PC));
            V="0";
 			U=new Inherent().CompleterZeros(U, 4);
 			PC=new Direct().IncrHexaVal(PC);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			POINTEUR_U.setText(U);
 			Z= verifierSiNull(U);
 			N=verifierPoidsFort2OCTET(U);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("80")) 
 	 {
 		 
	 		REG_RI.setText(instructions.get(PC));
 			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			if(A.equals("00"))
 			{
 				NA=NA-Long.parseLong(new Nombre(romFrame.getValueByKey(PC)).Base1ToBase2(16, 10));
 				A=NA+"";
 				A=new NombreSigne(A, 16).CA2();
 				A=new Nombre(A).Base1ToBase2(2, 16);
 				
 			}
 			else
 			{		
 			NA=NA-Long.parseLong(new Nombre(romFrame.getValueByKey(PC)).Base1ToBase2(16, 10));
 			A=NA+"";
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);}
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_A.setText(A);
 			Z= verifierSiNull(A);
 			N=verifierPoidsFort1OCTET(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 		}
 	 if(romFrame.getValueByKey(PC).equals("C0")) 
 	 {
		 		REG_RI.setText(instructions.get(PC));
 		 	Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			NB=NB-Long.parseLong(new Nombre(romFrame.getValueByKey(PC)).Base1ToBase2(16, 10));
 			B=NB+"";
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
			Z= verifierSiNull(A);
 			N=verifierPoidsFort1OCTET(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
 	  }
 	 if(romFrame.getValueByKey(PC).equals("83")) 
 	 {
 		 	REG_RI.setText(instructions.get(PC));
 		 	Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
 			Long NB=Long.parseLong(new Nombre(B).Base1ToBase2(16, 10));
 			PC=new Direct().IncrHexaVal(PC);
 			NA=NA-Long.parseLong(new Nombre(romFrame.getValueByKey(PC)).Base1ToBase2(16, 10));
 			A=NA+"";
 			A=new Nombre(A).Base1ToBase2(10, 16);
 			A=new Direct().CompleterZeros(A, 2);
 			NB=NB-Long.parseLong(new Nombre(romFrame.getValueByKey(new Direct().IncrHexaVal(PC))).Base1ToBase2(16, 10));
 			B=NB+"";
 			B=new Nombre(B).Base1ToBase2(10, 16);
 			B=new Direct().CompleterZeros(B, 2);
 			PC=new Direct().IncrHexaVal(PC);
 			if (verifierSiNull(A)=="1" && verifierSiNull(A)=="1")
 				{Z="1";}
 			N=verifierPoidsFort1OCTET(A);
 			REG_PC.setText(PC);
 			REG_B.setText(B);
 			REG_A.setText(A);
 			REG_CCR.setText(E+F+H+I+N+Z+V+C);
			REG_RI.setText(instructions.get(PC));
     }
   
 	if(romFrame.getValueByKey(PC).equals("9B"))
 	{
 		REG_RI.setText(instructions.get(PC));
 		String adress;
			Long NA=Long.parseLong(new Nombre(A).Base1ToBase2(16, 10));
			PC=new Direct().IncrHexaVal(PC);
			adress =DP+romFrame.getValueByKey(PC); 
			System.out.println(adress);
			NA=NA+Long.parseLong(new Nombre(ramFrame.getValueByKey(adress)).Base1ToBase2(16, 10));
			A=NA+"";
			System.out.println(ramFrame.getValueByKey(adress));
			PC=new Direct().IncrHexaVal(PC);
			A=new Nombre(A).Base1ToBase2(10, 16);
			A=new Direct().CompleterZeros(A, 2);
			System.out.println(A);
			REG_PC.setText(PC);
			REG_A.setText(A);
			Z= verifierSiNull(A);
			N=verifierPoidsFort1OCTET(A);
			C=verifierCarry1octet(A);
		REG_CCR.setText(E+F+H+I+N+Z+V+C);
		REG_RI.setText(instructions.get(PC));
 	}}
 	}                                         

                                                              
    private void Reste(java.awt.event.ActionEvent evt) {                                            
    	 PC="FC00";
    	 DP="00";
    	A="00";
    	B="00";
    	X="0000";
    	S="0000";
    	Y="0000";
    	 U="0000";
    	 E="0";F="0";H="0";I="0";N="0";Z="0";V="0";C="0";
    	REG_PC.setText(PC);
    	REG_A.setText(A);
    	REG_PC.setText(PC);
    	REG_B.setText(B);
    	REG_X.setText(X);
    	REG_DP.setText(DP);
    	REG_Y.setText(Y);
    	POINTEUR_U.setText(U);
    	POINTEUR_S.setText(S);
    	REG_CCR.setText(E+F+H+I+N+Z+V+C);
    	REG_RI.setText(null);
    }                                           
   
    
    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	ROM sharedRom =new ROM();
                new PublicInterface(sharedRom).setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify                     
    private  JCheckBoxMenuItem RAMchechBoxMenu;
    private  JCheckBoxMenuItem ROMchechBoxMenu;
    private  JColorChooser jColorChooser1;
    private  JLabel jLabel1;
    private  JLabel jLabel10;
    private  JLabel jLabel11;
    private  JLabel jLabel12;
    private  JLabel jLabel2;
    private  JLabel jLabel3;
    private  JLabel jLabel5;
    private  JLabel jLabel6;
    private  JLabel jLabel7;
    private  JLabel jLabel8;
    private  JLabel jLabel9;
    private  JMenu jMenu1;
    private  JMenu jMenu2;
    private  JMenu jMenu3;
    private  JMenuBar jMenuBar1;
    private  JMenuItem NouveauItem;
    private  JMenuItem OuvrirItem;
    private  JMenuItem EnregistrerItem;
    private  JMenuItem QuitterItem;
    private  JMenuItem stepbystepItem;
    private  JMenuItem ExecuteItem;
    private  JMenuItem resetItem;
    private  JCheckBoxMenuItem ProgrammechechBoxMenu;
    private  JPanel jPanel1;
    private  JTextField REG_A;
    private  JTextField REG_X;
    private  JTextField REG_B;
    private  JTextField REG_PC;
    private  JTextField REG_RI;
    private  JTextField POINTEUR_U;
    private  JTextField POINTEUR_S;
    private  JTextField REG_CCR;
    private  JTextField REG_DP;
    private  JTextField REG_Y;
    private ROM romFrame;
    private RAM ramFrame;
    private EditeurText editeurText;
    private String PC;
	private String DP;
	private String A;
	private String B;
	private String X;
	private String S;
	private String Y;
	private String U;
	private String E,F,H,I,N,Z,V,C;
    private HashMap<Integer,String> pointeurs;
    private HashMap<String,String> instructions;
    // End of variables declaration                   
}
