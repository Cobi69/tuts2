import java.util.Scanner; 
public class Greeter { 

public static void main(String[] args) { 
	greeter(); 
} 

  

public static String getName() { 

Scanner sc = new Scanner(System.in); 
		System.out.print(“Please provide your name: “); 
		String name = sc.nextLine(); 
		return name;		 
}

public static void greeter() { 
String name = getName();
System.out.println("Hello there, " + name + " How are you doing"); 

} 
 

}
