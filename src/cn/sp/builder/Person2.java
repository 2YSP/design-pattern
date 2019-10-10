package cn.sp.builder;

import java.util.Date;

/**
 * 重叠构造器模式
 * Created by 2YSP on 2019/10/10.
 */
public class Person2 {

  private int age;

  private String name;

  private Date birthday;

  private String sex;

  private String phone;
  
  
  public Person2(String name,Date birthday){
    this.Person2(name,birthday,18);
  }

  public void Person2(String name, Date birthday, int age) {
    this.Person2(name,birthday,age,"man");
  }

  public void Person2(String name, Date birthday, int age, String sex) {
    this.Person2(name,birthday,age,sex,"110");
  }

  public void Person2(String name, Date birthday, int age, String sex, String phone) {
    this.name = name;
    this.birthday = birthday;
    this.age = age;
    this.sex = sex;
    this.phone = phone;
  }

}
