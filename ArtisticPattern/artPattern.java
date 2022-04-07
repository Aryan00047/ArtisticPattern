package ArtisticPattern;
import java.util.*;
public class artPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int rows = (2*n)+1, cols = (2*n)+2;
		for(int i=0;i<rows ;i++) {
			int count =0;
			int u_pat = 2*i,l_pat=2*(2*n-i);
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
						else if(j>0 && j> n-i+1 && u_pat>2) {
					    	if(i%2==0){
					    		System.out.print("- ");
					    		u_pat--;
					    	}
					    	else {
					    		System.out.print("= ");
					    		u_pat--;
					    	}
					    }
						else if(j>0 && u_pat==2 && count==0) {
							System.out.print("\\ ");
							count++;
						}
						else if(j>0 && u_pat==2 && count>0 && j<cols-1) {
							System.out.print("  ");
						}
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
						if(i%2==0)
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
				    else if(j>0 &&j< i-n+1)
						System.out.print("  ");
					else if(j>0 && j== i-n+1)
				        System.out.print("\\ ");
					else if(j>0 && j> i-n+1 && l_pat>2) {
				    	if(i%2==0){
				    		System.out.print("- ");
				    		l_pat--;
				    	}
				    	else {
				    		System.out.print("= ");
				    		l_pat--;
				    	}
				    }
					else if(j>0 && l_pat==2 && count==0) {
						System.out.print("/ ");
						count++;
					}
					else if(j>0 && l_pat==2 && count>0 && j<cols-1) {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
			}
		}
	}


