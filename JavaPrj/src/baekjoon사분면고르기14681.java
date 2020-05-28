import java.util.Scanner;

public class baekjoon사분면고르기14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner s = new Scanner(System.in);
		        
		        System.out.println("x값 :");
		        int x = s.nextInt();
		        System.out.println("y값 :");
		        int y = s.nextInt();
		        
		        if ((x>0) && (y>0))
		            System.out.println(1);
		        else if ((x<0) && (y>0))
		            System.out.println(2);
		        else if ((x<0) && (y<0))
		            System.out.println(3);
		        else if ((x>0) && (y<0))
		            System.out.println(4);
		        
		    
		
	}

}
