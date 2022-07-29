package ex3;
import java.util.*;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		double []c = new double[1000];
		c[0] = 0;
		c[1] = 1;
		for(int a=2;a<1000;a++) {
			c[a] = c[a-1]+c[a-2];
		}
		System.out.printf("The number of F("+num+") is %.1f",c[num]);
		    
		  
		

	}

}











class p2{
	private int x;
	private int y;
	private String m1 = "春天來了",m2 = "安魂曲",m3 = "陰陽師"
			,m4 = "origin";
}
