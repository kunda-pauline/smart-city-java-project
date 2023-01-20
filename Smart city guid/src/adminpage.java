
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class adminpage extends javax.swing.JFrame {
    private int selectedindex;

    /**
     * Creates new form
     */
    public adminpage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        hospital = new javax.swing.JRadioButton();
        restourant = new javax.swing.JRadioButton();
        hotel = new javax.swing.JRadioButton();
        market = new javax.swing.JRadioButton();
        school = new javax.swing.JRadioButton();
        church = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delet = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtcategory = new javax.swing.JTextField();
        txtlocation = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtwebsite = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        mess = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        search = new javax.swing.JButton();
        searchfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        photo1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        commentstable = new javax.swing.JTable();
        btncomment = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 102, 102)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(102, 102, 255));
        header.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 3, 5, new java.awt.Color(0, 102, 102)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 204));
        jLabel2.setText("SMART CITY GUID");

        logout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(0, 153, 153));
        logout.setText("LOGOUT");
        logout.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(494, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 60));

        container.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));

        hospital.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        hospital.setText("Hospital");
        hospital.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        hospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalActionPerformed(evt);
            }
        });
        container.add(hospital);

        restourant.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        restourant.setText("Restourant");
        restourant.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        restourant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restourantActionPerformed(evt);
            }
        });
        container.add(restourant);

        hotel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        hotel.setText("Hotel");
        hotel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        hotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelActionPerformed(evt);
            }
        });
        container.add(hotel);

        market.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        market.setText("Market");
        market.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        market.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marketActionPerformed(evt);
            }
        });
        container.add(market);

        school.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        school.setText("Schools");
        school.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        school.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolActionPerformed(evt);
            }
        });
        container.add(school);

        church.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        church.setText("Church");
        church.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        church.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                churchActionPerformed(evt);
            }
        });
        container.add(church);

        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1380, 40));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 102)));

        add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add.setText("ADD");
        add.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        edit.setText("EDIT");
        edit.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delet.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        delet.setText("DELET");
        delet.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        delet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("NAME");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("CATEGORY ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("LOCATION");

        txtname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtcategory.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtcategory.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));

        txtlocation.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtlocation.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("ADDRESS");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("CONTACT");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("WEB SITE");

        txtwebsite.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtwebsite.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));

        txtcontact.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtcontact.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));

        txtaddress.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtaddress.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });

        mess.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mess.setForeground(new java.awt.Color(255, 0, 0));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("IMAGE");

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("uplod photo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(mess, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtlocation, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtwebsite, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(delet, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(mess, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlocation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtwebsite, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delet)
                    .addComponent(add)
                    .addComponent(edit))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 500, 510));

        table1.setAutoCreateRowSorter(true);
        table1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "CATEGORY", "LOCATION", "ADDRESS", "CONTACT", "WEBSITE", "IMAGE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table1.setColumnSelectionAllowed(true);
        table1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table1.setGridColor(new java.awt.Color(0, 102, 102));
        table1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);
        table1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setMinWidth(10);
            table1.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 820, 270));

        search.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        search.setForeground(new java.awt.Color(0, 51, 204));
        search.setText("SEARCH");
        search.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3), new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true)));
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 60, 30));

        searchfield.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchfield.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255))));
        searchfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfieldActionPerformed(evt);
            }
        });
        getContentPane().add(searchfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 260, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("  ENTER  NAME , LOCATION OR CATEGORY");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 390, 30));

        refresh.setBackground(new java.awt.Color(0, 102, 102));
        refresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refresh.setText("Refresh");
        refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        getContentPane().add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        photo1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        photo1.setMaximumSize(new java.awt.Dimension(2080, 2120));
        photo1.setMinimumSize(new java.awt.Dimension(2000, 20120));
        getContentPane().add(photo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 380, 230));

        commentstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Comments"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(commentstable);
        if (commentstable.getColumnModel().getColumnCount() > 0) {
            commentstable.getColumnModel().getColumn(0).setMinWidth(50);
            commentstable.getColumnModel().getColumn(0).setMaxWidth(50);
            commentstable.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 500, 430, 200));

        btncomment.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btncomment.setText("view comments ");
        btncomment.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        btncomment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncomment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncommentMouseClicked(evt);
            }
        });
        btncomment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncommentActionPerformed(evt);
            }
        });
        getContentPane().add(btncomment, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, 90, 30));

        jLabel10.setBackground(new java.awt.Color(204, 204, 255));
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 102, 102)));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 1130));

        pack();
    }// </editor-fold>//GEN-END:initComponents
