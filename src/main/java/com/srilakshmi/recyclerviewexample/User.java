package com.srilakshmi.recyclerviewexample;

class User {

    private String userName;
    private int age;

    User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }
    String getUserName() {
        return userName;
    }
    int getAge() {
        return age;
    }

    void setUserName(String userName) {
        this.userName = userName;
    }

    void setAge(int age) {
        this.age = age;
    }
}
