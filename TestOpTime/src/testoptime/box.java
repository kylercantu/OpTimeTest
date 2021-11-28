
package testoptime;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


public class box extends JPanel implements ActionListener{

    private static String[] optionStrings = {"Day", "Week", "Month", "Year" };
    private static JComboBox optionList = new JComboBox(optionStrings);
    
    box() throws IOException{
           
        this.add(optionList);
        optionList.addActionListener(this);
    }

@Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource()==optionList){
          
          if (optionList.getSelectedItem().equals("Day")){
              day q = new day();
              
          }
          
          if (optionList.getSelectedItem().equals("Week")){
              week w = new week();
              
          } 
          
          if (optionList.getSelectedItem().equals("Month")){
              month m = new month();
              
          } 
          
          if (optionList.getSelectedItem().equals("Year")){
              year y = new year();
              
      }
    }
    
    }
}
