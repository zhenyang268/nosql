package com;

import com.JsonReader;

import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String args[]) throws Exception {
        //获取json文件
        JsonReader reader = new JsonReader(JsonReader.class.getClassLoader().getResource("test.json").getPath());
        fredis getjson = new fredis();

        getjson.loading();

       
        List<student>students = reader.getStudents();

        for (student s:students){
            getjson.action(s);
        }
	int flag = 1;
        int inc=1;
        while(flag==1){
            System.out.println("1.增加(默认为1)");
            System.out.println("2.设置增加量");
            System.out.println("3.显示当前总数");
            System.out.println("4.查看所有List");
            System.out.println("5.查看所有Set");
            System.out.println("6.查看所有ZSet");
            System.out.println("7.减少(默认为1)");
            System.out.println("0.退出程序");
            System.out.println("请输入对应的操作序号：");

            Scanner input=new Scanner(System.in);
            String choice=input.nextLine();
            switch (choice){
                case "1":{
                    getjson.increase("NUM",inc);
                    System.out.println("当前系统点击数:" + getjson.getInt());
                    break;
                }
                case "2":{
                    Scanner in=new Scanner(System.in);
                    inc=Integer.valueOf(in.nextLine());
                    break;
                }
                case "3":{
                    System.out.println("当前系统点击数:" + getjson.getInt());
                    break;
                }
                case "4":{
                    System.out.println(getjson.getLIST("LIST",10));
                    break;
                }
                case "5":{
                    System.out.println(getjson.getSET("SET"));
                    break;
                }
                case "6":{
                    System.out.println(getjson.getZSET("ZSET",10));
                    break;
                }
                case "7":{
                    getjson.dec("NUM");
                    System.out.println("当前系统点击数:" + getjson.getInt());
                    break;
                }
                case "0":{
                    flag=0;
                    break;
                }
            }
        }

        
        getjson.save();
    }
}
