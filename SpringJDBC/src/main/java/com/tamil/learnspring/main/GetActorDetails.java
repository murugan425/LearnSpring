/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 20, 2015
 * @time	: 7:43:03 PM
 */
package com.tamil.learnspring.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.tamil.learnspring.dao.ActorDAO;
import com.tamil.learnspring.model.Actor;

/**
 * @author Murugan_Nagarajan
 *
 */
public class GetActorDetails {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");
		ActorDAO actorDAO = (ActorDAO) context.getBean("actorDAO");
		try {
		List<Actor> actorsList = actorDAO.getActorsList();
		for (Actor actor : actorsList) {
			System.out.println(actor);
		}
		}
		catch(DataAccessException daex) {
			System.out.println(daex.getMessage());
			System.out.println(daex.getClass());
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass());
		}
		((ClassPathXmlApplicationContext) context).close();
	}
}
