package com.cisc181.core;
import java.util.*;
public class Semester {
	private UUID SemsterId;
	private Date StartDate;
	private Date EndDate;
	public Semester(UUID semsterId, Date startDate, Date endDate) {
		super();
		SemsterId = semsterId;
		StartDate = startDate;
		EndDate = endDate;
	}
	
}
