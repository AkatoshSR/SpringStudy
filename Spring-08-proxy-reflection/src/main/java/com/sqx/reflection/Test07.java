package com.sqx.reflection;

public class Test07 {

    public static void main(String[] args) throws ClassNotFoundException {

        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // 获取系统类加载器的父类加载器，扩展类加载器
        ClassLoader extendClassLoader = systemClassLoader.getParent();
        System.out.println(extendClassLoader);

        // 获取扩展类加载器的父类加载器，根加载器(C/C++)
        ClassLoader rootClassLoader = extendClassLoader.getParent();
        System.out.println(rootClassLoader);

        // 测试当前类是由那个类加载器加载的
        ClassLoader currentClassLoader = Class.forName("com.sqx.reflection.Test07").getClassLoader();
        System.out.println(currentClassLoader);

        // 测试JDK内置的类是谁加载的
        ClassLoader jdkClassLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(jdkClassLoader);

        // 获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));

        /*
        E:\java8\jre\lib\charsets.jar;
        E:\java8\jre\lib\deploy.jar;
        E:\java8\jre\lib\ext\access-bridge-64.jar;
        E:\java8\jre\lib\ext\cldrdata.jar;
        E:\java8\jre\lib\ext\dnsns.jar;
        E:\java8\jre\lib\ext\jaccess.jar;
        E:\java8\jre\lib\ext\jfxrt.jar;
        E:\java8\jre\lib\ext\localedata.jar;
        E:\java8\jre\lib\ext\nashorn.jar;
        E:\java8\jre\lib\ext\servlet-api.jar;
        E:\java8\jre\lib\ext\sunec.jar;
        E:\java8\jre\lib\ext\sunjce_provider.jar;
        E:\java8\jre\lib\ext\sunmscapi.jar;
        E:\java8\jre\lib\ext\sunpkcs11.jar;
        E:\java8\jre\lib\ext\zipfs.jar;
        E:\java8\jre\lib\javaws.jar;
        E:\java8\jre\lib\jce.jar;
        E:\java8\jre\lib\jfr.jar;
        E:\java8\jre\lib\jfxswt.jar;
        E:\java8\jre\lib\jsse.jar;
        E:\java8\jre\lib\management-agent.jar;
        E:\java8\jre\lib\plugin.jar;
        E:\java8\jre\lib\resources.jar;
        E:\java8\jre\lib\rt.jar;
        E:\javaProjects\javaWebProjects\Spring-Study\Spring-08-proxy-reflection\target\classes;
        E:\javaWeb\maven\apache-maven-3.6.3-bin\apache-maven-3.6.3\maven-repo\org\springframework\spring-webmvc\5.3.6\spring-webmvc-5.3.6.jar;
        E:\javaWeb\maven\apache-maven-3.6.3-bin\apache-maven-3.6.3\maven-repo\org\springframework\spring-aop\5.3.6\spring-aop-5.3.6.jar;
        E:\javaWeb\maven\apache-maven-3.6.3-bin\apache-maven-3.6.3\maven-repo\org\springframework\spring-beans\5.3.6\spring-beans-5.3.6.jar;
        E:\javaWeb\maven\apache-maven-3.6.3-bin\apache-maven-3.6.3\maven-repo\org\springframework\spring-context\5.3.6\spring-context-5.3.6.jar;
        E:\javaWeb\maven\apache-maven-3.6.3-bin\apache-maven-3.6.3\maven-repo\org\springframework\spring-core\5.3.6\spring-core-5.3.6.jar;
        E:\javaWeb\maven\apache-maven-3.6.3-bin\apache-maven-3.6.3\maven-repo\org\springframework\spring-jcl\5.3.6\spring-jcl-5.3.6.jar;
        E:\javaWeb\maven\apache-maven-3.6.3-bin\apache-maven-3.6.3\maven-repo\org\springframework\spring-expression\5.3.6\spring-expression-5.3.6.jar;
        E:\javaWeb\maven\apache-maven-3.6.3-bin\apache-maven-3.6.3\maven-repo\org\springframework\spring-web\5.3.6\spring-web-5.3.6.jar;E:\idea\IntelliJ IDEA 2020.3.2\lib\idea_rt.jar

         */

    }

}
