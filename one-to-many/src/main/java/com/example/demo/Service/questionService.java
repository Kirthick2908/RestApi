package com.example.demo.Service;

public class questionService {
	package com.review1.project.Service;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.review1.project.Model.question;
	import com.review1.project.Repository.questionRepo;

	@Service
	public class questionService 
	{
		@Autowired
		public questionRepo obj;
		public question addStudent(question smodel)
		{
			return obj.save(smodel);
		}
		public List<question>getStudent()
		{
			return obj.findAll();
		}
		public question putData(question smodel)
		{
			return obj.saveAndFlush(smodel);
		}
	   public void deletedata(int studentid)
	   {
		   obj.deleteById(studentid);
	   }

	}
}
