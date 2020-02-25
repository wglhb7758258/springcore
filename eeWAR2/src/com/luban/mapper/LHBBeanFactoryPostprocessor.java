package com.luban.mapper;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

import com.luban.app.IndexService;
import com.luban.app.UserService;

@Component
public class LHBBeanFactoryPostprocessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanfactory)
			throws BeansException {
		System.out.println("laile");
		//子类对象方法更多
		GenericBeanDefinition indexservice=(GenericBeanDefinition) beanfactory.getBeanDefinition("indexService");
		indexservice.setBeanClass(UserService.class);
		
	}

}
