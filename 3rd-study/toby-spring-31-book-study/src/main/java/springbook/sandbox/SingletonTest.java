package springbook.sandbox;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springbook.user.dao.DaoFactory;
import springbook.user.dao.UserDao;
 
public class SingletonTest {
	public static void main(String[] args) {
        // 리스트 1-20 직접 생선한 DaoFactory 오브젝트 출력 코드
        DaoFactory factory = new DaoFactory();
        UserDao dao1 = factory.userDao();
        UserDao dao2 = factory.userDao();

        System.out.println(dao1);
        System.out.println(dao2);

        // 리스트 1-21 스프링 컨텍스트로부터 가져온 오브젝트 출력 코드
        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);

		System.out.println(context.getBean(UserDao.class));
		System.out.println(context.getBean(UserDao.class));
	}
}