package m99.redisdemo.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import m99.redisdemo.dao.IStudentDao;
import m99.redisdemo.model.Student;

@Component
public class RunnerDemo implements CommandLineRunner {

	@Autowired
	private IStudentDao dao;

	@Override
	public void run(String... args) throws Exception {
		dao.add(new Student(101, "AMN", 500.25));
		dao.add(new Student(102, "NWL", 500.25));
		dao.add(new Student(103, "GLJR", 500.25));

		dao.getAll().forEach((k,v) -> {
			System.out.println(k + "---" + v);
		});

		dao.remove(102);
		dao.modify(new Student(103, "GUL", 501.01));

		System.out.println("After modification");
		dao.getAll().forEach((k,v) -> {
			System.out.println(k + "---" + v);
		});
	}

}
