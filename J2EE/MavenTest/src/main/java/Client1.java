import org.springframework.context.ApplicationContext ;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("setter_based_DI.xml");
		Employee empObj=(Employee) context.getBean("employee");
		empObj.displayEmployeeData();

	}

}
