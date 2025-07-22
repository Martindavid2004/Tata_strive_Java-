package martin;
import java.util.*;
class Resource {
	synchronized void printNum(int n) {
		for (int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {Thread.sleep(550);} catch(InterruptedException e) {e.printStackTrace();}
			
		}
	}
}
class Myth extends Thread{
	Resource res;
	int num;
	Myth( Resource res,int num){
		this.res=res;
		this.num=num;
		
	}
	public void run() {
		res.printNum(num);
	}
	
}
	
public class Main2 {

	public static void main(String[] args) {
		 Resource res =new  Resource();
		 Myth t1=new Myth(res,2);
		 Myth t2=new Myth(res,3);
		t1.start();
		t2.start();
		
	}
}


