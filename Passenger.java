package carpool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Passenger {
	double oriX, oriY;
	double destX, destY;
	String name;
	BinNumber ori,dest;
	

void createPassenger() throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		name = br.readLine();
		oriX = Double.parseDouble(br.readLine());
		oriY = Double.parseDouble(br.readLine());
		destX = Double.parseDouble(br.readLine());
		destY = Double.parseDouble(br.readLine());
		
	}
BinNumber allocation() {
	
		BinNumber n = new BinNumber();
		BinNumber m = new BinNumber();
		if(oriX>22.454 && oriX<22.657 && oriY>88.281 && oriY<88.491) {
			n.a = (int) Math.floor((22.657-oriX)/0.00655);
			n.b = (int) Math.floor((88.491-oriY)/0.00954);
			ori.a = n.a;
			ori.b = n.b;
			
		}
		if(destX>22.454 && destX<22.657 && destY>88.281 && destY<88.491) {
			m.a = (int) Math.floor((22.657-destX)/0.00655);
			m.b = (int) Math.floor((88.491-destY)/0.00954);
			dest.a = m.a;
			dest.b = m.b;
			
		}
		
		return n;
		
	}
}
