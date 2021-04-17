package com.sqx.demo02;

public class UserServiceProxy implements UserService{

    private UserService userService;

    // 选择器
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    private void log(String str){
        System.out.println("日志：" + str);
    }
}