PreparedStatement insert;
Connection con;
Statement stm;

    private void table_update()
    {
        
    }
    
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

        login logt=new login();
       logt.setVisible(true);
      this.hide();
    }//GEN-LAST:event_logoutActionPerformed

    private void hospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalActionPerformed
       
        if(hospital.isSelected())
        school.setSelected(false);
        market.setSelected(false);
        hotel.setSelected(false);
         church.setSelected(false);
        restourant.setSelected(false);
        mess.setText("ADD , DELET OR EDIT HOSPITAL");

    }//GEN-LAST:event_hospitalActionPerformed

    private void restourantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restourantActionPerformed
        if(restourant.isSelected())
        
        school.setSelected(false);
        market.setSelected(false);
        hotel.setSelected(false);
        hospital.setSelected(false);
        church.setSelected(false);
        mess.setText("ADD , DELET OR EDIT RESTOURANT");
    }//GEN-LAST:event_restourantActionPerformed

    private void hotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotelActionPerformed
        
        if(hotel.isSelected())
        hospital.setSelected(false);
        school.setSelected(false);
        market.setSelected(false);
        restourant.setSelected(false);
         church.setSelected(false);
        mess.setText("ADD , DELET OR EDIT HOTEL");    
       
    }//GEN-LAST:event_hotelActionPerformed

    private void marketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marketActionPerformed
     
        if(market.isSelected())
        school.setSelected(false);
        church.setSelected(false);
        restourant.setSelected(false);
        hospital.setSelected(false);
         hotel.setSelected(false);
        mess.setText("ADD , DELET OR EDIT MARKET");
    }//GEN-LAST:event_marketActionPerformed

    private void schoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolActionPerformed
        
        if(school.isSelected())
        market.setSelected(false);
        restourant.setSelected(false);
        hotel.setSelected(false);
        hospital.setSelected(false);
        church.setSelected(false);
         mess.setText("ADD , DELET OR EDIT SCHOOL");
        
       
    }//GEN-LAST:event_schoolActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        
    }//GEN-LAST:event_txtaddressActionPerformed

    private void churchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_churchActionPerformed
        
        if(church.isSelected())
        market.setSelected(false);
        restourant.setSelected(false);
        hotel.setSelected(false);
        hospital.setSelected(false);
        school.setSelected(false); 
        mess.setText("ADD , DELET OR EDIT CHURCH");     // TODO add your handling code here:
    }//GEN-LAST:event_churchActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        
        String name=txtname.getText();
        String category=txtcategory.getText();
        String location=txtlocation.getText();
        String address=txtaddress.getText();
        String contact=txtcontact.getText();
        String website=txtwebsite.getText();
       
        
       
  if(    "".equals(name))
 {
     JOptionPane.showMessageDialog(this, "name is missing"); }

 else  if(    "".equals(category))
 {
     JOptionPane.showMessageDialog(this, "category is missing"); }
  else if(    "".equals(location))
 {
     JOptionPane.showMessageDialog(this, "set location "); }
  
 else if(    "".equals(contact))
 {
     JOptionPane.showMessageDialog(this, "set contact "); }

 else{
     
   if(hospital.isSelected()){   
        try {
            
         Class.forName("com.mysql.jdbc.Driver");
         
               con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
         
         insert=con.prepareStatement("insert into hospital(name,category,location,address,contact,website,photo)values(?,?,?,?,?,?,?)");
        
         insert.setString(1,name);
         insert.setString(2,category);
         insert.setString(3,location);
         insert.setString(4,address);
         insert.setString(5,contact);
         insert.setString(6,website);
         insert.setBytes(7,photo);
         
         insert.executeUpdate();
            
    
  JOptionPane.showMessageDialog(this, " Hospital Registerd sucessfully ");
        
  
txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);
photo1.setIcon(null);
jLabel11.setText(null);
txtname.requestFocus();
       }
     
     catch (ClassNotFoundException | SQLException ex)
     { System.out.println(ex);}}
     
   else if(restourant.isSelected()){   
        try {
         Class.forName("com.mysql.jdbc.Driver");
         
         //for gender
         
        con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
         
          insert=con.prepareStatement("insert into restourant(name,category,location,address,contact,website,photo)values(?,?,?,?,?,?,?)");
        
         insert.setString(1,name);
         insert.setString(2,category);
         insert.setString(3,location);
         insert.setString(4,address);
         insert.setString(5,contact);
         insert.setString(6,website);
         insert.setBytes(7,photo);
         
         insert.executeUpdate();
         //message to display
         
         
         JOptionPane.showMessageDialog(this, " Restourant Registerd sucessfully ");
         
         
  restourant.setSelected(false);  
txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);
photo1.setIcon(null);
jLabel11.setText(null);
txtname.requestFocus();
         }
     
     catch (ClassNotFoundException | SQLException ex)
     { Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);}}
     
   else if(hotel.isSelected()){   
        try {
         Class.forName("com.mysql.jdbc.Driver");
         
        
         
        con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
         
          insert=con.prepareStatement("insert into hospital(name,category,location,address,contact,website,photo)values(?,?,?,?,?,?,?)");
        
         insert.setString(1,name);
         insert.setString(2,category);
         insert.setString(3,location);
         insert.setString(4,address);
         insert.setString(5,contact);
         insert.setString(6,website);
        insert.setBytes(7,photo);
         
         insert.executeUpdate();
            
            
     JOptionPane.showMessageDialog(this, " Hotel Registerd sucessfully ");
         
        
         
  
txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);
photo1.setIcon(null);
jLabel11.setText(null);
txtname.requestFocus();
         }
     
     catch (ClassNotFoundException | SQLException ex)
     { Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);}}
     
   else if(market.isSelected()){   
        try {
         Class.forName("com.mysql.jdbc.Driver");
         
          con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
         insert=con.prepareStatement("insert into market(name,category,location,address,contact,website,photo)values(?,?,?,?,?,?,?)");
        
         insert.setString(1,name);
         insert.setString(2,category);
         insert.setString(3,location);
         insert.setString(4,address);
         insert.setString(5,contact);
         insert.setString(6,website);
        insert.setBytes(7,photo);
         
         insert.executeUpdate();
            
       
       
            
     
         JOptionPane.showMessageDialog(this, " Market Registerd sucessfully ");
        
  
txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);
photo1.setIcon(null);
jLabel11.setText(null);
txtname.requestFocus();
         }
     
     catch (ClassNotFoundException | SQLException ex)
     { Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);}}
    else if(school.isSelected()){   
         try {
         Class.forName("com.mysql.jdbc.Driver");
         
        
         
    con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
         
     insert=con.prepareStatement("insert into school(name,category,location,address,contact,website,photo)values(?,?,?,?,?,?,?)");
        
         insert.setString(1,name);
         insert.setString(2,category);
         insert.setString(3,location);
         insert.setString(4,address);
         insert.setString(5,contact);
         insert.setString(6,website);
         insert.setBytes(7,photo);
   
         insert.executeUpdate();
         
         JOptionPane.showMessageDialog(this, " School Registerd sucessfully ");
       
         
 
txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);
photo1.setIcon(null);
jLabel11.setText(null);
txtname.requestFocus();
         }
     
     catch (ClassNotFoundException | SQLException ex)
     { Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);}}
    
    
 else if(church.isSelected()){   
        try {
         Class.forName("com.mysql.jdbc.Driver");
         
        
         
        con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
         
     insert=con.prepareStatement("insert into church(name,category,location,address,contact,website,photo)values(?,?,?,?,?,?,?)");
        
         insert.setString(1,name);
         insert.setString(2,category);
         insert.setString(3,location);
         insert.setString(4,address);
         insert.setString(5,contact);
         insert.setString(6,website);
          insert.setBytes(7,photo);
      
         insert.executeUpdate();
         
         JOptionPane.showMessageDialog(this, " Church Registerd sucessfully ");
        
         
  
txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);
photo1.setIcon(null);
jLabel11.setText(null);
txtname.requestFocus();
         }
     
     catch (ClassNotFoundException | SQLException ex)
     { Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);}}
    
     else
     {JOptionPane.showMessageDialog(this, "Choose one of  above ");}
         }
    }//GEN-LAST:event_addActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
       
        DefaultTableModel df=(DefaultTableModel)table1.getModel();
        int selectindex=table1.getSelectedRow();
        int id=Integer.parseInt(df.getValueAt(selectindex, 0).toString());
        
        String name=txtname.getText();
        String category=txtcategory.getText();
        String location=txtlocation.getText();
        String address=txtaddress.getText();
        String contact=txtcontact.getText();
        String website=txtwebsite.getText();
       
        
      
 if(hospital.isSelected()){   
        try {
   
         Class.forName("com.mysql.jdbc.Driver");
         
        
         
        con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
     
    insert=con.prepareStatement("update hospital set name=?,category=?,location=?,address=?,contact=?,website=?,photo=? where id='"+id+"'");
         insert.setString(1,name);
         insert.setString(2,category);
         insert.setString(3,location);
         insert.setString(4,address);
         insert.setString(5,contact);
         insert.setString(6,website);
         insert.setBytes(7,photo);
         
         insert.executeUpdate();
         
         JOptionPane.showMessageDialog(this, " hospital updated sucessfully ");
  
txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);
photo1.setIcon(null);
jLabel11.setText(null);
txtname.requestFocus();

        }
     
     catch (ClassNotFoundException | SQLException ex)
     { Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);}}
 
