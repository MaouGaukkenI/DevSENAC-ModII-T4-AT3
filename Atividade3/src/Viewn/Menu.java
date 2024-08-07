/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Viewn;

import Model.Consultas;
import Model.ListaConsultas;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pacageObs.ListaObsevacoes;
import pacageObs.TableObservacoes;

public class Menu extends javax.swing.JFrame {

    private List<Consultas> ListaConsulta = ListaConsultas.listar();

    ListaConsultas lista = new ListaConsultas();
    ListaObsevacoes listaobs = new ListaObsevacoes();

    private final String[] tableColumns = {"Nome", "CPF", "Telefone", "Data", "Já era paciente?", "Consulta Realizada?"};

    DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);
    
    TableObservacoes tableObs;

    public Menu(TableObservacoes tableObs) {
        initComponents();
        dadosI();
        NovaLinha();
        this.tableObs = tableObs;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbConsultas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnNovaConsulta = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnObs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtbConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone", "Data", "Já era cliente?", "Consulta Realizada?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbConsultas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNovaConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNovaConsulta.setText("Nova Consulta");
        btnNovaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaConsultaActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDeletar.setText("Deletar Consulta");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnFinalizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFinalizar.setText("Finalizar Consulta");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnObs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnObs.setText("Ver OBS");
        btnObs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovaConsulta)
                .addGap(18, 18, 18)
                .addComponent(btnDeletar)
                .addGap(18, 18, 18)
                .addComponent(btnFinalizar)
                .addGap(18, 18, 18)
                .addComponent(btnObs)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaConsulta)
                    .addComponent(btnDeletar)
                    .addComponent(btnFinalizar)
                    .addComponent(btnObs))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void refreshTable(){
        jtbConsultas.setModel(tableModel);
    }

    public void NovaLinha() {
        if (!ListaConsulta.isEmpty()) {

            Consultas con;
            for (int i = 0; i < ListaConsulta.size(); i++) {
                con = ListaConsulta.get(i);
                String[] rowData = {con.getNome(), con.getCpf(), con.getTelefone(), con.getData(), con.getFidelidade(), con.getFinalizar()};
                tableModel.addRow(rowData);

                System.out.println("Nome: " + lista.getValueAt(i, 0));
                System.out.println("Cpf: " + lista.getValueAt(i, 1));
                System.out.println("Telefone: " + lista.getValueAt(i, 2));
                System.out.println("Data: " + lista.getValueAt(i, 3));
                System.out.println("Fidelidade: " + lista.getValueAt(i, 4));
                System.out.println("Finalizar: " + lista.getValueAt(i, 5));
            }
            refreshTable();

        }
    }
    

    public int getSelectedRow(){
        return jtbConsultas.getSelectedRow();
    }
    
    public void dadosI(){
        if(lista.getRowCount() == 0)
        for (int i = 0; i < 5; i++) {
            Consultas con = new Consultas();
            con.setNome("Nome" + (i + 1));
            con.setCpf("123.456.789-0" + i);
            con.setData("01/01/2" + i);
            con.setTelefone("(99)12345-678" + i);
            con.setFidelidade(i % 2 == 0 ? "Sim" : "Não");
            con.setFinalizar(i % 2 == 0 ? "Sim" : "Não");

            lista.addRow(con);
        }
    }
    
    private void btnNovaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaConsultaActionPerformed
        Cadastrar cad = new Cadastrar();
        cad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNovaConsultaActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int row = getSelectedRow();

        if (row != -1) {
            
            listaobs.Remover(row);
            tableObs.removeRow(row);
            lista.Remover(row);
            tableModel.removeRow(row);
            refreshTable();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para deletar");
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        if (getSelectedRow() != -1){
            Finalizar fin = new Finalizar (this);
            fin.setVisible(true);
            dispose();
            refreshTable();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma consulta para finalizar");
        }
        
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObsActionPerformed
        tableObs.setVisible(true);
    }//GEN-LAST:event_btnObsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            TableObservacoes t = new TableObservacoes();
            public void run() {
                new Menu(t).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnNovaConsulta;
    private javax.swing.JButton btnObs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbConsultas;
    // End of variables declaration//GEN-END:variables
}
