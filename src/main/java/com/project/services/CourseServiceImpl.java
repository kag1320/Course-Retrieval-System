package com.project.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.CourseRepository;
import com.project.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	private static List<Course> deletedCourses = new ArrayList<>();

	/**
	 * GET Methods
	 */
	@Override
	public Course getCourseByName(String name) {
		Course course = null;
		course = this.courseRepository.findByName(name);
		return course;
	}

	@Override
	public List<Course> getAllCourses() {
		List<Course> courses = (List<Course>) this.courseRepository.findAll();
		return courses;
	}

	@Override
	public List<Course> getCoursesByGrade(String grade) {
		List<Course> coursesByGrade = new ArrayList<>();
		coursesByGrade = this.courseRepository.findByGrade(grade);
		return coursesByGrade;
	}

	@Override
	public List<Course> getCoursesByDepartment(String department) {
		List<Course> coursesByDep = new ArrayList<>();
		coursesByDep = this.courseRepository.findByDepartment(department);
		return coursesByDep;
	}

	@Override
	public List<Course> getCoursesBySemester(int semester) {
		List<Course> coursesBySem = new ArrayList<>();
		coursesBySem = this.courseRepository.findBySemester(semester);
		return coursesBySem;
	}

	@Override
	public List<Course> getCoursesBySemesterAndDepartment(int semester, String department) {
		List<Course> coursesBySemAndDep = new ArrayList<>();
		coursesBySemAndDep = this.courseRepository.findBySemesterAndDepartment(semester, department);
		return coursesBySemAndDep;
	}

	@Override
	public List<Course> getCoursesBySemesterAndGrade(int semester, String grade) {
		List<Course> coursesBySemAndGrade = new ArrayList<>();
		coursesBySemAndGrade = this.courseRepository.findBySemesterAndGrade(semester, grade);
		return coursesBySemAndGrade;
	}

	@Override
	public List<Course> getCoursesByDepartmentAndGrade(String department, String grade) {
		List<Course> coursesByDepAndGrade = new ArrayList<>();
		coursesByDepAndGrade = this.courseRepository.findByDepartmentAndGrade(department, grade);
		return coursesByDepAndGrade;
	}

	@Override
	public List<Course> getCoursesBySemesterAndDepartmentAndGrade(int semester, String department, String grade) {
		List<Course> coursesBySemAndDepAndGrade = new ArrayList<>();
		coursesBySemAndDepAndGrade = this.courseRepository.findBySemesterAndDepartmentAndGrade(semester, department,
				grade);
		return coursesBySemAndDepAndGrade;
	}

	@Override
	public List<Course> getUpdatedCourses(String remark) {
		List<Course> updatedCourses = new ArrayList<>();
		updatedCourses = this.courseRepository.findByRemark(remark);
		return updatedCourses;
	}

	@Override
	public List<Course> getDeletedCourses() {
		return deletedCourses;
	}

	/**
	 * POST Methods
	 */
	@Override
	public void setCourses(List<Course> courseToBeAdded) {
		this.courseRepository.saveAll(courseToBeAdded);
	}

	/**
	 * PUT Methods
	 */
	@Override
	public void updateCourses(List<Course> coursesToBeUpdated) {
		this.courseRepository.saveAll(coursesToBeUpdated);
	}

	/**
	 * DELETE Methods
	 */
	@Override
	public void deleteCourses(List<Integer> coursesIdToBeDeleted) {
		this.courseRepository.deleteAllById(coursesIdToBeDeleted);
	}

}
