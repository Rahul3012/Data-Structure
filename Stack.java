import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class Stack extends JFrame implements ActionListener 
{
	JPanel side=new JPanel();
	int SIZE=5;
	int top=-1;
	JPanel work=new JPanel();
	TextField element;
	JButton push,pop;
	Button new1[]=new Button[SIZE];
	String ele; 
	int stk[]=new int[SIZE];
	int last=500,e;
	
	Button red=new Button("  ");
	Button green=new Button("  ");
	JLabel front=new JLabel("Top    ");
	JLabel other=new JLabel("element");
	
	Stack()
	{
		getContentPane().setBackground(Color.black);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		for(int i=0;i<SIZE;i++)
		stk[i]=0;
		setBackground(Color.white);
		work=new JPanel();
		element=new TextField();
		push=new JButton("PUSH");
		pop=new JButton("POP");
		setVisible(true);
		setSize(950,700);
		setLayout(null);
		element.setBounds(10,10,100,30);
		push.setBounds(120,10,100,30);
		pop.setBounds(230,10,100,30);
		work.setBounds(10,50,800,600);
		add(pop);
		add(push);
		add(element);
		push.addActionListener(this);
		pop.addActionListener(this);
		work.setBorder(new TitledBorder(new LineBorder(Color.black, 5),"Animation Area"));
		add(work);
		work.setBackground(Color.white);
		work.setLayout(null);
		
		side.setBounds(810,50,100,600);
		side.setBackground(Color.white);
		side.setBorder(new TitledBorder(new LineBorder(Color.black, 5),"Info"));
		add(side);
		front.setBounds(810,50,30,50);
		other.setBounds(810,150,30,50);
		side.add(front);
		side.add(red);
		side.add(other);
		side.add(green);
		red.setBackground(Color.red);
		green.setBackground(Color.green);
		red.setBounds(850,50,20,50);
		green.setBounds(850,150,20,50);
		
		red.setBackground(Color.red);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		
		if(ae.getSource()==push)
		{
			ele=element.getText();
			if(ele.equals(""))
			{
				
				
				JOptionPane.showMessageDialog(this,"ENTER A VALUE","Error",1);

				try{
							Thread.sleep(2000);
									
						}catch(Exception e1){}
			
		
				
				return;
			}		
			
			 e=Integer.parseInt(ele);
			if(top==(SIZE-1))
			{
				
				
				JOptionPane.showMessageDialog(this,"OVERFLOW OCCURED","Error",1);
				try{
							Thread.sleep(2000);
							
						}catch(Exception e1){}
				
				
			}
			else
			{
				
					Thread t=new Thread(){
						public void run(){
								new1[++top]=new Button(""+e);						
								int x=0,y=0;
					new1[top].setBounds(10,100,100,30);
					
					work.add(new1[top]);
				
					for(x=10,y=10;x<650;x++)
					{
						try{
							Thread.sleep(2);
						}
						catch(Exception ex){
						}
						new1[top].setBounds(x,y,100,30);
						
					}
						
					
					
					for(;y<last;y++)
					{
						try{
						Thread.sleep(2);
						}
						catch(Exception ex){
						}
						new1[top].setBounds(x,y,100,30);
					}
					last-=30;
					stk[top]=e;
				for(int i=0;i<top;i++)
				{
					new1[i].setBackground(Color.green);
				}
				new1[top].setBackground(Color.red);
				element.setText("");			
				}
		
				};
					t.start();
				
				
			 }  
			 
		}
		else
		{
			if(top==-1)
			{
					
					
					JOptionPane.showMessageDialog(this,"UNDERFLOW OCCURED","Error",1);
				
				try{
							Thread.sleep(2000);
											
						}catch(Exception e1){}
						
					
			}
			else
			{
				work.remove(new1[top]);
				last+=30;
				int e=stk[top];
				top--;
				
					new1[top].setBackground(Color.red);
				
			}
			
		}
		for(int i=0;i<=top;i++)
		System.out.println("\n"+stk[i]);
		
	}
	
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				Stack s1=new Stack();
			}	
		});
		//new Stack();
	}
}




