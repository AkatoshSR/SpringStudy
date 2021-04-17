package com.sqx.reflection;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();

        System.out.println(person.hashCode());

        // 方式一：通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        // 方式二：forName获得
        Class c2 = Class.forName("com.sqx.reflection.Student");
        System.out.println(c2.hashCode());

        // 方式三：通过类名.class获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        // 方式四：基本数据类型的包装类都有一个Type属性
        Class c4 = Integer.TYPE;
        System.out.println(c4.hashCode());

        // 获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5.hashCode());


    }
}

class Person{

}

class Student extends Person{

}
