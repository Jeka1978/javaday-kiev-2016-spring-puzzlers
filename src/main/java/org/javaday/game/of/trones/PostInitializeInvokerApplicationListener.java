package org.javaday.game.of.trones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by Jeka on 18/04/2015.
 */
@Component
public class PostInitializeInvokerApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ConfigurableListableBeanFactory factory;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext context = event.getApplicationContext();
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            BeanDefinition beanDefinition = factory.getBeanDefinition(name);
            String beanClassName = beanDefinition.getBeanClassName();
            try {
                Class<?> originalBeanClass = Class.forName(beanClassName);
                Method[] methods = originalBeanClass.getMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(PostInitialize.class)) {
                        Object bean = context.getBean(name);
                        Class<?> proxyClass = bean.getClass();
                        Method proxyClassMethod = proxyClass.getMethod(method.getName());// must be without parameters //todo throw exception here otherwise
                        proxyClassMethod.invoke(bean);
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}
