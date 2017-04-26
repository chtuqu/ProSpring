package com.chtuqu.prospring.ch3.multiple_packages;

import com.chtuqu.prospring.ch3.multiple_packages.subpkg1.SubComponent1;
import com.chtuqu.prospring.ch3.multiple_packages.subpkg2.SubComponent2;
import com.chtuqu.prospring.ch3.multiple_packages.subpkg3.SubComponent3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MultiplePackages {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/ch3/multiple_packages/context.xml");

        SubComponent1 sub1 = ctx.getBean(SubComponent1.class);
//        SubComponent2 sub2 = ctx.getBean(SubComponent2.class);
        SubComponent3 sub3 = ctx.getBean(SubComponent3.class);

        System.out.println(sub1);
//        System.out.println(sub2);
        System.out.println(sub3);
    }
}
