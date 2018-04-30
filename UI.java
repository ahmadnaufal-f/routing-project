package routing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.Component;

public class UI extends JFrame {

	private JPanel contentPane;
	private JTextField atoc;
	private JTextField atob;
	private JTextField btod;
	private JTextField btoc;
	private JTextField ctod;
	private JTextField ctoe;
	private JTextField dtoe;
	public int ab,ac,bc,bd,cd,ce,de;
	private String result;
	private String serverstatus = "Off";
	
	/**
	 * Launch the application.
	 * @return 
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
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
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 580);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnTurnOnServers = new JButton("Turn on Servers");
		btnTurnOnServers.setBounds(125, 15, 135, 32);
		contentPane.add(btnTurnOnServers);
		
		atoc = new JTextField();
		atoc.setName("ac");
		atoc.setBorder(new LineBorder(new Color(171, 173, 179)));
		atoc.setBounds(199, 173, 34, 20);
		contentPane.add(atoc);
		atoc.setColumns(10);
		
		atob = new JTextField();
		atob.setName("ab");
		atob.setColumns(10);
		atob.setBorder(new LineBorder(new Color(171, 173, 179)));
		atob.setBounds(188, 126, 34, 20);
		contentPane.add(atob);
		
		btod = new JTextField();
		btod.setName("bd");
		btod.setColumns(10);
		btod.setBorder(new LineBorder(new Color(171, 173, 179)));
		btod.setBounds(270, 104, 34, 20);
		contentPane.add(btod);
		
		btoc = new JTextField();
		btoc.setName("bc");
		btoc.setColumns(10);
		btoc.setBorder(new LineBorder(new Color(171, 173, 179)));
		btoc.setBounds(241, 150, 34, 20);
		contentPane.add(btoc);
		
		ctod = new JTextField();
		ctod.setName("cd");
		ctod.setColumns(10);
		ctod.setBorder(new LineBorder(new Color(171, 173, 179)));
		ctod.setBounds(285, 150, 34, 20);
		contentPane.add(ctod);
		
		ctoe = new JTextField();
		ctoe.setName("ce");
		ctoe.setColumns(10);
		ctoe.setBorder(new LineBorder(new Color(171, 173, 179)));
		ctoe.setBounds(314, 181, 34, 20);
		contentPane.add(ctoe);
		
		dtoe = new JTextField();
		dtoe.setName("de");
		dtoe.setColumns(10);
		dtoe.setBorder(new LineBorder(new Color(171, 173, 179)));
		dtoe.setBounds(345, 126, 34, 20);
		contentPane.add(dtoe);
		
		JLabel lblTes = new JLabel("Server status: " + serverstatus);
		lblTes.setBounds(10, 11, 207, 40);
		contentPane.add(lblTes);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(UI.class.getResource("/resources/router.png")));
		lblNewLabel.setBounds(146, 90, 295, 140);
		contentPane.add(lblNewLabel);
		
		JLabel lblFillOutThe = new JLabel("Fill out the desired path costs:");
		lblFillOutThe.setBounds(10, 65, 233, 14);
		contentPane.add(lblFillOutThe);
		
		JTextArea testestes = new JTextArea();
		testestes.setText("Dijkstra's Algorithm Result Table:");
		testestes.setBounds(10, 293, 552, 152);
		contentPane.add(testestes);
		
		JButton btnRunDjikstra = new JButton("Run Dijkstra");
		btnRunDjikstra.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnRunDjikstra.setBounds(213, 241, 135, 32);
		btnRunDjikstra.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ab = Integer.parseInt(atob.getText());
				ac = Integer.parseInt(atoc.getText());
				bc = Integer.parseInt(btoc.getText());
				bd = Integer.parseInt(btod.getText());
				cd = Integer.parseInt(ctod.getText());
				ce = Integer.parseInt(ctoe.getText());
				de = Integer.parseInt(dtoe.getText());
				result = "Dijkstra's Algorithm Result Table:";
				testestes.setText(result);
				DjikstraUndone.routingf(1, ab, ac, bc, bd, cd, ce, de);
			}
		});
		contentPane.add(btnRunDjikstra);
		
		
	}
}
