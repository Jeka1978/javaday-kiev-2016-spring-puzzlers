package org.javaday.iLoveInterfaces;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by Evegeny on 21/05/2016.
 */
//@Component
public class PostConstructIvikerFromInterfaceBFPP implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
       /* String[] names = beanFactory.getBeanDefinitionNames();
        for (String name : names) {
            AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) beanFactory.getBeanDefinition(name);
            String beanClassName = beanDefinition.getBeanClassName();
            if (beanClassName == null) {
                beanClassName = ПалкаКовырялкаUtil.resolveClassNameFromJavaConfig(beanDefinition);
            }
            Class<?> beanClass = ClassUtils.resolveClassName(beanClassName, ClassLoader.getSystemClassLoader());
            Class<?>[] allInterfacesForClass = ClassUtils.getAllInterfacesForClass(beanClass);
            for (Class<?> ifc : allInterfacesForClass) {
                Method[] methods = ifc.getMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(PostConstruct.class)) {
                        beanDefinition.setInitMethodName(method.getName());
                    }
                }
            }
        }*/
    }
}








