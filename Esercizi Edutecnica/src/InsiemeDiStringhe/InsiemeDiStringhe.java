package InsiemeDiStringhe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsiemeDiStringhe {
	private int a,i,n=0;
	private String[] T;
	
	//costruttore
	InsiemeDiStringhe(int lunghezzaMax)
	{
		this.n=lunghezzaMax;
	    this.T=new String[lunghezzaMax];
	    for(a=0;a<T.length;a++) T[a]="";
	    System.out.println(T.length);
	}
	    public void getInsieme(){
		for(i=0;i<T.length;i++)
		System.out.println(T[i]);
		}//fine getInsieme
	
		public void setInsieme() throws IOException
		{
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader h= new BufferedReader(input);
		for(i=0;i < T.length;i++) {
		System.out.print("ins:");
		T[i]=h.readLine();
		}//fine for
		}//fine setInsieme
		
		public String stringaLunga(){
		String lunga="";
		int lgmax=0,i;
		for(i=0;i < T.length;i++)
		   if(T[i].length()>lgmax){
		      lunga=T[i];
		      lgmax=T[i].length();
		   }//fine if
		return lunga;
		}//fine getInsieme
		public String spaziStringa(){
		String lex="nessuna stringa con spazi";
		int i,j,spazi,spazimax=0;
		System.out.println();
		for(i=0;i < T.length;i++) {
		spazi=0;
		for(j=0;j < T[i].length();j++)
		if(T[i].charAt(j)==' ')spazi++;
		if(spazi > spazimax){
		spazimax=spazi;
		lex=T[i];
		}//fine if
		}//fine for i
		return lex;
		}//fine spaziStringa
		public void preStringa(String pre){
		int lg=0,i; String s="";
		lg=pre.length();
		for(i=0;i < T.length;i++)
		if(T[i].length()>=lg){
		s=T[i].substring(0, lg); if(s.compareTo(pre)==0)System.out.println(T[i]); }//fine if
		}//fine preStringa
		}//fine classe InsiemeDiStringhe
	
	

