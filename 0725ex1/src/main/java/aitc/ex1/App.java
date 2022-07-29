package aitc.ex1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        for(int x=1;x<=5;x++) {
        	for(int y=1;y<=x;y++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        for(int a=4;a>=1;a--) {
        	for(int b=1;b<=a;b++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
    	
    }
}
