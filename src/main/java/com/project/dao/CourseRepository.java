package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{
	
	public Course findByName(String name);
	
	public List<Course> findByGrade(String grade);
	
	public List<Course> findByDepartment(String department);
	
	public List<Course> findBySemester(int semester);
	
	public List<Course> findBySemesterAndDepartment(int semester, String department);
	
	public List<Course> findBySemesterAndGrade(int semester, String grade);
	
	public List<Course> findByDepartmentAndGrade(String department, String grade);
	
	public List<Course> findBySemesterAndDepartmentAndGrade(int semester, String department, String grade);
	
	public List<Course> findByRemark(String remark);
}
