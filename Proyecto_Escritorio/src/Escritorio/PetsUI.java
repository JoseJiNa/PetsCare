/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escritorio;

import Utils.Session;
import java.awt.Frame;

/**
 *
 * @author Pepe Jiménez Narváez
 */
public class PetsUI extends javax.swing.JFrame {

    private Session session;

    /**
     * Creates new form Owners
     */
    public PetsUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        windowControls = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        closeSession = new javax.swing.JLabel();
        ownersPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        petsPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        weightsPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        vaccinesPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        reportPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        screen = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        windowControls.setBackground(new java.awt.Color(22, 160, 133));
        windowControls.setMinimumSize(new java.awt.Dimension(120, 30));

        jPanel3.setBackground(new java.awt.Color(22, 160, 133));

        jLabel2.setBackground(new java.awt.Color(22, 160, 133));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Minimize.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 30));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(22, 160, 133));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout windowControlsLayout = new javax.swing.GroupLayout(windowControls);
        windowControls.setLayout(windowControlsLayout);
        windowControlsLayout.setHorizontalGroup(
            windowControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windowControlsLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(windowControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(windowControlsLayout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 60, Short.MAX_VALUE)))
        );
        windowControlsLayout.setVerticalGroup(
            windowControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windowControlsLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
            .addGroup(windowControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(windowControlsLayout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(windowControls);
        windowControls.setBounds(1080, 0, 120, 30);

        jPanel5.setBackground(new java.awt.Color(22, 160, 133));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(300, 0, 780, 30);

        Menu.setBackground(new java.awt.Color(22, 160, 133));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_pets_white_48dp_1.png"))); // NOI18N
        jLabel1.setText("PetsCare");

        closeSession.setBackground(new java.awt.Color(22, 160, 133));
        closeSession.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closeSession.setForeground(new java.awt.Color(255, 255, 255));
        closeSession.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeSession.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_power_settings_new_white_36dp.png"))); // NOI18N
        closeSession.setText("Cerrar Sesión");
        closeSession.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeSession.setOpaque(true);
        closeSession.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeSessionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeSessionMouseExited(evt);
            }
        });

        ownersPanel.setBackground(new java.awt.Color(22, 160, 133));
        ownersPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ownersPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ownersPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ownersPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ownersPanelMouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(22, 160, 133));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_people_white_36dp.png"))); // NOI18N
        jLabel3.setText("Propietarios");

        javax.swing.GroupLayout ownersPanelLayout = new javax.swing.GroupLayout(ownersPanel);
        ownersPanel.setLayout(ownersPanelLayout);
        ownersPanelLayout.setHorizontalGroup(
            ownersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ownersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ownersPanelLayout.setVerticalGroup(
            ownersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ownersPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addGap(4, 4, 4))
        );

        petsPanel.setBackground(new java.awt.Color(67, 213, 180));
        petsPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setBackground(new java.awt.Color(22, 160, 133));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_pets_white_36dp.png"))); // NOI18N
        jLabel4.setText("Mascotas");

        javax.swing.GroupLayout petsPanelLayout = new javax.swing.GroupLayout(petsPanel);
        petsPanel.setLayout(petsPanelLayout);
        petsPanelLayout.setHorizontalGroup(
            petsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(petsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        petsPanelLayout.setVerticalGroup(
            petsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(petsPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addGap(4, 4, 4))
        );

        weightsPanel.setBackground(new java.awt.Color(22, 160, 133));
        weightsPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        weightsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                weightsPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                weightsPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                weightsPanelMouseExited(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(22, 160, 133));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/weight-kilogram.png"))); // NOI18N
        jLabel11.setText("Peso");

        javax.swing.GroupLayout weightsPanelLayout = new javax.swing.GroupLayout(weightsPanel);
        weightsPanel.setLayout(weightsPanelLayout);
        weightsPanelLayout.setHorizontalGroup(
            weightsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weightsPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        weightsPanelLayout.setVerticalGroup(
            weightsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weightsPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel11)
                .addGap(4, 4, 4))
        );

        vaccinesPanel.setBackground(new java.awt.Color(22, 160, 133));
        vaccinesPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vaccinesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vaccinesPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vaccinesPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vaccinesPanelMouseExited(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(22, 160, 133));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/needle.png"))); // NOI18N
        jLabel12.setText("Vacunas");

        javax.swing.GroupLayout vaccinesPanelLayout = new javax.swing.GroupLayout(vaccinesPanel);
        vaccinesPanel.setLayout(vaccinesPanelLayout);
        vaccinesPanelLayout.setHorizontalGroup(
            vaccinesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vaccinesPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        vaccinesPanelLayout.setVerticalGroup(
            vaccinesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vaccinesPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel12)
                .addGap(4, 4, 4))
        );

        reportPanel.setBackground(new java.awt.Color(22, 160, 133));
        reportPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportPanelMouseExited(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(22, 160, 133));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file-document.png"))); // NOI18N
        jLabel13.setText("Informes Diarios");

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel13)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ownersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(petsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(weightsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vaccinesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeSession, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(ownersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(petsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(weightsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(vaccinesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(reportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                .addComponent(closeSession, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(Menu);
        Menu.setBounds(0, 0, 300, 700);

        screen.setBackground(new java.awt.Color(26, 188, 156));

        javax.swing.GroupLayout screenLayout = new javax.swing.GroupLayout(screen);
        screen.setLayout(screenLayout);
        screenLayout.setHorizontalGroup(
            screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        screenLayout.setVerticalGroup(
            screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        getContentPane().add(screen);
        screen.setBounds(300, 0, 900, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jPanel3.setBackground(new java.awt.Color(26, 188, 156));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jPanel3.setBackground(new java.awt.Color(22, 160, 133));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jPanel4.setBackground(new java.awt.Color(238, 17, 17));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jPanel4.setBackground(new java.awt.Color(22, 160, 133));
    }//GEN-LAST:event_jLabel5MouseExited

    private void weightsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weightsPanelMouseEntered
        weightsPanel.setBackground(new java.awt.Color(26, 188, 156));    }//GEN-LAST:event_weightsPanelMouseEntered

    private void weightsPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weightsPanelMouseExited
        weightsPanel.setBackground(new java.awt.Color(22, 160, 133));
    }//GEN-LAST:event_weightsPanelMouseExited

    private void vaccinesPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaccinesPanelMouseEntered
        vaccinesPanel.setBackground(new java.awt.Color(26, 188, 156));    }//GEN-LAST:event_vaccinesPanelMouseEntered

    private void vaccinesPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaccinesPanelMouseExited
        vaccinesPanel.setBackground(new java.awt.Color(22, 160, 133));
    }//GEN-LAST:event_vaccinesPanelMouseExited

    private void reportPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportPanelMouseEntered
        reportPanel.setBackground(new java.awt.Color(26, 188, 156));    }//GEN-LAST:event_reportPanelMouseEntered

    private void reportPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportPanelMouseExited
        reportPanel.setBackground(new java.awt.Color(22, 160, 133));
    }//GEN-LAST:event_reportPanelMouseExited

    private void closeSessionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeSessionMouseEntered
        closeSession.setBackground(new java.awt.Color(238, 17, 17));
    }//GEN-LAST:event_closeSessionMouseEntered

    private void closeSessionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeSessionMouseExited
        closeSession.setBackground(new java.awt.Color(22, 160, 133));
    }//GEN-LAST:event_closeSessionMouseExited

    private void ownersPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ownersPanelMouseEntered
        ownersPanel.setBackground(new java.awt.Color(26, 188, 156));
    }//GEN-LAST:event_ownersPanelMouseEntered

    private void ownersPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ownersPanelMouseExited
        ownersPanel.setBackground(new java.awt.Color(22, 160, 133));
    }//GEN-LAST:event_ownersPanelMouseExited

    private void weightsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weightsPanelMouseClicked
        WeightsUI weightsUI = new WeightsUI();
        weightsUI.setSession(session);
        weightsUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_weightsPanelMouseClicked

    private void vaccinesPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaccinesPanelMouseClicked
        VaccinesUI vaccinesUI = new VaccinesUI();
        vaccinesUI.setSession(session);
        vaccinesUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_vaccinesPanelMouseClicked

    private void reportPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportPanelMouseClicked
        ReportsUI reportsUI = new ReportsUI();
        reportsUI.setSession(session);
        reportsUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_reportPanelMouseClicked

    private void ownersPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ownersPanelMouseClicked
        OwnersUI ownersUI = new OwnersUI();
        ownersUI.setSession(session);
        ownersUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ownersPanelMouseClicked

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
            java.util.logging.Logger.getLogger(PetsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PetsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PetsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PetsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PetsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel closeSession;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel ownersPanel;
    private javax.swing.JPanel petsPanel;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JPanel screen;
    private javax.swing.JPanel vaccinesPanel;
    private javax.swing.JPanel weightsPanel;
    private javax.swing.JPanel windowControls;
    // End of variables declaration//GEN-END:variables

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
