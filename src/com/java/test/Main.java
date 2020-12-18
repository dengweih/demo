package com.java.test;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Date 从1900年开始算
        Person A = new Person("张三", new Date(101, 2, 3));
        A.setLove(new Goods("apple", 3.2, Goods.Unit.cny, new Person("李四")));
        A.haveBirthday();
    }
    static class Person{
        String name;
        int age;
        Date birth;
        Goods love;
        Person(String name){
            this.name = name;
        }
        Person(String name, Date birth){
            this.name = name;
            this.birth = birth;
        }
        Person(String name, Date birth, int age){
            this.name = name;
            this.birth = birth;
            this.age = age;
        }
        void haveBirthday(){
            if (age == 0){
                Calendar calendar = Calendar.getInstance();
                Date now = calendar.getTime();
                System.out.println("生日：" + birth.toString());
                System.out.println("当前时间为：" + now.toString());
                age = now.getYear() - birth.getYear();
            }
            System.out.println(name + "过了" + age + "岁生日，并收到了来自"+ love.sender.name +"价值"+
                    love.price + love.unit + "的" + love.name + "作为生日礼物.");
        }
        void setLove(Goods goods){
            this.love = goods;
        }

    }
    static class Goods{
        enum Unit{
            dollar,
            cny,
            元
        }
        String name;
        double price;
        Person sender;
        Unit unit = Unit.cny; //单位
        Goods(String name, double price, Unit unit){
            this.name = name;
            this.price = price;
            this.unit = unit;
        }
        Goods(String name, double price, Unit unit, Person sender){
            this.name = name;
            this.price = price;
            this.unit = unit;
            this.sender = sender;
        }
        void setSender(Person sender){
            this.sender = sender;
        }
    }
}

