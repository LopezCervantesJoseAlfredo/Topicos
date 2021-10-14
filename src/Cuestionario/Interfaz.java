
package Cuestionario;

import Cuestionario.SuperClase.*;

import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Interfaz extends javax.swing.JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    SuperClase S = new SuperClase();
    int posicion = 0;
    
    public void asignarRespuestasYPregunta() 
	{
		if(posicion == 0) 
		{
			lblPregunta.setText(S.preguntas[posicion]);
			
			opc1.setText(S.RespuestasPregunta1[0]);
			opc2.setText(S.RespuestasPregunta1[1]);
			opc3.setText(S.RespuestasPregunta1[2]);
			opc4.setText(S.RespuestasPregunta1[3]);
			
		}
		if(posicion == 1) 
		{
			lblPregunta.setText(S.preguntas[posicion]);
			
			opc1.setText(S.RespuestasPregunta2[0]);
			opc2.setText(S.RespuestasPregunta2[1]);
			opc3.setText(S.RespuestasPregunta2[2]);
			opc4.setText(S.RespuestasPregunta2[3]);
			
		}
		if(posicion == 2) 
		{
			lblPregunta.setText(S.preguntas[posicion]);
			opc1.setText(S.RespuestasPregunta3[0]);
			opc2.setText(S.RespuestasPregunta3[1]);
			opc3.setText(S.RespuestasPregunta3[2]);
			opc4.setText(S.RespuestasPregunta3[3]);
		}
		if(posicion == 3) 
		{
			lblPregunta.setText(S.preguntas[posicion]);
			opc1.setText(S.RespuestasPregunta4[0]);
			opc2.setText(S.RespuestasPregunta4[1]);
			opc3.setText(S.RespuestasPregunta4[2]);
			opc4.setText(S.RespuestasPregunta4[3]);
		}
		if(posicion == 4) 
		{
			lblPregunta.setText(S.preguntas[posicion]);
			opc1.setText(S.RespuestasPregunta5[0]);
			opc2.setText(S.RespuestasPregunta5[1]);
			opc3.setText(S.RespuestasPregunta5[2]);
			opc4.setText(S.RespuestasPregunta5[3]);
		}
	}
    public Interfaz() {
        initComponents();
        lblPregunta.setText(S.preguntas[0]);
        opc1.setText(S.RespuestasPregunta1[0]);
        opc2.setText(S.RespuestasPregunta1[1]);
        opc3.setText(S.RespuestasPregunta1[2]);
        opc4.setText(S.RespuestasPregunta1[3]);
        opc1.requestFocus();
        btnAnterior.setEnabled(false);
        btnEvaluar.setEnabled(false);
    }   
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        opc1 = new javax.swing.JRadioButton();
        opc2 = new javax.swing.JRadioButton();
        opc3 = new javax.swing.JRadioButton();
        opc4 = new javax.swing.JRadioButton();
        btnEvaluar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();

        jLabel1.setText("Cuestionario");

        lblPregunta.setText("Para que sirve JDK Java?");

        buttonGroup1.add(opc1);
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        buttonGroup1.add(opc2);
        opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        buttonGroup1.add(opc3);
        opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        buttonGroup1.add(opc4);
        opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        btnEvaluar.setText("Evaluar");
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvaluarActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addContainerGap()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel1)
        								.addComponent(lblPregunta)))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGap(30)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(opc2)
        								.addComponent(opc1)
        								.addComponent(opc3)
        								.addComponent(opc4))))
        					.addGap(0, 425, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap(316, Short.MAX_VALUE)
        					.addComponent(btnAnterior)
        					.addGap(45)
        					.addComponent(btnSiguiente)
        					.addGap(18)
        					.addComponent(btnEvaluar)
        					.addGap(69)))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblPregunta)
        			.addGap(47)
        			.addComponent(opc1)
        			.addGap(18)
        			.addComponent(opc2)
        			.addGap(18)
        			.addComponent(opc3)
        			.addGap(18)
        			.addComponent(opc4)
        			.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnAnterior)
        				.addComponent(btnSiguiente)
        				.addComponent(btnEvaluar))
        			.addGap(37))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) 
    {
        if(opc1.isSelected()) 
        {
        	S.Puntos[posicion] = 1;
        }
    	if(posicion == 3){
    		posicion ++;
            asignarRespuestasYPregunta();
            if(opc1.isSelected()) 
            {
            	S.Puntos[posicion] = 1;
            }
            btnSiguiente.setEnabled(false);
            btnEvaluar.setEnabled(true);
        }
        
		else if(posicion < 5)
        {
            btnAnterior.setEnabled(true);
            posicion++;
            asignarRespuestasYPregunta();
            if(opc1.isSelected()) 
            {
            	S.Puntos[posicion] = 1;
            }
            opc1.requestFocus();
        }
    }

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {
        if(posicion == 0){
            btnAnterior.setEnabled(false);
        }
        
        if(posicion > -1){
            posicion--;
            btnSiguiente.setEnabled(true);
            if(opc1.isSelected()) 
            {
            	S.Puntos[posicion] = 1;
            }
            asignarRespuestasYPregunta();
            opc1.requestFocus();
        }
    }

    private void EvaluarActionPerformed(java.awt.event.ActionEvent evt) {
        
    	int calificacion = 0;
        
        for(int i = 0; i < 5; i++)
        {
            calificacion += S.Puntos[i];
        }
        
        calificacion = calificacion * 2;
        
        JOptionPane.showMessageDialog(null, "Tu calificacion es " +  calificacion);
    }

    private javax.swing.JButton btnSiguiente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opc1;
    private javax.swing.JRadioButton opc2;
    private javax.swing.JRadioButton opc3;
    private javax.swing.JRadioButton opc4;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnEvaluar;
 
}
