
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Client {
	private static SessionFactory factory;
	
	public static void getSessionFactory() {
		try {
		Configuration conf =new Configuration().configure();
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
		factory =conf.buildSessionFactory(builder.build());
		}catch (Exception ex) {
			System.out.println(ex);
		}
		
		
	}
	
	public static void main(String args[]) {
		getSessionFactory();
		Client clientObj=new Client();
		
		//clientObj.insertRecordInDatabase(77,"Om","Shaha",8000);
		//clientObj.updateRecord(74, "Sakshi");
		
		//Delete record from db
		//clientObj.deleteRecord(74);
		
		//Display the records using native query
		clientObj.displayRecordsUsingNativeQuery();
		
		//Display all the records using sql
		//clientObj.displayRecords();
		
		
	}
	//Insert a record in thh db.
	public void insertRecordInDatabase(int id,String firstName,String lastName,int sal) {
		Session session = factory.openSession();
		Transaction tx=session.beginTransaction();
		Employee empObj=new Employee(id,firstName,lastName,sal);
		session.save(empObj);
		tx.commit();
		System.out.println("Record inserted in the db succesfully..");
		session.close();
	}
	//Display att the records using HQL 
	
	public void displayRecords() {
		Session session=factory.openSession();
		List<Employee>empLst=session.createQuery("FROM Employee").list();
		
		for (Employee empObj:empLst) {
			System.out.print(empObj);
		}
		session.close();
	
	}
	
	//Displays the records using native sql query.
	public void displayRecordsUsingNativeQuery() {
		Session session=factory.openSession();
		String str="SELECT * FROM hibernate_create_insert_update_delete where salary>=5000";
		SQLQuery query=session.createSQLQuery(str);
		query.addEntity(Employee.class);
		List<Employee>empLst=query.list();
		for (Employee empObj: empLst)
			System.out.println(empObj);
		session.close();
	}
	public void updateRecord(int id ,String firstName) {
		Session session = factory.openSession();
		Transaction tx=session.beginTransaction();	
		Employee empObj=(Employee) session.get(Employee.class, id);
		empObj.setFirstName(firstName);
		session.update(empObj);
		tx.commit();
		System.out.println("Given record is update in the db succesfull..");
		session.close();
	}
	
	
	//Deletes the records from db
	public void deleteRecord (int id) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Employee empObj=(Employee) session.get(Employee.class, id);
		session.delete(empObj);
		tx.commit();
		System.out.println("Record with id::" +id+ " is deleted successfully");
		session.close();
		}

	

}

