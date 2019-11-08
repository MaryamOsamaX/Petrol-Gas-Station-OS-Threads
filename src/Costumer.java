import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Costumer extends Thread {
	Pump []myPump=null;
	int numP=-1;
	String name="";
	JPanel c;
	JPanel p;
	Costumer(){}
	
	Costumer(String n,Pump []myPump,JPanel p1,JPanel p2){
		this.myPump=myPump;
		numP=-1;
		name=n;
		c=p1;
		p=p2;
	}
	static synchronized int freePump(Pump []pumps) {
		int j=-1;
		for(int i=0;i<pumps.length;i++) {
			if(pumps[i].value==1&&pumps[i].state==1) {
				pumps[i].state=0;
				j=i;
				break;
			}
		}
		return j;
	}
	
	public void run(){
		Boolean x=false; 
		numP=freePump(myPump);
		JLabel w = (JLabel) c.getComponent(12);
		if(numP!=-1){
			
			System.out.println(name+" arrived");System.out.println("Pump "+(numP+1)+": "+name+" Occupied");
		}
		else {
			x=true;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			w.setText(w.getText()+name+" ");
			System.out.println(name+" arrived and waitting");
		}
		
		while(numP==-1) {
			numP=freePump(myPump);
		}
		JLabel co = (JLabel) c.getComponent(numP+1);
		w.setText(w.getText().replaceAll(name+" ", ""));
		co.setText(name);
		myPump[numP].P();
		if(x) {
		System.out.println("Pump "+(numP+1)+": "+name+" Occupied");}
		
		try {
			JLabel j = (JLabel) p.getComponent(numP); 
			Thread.sleep((long)(Math.random() * 8000));
			j.setBackground(Color.yellow);
			System.out.println("Pump "+(numP+1)+": "+name+" Being Served");
			Thread.sleep((long)(Math.random() * 8000));
			j.setBackground(Color.orange);
			System.out.println("Pump "+(numP+1)+": "+name+" Paying");
			Thread.sleep((long)(Math.random() * 8000));
			j.setBackground(Color.green); co.setText("");
			System.out.println("Pump "+(numP+1)+": "+name+" leave");
			myPump[numP].V();
			myPump[numP].state=1;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
