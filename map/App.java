package com.spark.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Dept dept = new Dept();
		dept.setdId(108);
		dept.setdName("Developer");

		Employee employee = new Employee();
		employee.seteId(23);
		employee.setpName("Megha");
		employee.seteSalary(32785);
		employee.seteDept(dept);

		Configuration configuration = new Configuration().configure().addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Dept.class);

		SessionFactory sessionfactory = configuration.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(employee);

//		System.out.println(session.get(Employee.class, 1));

		transaction.commit();

	}
}
