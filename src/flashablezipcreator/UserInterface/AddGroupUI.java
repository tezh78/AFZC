/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashablezipcreator.UserInterface;

/**
 *
 * @author Nikhil
 */
public class AddGroupUI extends javax.swing.JFrame {

    /**
     * Creates new form CustomGroupUI
     */
    public AddGroupUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customrbGroup = new javax.swing.ButtonGroup();
        customPanelMain = new javax.swing.JPanel();
        custombtnAdd = new javax.swing.JButton();
        custompanelPermissions = new javax.swing.JPanel();
        customcbOthersX = new javax.swing.JCheckBox();
        customcbOwnerW = new javax.swing.JCheckBox();
        customcbGroupW = new javax.swing.JCheckBox();
        customcbSticky = new javax.swing.JCheckBox();
        customlblR = new javax.swing.JLabel();
        customlblOwner = new javax.swing.JLabel();
        customlblX = new javax.swing.JLabel();
        customcbOwnerR = new javax.swing.JCheckBox();
        customlblPermissions = new javax.swing.JLabel();
        customllblW = new javax.swing.JLabel();
        customlblGroup = new javax.swing.JLabel();
        customcbGroupX = new javax.swing.JCheckBox();
        customcbSetuid = new javax.swing.JCheckBox();
        customcbGroupR = new javax.swing.JCheckBox();
        customcbSetgid = new javax.swing.JCheckBox();
        customcbOthersW = new javax.swing.JCheckBox();
        customcbOthersR = new javax.swing.JCheckBox();
        customlblOthers = new javax.swing.JLabel();
        customcbOwnerX = new javax.swing.JCheckBox();
        customcbPermissions = new javax.swing.JCheckBox();
        custompanelPermissionsContent = new javax.swing.JPanel();
        customlblPermInString = new javax.swing.JLabel();
        customlblPermInDigit = new javax.swing.JLabel();
        custompanelGroupDetails = new javax.swing.JPanel();
        customtxtGroupName = new javax.swing.JTextField();
        customtxtInstallLocation = new javax.swing.JTextField();
        customrbSingleFile = new javax.swing.JRadioButton();
        customrbMultipleFiles = new javax.swing.JRadioButton();
        custompanelHeader = new javax.swing.JPanel();
        customlblHeader = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        customPanelMain.setBackground(new java.awt.Color(255, 255, 255));

