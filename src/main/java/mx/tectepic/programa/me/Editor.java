/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.tectepic.programa.me;

import aux_tools.EstiloDialog;
import aux_tools.FontSelector;
import aux_tools.Simbolo;
import aux_tools.TablaSimbolos;
import aux_tools.TextLineNumber;
import java.awt.Font;
import java.io.File;
import javax.swing.JTextArea;
import aux_tools.lexico.Lexer;
import aux_tools.lexico.Tokens;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import javax.swing.event.UndoableEditEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

public class Editor extends javax.swing.JFrame {

    private UndoManager undo = new UndoManager();

    public void manager() {
        Document doc = texto.getDocument();

        // Listen for undo and redo events
        doc.addUndoableEditListener((UndoableEditEvent evt) -> {
            undo.addEdit(evt.getEdit());
        });

        // Create an undo action and add it to the text component
        texto.getActionMap().put("Undo",
                new AbstractAction("Undo") {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (undo.canUndo()) {
                        undo.undo();
                    }
                } catch (CannotUndoException e) {
                }
            }
        });

        // Bind the undo action to ctl-Z
        texto.getInputMap().put(KeyStroke.getKeyStroke("control Z"), "Undo");

        // Create a redo action and add it to the text component
        texto.getActionMap().put("Redo",
                new AbstractAction("Redo") {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (undo.canRedo()) {
                        undo.redo();
                    }
                } catch (CannotRedoException e) {
                }
            }
        });

        // Bind the redo action to ctl-Y
        texto.getInputMap().put(KeyStroke.getKeyStroke("control Y"), "Redo");
    }

    public Editor() {
        initComponents();
        this.setLocationRelativeTo(null);
        texto = new JTextArea();
        texto.setLineWrap(false);
        texto.setWrapStyleWord(false);
        texto.setTabSize(2);
        texto.setFont(actualFont);
        tln = new TextLineNumber(texto);
        vtnTexto.setViewportView(texto);
        vtnTexto.setRowHeaderView(tln);
        esNuevo = true;
        modelo = (DefaultTableModel) this.tblLexico.getModel();
        tpTablas.setVisible(true);
        tablaSimbolos_id = new TablaSimbolos();
        manager();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnNuevo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnCopiar = new javax.swing.JButton();
        btnCortar = new javax.swing.JButton();
        btnPegar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnDeshacer = new javax.swing.JButton();
        btnRehacer = new javax.swing.JButton();
        pnlAnalisi = new javax.swing.JPanel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnAnalizar = new javax.swing.JButton();
        btnTablas = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnConfiguracion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tpTablas = new javax.swing.JTabbedPane();
        listaTokens = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLexico = new javax.swing.JTable();
        vtnTexto = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMensajes = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor programa.me");
        setMinimumSize(new java.awt.Dimension(990, 550));

        jToolBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jToolBar1.setFloatable(false);
        jToolBar1.add(jSeparator4);

        btnNuevo.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/tectepic/programa/iconos/new.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnNuevo);
        jToolBar1.add(jSeparator1);

        btnAbrir.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/tectepic/programa/iconos/open.png"))); // NOI18N
        btnAbrir.setText("Abrir");
        btnAbrir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAbrir.setFocusable(false);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnAbrir);

        btnGuardar.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/tectepic/programa/iconos/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);
        jToolBar1.add(jSeparator2);

        btnCopiar.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/tectepic/programa/iconos/copy.png"))); // NOI18N
        btnCopiar.setText("Copiar");
        btnCopiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCopiar.setFocusable(false);
        btnCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCopiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCopiar);

        btnCortar.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/tectepic/programa/iconos/cut.png"))); // NOI18N
        btnCortar.setText("Cortar");
        btnCortar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCortar.setFocusable(false);
        btnCortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCortarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCortar);

        btnPegar.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/tectepic/programa/iconos/paste.png"))); // NOI18N
        btnPegar.setText("Pegar");
        btnPegar.setToolTipText("");
        btnPegar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPegar.setFocusable(false);
        btnPegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPegar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPegar);
        jToolBar1.add(jSeparator3);

        btnDeshacer.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnDeshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/tectepic/programa/iconos/redo.png"))); // NOI18N
        btnDeshacer.setText("Deshacer");
        btnDeshacer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDeshacer.setFocusable(false);
        btnDeshacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeshacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshacerActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDeshacer);

        btnRehacer.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnRehacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/tectepic/programa/iconos/undo.png"))); // NOI18N
        btnRehacer.setText("Rehacer");
        btnRehacer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRehacer.setFocusable(false);
        btnRehacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRehacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRehacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRehacerActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRehacer);

        cmbTipo.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Análisis léxico", "Análisis sintáctico" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel2.setText("Tipo de análisis:");

        javax.swing.GroupLayout pnlAnalisiLayout = new javax.swing.GroupLayout(pnlAnalisi);
        pnlAnalisi.setLayout(pnlAnalisiLayout);
        pnlAnalisiLayout.setHorizontalGroup(
            pnlAnalisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnalisiLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pnlAnalisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAnalisiLayout.setVerticalGroup(
            pnlAnalisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAnalisiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jToolBar1.add(pnlAnalisi);

        btnAnalizar.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnAnalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/tectepic/programa/iconos/yes.png"))); // NOI18N
        btnAnalizar.setText("Analizar");
        btnAnalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAnalizar.setFocusable(false);
        btnAnalizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnalizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAnalizar);

        btnTablas.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnTablas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/tectepic/programa/iconos/tg.png"))); // NOI18N
        btnTablas.setText("Tablas");
        btnTablas.setFocusable(false);
        btnTablas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTablas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnTablas);
        jToolBar1.add(jSeparator5);

        btnConfiguracion.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/tectepic/programa/iconos/settings.png"))); // NOI18N
        btnConfiguracion.setText("Estilos");
        btnConfiguracion.setFocusable(false);
        btnConfiguracion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfiguracion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        jToolBar1.add(btnConfiguracion);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/tectepic/programa/iconos/programame.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tpTablas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tpTablas.setToolTipText("");
        tpTablas.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tpTablas.setName(""); // NOI18N

        tblLexico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lexema", "Componente", "Linea"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLexico);

        javax.swing.GroupLayout listaTokensLayout = new javax.swing.GroupLayout(listaTokens);
        listaTokens.setLayout(listaTokensLayout);
        listaTokensLayout.setHorizontalGroup(
            listaTokensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        );
        listaTokensLayout.setVerticalGroup(
            listaTokensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        tpTablas.addTab("Componentes léxicos", listaTokens);

        txtMensajes.setEditable(false);
        txtMensajes.setColumns(20);
        txtMensajes.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtMensajes.setRows(5);
        jScrollPane3.setViewportView(txtMensajes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vtnTexto)
                            .addComponent(jScrollPane3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tpTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vtnTexto)
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tpTablas)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tpTablas.getAccessibleContext().setAccessibleName("Lista de Tokens");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        texto.copy();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCortarActionPerformed
        texto.cut();
    }//GEN-LAST:event_btnCortarActionPerformed

    private void btnPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegarActionPerformed
        texto.paste();
    }//GEN-LAST:event_btnPegarActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        EstiloDialog ed = new EstiloDialog(this);
        int[] res = ed.showDialog();
        if (res != null) {
            Font temp = FontSelector.select(res);
            cambiarFuente(temp);
        }
    }//GEN-LAST:event_btnConfiguracionActionPerformed
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        if (cmbTipo.getSelectedIndex() == 0) {
            txtMensajes.setText("");
            tablaSimbolos_id = new TablaSimbolos();
            File archivo = new File("archivo.txt");
            PrintWriter escribir;
            try {
                escribir = new PrintWriter(archivo);
                escribir.print(texto.getText());
                escribir.close();
            } catch (FileNotFoundException ex) {
            }
            try {
                modelo.setRowCount(0);
                String errores = "";
                boolean erro = false;
                Reader lector = new BufferedReader(new FileReader("archivo.txt"));
                Lexer lexer = new Lexer(lector);
                while (true) {
                    Tokens tokens = lexer.yylex();
                    if (tokens == null) {
                        txtMensajes.setText("Terminado analisis lexico\n");
                        break;
                    }
                    switch (tokens) {
                        case ERROR:
                            erro = true;
                            errores = errores + lexer.msg + lexer.lexeme + ", en la línea " + lexer.linea + "\n";
                            insertarSimboloLexico(lexer.lexeme, tokens.name(), lexer.linea);
                            break;
                        case P_Reservada:
                            insertarSimboloLexico(lexer.lexeme, tokens.name(), lexer.linea);
                            break;
                        case Asignacion:
                            insertarSimboloLexico(lexer.lexeme, tokens.name(), lexer.linea);
                            break;
                        case Suma:
                            insertarSimboloLexico(lexer.lexeme, tokens.name(), lexer.linea);
                            break;
                        case Resta:
                            insertarSimboloLexico(lexer.lexeme, tokens.name(), lexer.linea);
                            break;
                        case Multiplicacion:
                            insertarSimboloLexico(lexer.lexeme, tokens.name(), lexer.linea);
                            break;
                        case Division:
                            insertarSimboloLexico(lexer.lexeme, tokens.name(), lexer.linea);
                            break;
                        case Identificador:
                            tablaSimbolos_id.addToken(new Simbolo(lexer.lexeme, lexer.linea));
                            insertarSimboloLexico(lexer.lexeme, tokens.name(), lexer.linea);
                            break;
                        case Numero:
                            insertarSimboloLexico(lexer.lexeme, tokens.name(), lexer.linea);
                            break;
                        case Decimal:
                            insertarSimboloLexico(lexer.lexeme, tokens.name(), lexer.linea);
                            break;
                        case Texto:
                            insertarSimboloLexico(lexer.lexeme, tokens.name(), lexer.linea);
                            break;
                        case SA_Parentesis:
                            insertarSimboloLexico(lexer.lexeme, tokens.name(), lexer.linea);
                            break;
                        case SA_Llaves:
                            insertarSimboloLexico(lexer.lexeme, tokens.name(), lexer.linea);
                            break;
                        case SA_Corchetes:
                            insertarSimboloLexico(lexer.lexeme, tokens.name(), lexer.linea);
                            break;
                        case Simbolo_Especial:
                            insertarSimboloLexico(lexer.lexeme, tokens.name(), lexer.linea);
                            break;
                        case Propiedad:
                            insertarSimboloLexico(lexer.lexeme, tokens.name(), lexer.linea);
                            break;
                    }
                }
                if (erro) {
                    txtMensajes.setText(errores);
                }
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_btnAnalizarActionPerformed
    private void insertarSimboloLexico(String lexema, String componente, int linea) {
        Object[] item = {lexema, componente, linea};
        modelo.addRow(item);
    }
    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        //Si es análisis léxico, se muestra la tabla donde se
        //listaran lo lexemas encontrados
        //Si es otro tipo, se oculta
        if (cmbTipo.getSelectedIndex() == 0) {
            tpTablas.setVisible(true);
        } else if (cmbTipo.getSelectedIndex() == 1) {
            tpTablas.setVisible(false);
        }
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void btnTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablasActionPerformed
        new Tabla(this).setVisible(true);
    }//GEN-LAST:event_btnTablasActionPerformed

    private void btnDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshacerActionPerformed
        try {
            undo.undo();
        } catch (CannotUndoException e) {
        }
    }//GEN-LAST:event_btnDeshacerActionPerformed

    private void btnRehacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRehacerActionPerformed
        try {
            undo.redo();
        } catch (CannotRedoException e) {
        }
    }//GEN-LAST:event_btnRehacerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }
    private JTextArea texto;
    private TextLineNumber tln;
    public Font actualFont = new Font("Consolas", 0, 12);
    private boolean esNuevo = true;
    private boolean estaGuardado = true;
    private DefaultTableModel modelo;
    TablaSimbolos tablaSimbolos_id;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnCortar;
    private javax.swing.JButton btnDeshacer;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPegar;
    private javax.swing.JButton btnRehacer;
    private javax.swing.JButton btnTablas;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel listaTokens;
    private javax.swing.JPanel pnlAnalisi;
    private javax.swing.JTable tblLexico;
    private javax.swing.JTabbedPane tpTablas;
    private javax.swing.JTextArea txtMensajes;
    private javax.swing.JScrollPane vtnTexto;
    // End of variables declaration//GEN-END:variables

    private void actualizarFuente() {
        texto.setFont(actualFont);
        texto.updateUI();
        txtMensajes.setFont(actualFont);
        txtMensajes.updateUI();
    }

    private void cambiarFuente(Font nuevo) {
        this.actualFont = nuevo;
        actualizarFuente();
    }
}
