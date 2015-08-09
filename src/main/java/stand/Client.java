package stand;

import javax.naming.*;
import java.util.*;
import ejb.DemoSLSB;

public class Client {

	/** The JNDI Lookup name. Note that when the WildFly console says:
	 * JNDI bindings for session bean named DemoSLSBImpl in deployment
	 *     unit deployment "slsb-demo-remote.war" are as follows:
	 * ...
	 * java:module/DemoSLSBImpl!ejb.DemoSLSB
	 * and you want to use that one, you must replace "module"
	 * with the ear or war file basename, as follows:
	 */
	private static final String LOOKUP = 
		"java:slsb-demo-remote/DemoSLSBImpl!ejb.DemoSLSB";

	public static void main(String[] args) throws Exception {

		System.out.println("Looking for Bean ...");

		DemoSLSB bean = (DemoSLSB)new InitialContext().lookup(LOOKUP);

		System.out.println("Bean found! " + bean);

		System.out.println("Here's what it said to me: " + bean.sayHello());
	}
}
