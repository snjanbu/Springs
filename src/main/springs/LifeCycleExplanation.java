package main.springs;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;

public class LifeCycleExplanation implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean,String beanName){
		System.out.println("BeanName Before Initialization "+beanName);
		return bean;
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean,String beanName){
		System.out.println("BeanName After Initialization "+beanName);
		return bean;
	}
	
}
