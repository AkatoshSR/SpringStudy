package com.sqx.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // @Component：定义一个组件被Spring托管，相当于<bean id="user" class="com.sqx.pojo.User"/>
@Scope("Singleton")
public class User {

    @Value("sqx") // @Value 赋值 相当于<property name="name" value="sqx"/>，也可以在Setter上注入
    private String name;

    public String getName() {
        return name;
    }
}
