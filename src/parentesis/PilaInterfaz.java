package parentesis;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import parentesis.PilaClase;
public class PilaInterfaz extends JFrame {

	private JPanel contentPane;
    private javax.swing.JTextField txtValor;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PilaInterfaz frame = new PilaInterfaz();
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
	public PilaInterfaz() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVerificar = new JButton();
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				PilaClase Pc = new PilaClase();
				Pc.setExpresion(txtValor.getText());
				if(Pc.VerificarParentesis()) 
				{
				   JOptionPane.showMessageDialog(null,Pc.getExpresion()+" " + "Es una expresion correcta") ; 
				}
				else 
				{
				   JOptionPane.showMessageDialog(null,Pc.getExpresion()+" " + "Es una expresion incorrecta") ; 
				}
			}
		});
		btnVerificar.setBounds(55,102,197,33);
		contentPane.add(btnVerificar);
		btnVerificar.setText("Verficar");
		
		txtValor = new javax.swing.JTextField();
		txtValor.setBounds(69,42,173,33);
		contentPane.add(txtValor);
	}
}
