package com.fercosmig.form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public About() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("Version 1.0.0");
		lbl1.setBounds(12, 60, 426, 15);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Developed by .:: Fer Cos Mig ::. - fercosmig@gmail.com");
		lbl2.setBounds(12, 83, 426, 15);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("27 NOV 2015");
		lbl3.setBounds(12, 110, 426, 15);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("IDE: Eclipse Mars");
		lbl4.setBounds(12, 137, 426, 15);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("Java version: 8u66");
		lbl5.setBounds(12, 164, 426, 15);
		contentPane.add(lbl5);
		
		JLabel lbl6 = new JLabel("OS: Ubuntu 14.04.3 LTS");
		lbl6.setBounds(12, 191, 426, 15);
		contentPane.add(lbl6);
		
		JButton btnFechar = new JButton("Close");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFechar.setBounds(321, 235, 117, 25);
		contentPane.add(btnFechar);
	}
}
