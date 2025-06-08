package m99.redisdemo.dao;

import java.util.Map;

import m99.redisdemo.model.Student;

public interface IStudentDao {

	void add(Student student);
	void modify(Student student);
	Student getOne(Integer id);
	Map<Integer, Student> getAll();
	void remove(Integer id);
}
