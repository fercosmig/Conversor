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
		
		JLabel lbl1 = new JLabel("Developed by .:: Fer Cos Mig ::. - fercosmig@gmail.com");
		lbl1.setBounds(12, 51, 426, 15);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("27 NOV 2015");
		lbl2.setBounds(12, 78, 426, 15);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("IDE: Eclipse Mars");
		lbl3.setBounds(12, 105, 426, 15);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("Java version: 8u66");
		lbl4.setBounds(12, 132, 426, 15);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("OS: Ubuntu 14.04.3 LTS");
		lbl5.setBounds(12, 159, 426, 15);
		contentPane.add(lbl5);
		
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
