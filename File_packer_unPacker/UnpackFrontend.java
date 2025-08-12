import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import PackUnpack.Unpacker;


public class UnpackFrontend
{
	public Frame fobj;

	public static void main(String arg[])
	{
		UnpackFrontend obj = new UnpackFrontend();
	}

	public UnpackFrontend()
	{
		fobj = new Frame("Java Project"); 
		fobj.setBackground(Color.cyan); 

		Button bobj1 = new Button("Unpack");
		Button bobj2 = new Button("Back");

		Label lobj = new Label("Unpacker");
		Label Filename = new Label("File Name");
	
		TextField t1 = new TextField();

		lobj.setBounds(130,30,300,30); 					// setBounds() is used to set coordinates
		lobj.setForeground(Color.blue);                 // to set color of text
		lobj.setFont(new Font("Century",Font.BOLD,17)); // to set the font of the text

		Filename.setBounds(20,80,80,30);
		Filename.setForeground(Color.black);               
		Filename.setFont(new Font("Century",Font.BOLD,17));

		t1.setBounds(110,80,150,30);
		t1.setForeground(Color.black); 
		t1.setBackground(Color.white);
		t1.setFont(new Font("Century",Font.BOLD,14)); 

		bobj1.setBounds(70,170,80,30); 
		bobj1.setForeground(Color.red); 
		bobj1.setBackground(Color.pink);
		bobj1.setFont(new Font("Century",Font.BOLD,17));

		bobj2.setBounds(160,170,80,30);
		bobj2.setForeground(Color.red); 
		bobj2.setBackground(Color.pink);
		bobj2.setFont(new Font("Century",Font.BOLD,17));

		// Add buttons and labels in the frame
		fobj.add(bobj1);          
		fobj.add(bobj2);
		fobj.add(lobj);
		fobj.add(Filename);
		fobj.add(t1);

		// Set size of the frame
		fobj.setSize(350,250);   

		bobj1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String source = t1.getText();
				try
				{
					Unpacker obj = new Unpacker(source) ;
				}
				catch(Exception E)
				{};
			}
		});

		bobj2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				fobj.dispose();
			}
		});

		fobj.setLayout(null);
		fobj.setVisible(true);
	}
}
