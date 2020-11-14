package mainpackage;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass extends JFrame {
	private JButton[] jbtn = new JButton[2];
	private String[] jbtt = {"Game","Exit"};
	private JPanel jpnl = new JPanel();
	private JLabel jlbl = new JLabel(new ImageIcon(this.getClass().getResource("img/label.png")));
	public MainClass() {
		initComponents();
	}
	private void initComponents() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setTitle("Skyrim");
		this.setContentPane(jpnl);
		this.setLayout(new GridBagLayout());
		GridBagConstraints pen = new GridBagConstraints();
		pen.fill = GridBagConstraints.BOTH;
		pen.insets = new Insets(2,2,2,2);
		
//init comp
		for(int i = 0; i <= jbtn.length-1; i++) {
			jbtn[i] = new JButton(jbtt[i], new ImageIcon(this.getClass().getResource("img/button.png")));//jbtn[i] = new JButton("Exit");
			jbtn[i].setPreferredSize(new Dimension(100,40));
			jbtn[i].setForeground(Color.WHITE);
			jbtn[i].setOpaque(false);
			jbtn[i].setContentAreaFilled(false);
			jbtn[i].setBorderPainted(true);
			jbtn[i].addActionListener(new BTList());
		}
//		jbtn[0] = new JButton("", new ImageIcon( this.getClass().getResource("img/.png")) );
		
		
		
		
//end init
//set comp
		
		jpnl.setPreferredSize(new Dimension(1000,450));
		jlbl.setPreferredSize(new Dimension(900,350));
		jpnl.add(jlbl);
//		JOptionPane.showMessageDialog(null, "MAX: "+Toolkit.getDefaultToolkit().getScreenSize (), "Information", JOptionPane.PLAIN_MESSAGE);
		
//end set
		pen.gridx = 1;
		pen.gridy = 0;
		this.add(jbtn[0],pen);
		pen.gridx = 1;
		pen.gridy = 1;
		this.add(jbtn[1],pen);
		
		this.setIconImage((new ImageIcon(this.getClass().getResource("img/symb.png"))).getImage());
		this.getContentPane().setBackground(Color.BLACK);
		
		this.setSize(new Dimension(1000,450));//this.setSize(Toolkit.getDefaultToolkit().getScreenSize ());
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
	}
	private class BTList implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			switch(e.getActionCommand()) {
				case "Game":
					MainClass.this.setVisible(false);
					new ShowMainApp().setVisible(true);
				break;
				case "Exit":
					Runtime.getRuntime().exit(0);
				break;
			}
		}
	}
	private class ShowMainApp extends JFrame {
		private JButton[] jbtn = new JButton[1];
		public ShowMainApp() {
			initMainApp();
		}
		private void initMainApp() {
			this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			this.setTitle("Skyrim");
			this.setLayout(new GridBagLayout());
			GridBagConstraints pen = new GridBagConstraints();
			pen.fill = GridBagConstraints.BOTH;
			pen.insets = new Insets(2,2,2,2);
//init comp
			
			for(int i = 0; i <= jbtn.length-1; i++) {
				jbtn[i] = new JButton("Exit", new ImageIcon(this.getClass().getResource("img/button.png")));//jbtn[i] = new JButton("Exit");
				jbtn[i].setPreferredSize(new Dimension(100,40));
				jbtn[i].setForeground(Color.WHITE);
				jbtn[i].setOpaque(false);
				jbtn[i].setContentAreaFilled(false);
				jbtn[i].setBorderPainted(true);
				jbtn[i].addActionListener(new BTList());
			}
//end init
//set comp
			
//end set
			pen.gridx = 0;
			pen.gridy = 0;
			this.add(jbtn[0],pen);
			
			this.setIconImage((new ImageIcon(this.getClass().getResource("img/symb.png"))).getImage());
			this.getContentPane().setBackground(Color.BLACK);
		
			this.setSize(Toolkit.getDefaultToolkit().getScreenSize ());
			this.setResizable(false);
			this.setLocationRelativeTo(null);
			this.setUndecorated(true);
		}
	}
	public static void main(String[] args) {
		new MainClass().setVisible(true);
	}
}
