/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author piyus
 */
public class loginhome extends javax.swing.JFrame {
 String fname1=null,lname1=null,gender1=null,add1=null,dob1=null,city1=null,state1=null,semes1=null,roll1=null,table=null;
  //  String nam=null;
    /**
     * Creates new form loginhome
     */
    public loginhome() {
        initComponents();
        setLocationRelativeTo(null);
       
            
        
    }
 public loginhome(String fname,String lname,String gender, String add, String dob,String city,String state,String semes,String oroll) {
        initComponents();
               setLocationRelativeTo(null);
        jPanel4.setVisible(false);
        jPanel3.setVisible(true);
        jButton2.setVisible(false);
        
         buttonGroup1.add(jRadioButton1);
         buttonGroup1.add(jRadioButton2);
          buttonGroup1.add(jRadioButton3);
           buttonGroup1.add(jRadioButton4);
            buttonGroup1.add(jRadioButton5);
             jRadioButton2.setSelected(true);
             
             jRadioButton1.setVisible(false);
             jRadioButton2.setVisible(false);
             jRadioButton3.setVisible(false);
             jRadioButton4.setVisible(false);
             jRadioButton5.setVisible(false);
             jLabel1.setVisible(false);
             
  
        this.fname1=fname;
        this.lname1=lname;
        this.gender1=gender;
        this.add1=add;
        this.dob1=dob;
        this.city1=city;
        this.state1=state;
        this.semes1=semes;
        this.roll1=oroll;
        
        jLabel4.setText("Welcome"+" "+fname1);
        jLabel9.setText(fname1+" "+lname1);
        jLabel10.setText(gender1);
        jLabel11.setText(dob1);
        jTextField1.setText(add1);
        jLabel15.setText("Name:"+" "+fname1);
        jLabel14.setText("Roll no:"+" "+roll1);
        jLabel12.setText("Sem:"+" "+semes1);
        
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        j5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        j3 = new javax.swing.JLabel();
        j4 = new javax.swing.JLabel();
        j6 = new javax.swing.JLabel();
        j7 = new javax.swing.JLabel();
        j8 = new javax.swing.JLabel();
        j9 = new javax.swing.JLabel();
        j10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 188, 242));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SEM.");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 190, 50));

        j5.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        j5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(j5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 220, 50));

        jLabel14.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Roll no.");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 160, 50));

        jButton4.setBackground(new java.awt.Color(55, 38, 91));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("GET SUBJECTS");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 200, 40));

        jLabel15.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("NAME");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, 50));

        j1.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        j1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 220, 50));

        j2.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        j2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 220, 50));

        j3.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        j3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, 50));

        j4.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        j4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 220, 50));

        j6.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        j6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(j6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 160, 50));

        j7.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        j7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(j7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 220, 50));

        j8.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        j8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(j8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 220, 50));

        j9.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        j9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(j9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 220, 50));

        j10.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        j10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(j10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 220, 50));

        jRadioButton1.setBackground(new java.awt.Color(55, 38, 91));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 70, -1));

        jRadioButton2.setBackground(new java.awt.Color(55, 38, 91));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 70, -1));

        jRadioButton3.setBackground(new java.awt.Color(55, 38, 91));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 70, -1));

        jRadioButton4.setBackground(new java.awt.Color(55, 38, 91));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 70, -1));

        jRadioButton5.setBackground(new java.awt.Color(55, 38, 91));
        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 70, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 38, 91));
        jLabel1.setText("SELECT A NO. TO GIVE FEEDBACK");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jButton5.setText("GIVE FEEDBACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 180, 40));

        jLayeredPane1.add(jPanel5);
        jPanel5.setBounds(0, 0, 610, 480);

        jPanel4.setBackground(new java.awt.Color(129, 152, 48));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your details...");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 470, 50));

        jLabel5.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GENDER");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, 50));

        jLabel6.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NAME");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, 50));

        jLabel7.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADDRESS");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 180, 50));

        jLabel8.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DOB");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 180, 50));

        jLabel9.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 290, 40));

        jLabel10.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 290, 50));

        jLabel11.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 290, 50));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 280, 10));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 280, 10));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 280, 10));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 280, 10));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 190, 40));

        jTextField1.setBackground(new java.awt.Color(129, 152, 48));
        jTextField1.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextField1PropertyChange(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 280, 40));

        jLayeredPane1.add(jPanel4);
        jPanel4.setBounds(0, 0, 620, 470);

        jPanel3.setBackground(new java.awt.Color(124, 85, 227));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 500, 50));

        jLayeredPane1.add(jPanel3);
        jPanel3.setBounds(0, 0, 840, 480);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 610, 470));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(55, 38, 91));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quick Access");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, 50));

        jButton1.setBackground(new java.awt.Color(124, 85, 227));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("UPDATE PROFILE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 240, 40));

        jButton3.setBackground(new java.awt.Color(124, 85, 227));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("FEEDBACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String addr=jTextField1.getText();
        
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
                Connection ncon=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
                Statement stmt=ncon.createStatement();
                //String st1="insert into "+semes1+"  values(null)";
                String st= "update "+semes1+" set address='"+addr+"' WHERE rollno='"+roll1+"'"; 
          //      String st="UPDATE  `bank`.`sem1` SET  `address` =  'aal' WHERE  `sem1`.`rollno` =1";
                   stmt.executeUpdate(st);
                    JOptionPane.showMessageDialog(this,"Updated Succesfully");
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextField1PropertyChange
        // TODO add your handling code here:
     //   jButton2.setVisible(true);
    }//GEN-LAST:event_jTextField1PropertyChange

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
       // jButton2.setVisible(true);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        jButton2.setVisible(true);
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         jRadioButton1.setVisible(true);
         jLabel1.setVisible(true);
             jRadioButton2.setVisible(true);
             jRadioButton3.setVisible(true);
             jRadioButton4.setVisible(true);
             jRadioButton5.setVisible(true);
             
      
        if(semes1.equals("sem1"))
        {
            table="staffsem1";
        }
        
        else if(semes1.equals("sem2"))
        {
             table="staffsem2";
        }
        
        else if(semes1.equals("sem3"))
        {
             table="staffsem3";
        }
        
        else if(semes1.equals("sem4"))
        {
             table="staffsem4";
        }
        
        else if(semes1.equals("sem5"))
        {
             table="staffsem5";
        }
        
        else if(semes1.equals("sem6"))
        {
              table="staffsem6";
        }
        
        else if(semes1.equals("sem7"))
        {
             table="staffsem7";
        }
        
        else if(semes1.equals("sem8"))
        {
              table="staffsem8";
        }
        
        String ab="Ed";
        String a[]=new String[30];
        String b[]=new String[30];
       //int i=0;
        
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
           // Class.forName("com.mysql.jdbc.Driver");
            Connection logc=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
            Statement stmt=logc.createStatement();
            String st="select * from "+table+"";
            ResultSet rs=stmt.executeQuery(st);
              int i=0;
             while(rs.next())
            {
               b[i]=(String) rs.getString(2);
               a[i]=(String) rs.getString(1);
               i++;  
            }
             j1.setText(a[0]);
              j2.setText(a[1]);
               j3.setText(a[2]);
                j4.setText(a[3]);
                 j5.setText(a[4]);
             j6.setText(b[0]); 
             j7.setText(b[1]); 
             j8.setText(b[2]); 
             j9.setText(b[3]); 
             j10.setText(b[4]); 
             
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
                jRadioButton2.setActionCommand("1");
                jRadioButton3.setActionCommand("2");
                jRadioButton4.setActionCommand("3");
                jRadioButton5.setActionCommand("4");
                jRadioButton1.setActionCommand("5");
               String teacher=buttonGroup1.getSelection().getActionCommand();
              // System.out.println(teacher);
               String teacher1="";
        if(teacher.equals("1"))
        {
           teacher1=j6.getText();
        }
        else if(teacher.equals("2"))
        {
            teacher1=j7.getText();
        }
        else if(teacher.equals("3"))
        {
            teacher1=j8.getText();
        }
        else if(teacher.equals("4"))
        {
            teacher1=j9.getText();
        }
        else if(teacher.equals("5"))
        {
            teacher1=j10.getText();
        }
        else
        {
            
        }
        System.out.println(teacher1);
        feedback fb=new feedback(teacher1,table);
        fb.setVisible(true);
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(loginhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginhome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j10;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel j4;
    private javax.swing.JLabel j5;
    private javax.swing.JLabel j6;
    private javax.swing.JLabel j7;
    private javax.swing.JLabel j8;
    private javax.swing.JLabel j9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}