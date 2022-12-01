//Write a Java Program using Swing to design a GUI to input i) Name ii) Gender 
//iii) 10 th mark percentage iv) 12th marks percentage v) Graduation marks percengate and
//vi)specialization for an applicant.

//Write a Java Program using Swing to design a GUI to input Name,Gender,10th mark percentage 12th mark percentage and specialization for an applicant.When an applicant fill all the information and click on apply button the status bar should show eligible if the candidate is a female having 70% through out carrier and with ‘CSE’ as specialization. Otherwise, it should show ‘Not Eligible’.

package com.mukul;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class set01 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2;
    JRadioButton r1,r2;
    ButtonGroup bg;
    JCheckBox c1,c2,c3;
    JTextArea a;
    set01()
    {
        l1=new JLabel("Name");
        l1.setBounds(10,10,100,20);
        add(l1);
        t1=new JTextField();
        t1.setBounds(120,10,100,20);
        add(t1);
        l2 = new JLabel("Gender");
        l2.setBounds(10,40,100,20);
        add(l2);
        r1 = new JRadioButton("Male");
        r1.setBounds(120,40,100,20);
        add(r1);
        r2 = new JRadioButton("Female");
        r2.setBounds(220,40,100,20);
        add(r2);
        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        l3 = new JLabel("10th Percentage");
        l3.setBounds(10,70,100,20);
        add(l3);
        t2 = new JTextField();
        t2.setBounds(120,70,100,20);
        add(t2);
        l4 = new JLabel("12th Percentage");
        l4.setBounds(10,100,100,20);
        add(l4);
        t3 = new JTextField();
        t3.setBounds(120,100,100,20);
        add(t3);
        l5 = new JLabel("Specialization");
        l5.setBounds(10,130,100,20);
        add(l5);
        c1 = new JCheckBox("CSE");
        c1.setBounds(120,130,100,20);
        add(c1);
        c2 = new JCheckBox("ECE");
        c2.setBounds(220,130,100,20);
        add(c2);
        c3 = new JCheckBox("EEE");
        c3.setBounds(320,130,100,20);
        add(c3);
        l6 = new JLabel("Status");
        l6.setBounds(10,160,100,20);
        add(l6);
        a = new JTextArea();
        a.setBounds(120,160,100,20);
        add(a);
        b1 = new JButton("Apply");
        b1.setBounds(10,190,100,20);
        add(b1);
        b2 = new JButton("Clear");
        b2.setBounds(120,190,100,20);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(null);
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            String name = t1.getText();
            String tenth = t2.getText();
            String twelth = t3.getText();

            if(r1.isSelected())
            {
                String gender = "MALE";
            }
            else if(r2.isSelected())
            {
                String gender = "Female";

                if(c1.isSelected())
                {
                    String spec = "CSE";
                    if(Integer.parseInt(tenth)>=70 && Integer.parseInt(twelth)>=70)
                    {
                        a.setText("ELIGIBLE");
                    }
                    else
                    {
                        a.setText("NOT ELIGIBLE");
                    }
                }
                else if(c2.isSelected())
                {
                    String spec = "ECE";
                    if(Integer.parseInt(tenth)>=80 && Integer.parseInt(twelth)>=80)
                    {
                        a.setText("ELIGIBLE");
                    }
                    else
                    {
                        a.setText("NOT ELIGIBLE");
                    }
                }
                else if(c3.isSelected())
                {
                    String spec = "EEE";
                    if(Integer.parseInt(tenth)>=80 && Integer.parseInt(twelth)>=80)
                    {
                        a.setText("ELIGIBLE");
                    }
                    else
                    {
                        a.setText("NOT ELIGIBLE");
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
        new set01();
    }
}



