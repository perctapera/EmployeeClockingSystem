
package test;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class start extends javax.swing.JFrame{
Connection con;
Statement stmt;
ResultSet rs;

    public start() {
         initComponents();
        DoConnect();
    }
public void DoConnect(){
    try {
 byte[] ImageBytes;
        Image simage;
        
      
Class.forName("com.mysql.jdbc.Driver");
Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/redwing","root","");

//con.setAutoCommit(false);
Statement stmt = con.createStatement();
//String user=jTextField1.getText();
   AllData allData=new AllData();
     String user=  allData.getIc();
String sql= "Select * from `users` where `username` = '" + user + "' ;";
ResultSet rs = stmt.executeQuery(sql);
 try {
rs.next();
 ImageBytes = rs.getBytes("photo");
           simage =getToolkit().createImage(ImageBytes).getScaledInstance(jLabel14.getWidth(), jLabel14.getHeight(), WIDTH);
          ImageIcon icon = new ImageIcon(simage);
           jLabel14.setIcon(icon);}
catch (Exception e){
e.printStackTrace();
}                               
    
String emp_name  = rs.getString("name");
String ec_number  = rs.getString("username");
String address  = rs.getString("address");
int contact_number  = rs.getInt("contact_number");
String phone = Integer.toString(contact_number);
String surname  = rs.getString("surname");


jLabel9.setText(emp_name);
jLabel8.setText(ec_number);
jLabel13.setText(address);
jLabel11.setText(phone);
jLabel10.setText(surname);
    }
   catch (SQLException err){
       JOptionPane.showMessageDialog(start.this, err.getMessage());
   } catch (ClassNotFoundException ex) {
        Logger.getLogger(start.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setForeground(java.awt.Color.blue);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("AUTHETICATE EMPLOYEE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jLabel4.setText("Employee Clocking and Payroll System");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Please enter your EC number to check in and out");

        jLabel6.setFont(new java.awt.Font("Sylfaen", 2, 8)); // NOI18N
        jLabel6.setText("ECSP v1.0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 8)); // NOI18N
        jLabel5.setText("redwing");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("User Logged In");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Address");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Contact number");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("jLabel11");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("EC Number");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("jLabel13");

        jLabel14.setText("No Photo");

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setText("Close");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Help");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(176, 176, 176))))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String ec = jTextField1.getText();
     
          if (ec.length()==0) {
    
    JOptionPane.showMessageDialog(null, "Please enter EC Number", "Error", JOptionPane.ERROR_MESSAGE);
   // name.setFocusable(true);
    return;
    }  
          AllData allData=new AllData();
     String user=  allData.getIc();
     if (ec == null ? user == null : ec.equals(user)) {
    } else {
         JOptionPane.showMessageDialog(null, "Please enter your EC Number correctly", "Error", JOptionPane.ERROR_MESSAGE);
         // name.setFocusable(true);
         return;
    }  
               try{
        
           Connection c = DBclass.getConnection();
             Statement st = c.createStatement();
              ResultSet rs1 = st.executeQuery("SELECT * from users where username='"+ec+"'");
                    if (!rs1.next() ) {
   // JOptionPane.showMessageDialog(null, "Incorrect Login Credentials");
        JOptionPane.showMessageDialog(null, "EC NUMBER "+ec+" IS NOT IN OUR DATABASE ");
          start regFace =new start();
        regFace.setVisible(true);
        dispose(); 
         return;
       
}
           ResultSet rs2 = st.executeQuery("SELECT `status` FROM `clock` where ec='"+ec+"' ORDER BY c_id desc LIMIT 1");
             if (!rs2.next() ) {
     String query1= "INSERT INTO `clock` (`ec`, `status`, `datetime`) VALUES ('"+ec+"', 'IN', NOW()) ";
         st.executeUpdate(query1);
        JOptionPane.showMessageDialog(this, "EC NUMBER "+ec+" YOU WERE LOGGED IN ");
          start regFace =new start();
        regFace.setVisible(true);
        dispose(); 
        return;
}
             // JOptionPane.showMessageDialog(this, "EC NUMBER "+ec+" YOU WERE LOGGED IN ");
 ResultSet rs = st.executeQuery("SELECT `status` FROM `clock` where ec='"+ec+"' ORDER BY c_id desc LIMIT 1");
      while (rs.next())
      {
           //JOptionPane.showMessageDialog(this, "EC NUMBER "+ec+" YOU WERE LOGGED IN ");
        //int id = rs.getInt("id");
        String fir = rs.getString("status");
      //  JOptionPane.showMessageDialog(this, fir);
        String fir1;
        if(fir.equals("OUT"))
        {
       fir1="IN";
    // JOptionPane.showMessageDialog(this, fir1);
        }
        else
        {
        fir1="OUT";
       //  JOptionPane.showMessageDialog(this, fir1);
        }
        String query = "INSERT INTO `clock` (`ec`, `status`, `datetime`) VALUES ('"+ec+"', '"+fir1+"', NOW()) ";
         st.executeUpdate(query);
        JOptionPane.showMessageDialog(this, "EC NUMBER "+ec+" YOU WERE LOGGED "+fir+" NOW YOU ARE NOW LOGGED "+fir1+" ");
          start regFace =new start();
        regFace.setVisible(true);
        dispose(); 
      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    //String query = "INSERT INTO `clock` (`ec`, `date`, `status`, `datetime`) VALUES ('w', 'q', 'q', '2015-04-09 11:35:08'))";
   // System
  
   // System.out.println(query);


   

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);   // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        help regFace =new help();
        regFace.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        new welcomeRedwing().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
       char c =evt.getKeyChar();
        if((c==KeyEvent.VK_BACK_SPACE) || !Character.isDigit(c) || (c==KeyEvent.VK_DELETE)){
        evt.consume();
        getToolkit().beep();
    }                                // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
if (evt.getKeyCode()== KeyEvent.VK_ENTER){
    String ec = jTextField1.getText();
     
          if (ec.length()==0) {
    
    JOptionPane.showMessageDialog(null, "Please enter EC Number", "Error", JOptionPane.ERROR_MESSAGE);
   // name.setFocusable(true);
    return;
    }  
          AllData allData=new AllData();
     String user=  allData.getIc();
     if (ec == null ? user == null : ec.equals(user)) {
    } else {
         JOptionPane.showMessageDialog(null, "Please enter your EC Number correctly", "Error", JOptionPane.ERROR_MESSAGE);
         // name.setFocusable(true);
         return;
    }  
               try{
        
           Connection c = DBclass.getConnection();
             Statement st = c.createStatement();
              ResultSet rs1 = st.executeQuery("SELECT * from users where username='"+ec+"'");
                    if (!rs1.next() ) {
   // JOptionPane.showMessageDialog(null, "Incorrect Login Credentials");
        JOptionPane.showMessageDialog(null, "EC NUMBER "+ec+" IS NOT IN OUR DATABASE ");
          start regFace =new start();
        regFace.setVisible(true);
        dispose(); 
         return;
       
}
           ResultSet rs2 = st.executeQuery("SELECT `status` FROM `clock` where ec='"+ec+"' ORDER BY c_id desc LIMIT 1");
             if (!rs2.next() ) {
     String query1= "INSERT INTO `clock` (`ec`, `status`, `datetime`) VALUES ('"+ec+"', 'IN', NOW()) ";
         st.executeUpdate(query1);
        JOptionPane.showMessageDialog(this, "EC NUMBER "+ec+" YOU WERE LOGGED IN ");
          start regFace =new start();
        regFace.setVisible(true);
        dispose(); 
        return;
}
             // JOptionPane.showMessageDialog(this, "EC NUMBER "+ec+" YOU WERE LOGGED IN ");
 ResultSet rs = st.executeQuery("SELECT `status` FROM `clock` where ec='"+ec+"' ORDER BY c_id desc LIMIT 1");
      while (rs.next())
      {
           //JOptionPane.showMessageDialog(this, "EC NUMBER "+ec+" YOU WERE LOGGED IN ");
        //int id = rs.getInt("id");
        String fir = rs.getString("status");
      //  JOptionPane.showMessageDialog(this, fir);
        String fir1;
        if(fir.equals("OUT"))
        {
       fir1="IN";
    // JOptionPane.showMessageDialog(this, fir1);
        }
        else
        {
        fir1="OUT";
       //  JOptionPane.showMessageDialog(this, fir1);
        }
        String query = "INSERT INTO `clock` (`ec`, `status`, `datetime`) VALUES ('"+ec+"', '"+fir1+"', NOW()) ";
         st.executeUpdate(query);
        JOptionPane.showMessageDialog(this, "EC NUMBER "+ec+" YOU WERE LOGGED "+fir+" NOW YOU ARE NOW LOGGED "+fir1+" ");
          start regFace =new start();
        regFace.setVisible(true);
        dispose(); 
      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }    
    
    
}
    }//GEN-LAST:event_jTextField1KeyPressed

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
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 try
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException ex)
            {
                // Do something, if there is a exception
                System.out.println(ex.toString());
            } 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
