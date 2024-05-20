import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class display_Bean_Info {
	public static void main(String args[]) {
		ApplicationContext context= 
				new ClassPathXmlApplicationContext("display_BeanInfo_hellobean.xml");
		Employee1 empObj=(Employee1) context.getBean("emp");
		System.out.println("Employee details");
		System.out.println("Id: "+empObj.getId());
		System.out.println("Name: "+empObj.getName());
		System.out.println("Dept: "+empObj.getDept());
		System.out.println("Designation: "+empObj.getDesignation());
	}

}
