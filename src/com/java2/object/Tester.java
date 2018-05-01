package com.java2.object;

public class Tester {
	/*
	 * Employee is the base class. It includes three fields (name, email and
	 * experience), one constructor with three arguments and three getters:
	 * getName(), getEmail(), getExperience(). Developer is a subclass. It
	 * includes fields from the base class and two additional fields
	 * (mainLanguage, skills), one constructor with five arguments and two
	 * getters: getMainLanguage(), getSkills(). DataAnalyst is another subclass.
	 * It includes fields from the base class and two additional fields (phd,
	 * methods), one constructor with five arguments and two getters: isPhD(),
	 * getMethods(). You need to define types of the fields and write suitable
	 * constructors. To understand it see the code below.
	 */
	class Employee {
		// field是variable 不是method
		// field 也叫 data member
		// write fields
		String name;
		String email;
		int experience;
		// write constructor
 public Employee(String name, String email, int experience){
	 
 }
		// write getters
	}

	class Developer extends Employee {

		public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
		}
		// write fields

		// write constructor

		// write getters
	}

	class DataAnalyst extends Employee {

		public DataAnalyst(String name, String email, int experience, boolean phD, String[] mlMethods) {
		}

		// write fields

		// write constructor

		// write getters
	}

	public static void main(String[] args) {
		String[] skills = { "git", "Scala", "JBoss", "UML" };
		Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);

		String[] mlMethods = { "neural networks", "decision tree", "bayesian algorithms" };
		DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, mlMethods);
	}

}
