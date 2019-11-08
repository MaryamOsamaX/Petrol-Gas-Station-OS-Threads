import java.util.*;
public class PetrolStation {
	
	static void StartSimuation (){
		Scanner data=new Scanner(System.in);
		System.out.print("What is number of Pumps? ");
		int n=data.nextInt();
		System.out.print("Number of Clients : ");
		int x=data.nextInt();
		Pump station[]=new Pump[n];
		for(int i=0;i<n;i++) {
			station[i]=new Pump(1);
		}
		Costumer c[]=new Costumer[x];
		System.out.print("Clients’ names: ");
		for(int i=0;i<x;i++) {
			String name=data.next();
			//c[i]=new Costumer(name,station);
			c[i].start();
		}
		data.close();
	}

}
