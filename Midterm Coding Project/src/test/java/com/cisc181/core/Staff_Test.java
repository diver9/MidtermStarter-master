package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

import java.util.Date;
public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() throws PersonException{
			ArrayList<Staff> LStaff = new ArrayList<Staff>();
			Staff A = new Staff("A", "A", "A", new Date(1996, 12, 2), "A",
					"1234567890", "A@gmail.com", "None", 1, 5000.00, new Date(2000, 1, 1), eTitle.MS);
			LStaff.add(A);

			Staff B = new Staff("B", "B", "B", new Date(1998, 12, 2),
					"B", "1234567890", "B@gmail.com", "None", 2, 4000.00,
					new Date(2000, 1, 1), eTitle.MS);
			LStaff.add(B);

			Staff C = new Staff("C", "C", "C", new Date(2000, 2, 2), "C",
					"1234567890", "C@gmail.com", "None", 3, 3000.00, new Date(2000, 1, 1), eTitle.MS);
			LStaff.add(C);

			Staff D = new Staff("D", "D", "D", new Date(2002, 2, 2),
					"D", "1234567890", "D@gmail.com", "None", 4, 2000.00,
					new Date(2000, 1, 1), eTitle.MS);
			LStaff.add(D);

			Staff E = new Staff("E", "E", "E", new Date(2002, 2, 2),
					"E", "1234567890", "E@gmail.com", "None", 5, 1000.00,
					new Date(2001, 1, 1), eTitle.MS);
			LStaff.add(E);

			double total = 0;
			for (Staff m : LStaff) {
				total += m.getSalary();
			}
			total /= 5;

			int t = (int) total;

			assertEquals(t, 3000);
		
	}	

}
