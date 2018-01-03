package about_aodong_cn;
import java.awt.Container;
import java.awt.SplashScreen;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainView extends JFrame{
	JFrame MainUIFrame =new JFrame("澳东机电");
		
	
		      
		    
	
	public String show(String errorValue){
		

		
		String geterror=errorValue;
		
		JLabel  jl_style   = new JLabel("报警类型:");
		JLabel jtf_error= new JLabel();
		JLabel  jl_nowTime  = new JLabel("当前时间:");
		JLabel jtf_nowTime= new JLabel();
		
				   
		    MainUIFrame.setSize(500,530);
		    MainUIFrame.setVisible(false);
		    MainUIFrame.setLocation(350,100);
		    Container n=MainUIFrame.getContentPane();
			n.setLayout(null);
			//*************************
			jl_style.setBounds(30,30,70,25);
			jtf_error.setBounds(110,30,300,25);
			jl_nowTime.setBounds(30,80,90,25);
			jtf_nowTime.setBounds(110,80,300,25);
			
			//************************
			n.add(jl_style);
			n.add(jtf_error);
			n.add(jtf_nowTime);
			n.add(jl_nowTime);
			
			MainUIFrame.setVisible(true);
			return errorValue;  
			
			}
	
	public void actionPerformed(ActionEvent e)
	{    }
	public static void main(String args[])
	{        
		
	   MainView appp=new MainView();                                   
		appp.show("故障报警");  
		appp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
