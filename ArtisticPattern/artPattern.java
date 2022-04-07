package ArtisticPattern;
import java.util.*;
public class artPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int rows = (2*n)+1, cols = (2*n)+2;
		for(int i=0;i<rows ;i++) {
			int c_pat = 2*i;
			for(int j=0;j<cols;j++) {
				if(i== 0 || i== rows-1) { 
				   if(j== 0 || j== cols-1)
					  System.out.print("+ ");
				   else
					  System.out.print("- ");
					  }
				else if(i>0 && i<rows/2){
					    if(j==0)
						    System.out.print("| ");
					    else if(j==cols-1)
					    	System.out.print("|");
						if(j>0 &&j< n-i+1)
							System.out.print("  ");
						else if(j>0 && j== n-i+1)
					        System.out.print("/ ");
						else if(j>0 && j> n-i+1 && c_pat>2) {
					    	if(i%2==0){
					    		System.out.print("- ");
					    		c_pat--;
					    	}
					    	else {
					    		System.out.print("= ");
					    		c_pat--;
					    	}
					    }
						else if(j>0 && c_pat==2 )
							System.out.print("\\ ");
				}
				else if(i== rows/2) {
					if(j==0)
						System.out.print("| ");
					else if(j==cols-1)
						System.out.print("|");
					if(j== 1)
						System.out.print("< ");
					else if(j== cols-2)
						System.out.print("> ");
					else if( j>1 && j<cols-2){
						if(i%2==1)
							System.out.print("- ");
						else
							System.out.print("= ");
					}
				}
				else if(i>rows/2 && i<rows-1) {
					if(j==0)
					    System.out.print("| ");
				    else if(j==cols-1)
				    	System.out.print("|");
					if(j>0 &&j< n-i+1)
						System.out.print("  ");
					else if(j>0 && j== n-i+1)
				        System.out.print("\\ ");
					else if(j>0 && j> n-i+1 && c_pat>2) {
				    	if(i%2==0){
				    		System.out.print("- ");
				    		c_pat--;
				    	}
				    	else {
				    		System.out.print("= ");
				    		c_pat--;
				    	}
				    }
					else if(j>0 && c_pat==2 )
						System.out.print("/ ");
				}
			}
			System.out.println();
		}
	}
}


