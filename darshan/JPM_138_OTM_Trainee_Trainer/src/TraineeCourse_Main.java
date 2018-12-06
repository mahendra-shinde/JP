import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.jp.entities.Course;
import com.jp.entities.Trainee;
import com.jp.util.JPAUtil;

public class TraineeCourse_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager  em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		Trainee t1 = new Trainee();
		
		
		t1.setTraineeId(501L);
		t1.setTraineeName("Amit");
		
		Trainee t2 = new Trainee();
		
		
		t2.setTraineeId(502L);
		t2.setTraineeName("Sunil");
		
		Trainee t3 = new Trainee();
		
		
		t3.setTraineeId(503L);
		t3.setTraineeName("Rohit");
		
		Trainee t4 = new Trainee();
		
		
		t4.setTraineeId(504L);
		t4.setTraineeName("Anil");
		
		Trainee t5 = new Trainee();
		
		
		t5.setTraineeId(505L);
		t5.setTraineeName("Ritesh");
		
		Trainee t6 = new Trainee();
		
		
		t6.setTraineeId(506L);
		t6.setTraineeName("Viral");
		
		Set<Trainee> trnList1 = new HashSet<>();
				
		trnList1.add(t1);
		trnList1.add(t2);
		trnList1.add(t3);
		trnList1.add(t4);
		trnList1.add(t5);
		trnList1.add(t6);
		
		Set<Trainee> trnList2 = new HashSet<>();
		
		trnList2.add(t1);
		trnList2.add(t2);
		trnList2.add(t3);
		
		
		
		Course c1 = new Course();
		c1.setCourseId(101L);
		c1.setCourseName("Java");
		c1.setTrainerName("OP");
		
		Course c2 = new Course();
		c2.setCourseId(102L);
		c2.setCourseName("Angular JS");
		c2.setTrainerName("Smita");
		
				
		Set<Course> crsList = new HashSet<>();
						
		c1.setTrainee(trnList1);
		c2.setTrainee(trnList2);
		
										
		em.persist(c1);
		em.persist(c2);
		em.getTransaction().commit();
		em.close();
		
		

	}

}
