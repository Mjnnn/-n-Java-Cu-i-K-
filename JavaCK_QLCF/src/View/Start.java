package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.*;

public class Start extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param <Image>
	 */
	public <Image> Start() {
		setTitle("Wellcome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(525, 100, 577, 586);
		
		URL url = Start.class.getResource("/Icon/iconshop.png");
		Image img = (Image) Toolkit.getDefaultToolkit().createImage(url);
		this.setIconImage((java.awt.Image) img);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton bt_order = new JButton("Order Now!");
		bt_order.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				  dispose();    
			      new Login();	
			}
		});
//		bt_order.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(Start.class.getResource("hd.png"))));
		bt_order.setBackground(new Color(255, 228, 196));
		bt_order.setForeground(Color.RED);
		bt_order.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt_order.setBounds(376, 355, 153, 41);
		contentPane.add(bt_order);
		
		JButton bt_htro = new JButton("H\u1ED7 Tr\u1EE3 Kh\u00E1ch H\u00E0ng");
		bt_htro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Start.this,"Chi Tiết Xin Liên Hệ : 0931368433");
			}
			
		});
		bt_htro.setBackground(new Color(255, 228, 196));
		bt_htro.setForeground(Color.RED);
		bt_htro.setFont(new Font("Tahoma", Font.ITALIC, 15));
		bt_htro.setBounds(181, 518, 189, 21);
		contentPane.add(bt_htro);
		
		JLabel lb_background = new JLabel("");
		lb_background.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(Start.class.getResource("/Icon/Wellcome2.jpg"))));
		lb_background.setBounds(0, 0, 563, 549);
		contentPane.add(lb_background);
		setVisible(true);
	}
}
