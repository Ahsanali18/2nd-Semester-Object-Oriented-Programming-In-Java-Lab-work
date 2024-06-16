/* print the Diamond structure like this -->    *
  											   ***
  											  *****
  											 *******
  											  *****
  											   ***
  											    *   */
package Basics;

public class Daimond_Printing {

	public static void main(String[] args) {
		int n=4;
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
		}
		for(int k=0; k<2*i-1; k++) {
			System.out.print("*");
		}
		System.out.println();
	}
		for(int i=n-1; i>=1; i--) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
