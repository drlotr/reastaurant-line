import java.util.Collection;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Tester {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Menu: Fries, Pizza, Burger, Everything");
		System.out.println("Entering Q for Order Ends Ordering");
		Queue<Order> line = new LinkedList<Order>();
		String name;
		String order;
		int i = 0;
		boolean ordering = true;
		while (ordering == true) {
			System.out.print("Name: ");
			name = scnr.next();
			System.out.print("What would you like to order: ");
			order = scnr.next();
			if(order.toUpperCase().equals("Q")) {
				ordering = false;
				System.out.println("Program Ended");
			}
			Order newOrder = new Order(name, order);
			line.add(newOrder);
			i++;
			if (i - line.peek().getPrepTime() == 0) {
				System.out.println(line.peek().getName() + "'s order of " + line.peek().getOption() + " is complete!");
				line.remove();
				System.out.println("Current Orders: ");
				line.forEach((Order) -> System.out.println(Order.getName() + "'s " + Order.getOption()) );
				i = 0;
			}
		}

	}
}
