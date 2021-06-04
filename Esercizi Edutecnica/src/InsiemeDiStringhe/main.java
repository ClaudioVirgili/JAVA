package InsiemeDiStringhe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException 
{
		InputStreamReader input=new InputStreamReader(System.in); 
		BufferedReader h= new BufferedReader(input);
		int num;
		System.out.print("quante stringhe:"); num=Integer.parseInt(h.readLine().trim());
		InsiemeDiStringhe ins = new InsiemeDiStringhe(num);
		ins.setInsieme();
		ins.getInsieme();
		System.out.print("\nstringa più lunga:"+ins.stringaLunga());
		System.out.print("\nstringa con più spazi:"+ins.spaziStringa()); 
		System.out.println("\ncon prefisso:"); 
		ins.preStringa("0331");
}//fine main
	}


