
package bean;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeList {
	ArrayList<Employee> emplist = new ArrayList<>();

	public void addEmploye(Employee emp) {
		emplist.add(emp);
	}

	public void removeEmployee(String name, int empid) {
		for (Iterator iterator = emplist.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();

			if (employee.getName().equals(name)) {
				iterator.remove();
			} else if (employee.getEmpid() == empid) {
				iterator.remove();
			}

		}
	}

	public void showEmployee() {
		for (Employee employee : emplist) {
			System.out.println(employee.getEmpid() + " " + employee.getName() + " " + employee.getSalary() + " "
					+ employee.getCabin());
		}
	}

	public void getEmployeeByName(String name) {
		for (Employee employee : emplist) {
			if (employee.getName().equals(name)) {
				System.out.println(employee.getEmpid() + " " + employee.getName() + " " + employee.getSalary());

			}

		}
	}

	public void searchCabin(String cabin) {
		for (Employee employee : emplist) {
			if (employee.getCabin().equalsIgnoreCase(cabin)) {
				System.out.println(employee.getName() + " " + employee.getCabin());

			}

		}
	}

	public void dateOfJoining(String date) {
		for (Employee employee : emplist) {
			System.out.println(employee.getEmpid() + " " + employee.getName() + " " + employee.getDate() + " "
					+ employee.getSalary());
			if (employee.getDate() == date) {
				System.out.println(employee.getEmpid() + " " + employee.getName() + " " + employee.getDate() + " "
						+ employee.getSalary());

			}

		}
	}

	public Employee getHighestSalary() {
		int maximum = 0;
		Employee max = null;

		for (Employee employee : emplist) {
			if (employee.getSalary() > maximum) {
				maximum = employee.getSalary();
				max = employee;
			}

		}
		return max;
	}

	public static void main(String[] args) {
		EmployeeList employee = new EmployeeList();
		Employee e1 = new Employee(11, "ranjith", 1000000, "A", "21 / 01 / 2022");
		Employee e2 = new Employee(22, "SUBU", 200000, "B", "8 / 02 / 2022");
		Employee e3 = new Employee(33, "sai", 300000, "C", "23 / 03 / 2022");
		Employee e4 = new Employee(44, "SURESH", 500000, "D", "21 / 04 / 2022");
		employee.addEmploye(e1);
		employee.addEmploye(e2);
		employee.addEmploye(e3);
		employee.addEmploye(e4);
		employee.showEmployee();
		System.out.println();
		employee.getEmployeeByName("ranjith");
		System.out.println();
		employee.removeEmployee("sai", 55);
		System.out.println();
		employee.showEmployee();
		employee.dateOfJoining("21/01/2022");
		System.out.println();
		System.out.println(employee.getHighestSalary().getName() + " " + employee.getHighestSalary().getEmpid()
				+ " " + employee.getHighestSalary().getCabin() + " " + employee.getHighestSalary().getSalary() 
				+ " "	+ employee.getHighestSalary().getDate());

	}

}
