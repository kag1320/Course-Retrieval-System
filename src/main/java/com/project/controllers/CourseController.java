package com.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entities.Course;
import com.project.services.CourseServiceImpl;

@RestController
public class CourseController {

	@Autowired
	CourseServiceImpl courseServiceImpl;

	@GetMapping("/course/{name}")
	public Course getCourseByName(@PathVariable String name) {
		return this.courseServiceImpl.getCourseByName(name);
	}

	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return this.courseServiceImpl.getAllCourses();
	}

	@GetMapping("/courses/grade/{grade}")
	public List<Course> getCoursesByGrade(@PathVariable String grade) {
		return this.courseServiceImpl.getCoursesByGrade(grade);
	}

	@GetMapping("/courses/dep/{department}")
	public List<Course> getCoursesByDepartment(@PathVariable String department) {
		return this.courseServiceImpl.getCoursesByDepartment(department);
	}

	@GetMapping("/courses/sem/{semester}")
	public List<Course> getCoursesBySemester(@PathVariable int semester) {
		return this.courseServiceImpl.getCoursesBySemester(semester);
	}

	@GetMapping("/courses/sem/{semester}/dep/{department}")
	public List<Course> getCoursesBySemesterAndDepartment(@PathVariable int semester, @PathVariable String department) {
		return this.courseServiceImpl.getCoursesBySemesterAndDepartment(semester, department);
	}
	
	@GetMapping("/courses/sem/{semester}/grade/{grade}")
	public List<Course> getCoursesBySemesterAndGrade(@PathVariable int semester, @PathVariable String grade) {
		return this.courseServiceImpl.getCoursesBySemesterAndGrade(semester, grade);
	}
	
	@GetMapping("/courses/dep/{department}/grade/{grade}")
	public List<Course> getCoursesByDepartmentAndGrade(@PathVariable String department, @PathVariable String grade) {
		return this.courseServiceImpl.getCoursesByDepartmentAndGrade(department, grade);
	}
	
	@GetMapping("/courses/sem/{semester}/dep/{department}/grade/{grade}")
	public List<Course> getCoursesBySemesterAndDepartmentAndGrade(@PathVariable int semester, @PathVariable String department, @PathVariable String grade) {
		return this.courseServiceImpl.getCoursesBySemesterAndDepartmentAndGrade(semester, department, grade);
	}
	
	@GetMapping("/updatedCourses")
	public List<Course> getUpdatedCourses() {
		String remark = "updated";
		return this.courseServiceImpl.getUpdatedCourses(remark);
	}
	
	@GetMapping("/deletedCourses")
	public List<Course> getDeletedCourses() {
		return this.courseServiceImpl.getDeletedCourses();
	}
	
	@PostMapping("/add/courses")
	public void setCourse(@RequestBody List<Course> courseToBeAdded) {
		this.courseServiceImpl.setCourses(courseToBeAdded);
	}
	
	@PutMapping("/update/courses")
	public void updateCourses(@RequestBody List<Course> courseToBeUpdated) {
		this.courseServiceImpl.updateCourses(courseToBeUpdated);
	}
	
	@DeleteMapping("/delete/courses")
	public void deleteCourses(@RequestBody List<Integer> courseIdToBeDeleted) {
		this.courseServiceImpl.deleteCourses(courseIdToBeDeleted);
	}
	
}
