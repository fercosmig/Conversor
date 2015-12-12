package com.fercosmig.form;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.fercosmig.util.Conversao;
import com.fercosmig.util.Validacao;

public class Conversor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValorConverter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
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
	public Conversor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelTitulo = new JPanel();
		panelTitulo.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelTitulo.setBounds(58, 37, 678, 67);
		contentPane.add(panelTitulo);
		panelTitulo.setLayout(null);

		JLabel lblTitulo = new JLabel("Conversor");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		lblTitulo.setBounds(12, 12, 654, 31);
		panelTitulo.add(lblTitulo);

		JPanel panelOpcoes = new JPanel();
		panelOpcoes.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelOpcoes.setBounds(58, 134, 678, 72);
		contentPane.add(panelOpcoes);
		panelOpcoes.setLayout(null);

		JPanel panelConversao = new JPanel();
		panelConversao.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelConversao.setBounds(58, 239, 678, 225);
		contentPane.add(panelConversao);
		panelConversao.setLayout(null);

		JLabel lblValorConverter = new JLabel("Digite o valor para converter:");
		lblValorConverter.setBounds(33, 48, 217, 15);
		panelConversao.add(lblValorConverter);

		JLabel lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Dialog", Font.BOLD, 30));
		lblResultado.setBounds(16, 126, 650, 87);
		panelConversao.add(lblResultado);

		txtValorConverter = new JTextField();
		txtValorConverter.setBounds(256, 33, 407, 44);
		panelConversao.add(txtValorConverter);
		txtValorConverter.setColumns(10);

		JComboBox cmbOpcoes = new JComboBox();
		cmbOpcoes.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));

		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = txtValorConverter.getText();
				Validacao v = new Validacao();
				Conversao c = new Conversao();

				if (v.isNumeric(valor)) {
					Double vlr = Double.parseDouble(valor);
					int opc = cmbOpcoes.getSelectedIndex();
					switch (opc) {
					case 1: // Milhas para Quilômetros
						lblResultado.setText(vlr + " Milhas = " + c.milhasParaQuilometros(vlr) + " Quilômetros.");
						break;
					case 2: // Quilômetros para Milhas
						lblResultado.setText(vlr + " Quilômetros = " + c.quilometrosParaMilhas(vlr) + " Milhas.");
						break;
					case 3: // Celcius (°C) para Fahrenheit (°F)
						lblResultado.setText(vlr + "° Celcius = " + c.celciusParaFahrenheit(vlr) + "° Fahrenheit.");
						break;
					case 4: // Fahrenheit (°F) para Celcius (°C)
						lblResultado.setText(vlr + "° Fahrenheit = " + c.fahrenheitParaCelcius(vlr) + "° Celcius.");
						break;
					default:
						break;
					}

				} else {
					JOptionPane.showMessageDialog(null, "Valor digitado não é válido!\nDigite outro valor!");
					txtValorConverter.setText("");
				}
			}
		});
		btnConverter.setEnabled(false);
		btnConverter.setBounds(16, 89, 647, 25);
		panelConversao.add(btnConverter);

		List<String> itens = new ArrayList<>();
		itens.add("Escolha uma opção");
		itens.add("Milhas para Quilômetros");
		itens.add("Quilômetros para Milhas");
		itens.add("Celcius (°C) para Fahrenheit (°F)");
		itens.add("Fahrenheit (°F) para Celcius (°C)");

		cmbOpcoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cmbOpcoes.getSelectedIndex() == 0)
					btnConverter.setEnabled(false);
				else
					btnConverter.setEnabled(true);
				txtValorConverter.setText("");
				lblResultado.setText("");
			}
		});
		cmbOpcoes.setBounds(16, 12, 647, 44);
		for (String item : itens) {
			cmbOpcoes.addItem(item);
		}
		panelOpcoes.add(cmbOpcoes);

		JPanel panelBotoes = new JPanel();
		panelBotoes.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelBotoes.setBounds(58, 470, 678, 72);
		contentPane.add(panelBotoes);
		panelBotoes.setLayout(null);

		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnFechar.setBounds(521, 35, 117, 25);
		panelBotoes.add(btnFechar);
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About about = new About();
				about.setVisible(true);
			}
		});
		btnAbout.setBounds(398, 35, 117, 25);
		panelBotoes.add(btnAbout);

	}
}
