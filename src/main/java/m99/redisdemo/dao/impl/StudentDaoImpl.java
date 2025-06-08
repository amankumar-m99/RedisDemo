package m99.redisdemo.dao.impl;

import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Repository;

import jakarta.annotation.Resource;
import m99.redisdemo.dao.IStudentDao;
import m99.redisdemo.model.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {

	private final String KEY = "STUDENT";

	@Resource(name = "rt")
	//<ref type, key type, val type>
	private HashOperations<String, Integer, Student> hashOperations;

	@Override
	public void add(Student student) {
		hashOperations.putIfAbsent(KEY, student.getStdId(), student);
	}

	@Override
	public void modify(Student student) {
		hashOperations.put(KEY, student.getStdId(), student);
	}

	@Override
	public Student getOne(Integer id) {
		return hashOperations.get(KEY, id);
	}

	@Override
	public Map<Integer, Student> getAll() {
		return hashOperations.entries(KEY);
	}

	@Override
	public void remove(Integer id) {
		hashOperations.delete(KEY, id);
	}

}
