
package testoptime;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class FirstPage implements ActionListener{
    
   private static JLabel UserLabel;
   private static JLabel currentLabel;
   private static JButton button;
   private static JLabel timeStats;
   private static String[] optionStrings = { "Day", "Week", "Month", "Year" };
   private static JComboBox optionList = new JComboBox(optionStrings);
   private static JLabel lblTxt = new JLabel();
    
    
    FirstPage(){
        
        JPanel panel = new JPanel();
     JFrame frame = new JFrame();
     frame.setSize(1920, 1080);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     frame.add(panel);
     
     
     panel.setLayout(null);
           
//     box g = new box();
//     g.setBounds(1300, 250, 500, 250);
//     panel.add(g);
     
     UserLabel = new JLabel("OpTime");
     UserLabel.setBounds(750, 10, 500, 150);
     panel.add(UserLabel);
     UserLabel.setFont(new Font("Futura", Font.BOLD, 100));
     
    
     
     currentLabel = new JLabel("Current Tasks");
     currentLabel.setBounds(250, 150, 500, 100);
     panel.add(currentLabel);
     currentLabel.setFont(new Font("Futura", Font.BOLD, 20));
    
     
     button = new JButton("Browse Local Files");
     button.setBounds(875, 880, 150, 50);
     button.addActionListener(this);
     panel.add(button);
     
     timeStats = new JLabel("Time Stats");
     timeStats.setBounds(1500, 150, 500, 100);
     panel.add(timeStats);
     timeStats.setFont(new Font("Futura", Font.BOLD, 20));
     
     
     frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //works on my computer but will have to change file path to get it to work on Nick's computer
       try {
           Runtime.getRuntime().exec("explorer.exe \"C:\\Users\\John Chown\\Desktop\\optimeMain\\OpTime\\OpTime\"");
       } catch (IOException ex) {
           Logger.getLogger(FirstPage.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
    
}
