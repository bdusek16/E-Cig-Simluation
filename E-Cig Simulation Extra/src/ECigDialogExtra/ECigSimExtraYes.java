/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ECigDialogExtra;
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
/**
 *
 * @author class50040
 */
public class ECigSimExtraYes {
    
    
    private static void yesActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private static void noActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    } 
    
    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        JFrame f = new JFrame("frame");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pan = new JPanel();
        JDialog d = new JDialog(f, "Dialog Box Yes");
        pan.setLayout(new FlowLayout());
        d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        d.setSize(860, 460);
        
        ImageIcon img = new ImageIcon(ECigSimExtraYes.class.getResource("/images/vaping.png"));
        JLabel l = new JLabel("You feel different. You almost want to keep doing it but you convince yourself you have more work to do.");
        JLabel k = new JLabel("Later, the same person asks you if you want to do some more after school, as a way of relaxing.");
        JLabel j = new JLabel("Do you accept the offer?");
        
        l.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        k.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        j.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N        
        JButton yes = new JButton("Accept it");
        JButton no = new JButton("Decline it");
        pan.add(l);
        pan.add(k);
        pan.add(j);
        d.getContentPane().add(no);
        d.getContentPane().add(yes);
        no.setBounds(150, 340, 160, 70);
        yes.setBounds(510, 340, 180, 70);
        d.add(pan);
        
        d.setLocationRelativeTo(null);
        d.setVisible(true);
        
        
        d.addWindowListener(new WindowAdapter(){
            public void windowClosed(WindowEvent e)
            {
                f.dispose();
            }
            
            public void windowClosing(WindowEvent e)
            {
                f.dispose();
            }
        });
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });
    }
}
