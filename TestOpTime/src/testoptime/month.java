/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optime;

import java.awt.Dimension;
import java.io.File;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author JohnChown
 */
public class month {
    
    private static String[] columnNames = {"Program Name", "Total Time", "Average Time"};
    
    month() {
        
        try {
            int rows = 0;
            Scanner file = new Scanner(new File("test.txt"));
            
            while (file.hasNextLine()){
                rows++;
                file.nextLine();
            }
            
            file = new Scanner(new File("test.txt"));
            System.out.println(rows);
            Object[][] data = new Object[rows][3];
            for (int i = 0; i < rows; i++)
            {
                String str = file.nextLine();
                String[] tokens = str.split(",");
                for (int j = 0; j < 3; j++)
                {
                    data[i][j] = tokens[j];
                    System.out.print(data[i][j]);
                    System.out.print(" ");
                }
            }
            
    JTable month = new JTable(data, columnNames);    
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
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
