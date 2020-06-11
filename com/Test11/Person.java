//20年5月27日、6月2日课堂代码
package com.Test11;

import java.util.Objects;

public class Person implements Comparable{
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    //当向TreeSet中添加Person类的对象时，依据此方法，确定按照哪个属性排序
    @Override
    public int compareTo(Object o) {
        if (o instanceof Person){
            Person p=(Person)o;
//            return this.name.compareTo(p.name);//按照name属性从小到大排序
//            return this.age.compareTo(p.age);//按照age属性从小到大
//            return -this.age.compareTo(p.age);//按照age属性从大到小
            //先按照age排序，再按照name排序
            int i=this.age.compareTo(p.age);
            if (i==0){
                return this.name.compareTo(p.name);
            }else {
                return i;
            }
        }
        return 0;
    }
}
