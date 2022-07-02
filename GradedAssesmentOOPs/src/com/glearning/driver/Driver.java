/**
 * 
 */
package com.glearning.driver;

import com.glearning.service.AdminDept;
import com.glearning.service.HRDept;
import com.glearning.service.TechDept;

/**
 * @author Aravind samy
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HRDept hrDept = new HRDept();
		TechDept techDept = new TechDept();
		AdminDept adminDept = new AdminDept();

		// Printing Admin Dept Properties
		System.out.println("\n Welcome to" + adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		
		// Printing HR Dept Properties
		System.out.println("\n Welcome to" + hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayAHoliday());		
		
		// Printing Tech Dept Properties
		System.out.println("\n Welcome to" + techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());

	}

}