else if(restourant.isSelected()){   
        try {
   
         Class.forName("com.mysql.jdbc.Driver");
       
        con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
         
    insert=con.prepareStatement("update restourant set name=?,category=?,location=?,address=?,contact=?,website=?,photo=? where id='"+id+"'");
         insert.setString(1,name);
         insert.setString(2,category);
         insert.setString(3,location);
         insert.setString(4,address);
         insert.setString(5,contact);
         insert.setString(6,website);
      insert.setBytes(7,photo);
        
         insert.executeUpdate();
         
         JOptionPane.showMessageDialog(this, " restourant updated sucessfully ");
         
       
          txtname.setText(null);
          txtcategory.setText(null);
           txtlocation.setText(null);
           
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);
photo1.setIcon(null);
jLabel11.setText(null);
txtname.requestFocus();
        }
     
     catch (ClassNotFoundException | SQLException ex)
     { Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);}}
 
 
 else if(hotel.isSelected()){   
        try {
   
         Class.forName("com.mysql.jdbc.Driver");
         
        
         
        con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
         
   insert=con.prepareStatement("update hotel set name=?,category=?,location=?,address=?,contact=?,website=?,photo=? where id='"+id+"'");
         insert.setString(1,name);
         insert.setString(2,category);
         insert.setString(3,location);
         insert.setString(4,address);
         insert.setString(5,contact);
         insert.setString(6,website);
        insert.setBytes(7,photo);
         insert.executeUpdate();
         
         JOptionPane.showMessageDialog(this, " hotel updated sucessfully ");
         
            
txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);
photo1.setIcon(null);
jLabel11.setText(null);
txtname.requestFocus();
        }
     
     catch (ClassNotFoundException | SQLException ex)
     { Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);}}
  
  
 else if(market.isSelected()){   
        try {
   
         Class.forName("com.mysql.jdbc.Driver");
  
         con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
         
    insert=con.prepareStatement("update market set name=?,category=?,location=?,address=?,contact=?,website=?,photo=? where id='"+id+"'");
         insert.setString(1,name);
         insert.setString(2,category);
         insert.setString(3,location);
         insert.setString(4,address);
         insert.setString(5,contact);
         insert.setString(6,website);
        insert.setBytes(7,photo);
         
         insert.executeUpdate();
         
         JOptionPane.showMessageDialog(this, " market updated sucessfully ");
         
  
txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);
photo1.setIcon(null);
jLabel11.setText(null);
txtname.requestFocus();
        }
     
     catch (ClassNotFoundException | SQLException ex)
     { Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);}}
   
   
 else if(school.isSelected()){   
        try {
   
         Class.forName("com.mysql.jdbc.Driver");
         
        
         
        con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
         
    insert=con.prepareStatement("update school set name=?,category=?,location=?,address=?,contact=?,website=?,photo=? where id='"+id+"'");
         insert.setString(1,name);
         insert.setString(2,category);
         insert.setString(3,location);
         insert.setString(4,address);
         insert.setString(5,contact);
         insert.setString(6,website);
        insert.setBytes(7,photo);
         insert.executeUpdate();
         
         JOptionPane.showMessageDialog(this, " school updated sucessfully ");
         
  
txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);
photo1.setIcon(null);
jLabel11.setText(null);
txtname.requestFocus();
        }
     
     catch (ClassNotFoundException | SQLException ex)
     { Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);}}
    
    else if(church.isSelected()){   
        try {
   
         Class.forName("com.mysql.jdbc.Driver");
      
        con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
         
    insert=con.prepareStatement("update church set name=?,category=?,location=?,address=?,contact=?,website=?,photo=? where id='"+id+"'");
         insert.setString(1,name);
         insert.setString(2,category);
         insert.setString(3,location);
         insert.setString(4,address);
         insert.setString(5,contact);
         insert.setString(6,website);
        insert.setBytes(7,photo);
        
         insert.executeUpdate();
         
         JOptionPane.showMessageDialog(this, " Church updated sucessfully ");
      
            
txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);
photo1.setIcon(null);
jLabel11.setText(null);
txtname.requestFocus();
        }
     
     catch (ClassNotFoundException | SQLException ex)
     { Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);}}
    
    
    else{   JOptionPane.showMessageDialog(this, " SELECT FROM ABOVE PLEASE!!!");}
     
        
   
    }//GEN-LAST:event_editActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel df=(DefaultTableModel)table1.getModel();
        int selectindex=table1.getSelectedRow();
        int id=Integer.parseInt(df.getValueAt(selectindex, 0).toString());       
        
       
       txtname.setText(df.getValueAt(selectindex, 1).toString());
       txtcategory.setText(df.getValueAt(selectindex, 2).toString());
       txtlocation.setText(df.getValueAt(selectindex, 3).toString());
       txtaddress.setText(df.getValueAt(selectindex, 4).toString());
       txtcontact.setText(df.getValueAt(selectindex, 5).toString()); 
       txtwebsite.setText(df.getValueAt(selectindex, 6).toString());
       jLabel11.setText(df.getValueAt(selectindex, 7).toString());
      
       
       if(hospital.isSelected()){
       try
       {
            Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
            stm=con.createStatement();
               String sql="select * from hospital where id='"+id+"'";
                
               ResultSet rs=stm.executeQuery(sql);
               
               if(rs.next()){
            
            byte[] img=rs.getBytes("photo");
            
               ImageIcon image= new ImageIcon(img);
               Image im=image.getImage();
               Image myimage=im.getScaledInstance(photo1.getWidth(),photo1.getHeight(),Image.SCALE_SMOOTH);
               ImageIcon newimage= new ImageIcon(myimage);
                
               photo1.setIcon(newimage);
              
               }
        }
        catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());}
       }
       else if(restourant.isSelected()){
       try
       {
            Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
            stm=con.createStatement();
               String sql="select * from restourant where id='"+id+"'";
                
               ResultSet rs=stm.executeQuery(sql);
               
               if(rs.next()){
            
            byte[] img=rs.getBytes("photo");
            
               ImageIcon image= new ImageIcon(img);
               Image im=image.getImage();
               Image myimage=im.getScaledInstance(photo1.getWidth(),photo1.getHeight(),Image.SCALE_SMOOTH);
               ImageIcon newimage= new ImageIcon(myimage);
                
               photo1.setIcon(newimage);
              
               }
        }
        catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());}
       }
       else if(hotel.isSelected()){
       try
       {
            Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
            stm=con.createStatement();
               String sql="select * from hotel where id='"+id+"'";
                
               ResultSet rs=stm.executeQuery(sql);
               
               if(rs.next()){
            
            byte[] img=rs.getBytes("photo");
            
               ImageIcon image= new ImageIcon(img);
               Image im=image.getImage();
               Image myimage=im.getScaledInstance(photo1.getWidth(),photo1.getHeight(),Image.SCALE_SMOOTH);
               ImageIcon newimage= new ImageIcon(myimage);
                
               photo1.setIcon(newimage);
              
               }
        }
        catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());}
       }
       else if(market.isSelected()){
       try
       {
            Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
            stm=con.createStatement();
               String sql="select * from market where id='"+id+"'";
                
               ResultSet rs=stm.executeQuery(sql);
               
               if(rs.next()){
            
            byte[] img=rs.getBytes("photo");
            
               ImageIcon image= new ImageIcon(img);
               Image im=image.getImage();
               Image myimage=im.getScaledInstance(photo1.getWidth(),photo1.getHeight(),Image.SCALE_SMOOTH);
               ImageIcon newimage= new ImageIcon(myimage);
                
               photo1.setIcon(newimage);
              
               }
        }
        catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());}
       }
       else if(school.isSelected()){
       try
       {
            Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
            stm=con.createStatement();
               String sql="select * from school where id='"+id+"'";
                
               ResultSet rs=stm.executeQuery(sql);
               
               if(rs.next()){
            
            byte[] img=rs.getBytes("photo");
            
               ImageIcon image= new ImageIcon(img);
               Image im=image.getImage();
               Image myimage=im.getScaledInstance(photo1.getWidth(),photo1.getHeight(),Image.SCALE_SMOOTH);
               ImageIcon newimage= new ImageIcon(myimage);
                
               photo1.setIcon(newimage);
              
               }
        }
        catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());}
       }
       else if(church.isSelected()){
       try
       {
            Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
            stm=con.createStatement();
               String sql="select * from church where id='"+id+"'";
                
               ResultSet rs=stm.executeQuery(sql);
               
               if(rs.next()){
            
            byte[] img=rs.getBytes("photo");
            
               ImageIcon image= new ImageIcon(img);
               Image im=image.getImage();
               Image myimage=im.getScaledInstance(photo1.getWidth(),photo1.getHeight(),Image.SCALE_SMOOTH);
               ImageIcon newimage= new ImageIcon(myimage);
                
               photo1.setIcon(newimage);
              
               }
        }
        catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());}
       }
    }//GEN-LAST:event_table1MouseClicked

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
    String seach=searchfield.getText();
       if ("".equals(seach))
       { JOptionPane.showMessageDialog(this,"NO SEARCHING DETAILS "); }
     
       
       else if(hospital.isSelected()){
       try
       {
            Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
            stm=con.createStatement();
               String sql="select *from hospital where location='"+seach+"' or name='"+seach+"' or category='"+seach+"'";
               ResultSet rs=stm.executeQuery(sql);
               
               while(rs.next()){
                   
                   String id= String.valueOf(rs.getInt("id"));
                   String username= rs.getString("name");
                   String category= rs.getString("category");
                   String location= rs.getString("location");
                   String address= rs.getString("address");
                   String contact= rs.getString("contact");
                   String website= rs.getString("website");
                   String photo= rs.getString("photo");
                   
                   
                   
                   String login[]={id,username,category,location,address,contact,website,photo};
                   DefaultTableModel tblModel=(DefaultTableModel) table1.getModel();
                   tblModel.addRow(login);
               
           }
        }
        catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());}
       }
       
       else if(restourant.isSelected()){
        try
       {
            Class.forName("com.mysql.jdbc.Driver");
                 con = DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
                stm=con.createStatement();
                String sql="select *from restourant where location='"+seach+"' or name='"+seach+"' or category='"+seach+"'";
                ResultSet rs=stm.executeQuery(sql);
                
                while(rs.next()){
                   String id= String.valueOf(rs.getInt("id"));
                   String username= rs.getString("name");
                   String category= rs.getString("category");
                   String location= rs.getString("location");
                   String address= rs.getString("address");
                   String contact= rs.getString("contact");
                   String website= rs.getString("website");
                   String photo= rs.getString("photo");
                   
                   
                   
                   String login[]={id,username,category,location,address,contact,website,photo};
                   DefaultTableModel tblModel=(DefaultTableModel) table1.getModel();
                   tblModel.addRow(login);
                
            }
        }
        catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());}}
       else if(market.isSelected()){
        try
       {
            Class.forName("com.mysql.jdbc.Driver");
                 con = DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
                 stm=con.createStatement();
                String sql="select *from market where location='"+seach+"' or name='"+seach+"' or category='"+seach+"'";
                ResultSet rs=stm.executeQuery(sql);
                
                while(rs.next()){
                    
                  String id= String.valueOf(rs.getInt("id"));
                   String username= rs.getString("name");
                   String category= rs.getString("category");
                   String location= rs.getString("location");
                   String address= rs.getString("address");
                   String contact= rs.getString("contact");
                   String website= rs.getString("website");
                   String photos= rs.getString("photo");
                   
                  
                   
                   
                   String login[]={id,username,category,location,address,contact,website,photos};
                   DefaultTableModel tblModel=(DefaultTableModel) table1.getModel();
                   tblModel.addRow(login);
               
            }
        }
        catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());}}
       
       else if(hotel.isSelected()){
       try
       {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
            stm=con.createStatement();
               String sql="select *from hotel where location='"+seach+"' or name='"+seach+"' or category='"+seach+"'";
               ResultSet rs=stm.executeQuery(sql);
               
               while(rs.next()){
                   
                  String id= String.valueOf(rs.getInt("id"));
                   String username= rs.getString("name");
                   String category= rs.getString("category");
                   String location= rs.getString("location");
                   String address= rs.getString("address");
                   String contact= rs.getString("contact");
                   String website= rs.getString("website");
                   String photos= rs.getString("photo");
                   
                   
                   
                   String login[]={id,username,category,location,address,contact,website,photos};
                   DefaultTableModel tblModel=(DefaultTableModel) table1.getModel();
                   tblModel.addRow(login);
               
           }
        }
        catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());}
       }
       
       else if(church.isSelected()){
        try
       {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
                 stm=con.createStatement();
                String sql="select *from church where location='"+seach+"' or name='"+seach+"' or category='"+seach+"'";
                ResultSet rs=stm.executeQuery(sql);
                
                while(rs.next()){
                    
                   String id= String.valueOf(rs.getInt("id"));
                   String username= rs.getString("name");
                   String category= rs.getString("category");
                   String location= rs.getString("location");
                   String address= rs.getString("address");
                   String contact= rs.getString("contact");
                   String website= rs.getString("website");
                   String photos= rs.getString("photo");
                 
                   
                   
                   String login[]={id,username,category,location,address,contact,website,photos};
                   DefaultTableModel tblModel=(DefaultTableModel) table1.getModel();
                   tblModel.addRow(login);            
                }
        }
        catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());}}
       
       //
       
       else if(school.isSelected()){
        try
       {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
             stm=con.createStatement();
                String sql="select *from school where location='"+seach+"' or name='"+seach+"' or category='"+seach+"'";
                ResultSet rs=stm.executeQuery(sql);
                
                while(rs.next()){
                    
                   String id= String.valueOf(rs.getInt("id"));
                   String username= rs.getString("name");
                   String category= rs.getString("category");
                   String location= rs.getString("location");
                   String address= rs.getString("address");
                   String contact= rs.getString("contact");
                   String website= rs.getString("website");
                   String photos= rs.getString("photo");
                   
                   
                   
                   String login[]={id,username,category,location,address,contact,website,photos};
                   DefaultTableModel tblModel=(DefaultTableModel) table1.getModel();
                   tblModel.addRow(login);
                }
            }
       
        catch(ClassNotFoundException | SQLException e){
       
            System.out.println(e.getMessage());}
        
       } else
       {JOptionPane.showMessageDialog(this," Choose option above first"); }
   
    }//GEN-LAST:event_searchActionPerformed

    private void searchfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfieldActionPerformed

    private void deletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletActionPerformed
        // ama code yose ya delete buri radio 
        
        DefaultTableModel df=(DefaultTableModel)table1.getModel();
        int selectindex=table1.getSelectedRow();
        int id=Integer.parseInt(df.getValueAt(selectindex, 0).toString());       
        
        
        if(hospital.isSelected())
        {   
        try {
            int DialogResult= JOptionPane.showConfirmDialog(null, "Do you want to delete","WARNING", JOptionPane.YES_NO_OPTION);
            
            if(DialogResult== JOptionPane.YES_OPTION){
             
                Class.forName("com.mysql.jdbc.Driver");
                
               con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
               
       insert=con.prepareStatement("delete from hospital where id='"+id+"'");
        
       insert.setInt(1,id);
       JOptionPane.showMessageDialog(this, " deleted sucessfully ");
       insert.executeUpdate();
       
 
txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);
photo1.setIcon(null);
jLabel11.setText(null);



         }}
        
     
     catch (ClassNotFoundException | SQLException ex)
     { System.out.println(ex);}}
        
        else if(restourant.isSelected()){   
        
            try {
            int DialogResult= JOptionPane.showConfirmDialog(null, "Do you want to delete","WARNING", JOptionPane.YES_NO_OPTION);
            
            if(DialogResult== JOptionPane.YES_OPTION){
         Class.forName("com.mysql.jdbc.Driver");
         
               con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
         
       insert=con.prepareStatement("delete from restourant where id='"+id+"'");
        
       insert.setInt(1,id);
       JOptionPane.showMessageDialog(this, " deleted sucessfully ");
       insert.executeUpdate();
       
  
 
txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);

photo1.setIcon(null);
jLabel11.setText(null);
         }}
     
     catch (ClassNotFoundException | SQLException ex)
     { System.out.println(ex);}}
     
        else if(hotel.isSelected()){   
        try {
            int DialogResult= JOptionPane.showConfirmDialog(null, "Do you want to delete","WARNING", JOptionPane.YES_NO_OPTION);
            
            if(DialogResult== JOptionPane.YES_OPTION){
         Class.forName("com.mysql.jdbc.Driver");
         
               con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
         
       insert=con.prepareStatement("delete from hotel where id='"+id+"'");
        
       insert.setInt(1,id);
       JOptionPane.showMessageDialog(this, " deleted sucessfully ");
       insert.executeUpdate();
 
  
txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);

photo1.setIcon(null);
jLabel11.setText(null);
         }}
     
     catch (ClassNotFoundException | SQLException ex)
     { System.out.println(ex);}}
        
    else if(market.isSelected()){   
        try {
            int DialogResult= JOptionPane.showConfirmDialog(null, "Do you want to delete","WARNING", JOptionPane.YES_NO_OPTION);
            
            if(DialogResult== JOptionPane.YES_OPTION){
         Class.forName("com.mysql.jdbc.Driver");
         
               con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
         
       insert=con.prepareStatement("delete from hospital where id='"+id+"'");
       
       insert.setInt(1,id);
       JOptionPane.showMessageDialog(this, " deleted sucessfully ");
       insert.executeUpdate();
      

txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);
photo1.setIcon(null);
jLabel11.setText(null);;
         }}
     
     catch (ClassNotFoundException | SQLException ex)
     { System.out.println(ex);}}
    
     else if(school.isSelected()){   
        try {
            int DialogResult= JOptionPane.showConfirmDialog(null, "Do you want to delete","WARNING", JOptionPane.YES_NO_OPTION);
            
            if(DialogResult== JOptionPane.YES_OPTION){
         Class.forName("com.mysql.jdbc.Driver");
         
               con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
         
       insert=con.prepareStatement("delete from school where id='"+id+"'");
        
       insert.setInt(1,id);
       JOptionPane.showMessageDialog(this, " deleted sucessfully ");
       insert.executeUpdate();
       
  
txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);

photo1.setIcon(null);
jLabel11.setText(null);
         }}
     
     catch (ClassNotFoundException | SQLException ex)
     { System.out.println(ex);}}
     
     else if(church.isSelected()){   
        try {
            int DialogResult= JOptionPane.showConfirmDialog(null, "Do you want to delete","WARNING", JOptionPane.YES_NO_OPTION);
            
            if(DialogResult== JOptionPane.YES_OPTION){
         Class.forName("com.mysql.jdbc.Driver");
         
               con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
         
       insert=con.prepareStatement("delete from church where id='"+id+"'");
        
       insert.setInt(1,id);
       JOptionPane.showMessageDialog(this, " deleted sucessfully ");
       insert.executeUpdate();
       
  
txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
txtwebsite.setText(null);
photo1.setIcon(null);
jLabel11.setText(null);

         }}
     
     catch (ClassNotFoundException | SQLException ex)
     { System.out.println(ex);}}
     
    }//GEN-LAST:event_deletActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        table1.setModel(new DefaultTableModel(null,new String[]{"ID","NAME","CATEGORY","LOCATION","ADDRESS",
            "CONTACT","WEBSITE","IMAGE"}));
