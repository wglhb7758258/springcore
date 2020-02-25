package eeWAR;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.aspectj.GenericInterfaceDrivenDependencyInjectionAspect;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luban.app.IndexService;

import App.Appconfig;


@Controller()
@RequestMapping("test")
public class test {

	public static void main(String[] args) {
		//spring中默认单例支持循环依赖
		//1.初始化spring容器，将属性注入(依赖注入)
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		//2.springbean对象有完整生命周期
		IndexService indexService =ac.getBean(IndexService.class);
		System.out.println(indexService);
		indexService.getService();
		//ac.getBean(IndexService.class).getService();
		
	/*	GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
		genericBeanDefinition.setBeanClass(IndexService.class);
		genericBeanDefinition.setBeanClassName(beanClassName);
		genericBeanDefinition.setScope("prototype");//bean的作用域
		
		Map map = new HashMap<>();
		map.put("bean1", genericBeanDefinition);
		List<string>.add(xxx);*/
	}
	//15分
	//普通java类---编译成class---加载到jvm内存中
	//springbean---扫描包名拿到所有的类---new一个对象(GenericBeanDefiniiton)存储类的源信息、注解和配置信息等---该对象会存储到一个map中------会被放到一个单例池中
	
//了解源码是为了扩展
}
