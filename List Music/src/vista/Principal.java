package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.CentralAlbums;

import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import java.awt.Color;
import java.awt.Font;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField inputNombre;

	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton boton = new JButton("VistaAlbums");
		boton.setVerticalAlignment(SwingConstants.BOTTOM);
		boton.setBounds(188, 128, 89, 20);
		panel.add(boton);
		
		
		
		inputNombre = new JTextField();
		inputNombre.setBounds(205, 78, 86, 20);
		panel.add(inputNombre);
		inputNombre.setColumns(10);
		
		JLabel labelNombre = new JLabel("Nombre:");
		labelNombre.setBounds(138, 81, 79, 14);
		panel.add(labelNombre);
		
		JButton btnTodos = new JButton("Ver todos");
		btnTodos.setBounds(325, 217, 89, 23);
		panel.add(btnTodos);
		
		JLabel lblListmusic = new JLabel("ListMusic");
		lblListmusic.setToolTipText("");
		lblListmusic.setBackground(Color.WHITE);
		lblListmusic.setForeground(Color.BLACK);
		lblListmusic.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblListmusic.setHorizontalAlignment(SwingConstants.CENTER);
		lblListmusic.setBounds(168, 11, 122, 32);
		panel.add(lblListmusic);
		
		
		/* Acciones */
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = inputNombre.getText();
				new beans.Albums().saludar(nombre);
			}
			
		});
		
		btnTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CentralAlbums().verTodos();
			}
		});
	}
}
