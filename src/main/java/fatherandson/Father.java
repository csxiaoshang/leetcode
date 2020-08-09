package main.java.fatherandson;

/**
 * @Author 北集
 * @Date 2020/7/24 15:16
 * @Description:
 */
public class Father {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    private String name;

    private int age;

    public int sex;

    @Override
    public String toString() {
        return "Father{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", sex=" + sex +
            '}';
    }
}