        custombtnAdd.setBackground(new java.awt.Color(255, 255, 255));
        custombtnAdd.setText("Add");
        custombtnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        custombtnAdd.setContentAreaFilled(false);
        custombtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custombtnAddActionPerformed(evt);
            }
        });

        custompanelPermissions.setBackground(new java.awt.Color(255, 255, 255));

        customcbOthersX.setBackground(new java.awt.Color(255, 255, 255));
        customcbOthersX.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customcbOthersXItemStateChanged(evt);
            }
        });

        customcbOwnerW.setBackground(new java.awt.Color(255, 255, 255));
        customcbOwnerW.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customcbOwnerWItemStateChanged(evt);
            }
        });

        customcbGroupW.setBackground(new java.awt.Color(255, 255, 255));
        customcbGroupW.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customcbGroupWItemStateChanged(evt);
            }
        });

        customcbSticky.setBackground(new java.awt.Color(255, 255, 255));
        customcbSticky.setText("sticky");
        customcbSticky.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customcbStickyItemStateChanged(evt);
            }
        });

        customlblR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customlblR.setText(" R");
        customlblR.setPreferredSize(new java.awt.Dimension(21, 21));

        customlblOwner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customlblOwner.setText("Owner");

        customlblX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customlblX.setText("  X");
        customlblX.setPreferredSize(new java.awt.Dimension(21, 21));

        customcbOwnerR.setBackground(new java.awt.Color(255, 255, 255));
        customcbOwnerR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customcbOwnerRItemStateChanged(evt);
            }
        });

        customlblPermissions.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        customlblPermissions.setText("Permissions");

        customllblW.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customllblW.setText(" W");
        customllblW.setPreferredSize(new java.awt.Dimension(21, 21));

        customlblGroup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customlblGroup.setText("Group");

        customcbGroupX.setBackground(new java.awt.Color(255, 255, 255));
        customcbGroupX.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customcbGroupXItemStateChanged(evt);
            }
        });

        customcbSetuid.setBackground(new java.awt.Color(255, 255, 255));
        customcbSetuid.setText("setuid");
        customcbSetuid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customcbSetuidItemStateChanged(evt);
            }
        });

        customcbGroupR.setBackground(new java.awt.Color(255, 255, 255));
        customcbGroupR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customcbGroupRItemStateChanged(evt);
            }
        });

        customcbSetgid.setBackground(new java.awt.Color(255, 255, 255));
        customcbSetgid.setText("setgid");
        customcbSetgid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customcbSetgidItemStateChanged(evt);
            }
        });

        customcbOthersW.setBackground(new java.awt.Color(255, 255, 255));
        customcbOthersW.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customcbOthersWItemStateChanged(evt);
            }
        });

        customcbOthersR.setBackground(new java.awt.Color(255, 255, 255));
        customcbOthersR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customcbOthersRItemStateChanged(evt);
            }
        });

        customlblOthers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customlblOthers.setText("Others");

        customcbOwnerX.setBackground(new java.awt.Color(255, 255, 255));
        customcbOwnerX.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customcbOwnerXItemStateChanged(evt);
            }
        });

        customcbPermissions.setBackground(new java.awt.Color(255, 255, 255));
        customcbPermissions.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customcbPermissionsItemStateChanged(evt);
            }
        });

        custompanelPermissionsContent.setBackground(new java.awt.Color(255, 255, 255));

        customlblPermInString.setBackground(new java.awt.Color(255, 255, 255));
        customlblPermInString.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customlblPermInString.setText("----------");
        customlblPermInString.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout custompanelPermissionsContentLayout = new javax.swing.GroupLayout(custompanelPermissionsContent);
        custompanelPermissionsContent.setLayout(custompanelPermissionsContentLayout);
        custompanelPermissionsContentLayout.setHorizontalGroup(
            custompanelPermissionsContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custompanelPermissionsContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customlblPermInString)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        custompanelPermissionsContentLayout.setVerticalGroup(
            custompanelPermissionsContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custompanelPermissionsContentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(customlblPermInString))
        );

        customlblPermInDigit.setBackground(new java.awt.Color(255, 255, 255));
        customlblPermInDigit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customlblPermInDigit.setText("0000");
        customlblPermInDigit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout custompanelPermissionsLayout = new javax.swing.GroupLayout(custompanelPermissions);
        custompanelPermissions.setLayout(custompanelPermissionsLayout);
        custompanelPermissionsLayout.setHorizontalGroup(
            custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, custompanelPermissionsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(custompanelPermissionsLayout.createSequentialGroup()
                        .addGroup(custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(customlblGroup)
                            .addComponent(customlblOthers)
                            .addComponent(customlblOwner))
                        .addGap(18, 18, 18)
                        .addGroup(custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(custompanelPermissionsLayout.createSequentialGroup()
                                .addGroup(custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(custompanelPermissionsLayout.createSequentialGroup()
                                        .addComponent(customcbGroupR)
                                        .addGap(40, 40, 40)
                                        .addComponent(customcbGroupW))
                                    .addGroup(custompanelPermissionsLayout.createSequentialGroup()
                                        .addGroup(custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(customlblR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(customcbOwnerR))
                                        .addGap(40, 40, 40)
                                        .addGroup(custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(customcbOwnerW)
                                            .addComponent(customllblW, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(40, 40, 40)
                                .addGroup(custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customcbOwnerX)
                                    .addComponent(customcbGroupX)
                                    .addComponent(customlblX, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(custompanelPermissionsLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(custompanelPermissionsContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(custompanelPermissionsLayout.createSequentialGroup()
                                        .addComponent(customcbSetgid)
                                        .addGap(38, 38, 38)
                                        .addComponent(customcbSticky))
                                    .addGroup(custompanelPermissionsLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(customlblPermInDigit))))
                            .addGroup(custompanelPermissionsLayout.createSequentialGroup()
                                .addComponent(customcbOthersR)
                                .addGap(40, 40, 40)
                                .addComponent(customcbOthersW)
                                .addGap(40, 40, 40)
                                .addComponent(customcbOthersX))))
                    .addComponent(customcbSetuid)
                    .addGroup(custompanelPermissionsLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(customcbPermissions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(customlblPermissions)))
                .addGap(53, 53, 53))
        );
        custompanelPermissionsLayout.setVerticalGroup(
            custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custompanelPermissionsLayout.createSequentialGroup()
                .addGroup(custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customlblPermissions)
                    .addComponent(customcbPermissions))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customlblR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customllblW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customlblX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customcbOwnerR)
                    .addComponent(customcbOwnerW)
                    .addComponent(customcbOwnerX)
                    .addComponent(customlblOwner, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(7, 7, 7)
                .addGroup(custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customlblGroup)
                    .addGroup(custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(customcbGroupR)
                        .addComponent(customcbGroupW)
                        .addComponent(customcbGroupX)))
                .addGap(7, 7, 7)
                .addGroup(custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customlblOthers)
                    .addGroup(custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(customcbOthersR)
                        .addComponent(customcbOthersW)
                        .addComponent(customcbOthersX)))
                .addGap(7, 7, 7)
                .addGroup(custompanelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customcbSetuid)
                    .addComponent(customcbSticky)
                    .addComponent(customcbSetgid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customlblPermInDigit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(custompanelPermissionsContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        custompanelGroupDetails.setBackground(new java.awt.Color(255, 255, 255));

        customtxtGroupName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        customtxtGroupName.setToolTipText("This will contain set of files you will choose from in Aroma Installer");

        customtxtInstallLocation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        customtxtInstallLocation.setToolTipText("This is the location where your files will be installed (e.g. \\system\\framework)");

        customrbSingleFile.setBackground(new java.awt.Color(255, 255, 255));
        customrbGroup.add(customrbSingleFile);
        customrbSingleFile.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        customrbSingleFile.setSelected(true);
        customrbSingleFile.setText("Install Single File");
        customrbSingleFile.setToolTipText("Required in Groups such as BootAnimations, Fonts, Kernels, etc where you can only choose one from the list");

        customrbMultipleFiles.setBackground(new java.awt.Color(255, 255, 255));
        customrbGroup.add(customrbMultipleFiles);
        customrbMultipleFiles.setText("Install Multiple Files");
        customrbMultipleFiles.setToolTipText("Required in Groups where you can only choose multiple files from the list");

        javax.swing.GroupLayout custompanelGroupDetailsLayout = new javax.swing.GroupLayout(custompanelGroupDetails);
        custompanelGroupDetails.setLayout(custompanelGroupDetailsLayout);
        custompanelGroupDetailsLayout.setHorizontalGroup(
            custompanelGroupDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custompanelGroupDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(custompanelGroupDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(custompanelGroupDetailsLayout.createSequentialGroup()
                        .addComponent(customrbSingleFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(customrbMultipleFiles))
                    .addComponent(customtxtInstallLocation)
                    .addComponent(customtxtGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        custompanelGroupDetailsLayout.setVerticalGroup(
            custompanelGroupDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custompanelGroupDetailsLayout.createSequentialGroup()
                .addComponent(customtxtGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customtxtInstallLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(custompanelGroupDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(customrbSingleFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customrbMultipleFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        custompanelHeader.setBackground(new java.awt.Color(0, 102, 102));
        custompanelHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        customlblHeader.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        customlblHeader.setForeground(new java.awt.Color(255, 255, 255));
        customlblHeader.setText("Add Group");

        javax.swing.GroupLayout custompanelHeaderLayout = new javax.swing.GroupLayout(custompanelHeader);
        custompanelHeader.setLayout(custompanelHeaderLayout);
        custompanelHeaderLayout.setHorizontalGroup(
            custompanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custompanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customlblHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        custompanelHeaderLayout.setVerticalGroup(
            custompanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custompanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customlblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout customPanelMainLayout = new javax.swing.GroupLayout(customPanelMain);
        customPanelMain.setLayout(customPanelMainLayout);
        customPanelMainLayout.setHorizontalGroup(
            customPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(custombtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(custompanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(customPanelMainLayout.createSequentialGroup()
                .addGroup(customPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custompanelGroupDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(customPanelMainLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(custompanelPermissions, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 1, Short.MAX_VALUE))
        );
        customPanelMainLayout.setVerticalGroup(
            customPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customPanelMainLayout.createSequentialGroup()
                .addComponent(custompanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(custompanelGroupDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(custompanelPermissions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(custombtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custombtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custombtnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custombtnAddActionPerformed

    private void customcbOwnerRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customcbOwnerRItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_customcbOwnerRItemStateChanged

    private void customcbOwnerWItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customcbOwnerWItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_customcbOwnerWItemStateChanged

    private void customcbOwnerXItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customcbOwnerXItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_customcbOwnerXItemStateChanged

    private void customcbGroupRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customcbGroupRItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_customcbGroupRItemStateChanged

    private void customcbGroupWItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customcbGroupWItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_customcbGroupWItemStateChanged

    private void customcbOthersRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customcbOthersRItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_customcbOthersRItemStateChanged

    private void customcbOthersWItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customcbOthersWItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_customcbOthersWItemStateChanged

    private void customcbOthersXItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customcbOthersXItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_customcbOthersXItemStateChanged

    private void customcbSetuidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customcbSetuidItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_customcbSetuidItemStateChanged

    private void customcbSetgidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customcbSetgidItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_customcbSetgidItemStateChanged

    private void customcbStickyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customcbStickyItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_customcbStickyItemStateChanged

    private void customcbPermissionsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customcbPermissionsItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_customcbPermissionsItemStateChanged

    private void customcbGroupXItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customcbGroupXItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_customcbGroupXItemStateChanged

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
            java.util.logging.Logger.getLogger(AddGroupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddGroupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddGroupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddGroupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGroupUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel customPanelMain;
    private javax.swing.JButton custombtnAdd;
    private javax.swing.JCheckBox customcbGroupR;
    private javax.swing.JCheckBox customcbGroupW;
    private javax.swing.JCheckBox customcbGroupX;
    private javax.swing.JCheckBox customcbOthersR;
    private javax.swing.JCheckBox customcbOthersW;
    private javax.swing.JCheckBox customcbOthersX;
    private javax.swing.JCheckBox customcbOwnerR;
    private javax.swing.JCheckBox customcbOwnerW;
    private javax.swing.JCheckBox customcbOwnerX;
    private javax.swing.JCheckBox customcbPermissions;
    private javax.swing.JCheckBox customcbSetgid;
    private javax.swing.JCheckBox customcbSetuid;
    private javax.swing.JCheckBox customcbSticky;
    private javax.swing.JLabel customlblGroup;
    private javax.swing.JLabel customlblHeader;
    private javax.swing.JLabel customlblOthers;
    private javax.swing.JLabel customlblOwner;
    private javax.swing.JLabel customlblPermInDigit;
    private javax.swing.JLabel customlblPermInString;
    private javax.swing.JLabel customlblPermissions;
    private javax.swing.JLabel customlblR;
    private javax.swing.JLabel customlblX;
    private javax.swing.JLabel customllblW;
    private javax.swing.JPanel custompanelGroupDetails;
    private javax.swing.JPanel custompanelHeader;
    private javax.swing.JPanel custompanelPermissions;
    private javax.swing.JPanel custompanelPermissionsContent;
    private javax.swing.ButtonGroup customrbGroup;
    private javax.swing.JRadioButton customrbMultipleFiles;
    private javax.swing.JRadioButton customrbSingleFile;
    private javax.swing.JTextField customtxtGroupName;
    private javax.swing.JTextField customtxtInstallLocation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
