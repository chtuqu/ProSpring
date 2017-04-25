package com.chtuqu.prospring.ch3.bean_factory.properties;

import com.chtuqu.prospring.ch3.bean_factory.model.Oracle;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class PropertiesConfigWithBeanFactory {
    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        PropertiesBeanDefinitionReader reader = new PropertiesBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource("META-INF/spring/ch3/bean_factory/properties/props-bean-factory-config.properties"));

        Oracle oracle = factory.getBean("oracle", Oracle.class);
        System.out.println(oracle.defineMeaningOfLife());
    }
}
