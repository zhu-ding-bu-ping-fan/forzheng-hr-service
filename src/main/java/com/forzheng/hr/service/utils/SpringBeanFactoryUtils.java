package com.forzheng.hr.service.utils;

/**
 * Created by ls on 2018/1/22.
 */
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanFactoryUtils implements ApplicationContextAware {    
	private static ApplicationContext appCtx;    
	/**  
	 * 此方法可以把ApplicationContext对象inject到当前类中作为一个静态成员变量。  
	 * @param applicationContext ApplicationContext 对象.  
	 * @throws BeansException  
	 */    
	@Override
	public void setApplicationContext( ApplicationContext applicationContext ) throws BeansException {    
		appCtx = applicationContext;    
	}  

	/** 
	 * 获取ApplicationContext 
	 * @return 
	 */  
	public static ApplicationContext getApplicationContext(){  
		return appCtx;  
	}  

	/**  
	 * 快速得到一个BEAN  
	 * @param beanName bean的名字  
	 * @return 返回一个bean对象   
	 */    
	public static Object getBean( String beanName ) {    
		return appCtx.getBean( beanName );    
	} 
	/**
	 * 快速得到一个BEAN  
	 * @param clazz bean的类型
	 * @return
	 */
	public static <T> T getBean(Class<T> clazz){  
		return appCtx.getBean(clazz);  
	} 
}
