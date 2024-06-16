package StringBuilders;
public class StringBuilderUsage{

	public static void main(String[] args) {
		
		
		StringBuilder sb= new StringBuilder("Ahsan");
		System.out.println("The name through StringBuilder is: "+sb);
//		------------------------- charAt(); function usage ----------------------------------
		
		System.out.println("\nThe character @ [2] using charAt(); function is: "+sb.charAt(2));
		
//		------------------------- setCharAt(); function usage ----------------------------------
		sb.setCharAt(0, 'E');
		
		System.out.println("\nThe name by setting E @ [0] after using setChartAt(); function is: "+sb);
		
//		------------------------- delete(); function usage ----------------------------------
		
		sb.delete(0, 1);
		System.out.println("\nThe name by deleting 1 character @ [0] is: "+sb);
		
//		------------------------- insert(); function usage ----------------------------------
		
		sb.insert(0, 'A');
		System.out.println(sb);
		
//		------------------------- reverse(); function usage ----------------------------------
		
		System.out.println(sb.reverse());
		
		
//		------------------------- append(); function usage ----------------------------------
		
		StringBuilder sb1= new StringBuilder("A");
		
		sb1.append("h");
		sb1.append("s");
		sb1.append("a");
		sb1.append("n");
		
		System.out.println(sb1);	
	}

}
