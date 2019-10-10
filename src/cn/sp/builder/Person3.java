package cn.sp.builder;

import java.util.Date;

/**
 * Builder模式可读性好，更加灵活
 * Created by 2YSP on 2019/10/10.
 */
public class Person3 {

  private final int age;

  private final String name;

  private final Date birthday;

  private final String sex;

  private final String phone;

  private Person3(Builder builder) {
    age = builder.age;
    name = builder.name;
    birthday = builder.birthday;
    sex = builder.sex;
    phone = builder.phone;
  }


  public static class Builder{
    // required paramter
    private final String name;

    private final Date birthday;

    // optional value
    private  int age;

    private String sex;

    private String phone;

    public Builder(String name,Date birthday){
      this.name = name;
      this.birthday = birthday;
    }

    public Builder age(int age){
      this.age = age;
      return this;
    }

    public Builder sex(String sex){
      this.sex = sex;
      return this;
    }

    public Builder phone(String phone){
      this.phone = phone;
      return this;
    }

    public Person3 build(){
      return new Person3(this);
    }
  }


  public static void main(String[] args) {
    Person3 person3 = new Builder("张三",new Date()).age(18).sex("女").phone("110").build();
    System.out.println(person3);
  }
}
