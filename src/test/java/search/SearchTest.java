package search;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

public class SearchTest {

	@Test
	public void test() {
		SessionFactory sessionFactory = createSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Persone user = new Persone("test", "test", "0-0-0", "abc", PersoneStatusEnum.User);
		session.save(user);

		session.getTransaction().commit();
		session.close();
	}
	
	private SessionFactory createSessionFactory() {
	    Configuration configuration = new Configuration();
	    configuration.configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
				.getBootstrapServiceRegistry();
		return configuration.buildSessionFactory(serviceRegistry);
	}

}
