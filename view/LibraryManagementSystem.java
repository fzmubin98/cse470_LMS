/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3.view;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javaapplication3.controller.Login_user;
/**
 *
 * @author Revenant
 */
public class LibraryManagementSystem extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
        JLabel l1;
        JButton b1;
        
        public LibraryManagementSystem() {
		
                setSize(1366,390);
                setLayout(null);
                setLocation(300,300);

		l1 = new JLabel("");
                b1 = new JButton("Next");
                
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("javaapplication3/icons/first.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1366, 390,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                b1.setBounds(1050,250,200,60);
		l1.setBounds(0, 0, 1366, 390);
                
                l1.add(b1);
		add(l1);
                
                b1.addActionListener(this);
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login_user().setVisible(true);
                this.setVisible(false);
                calculate_lms(1,1);
        }
    public static void main(String[] args) {
        // TODO code application logic here
        LibraryManagementSystem window = new LibraryManagementSystem();
        window.setVisible(true);
    }
    int calculate_lms(int n1, int n2){
        return n1+n2;
 }
}
