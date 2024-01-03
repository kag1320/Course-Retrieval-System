package com.project.services;

import java.util.List;

import com.project.entities.Course;

public interface CourseService {
	
	public Course getCourseByName(String name);
	
	public List<Course> getAllCourses();
	
	public List<Course> getCoursesByGrade(String grade);
	
	public List<Course> getCoursesByDepartment(String department);
	
	public List<Course> getCoursesBySemester(int semester);
	
	public List<Course> getCoursesBySemesterAndDepartment(int semester, String department);
	
	public List<Course> getCoursesBySemesterAndGrade(int semester, String grade);
	
	public List<Course> getCoursesByDepartmentAndGrade(String grade, String department);
	
	public List<Course> getCoursesBySemesterAndDepartmentAndGrade(int semester, String department, String grade);

	public List<Course> getUpdatedCourses(String remark);
	
	public List<Course> getDeletedCourses();
	
	public void setCourses(List<Course> courseToBeAdded);
	
	public void updateCourses(List<Course> coursesToBeUpdated);
	
	public void deleteCourses(List<Integer> coursesIdToBeDeleted);
}