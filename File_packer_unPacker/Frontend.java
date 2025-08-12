import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import PackUnpack.*;

class ListenerX extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}

class Frontend
{
	public Frame fobj;

	public static void main(String arg[])
	{
		Frontend obj = new Frontend();
	}

	public Frontend()
	{
		fobj = new Frame("Java Project");   
		fobj.setBackground(Color.cyan);

		Button bobj1 = new Button("Pack");
		Button bobj2 = new Button("Unpack");

		Label lobj = new Label("Packer Unpacker");

		lobj.setBounds(100,50,300,30); 					// setBounds() is used to set coordinates
		lobj.setForeground(Color.blue);                 // to set color of text
		lobj.setFont(new Font("Century",Font.BOLD,17)); // to set the font of the text  

		// set the button size
		bobj1.setBounds(50,130,80,30);  
		bobj2.setBounds(200,130,80,30);

		bobj1.setForeground(Color.red);
		bobj1.setBackground(Color.pink);
		bobj1.setFont(new Font("Century",Font.BOLD,17));

		bobj2.setForeground(Color.red);
		bobj2.setBackground(Color.pink);
		bobj2.setFont(new Font("Century",Font.BOLD,17));
		
		// Add the buttons and label into the frame
		fobj.add(bobj1);          
		fobj.add(bobj2);
		fobj.add(lobj);
		
		// Set the size of the frame
		fobj.setSize(350,250);   
	
		bobj1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == bobj1)
				{
					try
					{
						PackFrontend obj = new PackFrontend();
					}
					catch(Exception E)
					{};
				}
			}
		});

		bobj2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == bobj2)
				{
					try
					{
						UnpackFrontend obj = new UnpackFrontend();
					}
					catch(Exception E)
					{};
				}
			}
		});

		fobj.setLayout(null);
		fobj.setVisible(true);
		fobj.addWindowListener(new ListenerX());
	}
}