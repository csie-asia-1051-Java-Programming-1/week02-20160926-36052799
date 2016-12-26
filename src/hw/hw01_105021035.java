package hw;
import java.util.Scanner;
public class hw01_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
		System.out.println("金錢:");
		int a = scn.nextInt();
		System.out.println("蘋果數量為:");
		int b = scn.nextInt();
		System.out.println("柳丁數量為:");
		int c = scn.nextInt();
		System.out.print("桃子數量為：");
		 int p = scn.nextInt();
	     int fsum = a*15+o*20+p*30;
	     int urm  = m-fsum;
	     if (urm>=0){
	     System.out.println(urm/50+"個50元");
	     System.out.println((urm-(urm/50)*50)/5+"個5元");
	     System.out.println((urm-(urm/50)*50)-(urm-(urm/50)*50)/5*5+"個1元");}
	     else if(urm<0){
	    	  System.out.println(0);
	     }
}

}
