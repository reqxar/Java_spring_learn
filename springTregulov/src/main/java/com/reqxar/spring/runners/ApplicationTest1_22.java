package com.reqxar.spring.runners;

import com.reqxar.spring.config.HandleApplicationConfig;
import com.reqxar.spring.entity.Cat;
import com.reqxar.spring.entity.Dog;
import com.reqxar.spring.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ApplicationTest1_22 {

    public static void main(String[] args) {
        //Конфигурация с помощью java-кода. Ручная конфигурация зависимостей в конфиге.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HandleApplicationConfig.class);

        Cat cat = context.getBean("cat", Cat.class);
        Dog dog = context.getBean("dog", Dog.class);

        cat.say();
        dog.say();

        Person person = context.getBean("person", Person.class);
        Person person2 = context.getBean("person", Person.class);

        System.out.println(person==person2);

        person.personPetSay();
        person.getPeronInfo();

        context.close();

    }
}
