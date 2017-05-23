/**
 * 
 */
package com.doj.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.doj.app.config.AppConfig;
import com.doj.app.service.TransferService;

/**
 * @author Manzoor Alam
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));//Reading from file system
		//BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));//Reading from class path
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		//TransferService transferService = (TransferService) applicationContext.getBean("transferService");
		TransferService transferService = applicationContext.getBean(TransferService.class);
		TransferService transferService2 = applicationContext.getBean(TransferService.class);
		System.out.println(transferService == transferService2);
		/*AccountRepository a1 = applicationContext.getBean(AccountRepository.class);
		AccountRepository a2 = applicationContext.getBean(AccountRepository.class);
		System.out.println(a1==a2);*/
		//TransferService transferService =  applicationContext.getBean(TransferService.class);
		transferService.transfer("A", "B", 3000.1);
	}

}
