package org.javaday.iLoveInterfaces.utility;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.type.classreading.MethodMetadataReadingVisitor;

import java.lang.reflect.Field;

/**
 * Created by Evegeny on 16/05/2016.
 */
//@Component
public class ПалкаКовырялкаUtil implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
     /*   String[] names = beanFactory.getBeanDefinitionNames();
        for (String name : names) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
            String beanClassName = beanDefinition.getBeanClassName();
            if (beanClassName == null) {

                beanClassName = resolveClassNameFromJavaConfig(beanDefinition);
            }
            Class<?> beanClass = ClassUtils.resolveClassName(beanClassName, ClassLoader.getSystemClassLoader());
            Class<?>[] allInterfaces = ClassUtils.getAllInterfacesForClass(beanClass);
            for (Class<?> ifc : allInterfaces) {
                Method[] methods = ifc.getMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(PostConstruct.class)) {
                        ((AbstractBeanDefinition) beanDefinition).setInitMethodName(method.getName());
                    }
                }
            }
        }*/
    }

    public static String resolveClassNameFromJavaConfig(BeanDefinition beanDefinition) {
        try {
            Object reader = Class.forName("org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader$ConfigurationClassBeanDefinition")
                    .cast(beanDefinition);
            Field field = reader.getClass().getDeclaredField("factoryMethodMetadata");
            field.setAccessible(true);
            MethodMetadataReadingVisitor visitor = (MethodMetadataReadingVisitor) field.get(reader);
            return visitor.getReturnTypeName();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
