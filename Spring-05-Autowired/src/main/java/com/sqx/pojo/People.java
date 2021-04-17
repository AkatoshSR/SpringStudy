package com.sqx.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class People {
    @Autowired
    @Qualifier("dog111")
    private Dog dog;
    @Autowired
    @Qualifier("cat111")
    /*
    * @Autowired：只要自动装配的属性在IOC容器中，Autowired注解可以依照byType（当类型大于1时依照byName）自动装配
    * @Qualifier：根据id装配，常与Autowired配合使用
    *
    * 
    */
    private Cat cat;
    private String name;

    public People() {
    }

    public People(Dog dog, Cat cat, String name) {
        this.dog = dog;
        this.cat = cat;
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }

    @Override
    public String toString() {
        return "People{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }
}
