package Demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kit._14_Spel.Spel;

class App {
	public static void main(String[] args) {
		System.out.println("project exicution Started===============>\n");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/kit/_14_Spel/Config14.xml");

		System.out.println("project exicution Ended===============>");
	}
}
