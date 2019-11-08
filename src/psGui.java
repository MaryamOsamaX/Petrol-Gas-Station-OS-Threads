import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import java.awt.Scrollbar;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class psGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					psGui frame = new psGui();
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
	public psGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 420);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPetrolStationSimulation = new JLabel("Petrol Station Simulation");
		lblPetrolStationSimulation.setBounds(144, 11, 312, 14);
		lblPetrolStationSimulation.setForeground(new Color(0, 0, 139));
		lblPetrolStationSimulation.setFont(new Font("Arial", Font.BOLD, 20));
		contentPane.add(lblPetrolStationSimulation);
		
		JLabel lblNewLabel = new JLabel("No. Pumps");
		lblNewLabel.setBounds(10, 40, 92, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 55, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNumberOfCostumer = new JLabel("No. Costumers");
		lblNumberOfCostumer.setBounds(111, 40, 102, 14);
		lblNumberOfCostumer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNumberOfCostumer);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 55, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCostumersNames = new JLabel("Costumers names");
		lblCostumersNames.setBounds(235, 40, 168, 14);
		lblCostumersNames.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblCostumersNames);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(180, 86, 89, 23);
		contentPane.add(btnStart);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 120, 570, 2);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(235, 55, 325, 20);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 255, 250));
		panel.setBounds(0, 120, 570, 261);
		
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		
		JLabel label_10 = new JLabel("");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_11 = new JLabel("");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_12 = new JLabel("");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_13 = new JLabel("");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_14 = new JLabel("");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_15 = new JLabel("");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_16 = new JLabel("");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_17 = new JLabel("");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_18 = new JLabel("");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_19 = new JLabel("");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblWaitingQueue = new JLabel("Waiting Queue:");
		lblWaitingQueue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(SystemColor.menu);
		lblNewLabel_1.setOpaque(true);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(26)
					.addComponent(label_10, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(label_11, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(label_12, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(label_13, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(label_14, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
					.addGap(27))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(24)
					.addComponent(label_15, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(label_16, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(29))
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblWaitingQueue, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblWaitingQueue, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(61, Short.MAX_VALUE))
		);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setOpaque(true);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setOpaque(true);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setOpaque(true);
		
		JLabel label_3 = new JLabel("");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setOpaque(true);
		
		JLabel label_4 = new JLabel("");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setOpaque(true);
		
		JLabel label_5 = new JLabel("");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setOpaque(true);
		
		JLabel label_6 = new JLabel("");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setOpaque(true);
		
		JLabel label_7 = new JLabel("");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setOpaque(true);
		
		JLabel label_8 = new JLabel("");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setOpaque(true);
		
		JLabel label_9 = new JLabel("");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setOpaque(true);
		
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(label, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(label_2, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(label_3, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(label_4, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(label_5, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(label_6, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(label_7, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(label_8, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(label_9, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
					.addGap(28))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		
		
		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n=Integer.parseInt(textField.getText());
				int x=Integer.parseInt(textField_1.getText());
				String []s=  textArea.getText().split(",");
				Pump station[]=new Pump[n];
				for(int i=0;i<n;i++) {
					station[i]=new Pump(1);
					 JLabel j = (JLabel) panel_1.getComponent(i);
					 j.setText("pump "+(i+1));
			         j.setForeground(Color.BLACK);
			         j.setBackground(Color.GREEN);
				}
				Costumer c[]=new Costumer[x];
				System.out.print("Clients’ names: ");
				for(int i=0;i<x;i++) {
					/*JLabel j = (JLabel) panel.getComponent(i+1);
					j.setText(s[i]);
			        j.setForeground(Color.BLACK);*/
					c[i]=new Costumer(s[i],station,panel,panel_1);
					
					c[i].start();
					
				}
				
				
			}
		});
	}
}
