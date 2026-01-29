package org.tutorial;

public class Developer {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    private App app;

    public Developer() {
        System.out.println("developer created!");
        this.age = 10;
    }
    public void doSomething() {
        System.out.println("dev doing something");
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }
}
