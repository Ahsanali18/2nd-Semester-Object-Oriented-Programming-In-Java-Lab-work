package Loops;

public class ManyVariablesInForLoop {

	public static void main(String[] args) {
		
		System.out.println("i\tj\tk\tl\tm");
		for(int i=0, j=0, k=0, l=10, m=20; i<10&&j<10&&k<10&&l>0&&m>0; i++,j++,k++,l--,--m)
		{
			System.out.print(i+"\t"+j+"\t"+k+"\t"+l+"\t"+m+"\n");
		}
	}

}
