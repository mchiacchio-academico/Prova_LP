package questao2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class CalculadoraCSS extends JFrame {

	private JPanel contentPane;
	private JTextField txtSeletoresIDS;
	private JTextField txtSeletoresClasses;
	private JTextField txtSeletoresTags;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraCSS frame = new CalculadoraCSS();
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
	public CalculadoraCSS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeletoresIDS = new JLabel("Qtde de Seletores IDs:");
		lblSeletoresIDS.setBounds(10, 34, 191, 14);
		contentPane.add(lblSeletoresIDS);
		
		JLabel lblSeletoresClasses = new JLabel("Qtde de Seletores Classes:");
		lblSeletoresClasses.setBounds(10, 71, 191, 14);
		contentPane.add(lblSeletoresClasses);
		
		JLabel lblSeletoresTags = new JLabel("Qtde de Seletores tags:");
		lblSeletoresTags.setBounds(10, 111, 173, 14);
		contentPane.add(lblSeletoresTags);
		
		txtSeletoresIDS = new JTextField();
		txtSeletoresIDS.setBounds(211, 31, 86, 20);
		contentPane.add(txtSeletoresIDS);
		txtSeletoresIDS.setColumns(10);
		
		txtSeletoresClasses = new JTextField();
		txtSeletoresClasses.setBounds(211, 68, 86, 20);
		contentPane.add(txtSeletoresClasses);
		txtSeletoresClasses.setColumns(10);
		
		txtSeletoresTags = new JTextField();
		txtSeletoresTags.setBounds(211, 108, 86, 20);
		contentPane.add(txtSeletoresTags);
		txtSeletoresTags.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCalcular.setForeground(Color.WHITE);
		btnCalcular.setBackground(Color.BLUE);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SeletoresIDS = txtSeletoresIDS.getText();
				String SeletoresClasses = txtSeletoresClasses.getText();
				String SeletoresTags = txtSeletoresTags.getText();
				
				int IDS=Integer.parseInt(SeletoresIDS);
				int Classes=Integer.parseInt(SeletoresClasses);
				int Tags = Integer.parseInt(SeletoresTags);
				
				int multiplicadorIDS = IDS*100;
				int multiplicadorClasses = Classes*10;
				int multiplicadorTags = Tags*1;
				int soma = multiplicadorIDS+multiplicadorClasses+multiplicadorTags;
				JOptionPane.showMessageDialog(btnCalcular, "A quantidade total de pontos é: " +soma +"\n IDS = "+multiplicadorIDS+", Classes = "+multiplicadorClasses+" e Tags = "+multiplicadorTags);
			}
		});
		btnCalcular.setBounds(177, 183, 89, 23);
		contentPane.add(btnCalcular);
	}
}
