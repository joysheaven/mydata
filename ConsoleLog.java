import javax.swing.*;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.*;

public class ConsoleLog extends JFrame implements ActionListener
{
	JButton bt;
	JPasswordField pf;
	JTextField username;
	JPanel jp;
	JPanel boxes;
	JPanel tfields;
	String u,pwd;
	public ConsoleLog()
	{
		super("logging");
		Font f = new Font("Matura MT Script Capitals",Font.PLAIN,36);
		bt = new JButton("login");
		bt.setFont(f);
		add(bt);
		
		bt.addActionListener(this);
		jp = new JPanel(new BorderLayout(5, 5));
		boxes = new JPanel(new GridLayout(0, 1, 2, 2));
		boxes.add(new JLabel("username",SwingConstants.RIGHT));
		boxes.add(new JLabel("password",SwingConstants.RIGHT));
		jp.add(boxes,BorderLayout.WEST);
		
		tfields = new JPanel(new GridLayout(0, 1, 2, 2));
		username = new JTextField();
		tfields.add(username);
		pf = new JPasswordField();
		tfields.add(pf);
		
		jp.add(tfields,BorderLayout.CENTER);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(null,jp,"login",JOptionPane.OK_CANCEL_OPTION);
		if(username.getText().compareTo("ikneet")==0)
		{
			if(pf.getPassword().equals("singh"))
			{
				JOptionPane.showMessageDialog(null,"welcome mr. ikneet singh");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null,"error...");
		}
	}
}
