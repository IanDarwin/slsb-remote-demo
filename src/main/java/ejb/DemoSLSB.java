package ejb;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.jws.WebService;

/**
 * For the old interface view, you probably want @Local and @Remote
 * on both the Interface and the Implementation
 * @author Ian Darwin
 */
@Remote
@WebService
public interface DemoSLSB {
	/** Generate a greeting */
	public String sayHello();
}
