
package testoptime;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Consent implements ActionListener{
    
    JFrame frame;
    
    private final static int WIDTH = 500;
    private final static int HEIGHT = 500;
    
    private static JLabel label;
    private static JButton yesBtn;
    private static JButton noBtn;
    
    Consent(){
        frame = new JFrame("Consent Confirmation");
        JPanel panel = new JPanel();
        
        //JFrame
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        //JPanel
        panel.setLayout(null);
        panel.setBackground(Color.black);
        
        label = new JLabel();
        label.setBounds(80, 10, 400, 300);
        label.setText("OpTime Would Like to Track Data");
        label.setFont(new Font("Verdana", Font.PLAIN, 20));
        label.setForeground(Color.white);
        
        
        
        yesBtn = new JButton("Allow");
        yesBtn.setBounds(200, 250, 100, 50);
        yesBtn.addActionListener(this);
        
        noBtn = new JButton("Don't Allow");
        noBtn.setBounds(200, 325, 100, 50);
        noBtn.addActionListener(this);

        panel.add(label);
        panel.add(yesBtn);
        panel.add(noBtn);
        
        
        frame.add(panel);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         //Takes user to next page of the app if clicked "Allow"
        if(e.getSource()==yesBtn){
            frame.dispose();
           
               //Opens the homepage of the OpTime applicationo
               FirstPage fp = new FirstPage();
            
            /*
            STILL NEED TO DO:
                Start the time tracking function once user clicks "Allow"
            */
            
        }
        
        
        //Closes the app if user clicks "Don't Allow"
        if(e.getSource()==noBtn){
            System.exit(0);
        }
    }
    
}
