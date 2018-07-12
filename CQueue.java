import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class CQueue extends JFrame implements ActionListener 
{
	JPanel side=new JPanel();
	int SIZE=5;
	int fr=-1,rr=-1;
	JPanel work=new JPanel();
	TextField element;
	JButton enCQueue,deCQueue;
	Button new1[]=new Button[SIZE];
	String ele; 
	int que[]=new int[SIZE];
	int last=650,e;
	Button red=new Button("  ");
	Button blue=new Button("  ");
	Button green=new Button("  ");
	JLabel front=new JLabel("Front  ");
	JLabel rear=new JLabel("Rear   ");
	JLabel other=new JLabel("element");
	CQueue()
	{
		getContentPane().setBackground(Color.black);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		for(int i=0;i<SIZE;i++)
		que[i]=0;work=new JPanel();
		//work.setBackground(new Color(85,2,155));
		
		element=new TextField();
		enCQueue=new JButton("EnQueue");
		deCQueue=new JButton("DeQueue");
		setVisible(true);
		setSize(930,700);
		setLayout(null);
		element.setBounds(10,10,100,30);
		enCQueue.setBounds(120,10,100,30);
		deCQueue.setBounds(230,10,100,30);
		work.setBounds(10,50,800,600);
		add(deCQueue);
		add(enCQueue);
		add(element);
		enCQueue.addActionListener(this);
		deCQueue.addActionListener(this);
				work.setBorder(new TitledBorder(new LineBorder(Color.black, 5),"Animation Area"));

		add(work);
		
		work.setLayout(null);
		side.setBounds(810,50,100,600);
		side.setBackground(Color.white);
		side.setBorder(new TitledBorder(new LineBorder(Color.black, 5),"Info"));
		
		add(side);
		
		front.setBounds(810,50,30,50);
		rear.setBounds(810,150,30,50);
		other.setBounds(810,250,30,50);
		side.add(front);
		side.add(red);
		side.add(rear);
		side.add(blue);
		side.add(other);
		side.add(green);
		red.setBackground(Color.red);
		blue.setBackground(Color.blue);
		green.setBackground(Color.green);
		red.setBounds(850,50,20,50);
		blue.setBounds(850,150,20,50);
		green.setBounds(850,250,20,50);
		
		red.setBackground(Color.red);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		
		if(ae.getSource()==enCQueue)
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
			if((rr==SIZE-1 && fr==0 )|| rr+1==fr)
			{
				
				
				JOptionPane.showMessageDialog(this,"OVERFLOW OCCURED","Error",1);	
			}
			else
			{
						Thread t=new Thread(){
						public void run(){
						if(fr==-1)
						{
							fr++;
							rr++;
						}
						else if(rr==SIZE-1 && fr!=0)
						{
							rr=0;
							//new1[rr]=new Button(""+e);						
						}
						else{
							rr++;
							
							System.out.println("called");
						}
						new1[rr]=new Button(""+e);	
								
								int x=0,y=0;
					new1[rr].setBounds(10,100,100,30);
					
					
					work.add(new1[rr]);
				    if(rr==0)
				    {
						for(x=10,y=200;x<300;x++)
						{
							try{
								Thread.sleep(2);
							}
							catch(Exception ex){
							}
							new1[rr].setBounds(x,y,100,30);
						
						}
					}
					if(rr==1)
				    {
						for(x=0,y=100;x<450;x++)
						{
							try{
								Thread.sleep(2);
							}
							catch(Exception ex){
							}
							new1[rr].setBounds(x,y,100,30);	
						}
						for(;y<300;y++)
						{
							try{
								Thread.sleep(2);
							}
							catch(Exception ex){
							}
							new1[rr].setBounds(x,y,100,30);	
						}
					}
					if(rr==2)
				    {
						for(x=0,y=100;x<550;x++)
						{
							try{
								Thread.sleep(2);
							}
							catch(Exception ex){
							}
							new1[rr].setBounds(x,y,100,30);	
						}
						for(;y<400;y++)
						{
							try{
								Thread.sleep(2);
							}
							catch(Exception ex){
							}
							new1[rr].setBounds(x,y,100,30);	
						}
						for(;x>380;x--)
						{
							try{
								Thread.sleep(2);
							}
							catch(Exception ex){
							}
							new1[rr].setBounds(x,y,100,30);	
						}
					}
						
					if(rr==3)
				    {
						for(x=0,y=100;x<550;x++)
						{
							try{
								Thread.sleep(2);
							}
							catch(Exception ex){
							}
							new1[rr].setBounds(x,y,100,30);	
						}
						for(;y<500;y++)
						{
							try{
								Thread.sleep(2);
							}
							catch(Exception ex){
							}
							new1[rr].setBounds(x,y,100,30);	
						}
						for(;x>220;x--)
						{
							try{
								Thread.sleep(2);
							}
							catch(Exception ex){
							}
							new1[rr].setBounds(x,y,100,30);	
						}
						for(;y>400;y--)
						{
							try{
								Thread.sleep(2);
							}
							catch(Exception ex){
							}
							new1[rr].setBounds(x,y,100,30);	
						}
					}
					
					if(rr==4)
				    {
						for(x=0,y=100;x<550;x++)
						{
							try{
								Thread.sleep(2);
							}
							catch(Exception ex){
							}
							new1[rr].setBounds(x,y,100,30);	
						}
						for(;y<500;y++)
						{
							try{
								Thread.sleep(2);
							}
							catch(Exception ex){
							}
							new1[rr].setBounds(x,y,100,30);	
						}
						for(;x>100;x--)
						{
							try{
								Thread.sleep(2);
							}
							catch(Exception ex){
							}
							new1[rr].setBounds(x,y,100,30);	
						}
						for(;y>300;y--)
						{
							try{
								Thread.sleep(2);
							}
							catch(Exception ex){
							}
							new1[rr].setBounds(x,y,100,30);	
						}
						for(;x<150;x++)
						{
							try{
								Thread.sleep(2);
							}
							catch(Exception ex){
							}
							new1[rr].setBounds(x,y,100,30);	
						}
					}	
					
					
					
					//last-=100;
					que[rr]=e;
					if(fr>rr){
				for(int i=0;i<=rr;i++)
				{
					new1[i].setBackground(Color.green);
				}
				for(int i=fr;i<SIZE;i++)
				{
					new1[i].setBackground(Color.green);
				}
				}
				else
				
				{
				
				for(int i=fr;i<rr;i++)
				{
					new1[i].setBackground(Color.green);
				}
				}
				new1[rr].setBackground(Color.blue);
				new1[fr].setBackground(Color.red);
				element.setText("");			
				}
		
				};
					t.start();
				
				
			 }  
			 
		}
		else
		{
			if(fr==-1)
			{
					
					
					JOptionPane.showMessageDialog(this,"UNDERFLOW OCCURED","Error",1);
							
			}
			else if(fr==rr)
			{
				work.remove(new1[fr]);
				fr=rr=-1;
			}
			else if(fr==SIZE-1)
			{
				work.remove(new1[fr]);
				fr=0;
			}
			else{
				work.remove(new1[fr++]);
			}
		for(int i=fr;i<rr;i++)
				{
					new1[i].setBackground(Color.green);
				}
				new1[fr].setBackground(Color.red);
				new1[rr].setBackground(Color.blue);
		
			
		}
		for(int i=0;i<=rr;i++)
		System.out.println("\n"+que[i]);
		
	}
	
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				CQueue s1=new CQueue();
			}	
		});
	}
}




