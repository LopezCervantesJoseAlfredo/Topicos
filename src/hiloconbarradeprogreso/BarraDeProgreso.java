package hiloconbarradeprogreso;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

public class BarraDeProgreso extends JFrame {
	
	static JPanel panel;
    static JProgressBar barra;
    static JButton BtnIniciarProceso;
    static JButton BtnSalirProceso;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarraDeProgreso frame = new BarraDeProgreso();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public BarraDeProgreso() 
	{	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		barra = new JProgressBar();
		barra.setBounds(68,78,273,50);
		barra.setValue(0);
		barra.setStringPainted(true);
		panel.add(barra);
		
		
		BtnIniciarProceso = new JButton();
		BtnIniciarProceso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				CreacionDeHilo objChilo = new CreacionDeHilo("miHilo");
				Thread varHilo = new Thread(objChilo);
				VerificarProgresoBarra objVpb = new VerificarProgresoBarra(barra);
				Thread varVpb = new Thread(objVpb);
				
				varHilo.start();
				varVpb.start();
			}
		});
		
		BtnIniciarProceso.setBounds(49,199,148,33);
		panel.add(BtnIniciarProceso);
		BtnIniciarProceso.setText("Iniciar");
		
		
		BtnSalirProceso = new JButton();
		BtnSalirProceso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		
		BtnSalirProceso.setBounds(221,199,148,33);
		panel.add(BtnSalirProceso);
		BtnSalirProceso.setText("Salir");
		
	}
	}

