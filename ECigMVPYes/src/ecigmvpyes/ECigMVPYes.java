/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecigmvpyes;
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
/**
 *
 * @author class50040
 */
public class ECigMVPYes {
    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        JFrame f = new JFrame("frame");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JDialog d = new JDialog(f, "Dialog Box Yes");
        d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        d.setSize(400, 400);
        
        ImageIcon img = new ImageIcon(ECigMVPYes.class.getResource("/Pictures/java1.png"));
        
        JLabel l = new JLabel("You chose to try the e-cig");
        JLabel m = new JLabel(img);
        
        d.add(m);
        d.add(l);
        l.setVerticalAlignment(JLabel.TOP);
        l.setHorizontalAlignment(JLabel.CENTER);
        m.setVerticalAlignment(JLabel.TOP);
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
    }
    
}