txtname.setText(null);
txtcategory.setText(null);
txtlocation.setText(null);
txtaddress.setText(null);
txtcontact.setText(null);
jLabel11.setText(null);
txtwebsite.setText(null);
photo1.setIcon(null);
     
    }//GEN-LAST:event_refreshActionPerformed

    @SuppressWarnings("empty-statement")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        
        photo1.setIcon(new ImageIcon(f.toString())); 
         filename = f.getAbsolutePath();
       jLabel11.setText(filename);
       
        try{ 
            File image=new File(filename);
            FileInputStream fis=new FileInputStream(image);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte[843565];
            
          for(int read;(read=fis.read(buf))!=-1;){
            bos.write(buf,0,read);
          }
          photo=bos.toByteArray();
        }
        
           catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
         
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addMouseClicked

    private void btncommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncommentActionPerformed
                                         
    }//GEN-LAST:event_btncommentActionPerformed

    private void btncommentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncommentMouseClicked
        
        try
       {
            Class.forName("com.mysql.jdbc.Driver");
            
            con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
            stm=con.createStatement();
           String sql="select *from comments";
           ResultSet rs=stm.executeQuery(sql);
           
            while(rs.next()){
            String id= String.valueOf(rs.getInt("id"));
            String comment= rs.getString("comment");
            
            String login[]={id,comment};
            DefaultTableModel tblModel=(DefaultTableModel) commentstable.getModel();
            tblModel.addRow(login);
            }
            
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        
    }
    }//GEN-LAST:event_btncommentMouseClicked

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
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new adminpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton btncomment;
    private javax.swing.JRadioButton church;
    private javax.swing.JTable commentstable;
    private javax.swing.JPanel container;
    private javax.swing.JButton delet;
    private javax.swing.JButton edit;
    private javax.swing.JPanel header;
    private javax.swing.JRadioButton hospital;
    private javax.swing.JRadioButton hotel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JRadioButton market;
    private javax.swing.JLabel mess;
    private javax.swing.JLabel photo1;
    private javax.swing.JButton refresh;
    private javax.swing.JRadioButton restourant;
    private javax.swing.JRadioButton school;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchfield;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcategory;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtlocation;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtwebsite;
    // End of variables declaration//GEN-END:variables

    private void SetVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
byte[]photo=null;
String filename=null;

    private void next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   
}
