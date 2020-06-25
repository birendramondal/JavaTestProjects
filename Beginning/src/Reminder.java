import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class userlogin implements ActionListener
{

	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	

	JFrame fr;
	JLabel l1,limg,l2,l3;
	JTextField t1,t2;
	JPasswordField t3;
	JButton b1,b2;
	static String name;
			
	public userlogin()
	{
		fr = new JFrame("REGISTER USER LOGIN");
		fr.getContentPane().setBackground(Color.pink);
		fr.setSize(400,300);
		fr.setLayout(null);
		limg = new JLabel(new ImageIcon("c:\\stdmgtsys\\images\\login\\login1.jpg"));
		fr.setContentPane(limg);

		t1 = new JTextField();
		t1.setBounds(200,70,150,30);
		
		l1 = new JLabel("USER NAME ");
		l1.setFont(new Font("comic sans ms",Font.BOLD,18));
		l1.setForeground(Color.blue);	
		l1.setBounds(40,70,150,30);
		fr.add(l1);

		l2 = new JLabel("Enter ID ");
		l2.setFont(new Font("comic sans ms",Font.BOLD,18));
		l2.setForeground(Color.blue);	
		l2.setBounds(40,120,150,30);
		fr.add(l2);

		t2 = new JTextField();
		t2.setBounds(200,120,150,30);
		fr.add(t2);

		l3 = new JLabel("PASSWORD ");
		l3.setFont(new Font("comic sans ms",Font.BOLD,18));
		l3.setForeground(Color.blue);	
		l3.setBounds(40,170,150,30);
		fr.add(l3);

		t3 = new JPasswordField();
		t3.setBounds(200,170,150,30);
		fr.add(t3);



		b1 = new JButton("LOGIN");
		b1.setBounds(90,230,100,30);
		b1.addActionListener(this);

		b2 = new JButton("CANCEL");
		b2.setBounds(200,230,100,30);
		b2.addActionListener(this);
		
		fr.add(b1);
		fr.add(t1);
		fr.add(b2);		

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    
		fr.setLocation((screen.width - 500)/2,((screen.height-350)/2));	
		fr.setUndecorated(true);   		
		 
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String s1 = t2.getText();
			String s2 = t1.getText();
 			String s3 = t3.getText();
			String s4,s5;
			name = s2;
			
			try
			{
			
			makeconnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select Name,Password1 from record where id="+s1);
			rs.next();
			s4 = rs.getString("Name"); 
			s5 = rs.getString("Password1");
			
			if(s4.equals(s2) && s5.equals(s3))
			{
			
			//new swelcome();
			fr.dispose();
			}	
					
			con.close();
			}
			catch(Exception e)
			{
			System.out.println("error"+e);
			}
			
			
		}
		
		if(ae.getSource()==b2)
		{
			
			fr.dispose();
		
		}

	}

	public void makeconnection()
	{
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con = DriverManager.getConnection("JDBC:ODBC:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=c:\\stdmgtsys\\source code\\database\\login.accdb");
	System.out.println("Connection established...");
	}
	catch(Exception e)
	{
	System.out.println("Connection not established...");
	}
	}

	

	public static void main(String args[])
	{
		new userlogin();
	}
}