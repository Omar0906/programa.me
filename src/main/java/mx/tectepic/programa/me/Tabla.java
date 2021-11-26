/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package mx.tectepic.programa.me;

import aux_tools.Simbolo;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author turis
 */
public class Tabla extends javax.swing.JDialog {

    public Editor padre;
    public Tabla(Editor padre) {
        super(padre,"Tablas de símbolos",false);
        initComponents();
        this.padre = padre;
        this.setLocationRelativeTo(padre);
        rbPR.setFont(padre.getFont());
        rbTI.setFont(padre.getFont());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbPR = new javax.swing.JRadioButton();
        rbTI = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 500));

        buttonGroup1.add(rbPR);
        rbPR.setText("Palabras Resevadas");
        rbPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPRActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbTI);
        rbTI.setText("Tabla de identificadores");
        rbTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbTI)
                    .addComponent(rbPR))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(rbPR)
                .addGap(55, 55, 55)
                .addComponent(rbTI)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPRActionPerformed
        Object[] columnNames = {"Palabra Reservada"};
        Object[][] data = {{"apagar"},{"bloque"},{"caso"},{"cierto"},{"como"},{"definir"},{"derecha"},{"display"},{"facil_bloque"},{"facil_hacer_mientras"},{"facil_mientras"},{"facil_repetir"},{"facil_selector"},{"facil_si"},{"facil_sino"},{"falso"},{"fin_programa"},{"fin_var"},{"girar"},{"girar"},{"grados"},{"hacer"},{"hr"},{"incluir"},{"inicio_programa"},{"inicio_var"},{"intensidad"},{"izquierda"},{"led"},{"led_panel"},{"led_rgb"},{"led_semaforo"},{"mientras"},{"min"},{"mostrar"},{"mostrar"},{"motor"},{"motor_electrico"},{"motor_paso"},{"prender"},{"repetir"},{"salir"},{"seg"},{"selector"},{"selector"},{"si"},{"sino"},{"tiempo"},{"veces"},{"verdadero"}};
        DefaultTableModel modelo = new DefaultTableModel(data,columnNames);
        tblTabla.setModel(modelo);
    }//GEN-LAST:event_rbPRActionPerformed

    private void rbTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTIActionPerformed
        Object[] columnNames = {"Lexema","Tipo","Linea de declaración","Valor"};
        padre.tablaSimbolos_id.sortTabla();
        ArrayList<Simbolo> lista = padre.tablaSimbolos_id.verTablaSimbolos();
        DefaultTableModel modelo = new DefaultTableModel(columnNames,0);
        tblTabla.setModel(modelo);
        for(Simbolo sim:lista){
            modelo.addRow(new Object[]{sim.lexema,sim.tipo,sim.linea_declaracion,sim.valor});
        }
    }//GEN-LAST:event_rbTIActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Tabla dialog = new Tabla(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbPR;
    private javax.swing.JRadioButton rbTI;
    private javax.swing.JTable tblTabla;
    // End of variables declaration//GEN-END:variables
}