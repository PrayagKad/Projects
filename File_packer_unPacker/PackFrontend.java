import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import PackUnpack.Packer;


public class PackFrontend extends WindowAdapter
{
	public Frame fobj;

	public static void main(String arg[])
	{
		PackFrontend obj = new PackFrontend();

	}

	public PackFrontend()
	{
		fobj = new Frame("Java Project");
		fobj.setBackground(Color.cyan); 

		Button bobj1 = new Button("Pack");
		Button bobj2 = new Button("Back");

		Label lobj = new Label("Packer");
		Label Foldername = new Label("Folder Name");
		Label Filename = new Label("File Name");

		TextField t1 = new TextField();
		TextField t2 = new TextField();

		lobj.setBounds(150,30,300,30);					// setBounds() is used to set coordinates
		lobj.setForeground(Color.blue);                 // to set color of text
		lobj.setFont(new Font("Century",Font.BOLD,17)); // to set the font of the text

		Foldername.setBounds(20,80,95,30);
		Foldername.setForeground(Color.black);               
		Foldername.setFont(new Font("Century",Font.BOLD,14));

		t1.setBounds(140,80,150,30);
		t1.setForeground(Color.black); 
		t1.setBackground(Color.white);
		t1.setFont(new Font("Century",Font.BOLD,13));

		Filename.setBounds(20,120,80,30);
		Filename.setForeground(Color.black);               
		Filename.setFont(new Font("Century",Font.BOLD,14));

		t2.setBounds(140,120,150,30);
		t2.setForeground(Color.black); 
		t2.setBackground(Color.white);
		t2.setFont(new Font("Century",Font.BOLD,13));

		bobj1.setBounds(70,170,80,30);   
		bobj2.setBounds(160,170,80,30);

		bobj1.setForeground(Color.red);
		bobj1.setBackground(Color.pink);
		bobj1.setFont(new Font("Century",Font.BOLD,17));
		
		bobj2.setForeground(Color.red);
		bobj2.setBackground(Color.pink);
		bobj2.setFont(new Font("Century",Font.BOLD,17));

		//Add the Buttons and labels into the frame
		fobj.add(bobj1);         
		fobj.add(bobj2);
		fobj.add(lobj);
		fobj.add(Foldername);
		fobj.add(Filename);
		fobj.add(t1);
		fobj.add(t2);
		fobj.setSize(350,250);   


		bobj1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String source = t1.getText();
				String dest = t2.getText();
				try
				{
					Packer obj = new Packer(source, dest) ;
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