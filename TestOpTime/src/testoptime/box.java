
package testoptime;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

public class box extends JPanel implements ActionListener{
    
     private static String[] optionStrings = {"Day", "Week", "Month", "Year" };
    private static JComboBox optionList = new JComboBox(optionStrings);
    
    private static String[] columnNames = {"Program Name", "Total Time", "Average Time"};
    
    
    
    private static final Object[][] data = {
        {"p1", "590 mins", "24mins"},
        {"p2", "590 mins", "24mins"},
        {"p3", "590 mins", "24mins"},  
};  
    
    private static final Object[][] wd = {
        {"p1", "510 mins", "21mins"},
        {"p2", "490 mins", "29mins"},
        {"p3", "390 mins", "25mins"},
   
    
};
    
    box(){
        this.add(optionList);
        optionList.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==optionList){
          
          if (optionList.getSelectedItem().equals("Day")){
              JTable day = new JTable(data, columnNames);
              day.setBounds(80, 80, 350, 250);
              day.setPreferredScrollableViewportSize(new Dimension(500, 50));
              day.setFillsViewportHeight(true);
              JFrame y = new JFrame();   
              y.setSize(500, 500);
              JPanel x = new JPanel();
              x.setLayout(null);
              y.add(x);
              x.add(day);
              y.setVisible(true);
              y.setAlwaysOnTop(true);
              y.setLocationRelativeTo(null);
              JScrollPane scrollPane = new JScrollPane(day);
              scrollPane.setBounds(80, 80, 350, 250);
              x.add(scrollPane);
              
          }
          
          if (optionList.getSelectedItem().equals("Week")){
              JTable week = new JTable(wd, columnNames);
              week.setBounds(80, 80, 350, 250);
              week.setPreferredScrollableViewportSize(new Dimension(500, 50));
              week.setFillsViewportHeight(true);
              JFrame y = new JFrame();   
              y.setSize(500, 500);
              JPanel x = new JPanel();
              x.setLayout(null);
              y.add(x);
              x.add(week);
              y.setVisible(true);
              y.setAlwaysOnTop(true);
              y.setLocationRelativeTo(null);
              JScrollPane scrollPane = new JScrollPane(week);
              scrollPane.setBounds(80, 80, 350, 250);
              x.add(scrollPane);
              
          } 
          
          if (optionList.getSelectedItem().equals("Month")){
              JTable month = new JTable(wd, columnNames);
              month.setBounds(80, 80, 350, 250);
              month.setPreferredScrollableViewportSize(new Dimension(500, 50));
              month.setFillsViewportHeight(true);
              JFrame y = new JFrame();   
              y.setSize(500, 500);
              JPanel x = new JPanel();
              x.setLayout(null);
              y.add(x);
              x.add(month);
              y.setVisible(true);
              y.setAlwaysOnTop(true);
              y.setLocationRelativeTo(null);
              JScrollPane scrollPane = new JScrollPane(month);
              scrollPane.setBounds(80, 80, 350, 250);
              x.add(scrollPane);
              
          } 
          
          if (optionList.getSelectedItem().equals("Year")){
              JTable year = new JTable(wd, columnNames);
              year.setBounds(80, 80, 350, 250);
              year.setPreferredScrollableViewportSize(new Dimension(500, 50));
              year.setFillsViewportHeight(true);
              JFrame y = new JFrame();   
              y.setSize(500, 500);
              JPanel x = new JPanel();
              x.setLayout(null);
              y.add(x);
              x.add(year);
              y.setVisible(true);
              y.setAlwaysOnTop(true);
              y.setLocationRelativeTo(null);
              JScrollPane scrollPane = new JScrollPane(year);
              scrollPane.setBounds(80, 80, 350, 250);
              x.add(scrollPane);
              
          } 
      }
        
    }
    
     public static void main(String[] args) throws IOException {
        Scanner fileIn = new Scanner(new File("test.txt"));
        
        box na = null;
        String proName;
        int tt;
        int at;
        
    while (fileIn.hasNext()) {
            proName = fileIn.next();
            tt = fileIn.nextInt();
            at = fileIn.nextInt();
    }
    }
    
}//End box class
