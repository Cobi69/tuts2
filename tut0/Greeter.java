import java.util.Scanner; 
public class Greeter { 

public static void main(String[] args) { 

	greeter(); 
>>>>>>> feature_input_greeter
} 

  

public static String getName() { 

Scanner sc = new Scanner(System.in); 
		System.out.print(“Please provide your name: “); 
		String name = sc.nextLine(); 
		return name;		 
}

public static void greeter() { 
String name = getName();
System.out.println("Good day my friend, " + name + "\n" + "Just imagine like are on	drugs that this line is longer than it actually is"); 

} 
 

public static void greeter(String name) { 

System.out.println("Good day my friend, " + name + "\n" + "Just imagine like are on 	drugs that this line is longer than it actually is"); 

} 
}
