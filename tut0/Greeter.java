public class Greeter { 

public static void main(String[] args) { 

greeter(args[0]); 

} 

  

public static String getName() { 

Scanner sc = new Scanner(System.in); 
		System.out.print(“Please provide your name: “); 
		String name = sc.nextLine(); 
		return name;		 

} 

public static void greeter(String name) { 

System.out.println("Good day my friend, " + name + "\n" + "Just imagine like are on 	drugs that this line is longer than it actually is"); 

} 
}
