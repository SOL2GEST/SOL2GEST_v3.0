/*
 * To change this template, choose Tools * Templates
 * and open the template in the editor.
 */

import Métier.Client;
import Métier.MPanelPrinter;
import dao.BddDAO;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JCheckBox;

/**
 *
 * @author btssio
 */
public class JFrameDevisGest extends javax.swing.JFrame {
    
    /**
     * Creates new form JFrameDemoModeleList
     */
    
    static int typeDevis=0;    
    File fichierOuvert;
    boolean modif = false;
    
    public JFrameDevisGest() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        Date actuelle = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = dateFormat.format(actuelle);
        this.fieldDate.setText(date);
        try{
            String clientsString = BddDAO.importClientsFromText();
            String[] clientsString2 = clientsString.split("//");
            Arrays.sort(clientsString2);
            for(int i=0;i<clientsString2.length;i++){
                String[] clientString = clientsString2[i].split(";");
                String libelle="";
                String correspondant="";
                String tel="";
                String fax="";
                String mail="";
                String adresse="";
                try{
                    libelle=clientString[0];
                    correspondant=clientString[1];
                    tel=clientString[2];
                    fax=clientString[3];
                    mail=clientString[4];
                    adresse=clientString[5];
                }catch(Exception e){
                    
                }
                Client unClient = new Client(libelle, correspondant, tel, fax, mail, adresse);
                this.comboBoxEntreprise.addItem(unClient.getLibelle());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Un problème est survenu au chargement de la BDD", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static int getTypeDevis(){
        return typeDevis;
    }

    public static JTextField getjTextField22() {
        return fieldCalculTS4;
    }

    public static JTextField getjTextField50() {
        return fieldCalculTS9;
    }

    public static JTextField getjTextField47() {
        return fieldCalculTS6;
    }

    public static JTextField getjTextField53() {
        return fieldTS2;
    }

    public static JTextField getjTextField14() {
        return fieldNomChantier;
    }

    public static JTextField getjTextField3() {
        return fieldAdrChantier;
    }
    
    public static JTextField getjTextField11() {
        return fieldTS1;
    }
    
    public static JTextField getjTextField24() {
        return fieldCalculTS5;
    }

    public static JComboBox getjComboBox8() {
        return comboBoxBeton;
    }
    
    public static String getSurfaceBeton(){
        return fieldCalculBeton1.getText();
    }
    
    public static String getAdrChantier(){
        return fieldAdrChantier.getText();
    }
    
    public static String getNomChantier(){
        return fieldNomChantier.getText();
    }

    public static JComboBox<String> getjComboBox5() {
        return comboBoxEntreprise;
    }

    public static JTextField getjTextField1() {
        return fieldTel;
    }

    public static JTextField getjTextField4() {
        return fieldMail;
    }

    public static JTextField getjTextField5() {
        return fieldInterlocuteur;
    }

    public static JTextField getjTextField6() {
        return fieldAdresse;
    }

    public static JTextField getjTextField2() {
        return fieldTelecopie;
    }
    
    
    public void AffichageChampCorrect(JTextField field){
        field.setBackground(Color.white);
        field.setForeground(Color.black);
    }
    
    public void AffichageChampIncorrect(JTextField field){
        field.setBackground(Color.red);
        field.setForeground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        checkBoxMousseOui = new javax.swing.JCheckBox();
        checkBoxMousseNon = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        checkBoxPolyOui = new javax.swing.JCheckBox();
        checkBoxPolyNon = new javax.swing.JCheckBox();
        fieldPloy = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        comboBoxTS1 = new javax.swing.JComboBox<>();
        fieldTS1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        comboBoxB1 = new javax.swing.JComboBox<>();
        comboBoxB2 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        checkBoxPenteOui = new javax.swing.JCheckBox();
        checkBoxPenteNon = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        comboBoxColorant = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaInfoComp = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        comboBoxTS2 = new javax.swing.JComboBox<>();
        fieldTS2 = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        checkBoxSciageOui = new javax.swing.JCheckBox();
        checkBoxSciageNon = new javax.swing.JCheckBox();
        checkBoxGarniOui = new javax.swing.JCheckBox();
        checkBoxGarniNon = new javax.swing.JCheckBox();
        checkBoxQuartzOui = new javax.swing.JCheckBox();
        checkBoxQuartzNon = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fieldTel = new javax.swing.JTextField();
        fieldTelecopie = new javax.swing.JTextField();
        fieldAdrChantier = new javax.swing.JTextField();
        fieldInterlocuteur = new javax.swing.JTextField();
        fieldAdresse = new javax.swing.JTextField();
        fieldSurface = new javax.swing.JTextField();
        fieldEpaisseur = new javax.swing.JTextField();
        fieldVolume = new javax.swing.JTextField();
        comboBoxEntreprise = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        fieldMail = new javax.swing.JTextField();
        buttonAddClient = new javax.swing.JButton(new ImageIcon("./image/modifier-icone.png" ));
        jLabel86 = new javax.swing.JLabel();
        fieldNomChantier = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        fieldCalculCAB1 = new javax.swing.JTextField();
        fieldCalculTS1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        fieldCalculPoly2 = new javax.swing.JTextField();
        fieldCalculTS2 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        fieldCalculPoly3 = new javax.swing.JTextField();
        fieldCalculTS3 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        fieldCalculPoly4 = new javax.swing.JTextField();
        fieldCalculTS4 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        fieldCalculPoly5 = new javax.swing.JTextField();
        fieldCalculTS5 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        fieldCalculPolyTotal = new javax.swing.JTextField();
        fieldCalculTSTotal = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        fieldCalculPoly1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        fieldCalculCAB2 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        fieldCalculCABTotal = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        fieldCalculBeton1 = new javax.swing.JTextField();
        fieldCalculBeton2 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        fieldCalculBetonTotal = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        fieldCalculFibre1 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        fieldCalculFibre = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        fieldCalculFibreTotal = new javax.swing.JTextField();
        fieldCalculPompe1 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        fieldCalculPompe2 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        fieldCalculPompeTotal = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        fieldCoef = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        fieldCalculTotal1 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        fieldCalculTotalFourni = new javax.swing.JTextField();
        fieldCalculTotalMOE = new javax.swing.JTextField();
        fieldCalculTotalFinal = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        checkBoxFourniture = new javax.swing.JCheckBox();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        fieldCalculTSTotal2 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        fieldCalculTS6 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        fieldCalculTS7 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        fieldCalculTS8 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        fieldCalculTS9 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        fieldCalculTS10 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        fieldCalculPompe3 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        fieldCalculPolystyreneTotal = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        fieldCalculPolystyrene2 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        fieldCalculPolystyrene1 = new javax.swing.JTextField();
        comboBoxPompe = new javax.swing.JComboBox<>();
        comboBoxBeton = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldDate = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ETUDE DE PRIX");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new ImageIcon("./image/logo-sol2s.png" ).getImage());
        setMaximumSize(new java.awt.Dimension(1100, 617));
        setMinimumSize(new java.awt.Dimension(1100, 617));
        setSize(new java.awt.Dimension(1100, 617));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel2.setText("SOL2S");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "MAIN D'OEUVRE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft Sans Serif", 1, 13))); // NOI18N

        jLabel13.setText("Mousse de désolidarisation :");

        checkBoxMousseOui.setSelected(true);
        checkBoxMousseOui.setText("oui");
        checkBoxMousseOui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMousseOuiActionPerformed(evt);
            }
        });

        checkBoxMousseNon.setText("non");
        checkBoxMousseNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMousseNonActionPerformed(evt);
            }
        });

        jLabel14.setText("Polyane :");

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                { new Float(3.85)},
                {null},
                { new Float(0.85)},
                {null},
                { new Float(0.8)},
                {null}
            },
            new String [] {
                "PRIX"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(28);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        checkBoxPolyOui.setSelected(true);
        checkBoxPolyOui.setText("oui");
        checkBoxPolyOui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxPolyOuiActionPerformed(evt);
            }
        });

        checkBoxPolyNon.setText("non");
        checkBoxPolyNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxPolyNonActionPerformed(evt);
            }
        });

        fieldPloy.setText("150");

        jLabel15.setText("U");

        jLabel16.setText("T.S :");

        comboBoxTS1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "calé", "non calé" }));
        comboBoxTS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTS1ActionPerformed(evt);
            }
        });

        fieldTS1.setText("ST15C");
        fieldTS1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldTS1CaretUpdate(evt);
            }
        });
        fieldTS1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldTS1FocusLost(evt);
            }
        });

        jLabel17.setText("Béton :");

        comboBoxB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "avec cure", "sans cure" }));

        comboBoxB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "lissé", "brut", "T.F", "T.BAL" }));

        jLabel18.setText("Forme de pente :");

        jLabel19.setText("Quartz 3.5 Kg/m² prémixé :");

        checkBoxPenteOui.setText("oui");
        checkBoxPenteOui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxPenteOuiActionPerformed(evt);
            }
        });

        checkBoxPenteNon.setSelected(true);
        checkBoxPenteNon.setText("non");
        checkBoxPenteNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxPenteNonActionPerformed(evt);
            }
        });

        jLabel20.setText("Colorants :");

        comboBoxColorant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Non", "Brique", "Ocre", "Ardoise", "Noir", "Wimbledon", "Havane", "Citron", "Souris" }));

        jLabel21.setText("Sciage des joints :");

        jLabel22.setText("Garnissage des joints :");

        textAreaInfoComp.setColumns(20);
        textAreaInfoComp.setRows(5);
        jScrollPane2.setViewportView(textAreaInfoComp);

        jLabel23.setText("Infos complémentaires :");

        jTable2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setFocusable(false);
        jTable2.setRowHeight(26);
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
        }

        comboBoxTS2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "calé", "non calé" }));

        fieldTS2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldTS2CaretUpdate(evt);
            }
        });
        fieldTS2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldTS2FocusLost(evt);
            }
        });

        jLabel85.setText("Polystyrène :");

        checkBoxSciageOui.setSelected(true);
        checkBoxSciageOui.setText("oui");
        checkBoxSciageOui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxSciageOuiActionPerformed(evt);
            }
        });

        checkBoxSciageNon.setText("non");
        checkBoxSciageNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxSciageNonActionPerformed(evt);
            }
        });

        checkBoxGarniOui.setText("oui");
        checkBoxGarniOui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxGarniOuiActionPerformed(evt);
            }
        });

        checkBoxGarniNon.setSelected(true);
        checkBoxGarniNon.setText("non");
        checkBoxGarniNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxGarniNonActionPerformed(evt);
            }
        });

        checkBoxQuartzOui.setSelected(true);
        checkBoxQuartzOui.setText("oui");
        checkBoxQuartzOui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxQuartzOuiActionPerformed(evt);
            }
        });

        checkBoxQuartzNon.setText("non");
        checkBoxQuartzNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxQuartzNonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel13))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(checkBoxMousseOui)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkBoxMousseNon))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(checkBoxPolyOui)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkBoxPolyNon))
                                    .addComponent(comboBoxB1, 0, 100, Short.MAX_VALUE)
                                    .addComponent(comboBoxTS1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxTS2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(fieldPloy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addComponent(fieldTS1)
                            .addComponent(comboBoxB2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldTS2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel85)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxColorant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(checkBoxGarniOui)
                                            .addComponent(checkBoxSciageOui))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkBoxSciageNon)
                                            .addComponent(checkBoxGarniNon)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(checkBoxQuartzOui)
                                            .addComponent(checkBoxPenteOui))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkBoxPenteNon)
                                            .addComponent(checkBoxQuartzNon))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(checkBoxMousseOui)
                            .addComponent(checkBoxMousseNon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(checkBoxPolyOui)
                            .addComponent(checkBoxPolyNon)
                            .addComponent(fieldPloy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(comboBoxTS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldTS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxTS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldTS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboBoxB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBoxB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(checkBoxPenteNon)
                                .addComponent(checkBoxPenteOui)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(checkBoxQuartzOui)
                            .addComponent(checkBoxQuartzNon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(comboBoxColorant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(checkBoxSciageOui)
                            .addComponent(checkBoxSciageNon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(checkBoxGarniOui)
                            .addComponent(checkBoxGarniNon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setText("Entreprise :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Téléphone :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Télécopie :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Adresse chantier :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Interlocuteur :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Adresse :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setText("Surface (m²) :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel11.setText("Epaisseur (m) :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel12.setText("Volume (m³) :");

        fieldTel.setNextFocusableComponent(fieldTelecopie);

        fieldTelecopie.setNextFocusableComponent(fieldMail);

        fieldAdrChantier.setNextFocusableComponent(fieldSurface);

        fieldInterlocuteur.setNextFocusableComponent(fieldAdresse);

        fieldAdresse.setNextFocusableComponent(fieldTel);

        fieldSurface.setNextFocusableComponent(fieldEpaisseur);
        fieldSurface.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldSurfaceCaretUpdate(evt);
            }
        });
        fieldSurface.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldSurfaceKeyPressed(evt);
            }
        });

        fieldEpaisseur.setNextFocusableComponent(fieldVolume);
        fieldEpaisseur.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldEpaisseurCaretUpdate(evt);
            }
        });

        fieldVolume.setFocusable(false);

        comboBoxEntreprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEntrepriseActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel54.setText("Mail :");

        fieldMail.setNextFocusableComponent(fieldNomChantier);

        buttonAddClient.setToolTipText("ajouter/modifier/supprimer des clients");
        buttonAddClient.setFocusable(false);
        buttonAddClient.setOpaque(false);
        buttonAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddClientActionPerformed(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel86.setText("Nom chantier :");

        fieldNomChantier.setNextFocusableComponent(fieldAdrChantier);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldInterlocuteur, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxEntreprise, 0, 226, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAddClient))
                    .addComponent(fieldAdresse))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldAdrChantier)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fieldNomChantier)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldTelecopie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldEpaisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldSurface, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(fieldSurface, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddClient)
                    .addComponent(jLabel5)
                    .addComponent(fieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(fieldTelecopie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54)
                    .addComponent(fieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel8)
                        .addComponent(fieldInterlocuteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fieldEpaisseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel86)
                        .addComponent(fieldNomChantier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9)
                    .addComponent(fieldAdrChantier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "FOURNITURE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft Sans Serif", 1, 13))); // NOI18N

        jLabel24.setText("Polyane :");

        jLabel25.setText(" 1.20 ");

        jLabel26.setText("*");

        jLabel27.setText("T.S :");

        jLabel28.setText(" 1.30 ");

        jLabel29.setText("*");

        fieldCalculCAB1.setText("0");
        fieldCalculCAB1.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculCAB1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculCAB1CaretUpdate(evt);
            }
        });

        fieldCalculTS1.setText("0");
        fieldCalculTS1.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculTS1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculTS1CaretUpdate(evt);
            }
        });

        jLabel30.setText("=");

        jLabel31.setText("=");

        fieldCalculPoly2.setText("0");
        fieldCalculPoly2.setFocusable(false);
        fieldCalculPoly2.setMinimumSize(new java.awt.Dimension(6, 100));

        fieldCalculTS2.setText("0");
        fieldCalculTS2.setFocusable(false);
        fieldCalculTS2.setMinimumSize(new java.awt.Dimension(6, 100));

        jLabel32.setText("/");

        jLabel33.setText("/");

        fieldCalculPoly3.setText("330");
        fieldCalculPoly3.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculPoly3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculPoly3CaretUpdate(evt);
            }
        });

        fieldCalculTS3.setText("9.60");
        fieldCalculTS3.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculTS3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculTS3CaretUpdate(evt);
            }
        });

        jLabel34.setText("=");

        jLabel35.setText("=");

        fieldCalculPoly4.setText("0");
        fieldCalculPoly4.setFocusable(false);
        fieldCalculPoly4.setMinimumSize(new java.awt.Dimension(6, 100));

        fieldCalculTS4.setText("0");
        fieldCalculTS4.setFocusable(false);
        fieldCalculTS4.setMinimumSize(new java.awt.Dimension(6, 100));

        jLabel36.setText("Rlx *");

        jLabel37.setText("Pnx *");

        fieldCalculPoly5.setText("63");
        fieldCalculPoly5.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculPoly5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculPoly5CaretUpdate(evt);
            }
        });

        fieldCalculTS5.setText("14");
        fieldCalculTS5.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculTS5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculTS5CaretUpdate(evt);
            }
        });

        jLabel38.setText("€ ");

        jLabel39.setText("€ ");

        jLabel40.setText("=");

        jLabel41.setText("=");

        fieldCalculPolyTotal.setText("0");
        fieldCalculPolyTotal.setFocusable(false);
        fieldCalculPolyTotal.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculPolyTotal.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculPolyTotalCaretUpdate(evt);
            }
        });

        fieldCalculTSTotal.setText("0");
        fieldCalculTSTotal.setFocusable(false);
        fieldCalculTSTotal.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculTSTotal.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculTSTotalCaretUpdate(evt);
            }
        });

        jLabel42.setText("Cale à béton :");

        fieldCalculPoly1.setText("0");
        fieldCalculPoly1.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculPoly1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculPoly1CaretUpdate(evt);
            }
        });

        jLabel43.setText("ml *");

        fieldCalculCAB2.setText("0.30");
        fieldCalculCAB2.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculCAB2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculCAB2CaretUpdate(evt);
            }
        });

        jLabel44.setText("€");

        jLabel45.setText("=");

        fieldCalculCABTotal.setText("0");
        fieldCalculCABTotal.setFocusable(false);
        fieldCalculCABTotal.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculCABTotal.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculCABTotalCaretUpdate(evt);
            }
        });

        jLabel46.setText("Béton :");

        jLabel47.setText("m³ *");

        fieldCalculBeton1.setText("0");
        fieldCalculBeton1.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculBeton1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculBeton1CaretUpdate(evt);
            }
        });

        fieldCalculBeton2.setText("81");
        fieldCalculBeton2.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculBeton2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculBeton2CaretUpdate(evt);
            }
        });

        jLabel48.setText("€");

        jLabel49.setText("=");

        fieldCalculBetonTotal.setText("0");
        fieldCalculBetonTotal.setFocusable(false);
        fieldCalculBetonTotal.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculBetonTotal.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculBetonTotalCaretUpdate(evt);
            }
        });

        jLabel50.setText("Fibres :");

        fieldCalculFibre1.setText("0");
        fieldCalculFibre1.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculFibre1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculFibre1CaretUpdate(evt);
            }
        });

        jLabel51.setText("m³ *");

        fieldCalculFibre.setText("0");
        fieldCalculFibre.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculFibre.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculFibreCaretUpdate(evt);
            }
        });

        jLabel52.setText("€");

        jLabel53.setText("=");

        fieldCalculFibreTotal.setText("0");
        fieldCalculFibreTotal.setFocusable(false);
        fieldCalculFibreTotal.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculFibreTotal.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculFibreTotalCaretUpdate(evt);
            }
        });

        fieldCalculPompe1.setText("0");
        fieldCalculPompe1.setFocusable(false);
        fieldCalculPompe1.setMinimumSize(new java.awt.Dimension(6, 100));

        jLabel55.setText("m³ *");

        fieldCalculPompe2.setText("0");
        fieldCalculPompe2.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculPompe2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculPompe2CaretUpdate(evt);
            }
        });

        jLabel56.setText("€");

        jLabel57.setText("=");

        fieldCalculPompeTotal.setText("0");
        fieldCalculPompeTotal.setFocusable(false);
        fieldCalculPompeTotal.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculPompeTotal.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculPompeTotalCaretUpdate(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel58.setText("Coëf. * TOTAL");

        fieldCoef.setText("1.15");
        fieldCoef.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCoef.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCoefCaretUpdate(evt);
            }
        });

        jLabel59.setText("=");

        fieldCalculTotal1.setText("0");
        fieldCalculTotal1.setFocusable(false);
        fieldCalculTotal1.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculTotal1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculTotal1CaretUpdate(evt);
            }
        });

        jLabel61.setText("=");

        fieldCalculTotalFourni.setText("0");
        fieldCalculTotalFourni.setFocusable(false);
        fieldCalculTotalFourni.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculTotalFourni.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculTotalFourniCaretUpdate(evt);
            }
        });

        fieldCalculTotalMOE.setText("0");
        fieldCalculTotalMOE.setFocusable(false);
        fieldCalculTotalMOE.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculTotalMOE.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculTotalMOECaretUpdate(evt);
            }
        });

        fieldCalculTotalFinal.setText("0");
        fieldCalculTotalFinal.setFocusable(false);
        fieldCalculTotalFinal.setMinimumSize(new java.awt.Dimension(6, 100));

        jLabel62.setText("=");

        jLabel63.setText("=");

        jLabel64.setText("TOTAL Main d'oeuvre/m²");

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel65.setText("TOTAL €/m² HT");

        jLabel66.setText("TOTAL Fournitures/m²");

        checkBoxFourniture.setSelected(true);
        checkBoxFourniture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxFournitureActionPerformed(evt);
            }
        });

        jLabel67.setText("m² ");

        jLabel68.setText("m² ");

        jLabel69.setText("T.S :");

        jLabel70.setText(" 1.30 ");

        fieldCalculTSTotal2.setText("0");
        fieldCalculTSTotal2.setFocusable(false);
        fieldCalculTSTotal2.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculTSTotal2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculTSTotal2CaretUpdate(evt);
            }
        });

        jLabel71.setText("=");

        jLabel72.setText("*");

        fieldCalculTS6.setText("0");
        fieldCalculTS6.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculTS6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculTS6CaretUpdate(evt);
            }
        });

        jLabel73.setText("=");

        fieldCalculTS7.setText("0");
        fieldCalculTS7.setFocusable(false);
        fieldCalculTS7.setMinimumSize(new java.awt.Dimension(6, 100));

        jLabel74.setText("/");

        fieldCalculTS8.setText("0");
        fieldCalculTS8.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculTS8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculTS8CaretUpdate(evt);
            }
        });

        jLabel75.setText("m² ");

        jLabel76.setText("=");

        fieldCalculTS9.setText("0");
        fieldCalculTS9.setFocusable(false);
        fieldCalculTS9.setMinimumSize(new java.awt.Dimension(6, 100));

        jLabel77.setText("Pnx *");

        fieldCalculTS10.setText("0");
        fieldCalculTS10.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculTS10.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculTS10CaretUpdate(evt);
            }
        });

        jLabel78.setText("€ ");

        jLabel80.setText("+");

        fieldCalculPompe3.setText("0");
        fieldCalculPompe3.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculPompe3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculPompe3CaretUpdate(evt);
            }
        });

        jLabel79.setText("€ ");

        jLabel81.setText("Polystyrène :");

        fieldCalculPolystyreneTotal.setText("0");
        fieldCalculPolystyreneTotal.setFocusable(false);
        fieldCalculPolystyreneTotal.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculPolystyreneTotal.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculPolystyreneTotalCaretUpdate(evt);
            }
        });

        jLabel82.setText("=");

        jLabel83.setText("m² *");

        fieldCalculPolystyrene2.setText("0");
        fieldCalculPolystyrene2.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculPolystyrene2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculPolystyrene2CaretUpdate(evt);
            }
        });

        jLabel84.setText("€");

        fieldCalculPolystyrene1.setText("0");
        fieldCalculPolystyrene1.setMinimumSize(new java.awt.Dimension(6, 100));
        fieldCalculPolystyrene1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldCalculPolystyrene1CaretUpdate(evt);
            }
        });

        comboBoxPompe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pompe", "Tapis", "Goulotte" }));

        comboBoxBeton.setEditable(true);
        comboBoxBeton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BPS C25/30 XF1 320 KG", "BPS XA2 C35/45 D20 S3", "BPS XF1 C25/30 D20 S3" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(checkBoxFourniture)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel24)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel25)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel26)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(fieldCalculTS1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                            .addComponent(fieldCalculPoly1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(fieldCalculBeton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fieldCalculTS6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel69)
                                    .addComponent(jLabel81))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel28)
                                                .addGap(0, 0, 0)
                                                .addComponent(jLabel29))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel70)
                                                .addGap(0, 0, 0)
                                                .addComponent(jLabel72)))
                                        .addGap(25, 25, 25))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(fieldCalculPolystyrene1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxPompe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldCalculCAB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fieldCoef, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fieldCalculPompe1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fieldCalculFibre1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 4, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel65)
                            .addComponent(jLabel64)
                            .addComponent(jLabel66))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62)
                            .addComponent(jLabel63))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldCalculTotalFourni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldCalculTotalMOE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldCalculTotalFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel73)
                                    .addGap(0, 0, 0)
                                    .addComponent(fieldCalculTS7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jLabel74)
                                    .addGap(0, 0, 0)
                                    .addComponent(fieldCalculTS8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jLabel75))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel55)
                                                .addGap(0, 0, 0)
                                                .addComponent(fieldCalculPompe2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel51)
                                                .addGap(0, 0, 0)
                                                .addComponent(fieldCalculFibre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel43)
                                                    .addComponent(jLabel47)
                                                    .addComponent(jLabel83))
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(fieldCalculPolystyrene2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(fieldCalculBeton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(fieldCalculCAB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel56))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel80))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel44)
                                                    .addComponent(jLabel84))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel48)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(comboBoxBeton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel30)
                                                .addGap(0, 0, 0)
                                                .addComponent(fieldCalculPoly2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jLabel32)
                                                .addGap(0, 0, 0)
                                                .addComponent(fieldCalculPoly3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jLabel67)
                                                .addGap(0, 0, 0)
                                                .addComponent(jLabel34)
                                                .addGap(0, 0, 0)
                                                .addComponent(fieldCalculPoly4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jLabel36))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel31)
                                                .addGap(0, 0, 0)
                                                .addComponent(fieldCalculTS2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jLabel33)
                                                .addGap(0, 0, 0)
                                                .addComponent(fieldCalculTS3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jLabel68)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(jLabel35)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(fieldCalculTS4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, 0)
                                                        .addComponent(jLabel37))
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(jLabel76)
                                                        .addGap(0, 0, 0)
                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(fieldCalculPompe3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jLabel79))
                                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(fieldCalculTS9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jLabel77)))))))
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(fieldCalculTS5, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                            .addComponent(fieldCalculPoly5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fieldCalculTS10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel82)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldCalculPolystyreneTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel59)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fieldCalculTotal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldCalculPolyTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(jLabel45)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(fieldCalculCABTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(jLabel49)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(fieldCalculBetonTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(jLabel53)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(fieldCalculFibreTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(jLabel57)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(fieldCalculPompeTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(jLabel39)
                                                    .addGap(0, 0, 0)
                                                    .addComponent(jLabel41))
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(jLabel78)
                                                    .addGap(0, 0, 0)
                                                    .addComponent(jLabel71)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fieldCalculTSTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fieldCalculTSTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26)
                                .addComponent(jLabel30)
                                .addComponent(fieldCalculPoly2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel32)
                                .addComponent(fieldCalculPoly3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34)
                                .addComponent(fieldCalculPoly4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel36)
                                .addComponent(fieldCalculPoly5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel38)
                                .addComponent(jLabel40)
                                .addComponent(fieldCalculPolyTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fieldCalculPoly1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel25)
                                .addComponent(jLabel24))))
                    .addComponent(checkBoxFourniture))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(fieldCalculTS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(fieldCalculTS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(fieldCalculTS3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(fieldCalculTS4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(fieldCalculTS5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel41)
                    .addComponent(fieldCalculTSTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(jLabel70)
                    .addComponent(fieldCalculTSTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71)
                    .addComponent(jLabel72)
                    .addComponent(fieldCalculTS6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73)
                    .addComponent(fieldCalculTS7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74)
                    .addComponent(fieldCalculTS8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75)
                    .addComponent(jLabel76)
                    .addComponent(fieldCalculTS9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77)
                    .addComponent(fieldCalculTS10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(fieldCalculPolystyrene1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83)
                    .addComponent(fieldCalculPolystyrene2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84)
                    .addComponent(jLabel82)
                    .addComponent(fieldCalculPolystyreneTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(fieldCalculCAB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(fieldCalculCAB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45)
                    .addComponent(fieldCalculCABTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(fieldCalculBeton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(fieldCalculBeton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(fieldCalculBetonTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxBeton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(fieldCalculFibre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(fieldCalculFibre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addComponent(fieldCalculFibreTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCalculPompe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                    .addComponent(fieldCalculPompe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57)
                    .addComponent(fieldCalculPompeTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80)
                    .addComponent(fieldCalculPompe3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79)
                    .addComponent(comboBoxPompe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldCoef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel58))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel59)
                        .addComponent(fieldCalculTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(fieldCalculTotalFourni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCalculTotalMOE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCalculTotalFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63)
                    .addComponent(jLabel65))
                .addGap(20, 20, 20))
        );

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel3.setText("DATE");

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel4.setText("ETUDE DE PRIX");

        fieldDate.setFocusable(false);
        fieldDate.setNextFocusableComponent(fieldEpaisseur);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(fieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenu1.setText("Fichier");

        jMenuItem6.setText("Nouveau");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem3.setText("Ouvrir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem2.setText("Enregistrer");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Enregistrer sous");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem1.setText("Imprimer");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("BonCommande");

        jMenuItem5.setText("Pré-rempli");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:
        this.jTable2.setValueAt(calculMainDoeuvre(), 0, 0);
        this.fieldCalculTotalMOE.setText(Float.toString(arrondiCalcul(calculMainDoeuvre())));
    }//GEN-LAST:event_jTable1PropertyChange

    private void checkBoxFournitureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxFournitureActionPerformed
        // TODO add your handling code here:
        Component[] tabComp = this.jPanel4.getComponents();
        if(!this.checkBoxFourniture.isSelected()){
            for(int i=0;i<tabComp.length;i++){
                tabComp[i].setEnabled(false);
            }
            this.checkBoxFourniture.setEnabled(true);
            this.fieldCalculTotalFourni.setText("0");
            this.fieldCalculTotalMOE.setEnabled(true);
            this.fieldCalculTotalFinal.setEnabled(true);
            this.jLabel64.setEnabled(true);
            this.jLabel65.setEnabled(true);
        }else{
            for(int i=0;i<tabComp.length;i++){
                tabComp[i].setEnabled(true);
            }
        }
    }//GEN-LAST:event_checkBoxFournitureActionPerformed

    private void fieldCalculTotalMOECaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculTotalMOECaretUpdate
        // TODO add your handling code here:
        if(!this.fieldCalculTotalMOE.getText().isEmpty()){
            this.fieldCalculTotalFinal.setText(calculTotal());
        }
    }//GEN-LAST:event_fieldCalculTotalMOECaretUpdate

    private void fieldCalculTotalFourniCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculTotalFourniCaretUpdate
        // TODO add your handling code here:
        if(!this.fieldCalculTotalFourni.getText().isEmpty()){
            this.fieldCalculTotalFinal.setText(calculTotal());
        }
    }//GEN-LAST:event_fieldCalculTotalFourniCaretUpdate

    private void fieldCalculTotal1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculTotal1CaretUpdate
        // TODO add your handling code here:
        if(!this.fieldCalculTotal1.getText().isEmpty() && !this.fieldSurface.getText().isEmpty()){
            this.fieldCalculTotalFourni.setText(calculTotalFourniture());
        }
    }//GEN-LAST:event_fieldCalculTotal1CaretUpdate

    private void fieldCoefCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCoefCaretUpdate
        // TODO add your handling code here:        
        AffichageChampCorrect(fieldCoef);
        
        if(!this.fieldCoef.getText().isEmpty() && this.fieldCoef.getText().matches("[^a-zA-Z]*")){
            this.fieldCalculTotal1.setText(calculTotalAvecCoef());
        }else{            
            AffichageChampIncorrect(fieldCoef);
        }
    }//GEN-LAST:event_fieldCoefCaretUpdate

    private void fieldCalculPompeTotalCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculPompeTotalCaretUpdate
        // TODO add your handling code here:
        if(!this.fieldCalculPompeTotal.getText().isEmpty()){
            this.fieldCalculTotal1.setText(calculTotalAvecCoef());
        }
    }//GEN-LAST:event_fieldCalculPompeTotalCaretUpdate

    private void fieldCalculPompe2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculPompe2CaretUpdate
        // TODO add your handling code here:        
        AffichageChampCorrect(fieldCalculPompe2);
        
        if(!this.fieldCalculPompe2.getText().isEmpty() && this.fieldCalculPompe2.getText().matches("[^a-zA-Z]*")){
            if(!this.fieldCalculPompe3.getText().isEmpty() && this.fieldCalculPompe3.getText().matches("[^a-zA-Z]*")){
                this.fieldCalculPompeTotal.setText(calculP());
            }
        }else{            
            AffichageChampIncorrect(fieldCalculPompe2);
        }
    }//GEN-LAST:event_fieldCalculPompe2CaretUpdate

    private void fieldCalculFibreTotalCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculFibreTotalCaretUpdate
        // TODO add your handling code here:
        if(!this.fieldCalculFibreTotal.getText().isEmpty()){
            this.fieldCalculTotal1.setText(calculTotalAvecCoef());
        }
    }//GEN-LAST:event_fieldCalculFibreTotalCaretUpdate

    private void fieldCalculFibreCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculFibreCaretUpdate
        // TODO add your handling code here:        
        AffichageChampCorrect(fieldCalculFibre);

        if(!this.fieldCalculFibre.getText().isEmpty() && this.fieldCalculFibre.getText().matches("[^a-zA-Z]*")){
            if(!this.fieldCalculFibre1.getText().isEmpty() && this.fieldCalculFibre1.getText().matches("[^a-zA-Z]*")){
                this.fieldCalculFibreTotal.setText(calculF());
            }
        }else{            
            AffichageChampIncorrect(fieldCalculFibre);
        }
    }//GEN-LAST:event_fieldCalculFibreCaretUpdate

    private void fieldCalculBetonTotalCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculBetonTotalCaretUpdate
        // TODO add your handling code here:
        if(!this.fieldCalculBetonTotal.getText().isEmpty()){
            this.fieldCalculTotal1.setText(calculTotalAvecCoef());
        }
    }//GEN-LAST:event_fieldCalculBetonTotalCaretUpdate

    private void fieldCalculBeton2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculBeton2CaretUpdate
        // TODO add your handling code here:        
        AffichageChampCorrect(fieldCalculBeton2);

        if(!this.fieldCalculBeton2.getText().isEmpty() && this.fieldCalculBeton2.getText().matches("[^a-zA-Z]*")){
            if(!this.fieldCalculBeton1.getText().isEmpty() && this.fieldCalculBeton1.getText().matches("[^a-zA-Z]*")){
                this.fieldCalculBetonTotal.setText(calculB());
            }
        }else{            
            AffichageChampIncorrect(fieldCalculBeton2);
        }
    }//GEN-LAST:event_fieldCalculBeton2CaretUpdate

    private void fieldCalculCABTotalCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculCABTotalCaretUpdate
        // TODO add your handling code here:
        if(!this.fieldCalculCABTotal.getText().isEmpty()){
            this.fieldCalculTotal1.setText(calculTotalAvecCoef());
        }
    }//GEN-LAST:event_fieldCalculCABTotalCaretUpdate

    private void fieldCalculCAB2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculCAB2CaretUpdate
        // TODO add your handling code here:        
        AffichageChampCorrect(fieldCalculCAB2);

        if(!this.fieldCalculCAB2.getText().isEmpty() && this.fieldCalculCAB2.getText().matches("[^a-zA-Z]*")){
            if(!this.fieldCalculCAB1.getText().isEmpty() && this.fieldCalculCAB1.getText().matches("[^a-zA-Z]*")){
                this.fieldCalculCABTotal.setText(calculCAB());
            }
        }else{            
            AffichageChampIncorrect(fieldCalculCAB2);
        }
    }//GEN-LAST:event_fieldCalculCAB2CaretUpdate

    private void fieldCalculTSTotalCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculTSTotalCaretUpdate
        // TODO add your handling code here:
        if(!this.fieldCalculTSTotal.getText().isEmpty()){
            this.fieldCalculTotal1.setText(calculTotalAvecCoef());
        }
    }//GEN-LAST:event_fieldCalculTSTotalCaretUpdate

    private void fieldCalculPolyTotalCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculPolyTotalCaretUpdate
        // TODO add your handling code here:
        if(!this.fieldCalculPolyTotal.getText().isEmpty()){
            this.fieldCalculTotal1.setText(calculTotalAvecCoef());
        }
    }//GEN-LAST:event_fieldCalculPolyTotalCaretUpdate

    private void fieldCalculTS5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculTS5CaretUpdate
        // TODO add your handling code here:        
        AffichageChampCorrect(fieldCalculTS5);

        if(!this.fieldCalculTS5.getText().isEmpty() && this.fieldCalculTS5.getText().matches("[^a-zA-Z]*")){
            this.fieldCalculTSTotal.setText(calculTS3());
        }else{            
            AffichageChampIncorrect(fieldCalculTS5);
        }
    }//GEN-LAST:event_fieldCalculTS5CaretUpdate

    private void fieldCalculPoly5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculPoly5CaretUpdate
        // TODO add your handling code here:        
        AffichageChampCorrect(fieldCalculPoly5);

        if(!this.fieldCalculPoly5.getText().isEmpty() && this.fieldCalculPoly5.getText().matches("[^a-zA-Z]*")){
            this.fieldCalculPolyTotal.setText(calculPolyane3());
        }else{            
            AffichageChampIncorrect(fieldCalculPoly5);
        }
    }//GEN-LAST:event_fieldCalculPoly5CaretUpdate

    private void fieldCalculTS3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculTS3CaretUpdate
        // TODO add your handling code here:        
        AffichageChampCorrect(fieldCalculTS3);

        if(!this.fieldCalculTS3.getText().isEmpty() && this.fieldCalculTS3.getText().matches("[^a-zA-Z]*")){
            this.fieldCalculTS4.setText(calculTS2());
            if(!this.fieldCalculTS5.getText().isEmpty() && this.fieldCalculTS5.getText().matches("[^a-zA-Z]*")){
                this.fieldCalculTSTotal.setText(calculTS3());
            }
        }else{            
            AffichageChampIncorrect(fieldCalculTS3);
        }
    }//GEN-LAST:event_fieldCalculTS3CaretUpdate

    private void fieldCalculPoly3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculPoly3CaretUpdate
        // TODO add your handling code here:        
        AffichageChampCorrect(fieldCalculPoly3);

        if(!this.fieldCalculPoly3.getText().isEmpty() && this.fieldCalculPoly3.getText().matches("[^a-zA-Z]*")){
            this.fieldCalculPoly4.setText(calculPolyane2());
            if(!this.fieldCalculPoly5.getText().isEmpty() && this.fieldCalculPoly5.getText().matches("[^a-zA-Z]*")){
                this.fieldCalculPolyTotal.setText(calculPolyane3());
            }
        }else{            
            AffichageChampIncorrect(fieldCalculPoly3);
        }
    }//GEN-LAST:event_fieldCalculPoly3CaretUpdate
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        if(fichierOuvert!=null){
            try {
                saveDevisInXlsx(fichierOuvert.getAbsolutePath());
            } catch (IOException ex) {
                Logger.getLogger(JFrameDevisGest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try{            
               JFileChooser chooser = new JFileChooser();      
               FileNameExtensionFilter xlsxFilter = new FileNameExtensionFilter("xlsx files (*.xlsx)", "xlsx");
               chooser.addChoosableFileFilter(xlsxFilter);
               chooser.setFileFilter(xlsxFilter);

               File fDirectory = new  File("./Devis"+File.separator);
               // Dossier Courant
              chooser.setCurrentDirectory(fDirectory); 

              Date actuelleF = new Date();
              DateFormat dateFormatF = new SimpleDateFormat("dd-MM-yyyy");
              String dateF = dateFormatF.format(actuelleF);

              File f = new  File("EDP_"+this.comboBoxEntreprise.getSelectedItem()+"_"+fieldNomChantier.getText());
              chooser.setSelectedFile(f);
               //Affichage et récupération de la réponse de l'utilisateur
               int reponse = chooser.showDialog(chooser,"Enregistrer sous");             
              // Si l'utilisateur clique sur OK
              if  (reponse == JFileChooser.APPROVE_OPTION){                
                     // Récupération du chemin du fichier
                    File fichier = new File(chooser.getSelectedFile().toString()+".xlsx");
                    saveDevisInXlsx(fichier.getAbsolutePath());
                    modif = false;
               }
            }catch(HeadlessException he){
                he.printStackTrace();
            } catch (IOException ex) {
                Logger.getLogger(JFrameDevisGest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public void saveDevisInXlsx(String nomFichier) throws FileNotFoundException, IOException{
        FileInputStream fichier = new FileInputStream(new File("./Devis/modeleDevis.xlsx"));
        //créer une instance workbook qui fait référence au fichier xlsx 
        XSSFWorkbook wb = new XSSFWorkbook(fichier);
        XSSFSheet sheet = wb.getSheetAt(0);
        Row row0 = sheet.getRow((short) 0);        
        Row row1 = sheet.getRow((short) 1);
        Row row2 = sheet.getRow((short) 2);
        Row row5 = sheet.getRow((short) 5);
        Row row6 = sheet.getRow((short) 6);
        Row row7 = sheet.getRow((short) 7);
        Row row8 = sheet.getRow((short) 8);
        Row row9 = sheet.getRow((short) 9);
        Row row10 = sheet.getRow((short) 10);
        Row row11 = sheet.getRow((short) 11);
        Row row12 = sheet.getRow((short) 12);
        Row row13 = sheet.getRow((short) 13);
        Row row14 = sheet.getRow((short) 14);
        Row row15 = sheet.getRow((short) 15);
        Row row16 = sheet.getRow((short) 16);
        //**********************
        //
        // ENREGISTREMENT ENTETE
        //
        //**********************
        String libelle = comboBoxEntreprise.getSelectedItem().toString();
        String adrChantier = fieldAdrChantier.getText();
        String nomChantier = fieldNomChantier.getText();
        String surface = fieldSurface.getText();
        String epaisseur = fieldEpaisseur.getText();
        
        row0.getCell(1).setCellValue(libelle);
        row0.getCell(7).setCellValue(surface);
        
        row1.getCell(1).setCellValue(nomChantier);
        row1.getCell(7).setCellValue(epaisseur);
        
        row2.getCell(1).setCellValue(adrChantier);
        //**********************
        //
        // ENREGISTREMENT MAIN D'OEUVRE
        //
        //**********************
        String mousse = "";
        String polyane = "";
        if(checkBoxMousseOui.isSelected()){
            mousse=checkBoxMousseOui.getText();
        }
        if(checkBoxMousseNon.isSelected()){
            mousse=checkBoxMousseNon.getText();
        }
        if(checkBoxPolyOui.isSelected()){
            polyane=checkBoxPolyOui.getText();
        }
        if(checkBoxPolyNon.isSelected()){
            polyane=checkBoxPolyNon.getText();
        }
        String polyaneValue = fieldPloy.getText(); 
        if(jTable1.getValueAt(0, 0)!=null){
            try{
                float polyanePrix = (float)jTable1.getValueAt(0, 0);
                row6.getCell(3).setCellValue(String.valueOf(polyanePrix));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erreur de saisie", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        String ts1 = comboBoxTS1.getSelectedItem().toString();
        String ts1Value = fieldTS1.getText(); 
        if(jTable1.getValueAt(1, 0)!=null){
            try{
                float ts1Prix = (float)jTable1.getValueAt(1, 0);
                row7.getCell(3).setCellValue(String.valueOf(ts1Prix));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erreur de saisie", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }  
        
        String ts2 = comboBoxTS2.getSelectedItem().toString();
        String ts2Value = fieldTS2.getText(); 
        if(jTable1.getValueAt(2, 0)!=null){
            try{
                float ts2Prix = (float)jTable1.getValueAt(2, 0);
                row8.getCell(3).setCellValue(String.valueOf(ts2Prix));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erreur de saisie", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(jTable1.getValueAt(3, 0)!=null){
            try{
                float polystPrix = (float)jTable1.getValueAt(3, 0);
                row9.getCell(3).setCellValue(String.valueOf(polystPrix));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erreur de saisie", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        String betonType1 = comboBoxB1.getSelectedItem().toString();
        String betonType2 = comboBoxB2.getSelectedItem().toString();
        if(jTable1.getValueAt(4, 0)!=null){
            try{
                float betonPrix = (float)jTable1.getValueAt(4, 0);
                row10.getCell(3).setCellValue(String.valueOf(betonPrix));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erreur de saisie", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        String pente = "";
        if(checkBoxPenteOui.isSelected()){
            pente=checkBoxPenteOui.getText();
        }
        if(checkBoxPenteNon.isSelected()){
            pente=checkBoxPenteNon.getText();
        }
        if(jTable1.getValueAt(5, 0)!=null){
            try{
                float pentePrix = (float)jTable1.getValueAt(5, 0);
                row11.getCell(3).setCellValue(String.valueOf(pentePrix));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erreur de saisie", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
        String quartz = ""; 
        if(checkBoxQuartzOui.isSelected()){
            quartz=checkBoxQuartzOui.getText();
        }
        if(checkBoxQuartzNon.isSelected()){
            quartz=checkBoxQuartzNon.getText();
        }
        if(jTable1.getValueAt(6, 0)!=null){
            try{
                float quartzPrix = (float)jTable1.getValueAt(6, 0);
                row12.getCell(3).setCellValue(String.valueOf(quartzPrix));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erreur de saisie", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
        String colorant = comboBoxColorant.getSelectedItem().toString();
        if(jTable1.getValueAt(7, 0)!=null){
            try{
                float colorantPrix = (float)jTable1.getValueAt(7, 0);
                row13.getCell(3).setCellValue(String.valueOf(colorantPrix));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erreur de saisie", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }   
        String sciage = "";
        String garnissage = "";
        if(checkBoxSciageOui.isSelected()){
            sciage=checkBoxSciageOui.getText();
        }
        if(checkBoxSciageNon.isSelected()){
            sciage=checkBoxSciageNon.getText();
        }
        if(checkBoxGarniOui.isSelected()){
            garnissage=checkBoxGarniOui.getText();
        }
        if(checkBoxGarniNon.isSelected()){
            garnissage=checkBoxGarniNon.getText();
        }
        if(jTable1.getValueAt(8, 0)!=null){
            try{
                float sciagePrix = (float)jTable1.getValueAt(8, 0);
                row14.getCell(3).setCellValue(String.valueOf(sciagePrix));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erreur de saisie", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(jTable1.getValueAt(9, 0)!=null){
            try{
                float garnissagePrix = (float)jTable1.getValueAt(9, 0);
                row15.getCell(3).setCellValue(String.valueOf(garnissagePrix));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erreur de saisie", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
        String infos = textAreaInfoComp.getText(); 
        
        row5.getCell(1).setCellValue(mousse);
        
        row6.getCell(1).setCellValue(polyane);
        row6.getCell(2).setCellValue(polyaneValue);        
        
        row7.getCell(1).setCellValue(ts1);
        row7.getCell(2).setCellValue(ts1Value);        
        
        row8.getCell(1).setCellValue(ts2);
        row8.getCell(2).setCellValue(ts2Value);        
        
        row10.getCell(1).setCellValue(betonType1);
        row10.getCell(2).setCellValue(betonType2);        
        
        row11.getCell(1).setCellValue(pente);        
        
        row12.getCell(1).setCellValue(quartz);        
        
        row13.getCell(1).setCellValue(colorant);        
        
        row14.getCell(1).setCellValue(sciage);
        
        row15.getCell(1).setCellValue(garnissage);
        
        
        row16.getCell(1).setCellValue(infos);
        //**********************
        //
        // ENREGISTREMENT FOURNITURE
        //
        //**********************
        String fourniture = "oui";
        if(!checkBoxFourniture.isSelected()){
            fourniture="non";
        }
        float polyaneCalcul0 = Float.parseFloat(fieldCalculPoly1.getText());
        float polyaneCalcul1 = Float.parseFloat(fieldCalculPoly3.getText());
        float polyaneCalcul2 = Float.parseFloat(fieldCalculPoly5.getText());
        
        float ts1Calcul0 = Float.parseFloat(fieldCalculTS1.getText());
        float ts1Calcul1 = Float.parseFloat(fieldCalculTS3.getText());
        float ts1Calcul2 = Float.parseFloat(fieldCalculTS5.getText());
        
        float ts2Calcul0 = Float.parseFloat(fieldCalculTS6.getText());
        float ts2Calcul1 = Float.parseFloat(fieldCalculTS8.getText());
        float ts2Calcul2 = Float.parseFloat(fieldCalculTS10.getText());
        
        float polystCalcul0 = Float.parseFloat(fieldCalculPolystyrene1.getText());
        float polystCalcul1 = Float.parseFloat(fieldCalculPolystyrene2.getText());
        
        float CAB0 = Float.parseFloat(fieldCalculCAB1.getText());
        float CAB1 = Float.parseFloat(fieldCalculCAB2.getText());
        float B0 = Float.parseFloat(fieldCalculBeton1.getText());
        float B1 = Float.parseFloat(fieldCalculBeton2.getText());
        String B2 = comboBoxBeton.getSelectedItem().toString();
        float F0 = Float.parseFloat(fieldCalculFibre1.getText());
        float F1 = Float.parseFloat(fieldCalculFibre.getText());
        String P = comboBoxPompe.getSelectedItem().toString();
        float P0 = Float.parseFloat(fieldCalculPompe1.getText());
        float P1 = Float.parseFloat(fieldCalculPompe2.getText());
        float P2 = Float.parseFloat(fieldCalculPompe3.getText());
        float coef = Float.parseFloat(fieldCoef.getText());
        
        row5.getCell(5).setCellValue(fourniture);
        
        row6.getCell(6).setCellValue(String.valueOf(polyaneCalcul0));
        row6.getCell(7).setCellValue(String.valueOf(polyaneCalcul1));
        row6.getCell(8).setCellValue(String.valueOf(polyaneCalcul2));
        
        row7.getCell(6).setCellValue(String.valueOf(ts1Calcul0));
        row7.getCell(7).setCellValue(String.valueOf(ts1Calcul1));
        row7.getCell(8).setCellValue(String.valueOf(ts1Calcul2));
        
        row8.getCell(6).setCellValue(String.valueOf(ts2Calcul0));
        row8.getCell(7).setCellValue(String.valueOf(ts2Calcul1));
        row8.getCell(8).setCellValue(String.valueOf(ts2Calcul2));
        
        row9.getCell(6).setCellValue(String.valueOf(polystCalcul0));
        row9.getCell(7).setCellValue(String.valueOf(polystCalcul1));
        
        row10.getCell(6).setCellValue(String.valueOf(CAB0));
        row10.getCell(7).setCellValue(String.valueOf(CAB1));
        
        row11.getCell(6).setCellValue(String.valueOf(B0));
        row11.getCell(7).setCellValue(String.valueOf(B1));
        row11.getCell(8).setCellValue(String.valueOf(B2));
        
        row12.getCell(6).setCellValue(String.valueOf(F0));
        row12.getCell(7).setCellValue(String.valueOf(F1));
        
        row13.getCell(6).setCellValue(String.valueOf(P));
        row13.getCell(7).setCellValue(String.valueOf(P0));
        row13.getCell(8).setCellValue(String.valueOf(P1));
        row13.getCell(9).setCellValue(String.valueOf(P2));
        
        row14.getCell(6).setCellValue(String.valueOf(coef));
        
        FileOutputStream fileOut;
        try {
            fileOut = new FileOutputStream(nomFichier);
            wb.write(fileOut);
            fileOut.close();
            JOptionPane.showMessageDialog(null, "Le Devis a été enregistré", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        try{
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter xlsFilter = new FileNameExtensionFilter("xlsx files (*.xlsx)", "xlsx");
            chooser.addChoosableFileFilter(xlsFilter);
            chooser.setFileFilter(xlsFilter);
            // Dossier Courant
            chooser.setCurrentDirectory(new  File("./Devis/"+File.separator));
            //ajout du file finder
            chooser.setAccessory (new FindAccessory (chooser));
            //Affichage et récupération de la réponse de l'utilisateur
            int reponse = chooser.showDialog(chooser,"Sélectionner");
            // Si l'utilisateur clique sur OK
            if  (reponse == JFileChooser.APPROVE_OPTION){
                try{
                    // Récupération du chemin du fichier                
                    File fichier = new File(chooser.getSelectedFile().toString());
                    fichierOuvert=fichier;
                    chargerDevisXls(fichier.getAbsolutePath());
                    modif = true;
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Un problème est survenu au chargement du fichier", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(HeadlessException he){
            he.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public void chargerDevisXls(String nomfichier) throws FileNotFoundException, IOException{
        FileInputStream fichier = new FileInputStream(new File(nomfichier));
        //créer une instance workbook qui fait référence au fichier xlsx 
        XSSFWorkbook wb = new XSSFWorkbook(fichier);
        XSSFSheet sheet = wb.getSheetAt(0);

        Row row0 = sheet.getRow((short) 0);
        String libelle = row0.getCell(1).getStringCellValue();
        String surface = row0.getCell(7).getStringCellValue();
        
        Row row1 = sheet.getRow((short) 1);
        String nomChantier = row1.getCell(1).getStringCellValue();
        String epaisseur = row1.getCell(7).getStringCellValue();
        
        Row row2 = sheet.getRow((short) 2);
        String adrChantier = row2.getCell(1).getStringCellValue();
        
        Row row5 = sheet.getRow((short) 5);
        String mousse = row5.getCell(1).getStringCellValue();
        String fourniture = row5.getCell(5).getStringCellValue();
        
        Row row6 = sheet.getRow((short) 6);
        String polyane = row6.getCell(1).getStringCellValue();
        String polyaneValue = row6.getCell(2).getStringCellValue();
        String polyanePrix = row6.getCell(3).getStringCellValue();
        String polyaneCalcul0 = row6.getCell(6).getStringCellValue();
        String polyaneCalcul1 = row6.getCell(7).getStringCellValue();
        String polyaneCalcul2 = row6.getCell(8).getStringCellValue();
        
        Row row7 = sheet.getRow((short) 7);
        String ts1 = row7.getCell(1).getStringCellValue();
        String ts1Value = row7.getCell(2).getStringCellValue();
        String ts1Prix = row7.getCell(3).getStringCellValue();
        String ts1Calcul0 = row7.getCell(6).getStringCellValue();
        String ts1Calcul1 = row7.getCell(7).getStringCellValue();
        String ts1Calcul2 = row7.getCell(8).getStringCellValue();
        
        Row row8 = sheet.getRow((short) 8);
        String ts2 = row8.getCell(1).getStringCellValue();
        String ts2Value = row8.getCell(2).getStringCellValue();
        String ts2Prix = row8.getCell(3).getStringCellValue();
        String ts2Calcul0 = row8.getCell(6).getStringCellValue();
        String ts2Calcul1 = row8.getCell(7).getStringCellValue();
        String ts2Calcul2 = row8.getCell(8).getStringCellValue();
        
        Row row9 = sheet.getRow((short) 9);
        String polystPrix = row9.getCell(3).getStringCellValue();
        String polystCalul0 = row9.getCell(6).getStringCellValue();
        String polystCalul1 = row9.getCell(7).getStringCellValue();
        
        Row row10 = sheet.getRow((short) 10);
        String betonType1 = row10.getCell(1).getStringCellValue();
        String betonType2 = row10.getCell(2).getStringCellValue();
        String betonPrix = row10.getCell(3).getStringCellValue();
        String CABCalcul0 = row10.getCell(6).getStringCellValue();
        String CABCalcul1 = row10.getCell(7).getStringCellValue();
        
        Row row11 = sheet.getRow((short) 11);
        String pente = row11.getCell(1).getStringCellValue();
        String pentePrix = row11.getCell(3).getStringCellValue();
        String betonCalcul0 = row11.getCell(6).getStringCellValue();
        String betonCalcul1 = row11.getCell(7).getStringCellValue();
        String betonCalcul2 = row11.getCell(8).getStringCellValue();
        
        Row row12 = sheet.getRow((short) 12);
        String quartz = row12.getCell(1).getStringCellValue();
        String quartzPrix = row12.getCell(3).getStringCellValue();
        String fibreCalcul0 = row12.getCell(6).getStringCellValue();
        String fibreCalcul1 = row12.getCell(7).getStringCellValue();
        
        Row row13 = sheet.getRow((short) 13);
        String colorant = row13.getCell(1).getStringCellValue();
        String colorantPrix = row13.getCell(3).getStringCellValue();
        String pompeType = row13.getCell(6).getStringCellValue();
        String pompeCalcul0 = row13.getCell(7).getStringCellValue();
        String pompeCalcul1 = row13.getCell(8).getStringCellValue();
        String pompeCalcul2 = row13.getCell(9).getStringCellValue();
        
        Row row14 = sheet.getRow((short) 14);
        String sciage = row14.getCell(1).getStringCellValue();
        String sciagePrix = row14.getCell(3).getStringCellValue();
        String coef = row14.getCell(6).getStringCellValue();
        
        Row row15 = sheet.getRow((short) 15);
        String garnissage = row15.getCell(1).getStringCellValue();
        String garnissagePrix = row15.getCell(3).getStringCellValue();
        
        Row row16 = sheet.getRow((short) 16);
        String infos = row16.getCell(1).getStringCellValue();
        
        comboBoxEntreprise.setSelectedItem(libelle);
        fieldNomChantier.setText(nomChantier);
        fieldAdrChantier.setText(adrChantier);
        fieldSurface.setText(surface);
        fieldEpaisseur.setText(epaisseur);     
        if(fourniture.equals("oui")){
            checkBoxFourniture.setSelected(true);
        }
        if(fourniture.equals("non")){
            checkBoxFourniture.setSelected(false);
        }
        if(mousse.equals("oui")){
            checkBoxMousseOui.setSelected(true);
            checkBoxMousseNon.setSelected(false);
        }
        if(mousse.equals("non")){
            checkBoxMousseNon.setSelected(true);
            checkBoxMousseOui.setSelected(false);
        }
        if(polyane.equals("oui")){
            checkBoxPolyOui.setSelected(true);
            checkBoxPolyNon.setSelected(false);
        }
        if(polyane.equals("non")){
            checkBoxPolyNon.setSelected(true);
            checkBoxPolyOui.setSelected(false);
        }
        fieldPloy.setText(polyaneValue); 
        try{
            jTable1.setValueAt(Float.parseFloat(polyanePrix),0, 0);
        }catch(Exception e){          
        }
        fieldCalculPoly1.setText(polyaneCalcul0);
        fieldCalculPoly3.setText(polyaneCalcul1);
        fieldCalculPoly5.setText(polyaneCalcul2);
        
        comboBoxTS1.setSelectedItem(ts1);
        fieldTS1.setText(ts1Value); 
        try{
            jTable1.setValueAt(Float.parseFloat(ts1Prix),1, 0);
        }catch(Exception e){          
        }
        fieldCalculTS1.setText(ts1Calcul0);
        fieldCalculTS3.setText(ts1Calcul1);
        fieldCalculTS5.setText(ts1Calcul2);
        
        comboBoxTS2.setSelectedItem(ts2);
        fieldTS2.setText(ts2Value); 
        try{
            jTable1.setValueAt(Float.parseFloat(ts2Prix),2, 0);
        }catch(Exception e){          
        }
        fieldCalculTS6.setText(ts2Calcul0);
        fieldCalculTS8.setText(ts2Calcul1);
        fieldCalculTS10.setText(ts2Calcul2);
        
        try{
            jTable1.setValueAt(Float.parseFloat(polystPrix),3, 0);
        }catch(Exception e){          
        }
        fieldCalculPolystyrene1.setText(polystCalul0);
        fieldCalculPolystyrene2.setText(polystCalul1);
        
        comboBoxB1.setSelectedItem(betonType1);
        comboBoxB2.setSelectedItem(betonType2);
        try{
            jTable1.setValueAt(Float.parseFloat(betonPrix),4, 0);
        }catch(Exception e){          
        }
        fieldCalculCAB1.setText(CABCalcul0);
        fieldCalculCAB2.setText(CABCalcul1);
        
        if(pente.equals("oui")){
            checkBoxPenteOui.setSelected(true);
            checkBoxPenteNon.setSelected(false);
        }
        if(pente.equals("non")){
            checkBoxPenteNon.setSelected(true);
            checkBoxPenteOui.setSelected(false);
        }
        try{
            jTable1.setValueAt(Float.parseFloat(pentePrix),5, 0);
        }catch(Exception e){          
        }
        fieldCalculBeton1.setText(betonCalcul0);
        fieldCalculBeton2.setText(betonCalcul1);
        comboBoxBeton.setSelectedItem(betonCalcul2);
        
        if(quartz.equals("oui")){
            checkBoxQuartzOui.setSelected(true);
            checkBoxQuartzNon.setSelected(false);
        }
        if(quartz.equals("non")){
            checkBoxQuartzNon.setSelected(true);
            checkBoxQuartzOui.setSelected(false);
            jTable1.setValueAt(null, 6, 0);
        }
        
        try{
            jTable1.setValueAt(Float.parseFloat(quartzPrix),6, 0);
        }catch(Exception e){          
        }
        fieldCalculFibre1.setText(fibreCalcul0);
        fieldCalculFibre.setText(fibreCalcul1);
        
        comboBoxColorant.setSelectedItem(colorant);
        try{
            jTable1.setValueAt(Float.parseFloat(colorantPrix),7, 0);
        }catch(Exception e){          
        }
        comboBoxPompe.setSelectedItem(pompeType);
        fieldCalculPompe1.setText(pompeCalcul0);
        fieldCalculPompe2.setText(pompeCalcul1);
        fieldCalculPompe3.setText(pompeCalcul2);
        
        if(sciage.equals("oui")){
            checkBoxSciageOui.setSelected(true);
            checkBoxSciageNon.setSelected(false);
        }
        if(sciage.equals("non")){
            checkBoxSciageNon.setSelected(true);
            checkBoxSciageOui.setSelected(false);
            jTable1.setValueAt(null, 8, 0);
        }
        try{
            jTable1.setValueAt(Float.parseFloat(sciagePrix),8, 0);
        }catch(Exception e){          
        }
        fieldCoef.setText(coef);
        
        if(garnissage.equals("oui")){
            checkBoxGarniOui.setSelected(true);
            checkBoxGarniNon.setSelected(false);
        }
        if(garnissage.equals("non")){
            checkBoxGarniNon.setSelected(true);
            checkBoxGarniOui.setSelected(false);
        }
        try{
            jTable1.setValueAt(Float.parseFloat(garnissagePrix),9, 0);
        }catch(Exception e){          
        }
        
        textAreaInfoComp.setText(infos);
        
        this.jTable2.setValueAt(calculMainDoeuvre(), 0, 0);
        this.fieldCalculTotalMOE.setText(Float.toString(arrondiCalcul(calculMainDoeuvre())));
    }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        try {
            File fDevis = new File("test.jpg");
            sauverJPanelDansFile(jPanel2,fDevis);
            MPanelPrinter mPanelPrinter = new MPanelPrinter(jPanel2);
            mPanelPrinter.setFitIntoPage(true);
            mPanelPrinter.setOrientation(0);
            mPanelPrinter.printDevis();
            JOptionPane.showMessageDialog(null, "Impression réussie", "Info", JOptionPane.INFORMATION_MESSAGE);
            fDevis.delete();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erreur lors de l'impression", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public void sauverJPanelDansFile(JPanel panneauImage, File fichier)
    throws IOException{
        BufferedImage tamponSauvegarde = new BufferedImage(
                panneauImage.getPreferredSize().width,
                panneauImage.getPreferredSize().height,
                BufferedImage.TYPE_3BYTE_BGR);
        Graphics g = tamponSauvegarde.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, panneauImage.getPreferredSize().width,
                panneauImage.getPreferredSize().height);
        panneauImage.paint(g);
        ImageIO.write(tamponSauvegarde, "JPG", fichier);
    }
    
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        typeDevis=1;
        if(Float.parseFloat(fieldCalculTS1.getText())!=0 && !fieldCalculTS1.getText().isEmpty()){
            new JFrameBonCommandeTS().setVisible(true);
        }
        if(Float.parseFloat(fieldCalculBeton2.getText())!=0 && !fieldCalculBeton2.getText().isEmpty()){
            new JFrameBonCommandeBeton().setVisible(true);
        }
        if(Float.parseFloat(fieldCalculFibre1.getText())!=0 && !fieldCalculFibre1.getText().isEmpty()){
            new JFrameBonCommandeFibre().setVisible(true);
        }
        if(comboBoxPompe.getSelectedItem().toString().equals("Pompe") && Float.parseFloat(fieldCalculPompe2.getText())!=0 && !fieldCalculPompe2.getText().isEmpty()){
            new JFrameBonCommandePompe().setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void comboBoxEntrepriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEntrepriseActionPerformed
        // TODO add your handling code here:
        try{
            String clientsString = BddDAO.importClientsFromText();
            String[] clientsString2 = clientsString.split("//");
            for(int i=0;i<clientsString2.length;i++){
                String[] clientString = clientsString2[i].split(";");
                String libelle="";
                String correspondant="";
                String tel="";
                String fax="";
                String mail="";
                String adresse="";
                try{
                    libelle=clientString[0];
                    correspondant=clientString[1];
                    tel=clientString[2];
                    fax=clientString[3];
                    mail=clientString[4];
                    adresse=clientString[5];
                }catch(Exception e){
                    
                }
                Client unClient = new Client(libelle, correspondant, tel, fax, mail, adresse);
                if(this.comboBoxEntreprise.getSelectedItem().equals(unClient.getLibelle())){
                    this.fieldInterlocuteur.setText(unClient.getCorrespondant());
                    this.fieldTel.setText(unClient.getTel());
                    this.fieldTelecopie.setText(unClient.getFax());
                    this.fieldMail.setText(unClient.getMail());
                    this.fieldAdresse.setText(unClient.getAdresse());
                }
            }
        
            Client unClient = JFrameAjoutClient.getClient();
            if(this.comboBoxEntreprise.getSelectedItem().equals(unClient.getLibelle())){
                this.fieldInterlocuteur.setText(unClient.getCorrespondant());
                this.fieldTel.setText(unClient.getTel());
                this.fieldTelecopie.setText(unClient.getFax());
                this.fieldMail.setText(unClient.getMail());
                this.fieldAdresse.setText(unClient.getAdresse());
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_comboBoxEntrepriseActionPerformed

    private void fieldEpaisseurCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldEpaisseurCaretUpdate
        // TODO add your handling code here:       
        AffichageChampCorrect(fieldSurface);
        AffichageChampCorrect(fieldEpaisseur);

        try{
            if(!this.fieldEpaisseur.getText().isEmpty() && this.fieldEpaisseur.getText().matches("[^a-zA-Z]*")){
                if(!this.fieldSurface.getText().isEmpty() && this.fieldSurface.getText().matches("[^a-zA-Z]*")){
                    this.fieldVolume.setText(calculVolume());
                    this.fieldCalculBeton1.setText(calculVolume());
                    this.fieldCalculPompe1.setText(calculVolume());
                }else{   
                    AffichageChampIncorrect(fieldSurface);
                }
            }else{            
                AffichageChampIncorrect(fieldEpaisseur);
            }

            if(!this.fieldCalculBeton2.getText().isEmpty()){
                this.fieldCalculBetonTotal.setText(calculB());
            }
            if(!this.fieldCalculFibre.getText().isEmpty()){
                this.fieldCalculFibreTotal.setText(calculF());
            }
            if(!this.fieldCalculPompe2.getText().isEmpty()){
                this.fieldCalculPompeTotal.setText(calculP());
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_fieldEpaisseurCaretUpdate

    private void fieldSurfaceCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldSurfaceCaretUpdate
        // TODO add your handling code here:
        String surface = this.fieldSurface.getText();
        
        AffichageChampCorrect(fieldSurface);
        AffichageChampCorrect(fieldEpaisseur);

        if(!this.fieldSurface.getText().isEmpty() && surface.matches("[^a-zA-Z]*")){
            try{
                this.fieldCalculPoly1.setText(surface);
                this.fieldCalculTS1.setText(surface);
                this.fieldCalculCAB1.setText(surface);

                this.fieldCalculPoly2.setText(calculPolyane1());
                this.fieldCalculTS2.setText(calculTS1());

                if(!this.fieldCalculPoly3.getText().isEmpty()){
                    this.fieldCalculPoly4.setText(calculPolyane2());
                    if(!this.fieldCalculPoly5.getText().isEmpty()){
                        this.fieldCalculPolyTotal.setText(calculPolyane3());
                    }
                }
                if(!this.fieldCalculTS3.getText().isEmpty()){
                    this.fieldCalculTS4.setText(calculTS2());
                    if(!this.fieldCalculTS5.getText().isEmpty()){
                        this.fieldCalculTSTotal.setText(calculTS3());
                    }
                }
                if(!this.fieldCalculCAB2.getText().isEmpty()){
                    this.fieldCalculCABTotal.setText(calculCAB());
                }

                if(!this.fieldEpaisseur.getText().isEmpty() && this.fieldEpaisseur.getText().matches("[^a-zA-Z]*")){
                    this.fieldVolume.setText(calculVolume());
                    this.fieldCalculBeton1.setText(calculVolume());
                    this.fieldCalculPompe1.setText(calculVolume());
                }else{                
                    AffichageChampIncorrect(fieldEpaisseur);
                }
                if(!this.fieldCalculBeton2.getText().isEmpty()){
                    this.fieldCalculBetonTotal.setText(calculB());
                }
                if(!this.fieldCalculFibre.getText().isEmpty()){
                    this.fieldCalculFibreTotal.setText(calculF());
                }
                if(!this.fieldCalculPompe2.getText().isEmpty()){
                    this.fieldCalculPompeTotal.setText(calculP());
                }
            }catch(Exception e){
            }
        }else{            
            AffichageChampIncorrect(fieldSurface);
        }
        
    }//GEN-LAST:event_fieldSurfaceCaretUpdate

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost
        // TODO add your handling code here:
        jTable1.clearSelection();
        jTable1.repaint();
    }//GEN-LAST:event_jTable1FocusLost

    private void buttonAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddClientActionPerformed
        // TODO add your handling code here:
        new JFrameClients().setVisible(true);
    }//GEN-LAST:event_buttonAddClientActionPerformed

    private void checkBoxMousseOuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMousseOuiActionPerformed
        // TODO add your handling code here:
        this.checkBoxMousseNon.setSelected(false);
    }//GEN-LAST:event_checkBoxMousseOuiActionPerformed

    private void checkBoxMousseNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMousseNonActionPerformed
        // TODO add your handling code here:
        this.checkBoxMousseOui.setSelected(false);
    }//GEN-LAST:event_checkBoxMousseNonActionPerformed

    private void checkBoxPolyOuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxPolyOuiActionPerformed
        // TODO add your handling code here:
        this.checkBoxPolyNon.setSelected(false);
        fieldCalculPoly1.setText(fieldSurface.getText());
    }//GEN-LAST:event_checkBoxPolyOuiActionPerformed

    private void checkBoxPolyNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxPolyNonActionPerformed
        // TODO add your handling code here:
        checkBoxMOEAction(checkBoxPolyOui,0,0);
        fieldCalculPoly1.setText("0");
    }//GEN-LAST:event_checkBoxPolyNonActionPerformed

    private void checkBoxPenteOuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxPenteOuiActionPerformed
        // TODO add your handling code here:
        this.checkBoxPenteNon.setSelected(false);
    }//GEN-LAST:event_checkBoxPenteOuiActionPerformed

    private void checkBoxPenteNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxPenteNonActionPerformed
        // TODO add your handling code here:
        checkBoxMOEAction(checkBoxPenteOui,0,5);
    }//GEN-LAST:event_checkBoxPenteNonActionPerformed

    private void fieldCalculPoly1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculPoly1CaretUpdate
        // TODO add your handling code here:
        AffichageChampCorrect(fieldCalculPoly1);

        if(!this.fieldCalculPoly1.getText().isEmpty() && this.fieldCalculPoly1.getText().matches("[^a-zA-Z]*")){
            this.fieldCalculPoly2.setText(calculPolyane1());
            if(!this.fieldCalculPoly3.getText().isEmpty() && this.fieldCalculPoly3.getText().matches("[^a-zA-Z]*")){
                this.fieldCalculPoly4.setText(calculPolyane2());
                if(!this.fieldCalculPoly5.getText().isEmpty() && this.fieldCalculPoly5.getText().matches("[^a-zA-Z]*")){
                    this.fieldCalculPolyTotal.setText(calculPolyane3());
                }
            }
        }else{            
            AffichageChampIncorrect(fieldCalculPoly1);
        }
    }//GEN-LAST:event_fieldCalculPoly1CaretUpdate

    private void fieldCalculTS1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculTS1CaretUpdate
        // TODO add your handling code here:
        AffichageChampCorrect(fieldCalculTS1);

        if(!this.fieldCalculTS1.getText().isEmpty() && this.fieldCalculTS1.getText().matches("[^a-zA-Z]*")){
            this.fieldCalculTS2.setText(calculTS1());
            if(!this.fieldCalculTS3.getText().isEmpty() && this.fieldCalculTS3.getText().matches("[^a-zA-Z]*")){
                this.fieldCalculTS4.setText(calculTS2());
                if(!this.fieldCalculTS5.getText().isEmpty() && this.fieldCalculTS5.getText().matches("[^a-zA-Z]*")){
                    this.fieldCalculTSTotal.setText(calculTS3());
                }
            }
        }else{            
            AffichageChampIncorrect(fieldCalculTS1);
        }
    }//GEN-LAST:event_fieldCalculTS1CaretUpdate

    private void fieldTS1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldTS1CaretUpdate
        // TODO add your handling code here:
        if(fieldTS1.getText().equals("ST15C")){
            fieldCalculTS3.setText("9.60");
        }else{
            fieldCalculTS3.setText("14.40");
        }
    }//GEN-LAST:event_fieldTS1CaretUpdate

    private void fieldTS1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTS1FocusLost
        // TODO add your handling code here:
        fieldTS1.setText(fieldTS1.getText().toUpperCase());
    }//GEN-LAST:event_fieldTS1FocusLost

    private void fieldCalculCAB1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculCAB1CaretUpdate
        // TODO add your handling code here:
        AffichageChampCorrect(fieldCalculCAB1);

        if(!this.fieldCalculCAB1.getText().isEmpty() && this.fieldCalculCAB1.getText().matches("[^a-zA-Z]*")){
            if(!this.fieldCalculCAB2.getText().isEmpty() && this.fieldCalculCAB2.getText().matches("[^a-zA-Z]*")){
                this.fieldCalculCABTotal.setText(calculCAB());
            }
        }else{            
            AffichageChampIncorrect(fieldCalculCAB1);
        }
    }//GEN-LAST:event_fieldCalculCAB1CaretUpdate

    private void fieldCalculTSTotal2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculTSTotal2CaretUpdate
        // TODO add your handling code here:
        if(!this.fieldCalculTSTotal2.getText().isEmpty()){
            this.fieldCalculTotal1.setText(calculTotalAvecCoef());
        }
    }//GEN-LAST:event_fieldCalculTSTotal2CaretUpdate

    private void fieldCalculTS6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculTS6CaretUpdate
        // TODO add your handling code here:
        AffichageChampCorrect(fieldCalculTS6);

        if(!this.fieldCalculTS6.getText().isEmpty() && this.fieldCalculTS6.getText().matches("[^a-zA-Z]*")){
            this.fieldCalculTS7.setText(calculTS1Bis());
            if(!this.fieldCalculTS8.getText().isEmpty() && this.fieldCalculTS8.getText().matches("[^a-zA-Z]*")){
                this.fieldCalculTS9.setText(calculTS2Bis());
                if(!this.fieldCalculTS10.getText().isEmpty() && this.fieldCalculTS10.getText().matches("[^a-zA-Z]*")){
                    this.fieldCalculTSTotal2.setText(calculTS3Bis());
                }
            }
        }else{            
            AffichageChampIncorrect(fieldCalculTS6);
        }
    }//GEN-LAST:event_fieldCalculTS6CaretUpdate

    private void fieldCalculTS8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculTS8CaretUpdate
        // TODO add your handling code here:
        AffichageChampCorrect(fieldCalculTS8);

        if(!this.fieldCalculTS8.getText().isEmpty() && this.fieldCalculTS8.getText().matches("[^a-zA-Z]*")){
            this.fieldCalculTS9.setText(calculTS2Bis());
            if(!this.fieldCalculTS10.getText().isEmpty() && this.fieldCalculTS10.getText().matches("[^a-zA-Z]*")){
                this.fieldCalculTSTotal2.setText(calculTS3Bis());
            }
        }else{            
            AffichageChampIncorrect(fieldCalculTS8);
        }
    }//GEN-LAST:event_fieldCalculTS8CaretUpdate

    private void fieldCalculTS10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculTS10CaretUpdate
        // TODO add your handling code here:
        AffichageChampCorrect(fieldCalculTS10);

        if(!this.fieldCalculTS10.getText().isEmpty() && this.fieldCalculTS10.getText().matches("[^a-zA-Z]*")){
            this.fieldCalculTSTotal2.setText(calculTS3Bis());
        }else{            
            AffichageChampIncorrect(fieldCalculTS10);
        }
    }//GEN-LAST:event_fieldCalculTS10CaretUpdate

    private void fieldCalculPolystyreneTotalCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculPolystyreneTotalCaretUpdate
        // TODO add your handling code here:
        if(!this.fieldCalculPolystyreneTotal.getText().isEmpty()){
            this.fieldCalculTotal1.setText(calculTotalAvecCoef());
        }
    }//GEN-LAST:event_fieldCalculPolystyreneTotalCaretUpdate

    private void fieldCalculPolystyrene2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculPolystyrene2CaretUpdate
        // TODO add your handling code here:
        AffichageChampCorrect(fieldCalculPolystyrene2);

        if(!this.fieldCalculPolystyrene2.getText().isEmpty() && this.fieldCalculPolystyrene2.getText().matches("[^a-zA-Z]*")){
            if(!this.fieldCalculPolystyrene1.getText().isEmpty() && this.fieldCalculPolystyrene1.getText().matches("[^a-zA-Z]*")){
                this.fieldCalculPolystyreneTotal.setText(calculPOLYST());
            }
        }else{            
            AffichageChampIncorrect(fieldCalculPolystyrene2);
        }
    }//GEN-LAST:event_fieldCalculPolystyrene2CaretUpdate

    private void fieldCalculPolystyrene1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculPolystyrene1CaretUpdate
        // TODO add your handling code here:
        AffichageChampCorrect(fieldCalculPolystyrene1);

        if(!this.fieldCalculPolystyrene1.getText().isEmpty() && this.fieldCalculPolystyrene1.getText().matches("[^a-zA-Z]*")){
            if(!this.fieldCalculPolystyrene2.getText().isEmpty() && this.fieldCalculPolystyrene2.getText().matches("[^a-zA-Z]*")){
                this.fieldCalculPolystyreneTotal.setText(calculPOLYST());
            }
        }else{            
            AffichageChampIncorrect(fieldCalculPolystyrene1);
        }
    }//GEN-LAST:event_fieldCalculPolystyrene1CaretUpdate

    private void fieldCalculPompe3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculPompe3CaretUpdate
        // TODO add your handling code here:
        AffichageChampCorrect(fieldCalculPompe3);

        if(!this.fieldCalculPompe3.getText().isEmpty() && this.fieldCalculPompe3.getText().matches("[^a-zA-Z]*")){
            if(!this.fieldCalculPompe2.getText().isEmpty() && this.fieldCalculPompe2.getText().matches("[^a-zA-Z]*")){
                this.fieldCalculPompeTotal.setText(calculP());
            }
        }else{            
            AffichageChampIncorrect(fieldCalculPompe3);
        }
    }//GEN-LAST:event_fieldCalculPompe3CaretUpdate

    private void fieldTS2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldTS2CaretUpdate
        // TODO add your handling code here:
        if(!fieldTS2.getText().isEmpty()){
            if(fieldTS2.getText().equals("ST15C")){
                fieldCalculTS8.setText("9.60");
            }else{
                fieldCalculTS8.setText("14.40");
            }
            fieldCalculTS6.setText(fieldSurface.getText());
            fieldCalculTS10.setText("14");
        }
    }//GEN-LAST:event_fieldTS2CaretUpdate

    private void fieldTS2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldTS2FocusLost
        // TODO add your handling code here:
        fieldTS2.setText(fieldTS2.getText().toUpperCase());
    }//GEN-LAST:event_fieldTS2FocusLost

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        try{            
           JFileChooser chooser = new JFileChooser();      
           FileNameExtensionFilter xlsxFilter = new FileNameExtensionFilter("xlsx files (*.xlsx)", "xlsx");
           chooser.addChoosableFileFilter(xlsxFilter);
           chooser.setFileFilter(xlsxFilter);

           File fDirectory = new  File("./Devis"+File.separator);
           // Dossier Courant
          chooser.setCurrentDirectory(fDirectory); 

          Date actuelleF = new Date();
          DateFormat dateFormatF = new SimpleDateFormat("dd-MM-yyyy");
          String dateF = dateFormatF.format(actuelleF);

          File f = new  File("EDP_"+this.comboBoxEntreprise.getSelectedItem()+"_"+fieldNomChantier.getText());
          chooser.setSelectedFile(f);
           //Affichage et récupération de la réponse de l'utilisateur
           int reponse = chooser.showDialog(chooser,"Enregistrer sous");             
          // Si l'utilisateur clique sur OK
          if  (reponse == JFileChooser.APPROVE_OPTION){                
                 // Récupération du chemin du fichier
                File fichier = new File(chooser.getSelectedFile().toString()+".xlsx");
                saveDevisInXlsx(fichier.getAbsolutePath());    
                modif = false;
           }
        }catch(HeadlessException he){
            he.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(JFrameDevisGest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void checkBoxSciageOuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxSciageOuiActionPerformed
        // TODO add your handling code here:
        checkBoxMOEAction(checkBoxSciageNon, (float) 0.8,8);
    }//GEN-LAST:event_checkBoxSciageOuiActionPerformed

    private void checkBoxSciageNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxSciageNonActionPerformed
        // TODO add your handling code here:
        checkBoxMOEAction(checkBoxSciageOui,0,8);
    }//GEN-LAST:event_checkBoxSciageNonActionPerformed

    private void checkBoxGarniOuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxGarniOuiActionPerformed
        // TODO add your handling code here:
        checkBoxMOEAction(checkBoxGarniNon, (float) 0.85,9);
    }//GEN-LAST:event_checkBoxGarniOuiActionPerformed

    private void checkBoxGarniNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxGarniNonActionPerformed
        // TODO add your handling code here:
        checkBoxMOEAction(checkBoxGarniOui,0,9);
    }//GEN-LAST:event_checkBoxGarniNonActionPerformed

    public void checkBoxMOEAction(JCheckBox checkBox, float val, int positionTab){
        checkBox.setSelected(false);
        jTable1.setValueAt(val, positionTab, 0);
        this.jTable2.setValueAt(calculMainDoeuvre(), 0, 0);
        this.fieldCalculTotalMOE.setText(Float.toString(arrondiCalcul(calculMainDoeuvre())));
    } 
    
    private void fieldCalculFibre1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculFibre1CaretUpdate
        // TODO add your handling code here:
        AffichageChampCorrect(fieldCalculFibre1);

        if(!this.fieldCalculFibre1.getText().isEmpty() && this.fieldCalculFibre1.getText().matches("[^a-zA-Z]*")){
            if(!this.fieldCalculFibre.getText().isEmpty() && this.fieldCalculFibre.getText().matches("[^a-zA-Z]*")){
                this.fieldCalculFibreTotal.setText(calculF());
            }
        }else{            
            AffichageChampIncorrect(fieldCalculFibre1);
        }
    }//GEN-LAST:event_fieldCalculFibre1CaretUpdate

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new JFrameDevisGest().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if(modif == false){
            this.dispose();
        }else{
            JOptionPane jop = new JOptionPane();			
            int option = jop.showConfirmDialog(null, "Voulez-vous enregistrer avant de quitter ?", "Enregistrer ?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if(option == JOptionPane.OK_OPTION){
                if(fichierOuvert!=null){
                    try {
                        saveDevisInXlsx(fichierOuvert.getAbsolutePath());
                        this.dispose();
                    } catch (IOException ex) {
                        Logger.getLogger(JFrameDevisGest.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    try{            
                       JFileChooser chooser = new JFileChooser();      
                       FileNameExtensionFilter xlsxFilter = new FileNameExtensionFilter("xlsx files (*.xlsx)", "xlsx");
                       chooser.addChoosableFileFilter(xlsxFilter);
                       chooser.setFileFilter(xlsxFilter);

                       File fDirectory = new  File("./Devis"+File.separator);
                       // Dossier Courant
                      chooser.setCurrentDirectory(fDirectory); 

                      Date actuelleF = new Date();
                      DateFormat dateFormatF = new SimpleDateFormat("dd-MM-yyyy");
                      String dateF = dateFormatF.format(actuelleF);

                      File f = new  File("EDP_"+this.comboBoxEntreprise.getSelectedItem()+"_"+fieldNomChantier.getText());
                      chooser.setSelectedFile(f);
                       //Affichage et récupération de la réponse de l'utilisateur
                       int reponse = chooser.showDialog(chooser,"Enregistrer sous");             
                      // Si l'utilisateur clique sur OK
                      if  (reponse == JFileChooser.APPROVE_OPTION){                
                             // Récupération du chemin du fichier
                            File fichier = new File(chooser.getSelectedFile().toString()+".xlsx");
                            saveDevisInXlsx(fichier.getAbsolutePath());   
                            this.dispose();
                       }
                    }catch(HeadlessException he){
                        he.printStackTrace();
                    } catch (IOException ex) {
                        Logger.getLogger(JFrameDevisGest.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }else{
                if(option == JOptionPane.NO_OPTION){
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void checkBoxQuartzOuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxQuartzOuiActionPerformed
        // TODO add your handling code here:
        checkBoxMOEAction(checkBoxQuartzNon, (float) 0.85 ,6);
    }//GEN-LAST:event_checkBoxQuartzOuiActionPerformed

    private void checkBoxQuartzNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxQuartzNonActionPerformed
        // TODO add your handling code here:
        checkBoxMOEAction(checkBoxQuartzOui, 0, 6);
    }//GEN-LAST:event_checkBoxQuartzNonActionPerformed

    private void comboBoxTS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTS1ActionPerformed
        // TODO add your handling code here:
        if(comboBoxTS1.getSelectedIndex()==1){
            fieldCalculCAB1.setText("0");
        }else{
            if(comboBoxTS1.getSelectedIndex()==0){
                fieldCalculCAB1.setText(fieldSurface.getText());
            }
        }
    }//GEN-LAST:event_comboBoxTS1ActionPerformed

    private void fieldSurfaceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldSurfaceKeyPressed
        // TODO add your handling code here:
        modif = true;
    }//GEN-LAST:event_fieldSurfaceKeyPressed

    private void fieldCalculBeton1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldCalculBeton1CaretUpdate
        // TODO add your handling code here:
        AffichageChampCorrect(fieldCalculBeton1);

        if(!this.fieldCalculBeton1.getText().isEmpty() && this.fieldCalculBeton1.getText().matches("[^a-zA-Z]*")){
            if(!this.fieldCalculBeton2.getText().isEmpty() && this.fieldCalculBeton2.getText().matches("[^a-zA-Z]*")){
                this.fieldCalculBetonTotal.setText(calculB());
            }
        }else{            
            AffichageChampIncorrect(fieldCalculBeton1);
        }
    }//GEN-LAST:event_fieldCalculBeton1CaretUpdate
   
    public String calculVolume(){
        float volume=0;
        volume=Float.valueOf(this.fieldSurface.getText())*Float.valueOf(this.fieldEpaisseur.getText())+1;
        String totalString=Float.toString(arrondiCalcul(volume));
        return totalString;
    }
    
    public String calculTotal(){
        float total=0;
        total=Float.valueOf(this.fieldCalculTotalFourni.getText())+Float.valueOf(this.fieldCalculTotalMOE.getText());
        String totalString=Float.toString(arrondiCalcul(total));
        return totalString;
    }
    
    public String calculTotalFourniture(){
        float total=0;
        if(this.checkBoxFourniture.isSelected()){
            total=Float.valueOf(this.fieldCalculTotal1.getText())/Float.valueOf(this.fieldSurface.getText());
        }
        String totalString=Float.toString(arrondiCalcul(total));
        return totalString;
    }
    
    public String calculTotalAvecCoef(){
        float total=0;
        total=Float.valueOf(this.fieldCoef.getText())*(Float.valueOf(this.fieldCalculPolyTotal.getText())+Float.valueOf(this.fieldCalculTSTotal.getText())+Float.valueOf(this.fieldCalculTSTotal2.getText())+Float.valueOf(this.fieldCalculCABTotal.getText())
                +Float.valueOf(this.fieldCalculBetonTotal.getText())+Float.valueOf(this.fieldCalculFibreTotal.getText())+Float.valueOf(this.fieldCalculPompeTotal.getText())+Float.valueOf(this.fieldCalculPolystyreneTotal.getText()));
        String totalString=Float.toString(arrondiCalcul(total));
        return totalString;
    }
    
    public float calculMainDoeuvre(){
        float total=0;
        JTable tab = this.jTable1;
        for(int i=0;i<this.jTable1.getRowCount();i++){
            if(jTable1.getValueAt(i,0)!=null){
                total=total+(float)jTable1.getValueAt(i,0);
            }
        }
        return total;
    }
    
    public String calculPolyane1(){
        float total=0;
        total=Float.valueOf(this.jLabel25.getText())*Float.valueOf(this.fieldCalculPoly1.getText());
        String totalString=Float.toString(arrondiCalcul(total));
        return totalString;
    }
    
    public String calculPolyane2(){
        float total=0;
        if(!this.fieldCalculPoly3.getText().equals("0")){
            total=Float.valueOf(this.fieldCalculPoly2.getText())/Float.valueOf(this.fieldCalculPoly3.getText());
        }
        String totalString=Float.toString(arrondiCalcul(total));
        return totalString;
    }
    
    public String calculPolyane3(){
        float total=0;
        total=Float.valueOf(this.fieldCalculPoly4.getText())*Float.valueOf(this.fieldCalculPoly5.getText());
        String totalString=Float.toString(arrondiCalcul(total));
        return totalString;
    }
    
    public String calculTS1(){
        float total=0;
        total=Float.valueOf(this.jLabel28.getText())*Float.valueOf(this.fieldCalculTS1.getText());
        String totalString=Float.toString(arrondiCalcul(total));
        return totalString;
    }
    
    public String calculTS2(){
        float total=0;
        if(!this.fieldCalculTS3.getText().equals("0")){
            total=Float.valueOf(this.fieldCalculTS2.getText())/Float.valueOf(this.fieldCalculTS3.getText());
        }
        String totalString=Float.toString(Math.round(total));
        return totalString;
    }
    
    public String calculTS3(){
        float total=0;
        total=Float.valueOf(this.fieldCalculTS4.getText())*Float.valueOf(this.fieldCalculTS5.getText());
        String totalString=Float.toString(arrondiCalcul(total));
        return totalString;
    }
    
    public String calculTS1Bis(){
        float total=0;
        total=Float.valueOf(this.jLabel70.getText())*Float.valueOf(this.fieldCalculTS6.getText());
        String totalString=Float.toString(arrondiCalcul(total));
        return totalString;
    }
    
    public String calculTS2Bis(){
        float total=0;
        if(!this.fieldCalculTS8.getText().equals("0")){
            total=Float.valueOf(this.fieldCalculTS7.getText())/Float.valueOf(this.fieldCalculTS8.getText());
        }
        String totalString=Float.toString(Math.round(total));
        return totalString;
    }
    
    public String calculTS3Bis(){
        float total=0;
        total=Float.valueOf(this.fieldCalculTS9.getText())*Float.valueOf(this.fieldCalculTS10.getText());
        String totalString=Float.toString(arrondiCalcul(total));
        return totalString;
    }
    
    public String calculCAB(){
        float total=0;
        total=Float.valueOf(this.fieldCalculCAB1.getText())*Float.valueOf(this.fieldCalculCAB2.getText());
        String totalString=Float.toString(arrondiCalcul(total));
        return totalString;
    }
    
    public String calculB(){
        float total=0;
        total=Float.valueOf(this.fieldCalculBeton1.getText())*Float.valueOf(this.fieldCalculBeton2.getText());
        String totalString=Float.toString(arrondiCalcul(total));
        return totalString;
    }
    
    public String calculF(){
        float total=0;
        total=Float.valueOf(this.fieldCalculFibre1.getText())*Float.valueOf(this.fieldCalculFibre.getText());
        String totalString=Float.toString(arrondiCalcul(total));
        return totalString;
    }
    
    public String calculP(){
        float total=0;
        total=Float.valueOf(this.fieldCalculPompe1.getText())*Float.valueOf(this.fieldCalculPompe2.getText())+Float.valueOf(this.fieldCalculPompe3.getText());
        String totalString=Float.toString(arrondiCalcul(total));
        return totalString;
    }
    
    public String calculPOLYST(){
        float total=0;
        total=Float.valueOf(this.fieldCalculPolystyrene1.getText())*Float.valueOf(this.fieldCalculPolystyrene2.getText());
        String totalString=Float.toString(arrondiCalcul(total));
        return totalString;
    }
    
    public float arrondiCalcul(float nombre){
        float arrondi = (float) Math.round(nombre * 100) / 100;
        return arrondi;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddClient;
    private javax.swing.JCheckBox checkBoxFourniture;
    private javax.swing.JCheckBox checkBoxGarniNon;
    private javax.swing.JCheckBox checkBoxGarniOui;
    private javax.swing.JCheckBox checkBoxMousseNon;
    private javax.swing.JCheckBox checkBoxMousseOui;
    private javax.swing.JCheckBox checkBoxPenteNon;
    private javax.swing.JCheckBox checkBoxPenteOui;
    private javax.swing.JCheckBox checkBoxPolyNon;
    private javax.swing.JCheckBox checkBoxPolyOui;
    private javax.swing.JCheckBox checkBoxQuartzNon;
    private javax.swing.JCheckBox checkBoxQuartzOui;
    private javax.swing.JCheckBox checkBoxSciageNon;
    private javax.swing.JCheckBox checkBoxSciageOui;
    private javax.swing.JComboBox<String> comboBoxB1;
    private javax.swing.JComboBox<String> comboBoxB2;
    private static javax.swing.JComboBox<String> comboBoxBeton;
    private javax.swing.JComboBox<String> comboBoxColorant;
    private static javax.swing.JComboBox<String> comboBoxEntreprise;
    private javax.swing.JComboBox<String> comboBoxPompe;
    private javax.swing.JComboBox<String> comboBoxTS1;
    private javax.swing.JComboBox<String> comboBoxTS2;
    private static javax.swing.JTextField fieldAdrChantier;
    private static javax.swing.JTextField fieldAdresse;
    private static javax.swing.JTextField fieldCalculBeton1;
    private javax.swing.JTextField fieldCalculBeton2;
    private javax.swing.JTextField fieldCalculBetonTotal;
    private javax.swing.JTextField fieldCalculCAB1;
    private javax.swing.JTextField fieldCalculCAB2;
    private javax.swing.JTextField fieldCalculCABTotal;
    private javax.swing.JTextField fieldCalculFibre;
    private javax.swing.JTextField fieldCalculFibre1;
    private javax.swing.JTextField fieldCalculFibreTotal;
    private javax.swing.JTextField fieldCalculPoly1;
    private javax.swing.JTextField fieldCalculPoly2;
    private javax.swing.JTextField fieldCalculPoly3;
    private javax.swing.JTextField fieldCalculPoly4;
    private javax.swing.JTextField fieldCalculPoly5;
    private javax.swing.JTextField fieldCalculPolyTotal;
    private javax.swing.JTextField fieldCalculPolystyrene1;
    private javax.swing.JTextField fieldCalculPolystyrene2;
    private javax.swing.JTextField fieldCalculPolystyreneTotal;
    private javax.swing.JTextField fieldCalculPompe1;
    private javax.swing.JTextField fieldCalculPompe2;
    private javax.swing.JTextField fieldCalculPompe3;
    private javax.swing.JTextField fieldCalculPompeTotal;
    private javax.swing.JTextField fieldCalculTS1;
    private static javax.swing.JTextField fieldCalculTS10;
    private javax.swing.JTextField fieldCalculTS2;
    private javax.swing.JTextField fieldCalculTS3;
    private static javax.swing.JTextField fieldCalculTS4;
    private static javax.swing.JTextField fieldCalculTS5;
    private static javax.swing.JTextField fieldCalculTS6;
    private javax.swing.JTextField fieldCalculTS7;
    private javax.swing.JTextField fieldCalculTS8;
    private static javax.swing.JTextField fieldCalculTS9;
    private javax.swing.JTextField fieldCalculTSTotal;
    private javax.swing.JTextField fieldCalculTSTotal2;
    private javax.swing.JTextField fieldCalculTotal1;
    private javax.swing.JTextField fieldCalculTotalFinal;
    private javax.swing.JTextField fieldCalculTotalFourni;
    private javax.swing.JTextField fieldCalculTotalMOE;
    private javax.swing.JTextField fieldCoef;
    private javax.swing.JTextField fieldDate;
    private javax.swing.JTextField fieldEpaisseur;
    private static javax.swing.JTextField fieldInterlocuteur;
    private static javax.swing.JTextField fieldMail;
    private static javax.swing.JTextField fieldNomChantier;
    private javax.swing.JTextField fieldPloy;
    private javax.swing.JTextField fieldSurface;
    private static javax.swing.JTextField fieldTS1;
    private static javax.swing.JTextField fieldTS2;
    private static javax.swing.JTextField fieldTel;
    private static javax.swing.JTextField fieldTelecopie;
    private static javax.swing.JTextField fieldVolume;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea textAreaInfoComp;
    // End of variables declaration//GEN-END:variables
}
