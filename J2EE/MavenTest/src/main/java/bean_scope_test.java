
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class bean_scope_test {
	public static void main(String args[]) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("bean_scope.xml");
		Hello obj1=(Hello) context.getBean("hello1");
		obj1.setMsg("This is a singleton bean..");
		System.out.println("Object 1: ");
		System.out.println(obj1.getMsg());
		
		Hello obj2=(Hello) context.getBean("hello1");
		System.out.println("Object 2: ");
		System.out.println(obj1.getMsg());
	
	}

}

