package com.java.company.assign;

public class StartApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address ad1 = new Address("Pune-A", 101, "MH", 123456);
		Address ad2 = new Address("Pune-B", 102, "MH", 123457);
		Address ad3 = new Address("Pune-C", 103, "MH", 123458);
		Address ad4 = new Address("Pune-D", 104, "MH", 123459);

		Role manager = new Role("Manager", 10001);
		Role sse = new Role("Sr. Software Engineer", 10002);
		Role se = new Role("Software Engineer", 10003);
		Role lead = new Role("Tech Lead", 10001);

		Role[] grp1 = { manager };
		Role[] grp2 = { manager, lead };
		Role[] grp3 = { se };
		Role[] grp4 = { sse, lead };

		Employee e1 = new Employee(1, "Mr.XXX1", 23522.67, ad1, grp2);// m
		Employee e2 = new Employee(2, "Mr.XXX2", 62424.90, ad2, grp1);// m
		Employee e3 = new Employee(3, "Mr.XXX3", 98765.76, ad3, grp3);//
		Employee e4 = new Employee(4, "Mr.XXX4", 24252.77, ad4, grp4);//
		Employee e5 = new Employee(5, "Mr.XXX5", 89876.99, ad1, grp3);// m

		Employee[] hr = { e1, e4 ,e5};
		Employee[] devs = { e3, e2, e4 };

		Dept dept1 = new Dept(551, "Human Resources", "HR", hr);
		Dept dept2 = new Dept(552, "Development", "DEV", devs);

		Dept[] depts = { dept1, dept2 };

		Company company = new Company("XXX3245", "IBM", ad4, depts);
		System.out.println(company);

	}

}
