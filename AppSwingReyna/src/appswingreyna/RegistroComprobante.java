/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appswingreyna;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Compu
 */
public class RegistroComprobante extends javax.swing.JFrame {

    protected Double montoBruto;
    protected Double impuesto;
    protected Double montoTotal;
    /**
     * Creates new form registroComprobante
     * Patrick Rodriguez, Para Transportes Reyna
     */
    
    public RegistroComprobante() {
        initComponents();
        setValuesDefault();
        setMyProperties();
        setMyActions();
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelButtons = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        panelMain = new javax.swing.JPanel();
        txfDocumento = new javax.swing.JTextField();
        txfNombreRazon = new javax.swing.JTextField();
        txfDireccion = new javax.swing.JTextField();
        cmbTipoDocumento = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        txfMontoBruto = new javax.swing.JTextField();
        txfMontoImpuesto = new javax.swing.JTextField();
        txfMontoTotal = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txfComprobante = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Registro de Comprobantes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("REYNA");

        panelButtons.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNuevo.setText("Nuevo registro");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnReportes.setText("Reportes");

        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReportes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelButtonsLayout.setVerticalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnNuevo)
                .addComponent(btnReportes))
        );

        panelMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txfDocumento.setToolTipText("Documento de cliente");
        txfDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDocumentoActionPerformed(evt);
            }
        });

        cmbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleta", "Factura", "Nota de Crédito", "Guardar Temporalmente" }));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "#", "Item Adquirido", "Observaciones", "Cantidad", "Monto S/."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.setName("tblProductos"); // NOI18N
        jScrollPane1.setViewportView(tblProductos);

        txfMontoBruto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfMontoBruto.setText("0.0");
        txfMontoBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfMontoBrutoActionPerformed(evt);
            }
        });

        txfMontoImpuesto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfMontoImpuesto.setText("0.0");

        txfMontoTotal.setBackground(new java.awt.Color(204, 255, 255));
        txfMontoTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfMontoTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfMontoTotal.setText("0.0");

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel3.setText("RUC/DNI:");

        jLabel4.setText("Nombre o razon social:");

        jLabel5.setText("Dirección:");

        jLabel6.setText("Ingrese productos adquiridos");

        jLabel7.setText("Compra S/.");

        jLabel8.setText("IGV S/.");

        jLabel9.setText("Monto total S/.");

        jLabel10.setText("N° de Comprobante:");

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfDireccion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfMontoBruto)
                            .addComponent(txfMontoImpuesto)
                            .addComponent(txfMontoTotal)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfNombreRazon)
                                    .addGroup(panelMainLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNombreRazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addComponent(txfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfMontoBruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txfMontoImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addContainerGap())
        );

        jLabel4.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(351, 351, 351)
                                .addComponent(jLabel2)))
                        .addGap(0, 274, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txfDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfDocumentoActionPerformed

    private void txfMontoBrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfMontoBrutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfMontoBrutoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ConexionMySQL conexionmysql = new ConexionMySQL();
        Connection conn = conexionmysql.conectarMySQL();
        
        
        String sSQL =  "SELECT `serie`, `numero`, `tipo`, `cliente`, `clidocumento`, `clidireccion`, `mbruto`, `impuesto`, `mtotal`, `fregistro` FROM `dbreyna`.`ryacomprobante` WHERE  `serie`=0 AND `numero`=00000000000000000000;";
        
        try {
            
            Statement statement=conn.createStatement();
            
            String comboValue = (String) cmbTipoDocumento.getSelectedItem();
            
            /****
            ** New Object Comprobante
            *  Set value in objects
            * */
            Comprobante comprobante = new Comprobante();
            if(comboValue == "Boleta") { 
                comprobante.setSerie(1); 
                comprobante.setTipo('B');
            }else {
                comprobante.setSerie(2); 
                comprobante.setTipo('F');
            }
           comprobante.setNumero(Integer.parseInt(txfComprobante.getText()));
           comprobante.setCliente(txfNombreRazon.getText());
           comprobante.setClidocumento(txfDocumento.getText());
           comprobante.setClidireccion(txfDireccion.getText());
           comprobante.setMbruto(montoBruto);
           comprobante.setImpuesto(impuesto);
           comprobante.setMtotal(montoTotal);
            
            if(conexionmysql.insertDB(comprobante, statement))
            {
                 JOptionPane.showMessageDialog(null,"Se guardo Correctamente.");
                 
            }
        
        
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        } 
         
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroComprobante().setVisible(true);
                
            }
        });
    }
    
    

    /**
     * Funciones Propias
     */
    //TABLA DE ITEMS
    private void setMyActions() {
        
        //Validate basic data;
        validateBasicData();
        
        //Change value of table 
        tblProductos.getModel().addTableModelListener(
        new TableModelListener() 
        {
            public void tableChanged(TableModelEvent evt) 
            {     
                 TableModel a = tblProductos.getModel();
                 a.removeTableModelListener(this);
                 setNumberItem(a);
                 a.addTableModelListener(this);
                 setValidateAdd(a);
            }

            private void setNumberItem(TableModel model) {  
                montoTotal=0.0;
                for (int i = 0; i < tblProductos.getRowCount(); i++) {  // Loop through the rows
                    if(tblProductos.getValueAt(i, 1) != null) {
                    model.setValueAt(i+1,i,0);    
                        
                        //update cantidad
                        if(tblProductos.getValueAt(i, 3) == null) {
                            model.setValueAt(1.0,i,3);    
                        }

                        //Update MontoTotal
                        if(tblProductos.getValueAt(i, 4) !=null && (Double)tblProductos.getValueAt(i, 4) !=  0.0) {                           
                            Object tmpquanty = (Object) tblProductos.getValueAt(i, 3);
                            double quanty = (double)(tmpquanty);
                            
                            if((Double)tblProductos.getValueAt(i, 4) < 0 ) {
                                JOptionPane.showMessageDialog(null,"No esta permitido montos negativos, se considerara como positivo");
                                montoTotal += ((Double)tblProductos.getValueAt(i, 4)* (-1)) * quanty ;
                            }else {
                                montoTotal += (Double)tblProductos.getValueAt(i, 4) * quanty;      
                            }
                          updateMonto(montoTotal);
                        }
                    }  
                 }
            }

            private void setValidateAdd(TableModel model) {
                DefaultTableModel modelDef = (DefaultTableModel) model;
                
                int numInsert=0;
                for (int i = 0; i < tblProductos.getRowCount(); i++) {  // Loop through the rows
                    if(tblProductos.getValueAt(i, 1) != null) {
                    numInsert++;
                    }  
                }
                if(tblProductos.getRowCount() == numInsert) {
                    modelDef.addRow(new Object[]{null, null,null,null,null});
                }
                
            }

            private void updateMonto(Double montoTotal) {
                txfMontoTotal.setText(montoTotal.toString());
                updateImpuestos();
            }

            private void updateImpuestos() {
                impuesto = montoTotal * 0.18;
                montoBruto = montoTotal - impuesto;
                
            }
        });
    }
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReportes;
    private javax.swing.JComboBox<String> cmbTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txfComprobante;
    private javax.swing.JTextField txfDireccion;
    private javax.swing.JTextField txfDocumento;
    private javax.swing.JTextField txfMontoBruto;
    private javax.swing.JTextField txfMontoImpuesto;
    private javax.swing.JTextField txfMontoTotal;
    private javax.swing.JTextField txfNombreRazon;
    // End of variables declaration//GEN-END:variables

    private void setMyProperties() {
        
        //Tamaño de columnas
        TableColumnModel columnModel = tblProductos.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(5); //NUMBER ITEM
        columnModel.getColumn(1).setPreferredWidth(300); //ITEM DETAILS
        columnModel.getColumn(3).setPreferredWidth(5); //QUANTY
        
        //Centrar contenido de Columnas
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tblProductos.getColumnModel().getColumn(0).setCellRenderer( centerRenderer ); //NUMBER ITEM
        
        //Buttons desactivado 
        btnGuardar.setEnabled(false);
        
        txfMontoBruto.setEnabled(false);
        txfMontoTotal.setEnabled(false);
        txfMontoImpuesto.setEnabled(false);
    }

    private void setValuesDefault() {
        montoBruto = 0.0;
        impuesto =0.0;
        montoTotal = 0.0;
    }

    private void validateBasicData() {
        
        //Validate values Documento
        txfDocumento.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                txfDocumento.setBackground(Color.yellow);
            }

            public void focusLost(FocusEvent e) { 
                    validarCampos();                
            }
        });
        
        //Validate values Razon Social
        txfNombreRazon.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                txfNombreRazon.setBackground(Color.yellow);
            }

            public void focusLost(FocusEvent e) { 
                    validarCampos();                
            }
        });
              
              
        
    }
    private void validarCampos() {
        boolean estado= true;
        if(txfDocumento.getText().length() > 0 && txfDocumento.getText().length() < 8) {
            JOptionPane.showMessageDialog(null,"Documento de identidad debe ser mayor a 8 digitos.");
            estado=false;
        }
        if(txfDocumento.getText().length() == 0) {
            estado=false;
        }
        
        if(txfNombreRazon.getText().length() >0 && txfNombreRazon.getText().length() < 2) {
            JOptionPane.showMessageDialog(null,"Ingrese nombre o razon social válida");
            estado=false;
        }
        if(txfNombreRazon.getText().length() ==0) {
            estado=false;
        }
                
        if(estado) {
            btnGuardar.setEnabled(true);
        }
    }
}

