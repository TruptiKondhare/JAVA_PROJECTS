import org.springframework.context.ApplicationContext ;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class bean_init_destroy_client {
	public static void main(String args[]) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("bean_init_Destroy.xml");
		Hello1 helloObj=(Hello1)context.getBean("hello");
		System.out.println("Content of hello obj "+ helloObj.getMsg());	}

}
