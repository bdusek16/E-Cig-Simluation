/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ECigDialog;
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
        JPanel pan = new JPanel();
        JDialog d = new JDialog(f, "Dialog Box Yes");
        pan.setLayout(new FlowLayout());
        d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        d.setSize(860, 460);
        
        ImageIcon img = new ImageIcon(ECigMVPYes.class.getResource("/images/vaping.png"));
        JLabel m = new JLabel(img);
        JLabel l = new JLabel("You have decided to take the e-cigarette.");
        m.setVerticalAlignment(JLabel.TOP);
        l.setVerticalAlignment(JLabel.CENTER);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setPreferredSize(new Dimension(250,25));
        pan.add(l);
        pan.add(m);
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
    }
    
}
