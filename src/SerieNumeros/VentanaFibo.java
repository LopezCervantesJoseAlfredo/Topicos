package SerieNumeros;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaFibo extends JFrame {
	private final JButton btnLimpiar = new JButton("Limpiar");
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtCantidad;
	public static void main(String[] args) {
		VentanaFibo frame = new VentanaFibo();
		frame.setVisible(true);
			};
	public VentanaFibo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNumero1.setText("");
				txtNumero2.setText("");
				txtCantidad.setText("");
			}
		});
		btnLimpiar.setBounds(328, 217, 85, 21);
		getContentPane().add(btnLimpiar);
		
		JButton btnMostrarSerie = new JButton("Mostrar Serie");
		btnMostrarSerie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String varNumero1 = txtNumero1.getText();
				String VarNumero2 = txtNumero2.getText();
				String VarIteraciones = txtCantidad.getText();
				
				int varNum1 = Integer.parseInt(varNumero1);
				int varNum2 = Integer.parseInt(VarNumero2);
				int varItera = Integer.parseInt(VarIteraciones);
				
				int suma = 0 ; 
				
				String CadenaSerie = varNum1+" "+varNum2;
						
						for(int x = 0 ; x<varItera; x++) 
						{
							suma = varNum1 + varNum2;
							varNum1 = varNum2;
							varNum2 = suma;
							
							CadenaSerie = CadenaSerie + " " + suma;

							System.out.println(CadenaSerie);
						}
				JOptionPane.showMessageDialog(null,CadenaSerie);
						}
			}
		);
		btnMostrarSerie.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnMostrarSerie.setBounds(101, 217, 113, 21);
		getContentPane().add(btnMostrarSerie);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(179, 49, 96, 19);
		getContentPane().add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(179, 78, 96, 19);
		getContentPane().add(txtNumero2);
		txtNumero2.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(179, 130, 96, 19);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numero Inicial 1");
		lblNewLabel.setBounds(32, 52, 87, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero Inicial 2");
		lblNewLabel_1.setBounds(32, 88, 74, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad de numeros");
		lblNewLabel_2.setBounds(32, 133, 105, 13);
		getContentPane().add(lblNewLabel_2);
		
		JTextPane outSerieNumerica = new JTextPane();
		outSerieNumerica.setBounds(285, 50, 141, 121);
		getContentPane().add(outSerieNumerica);
	}
}
