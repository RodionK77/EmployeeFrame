public class Employee {
    private String name;
    private String age;
    private String position;

    Employee(){
        this.name = "-";
        this.age = "-";
        this.position = "-";
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(String age){
        this.age = age;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getName(){
        return this.name;
    }
    public String getAge(){
        return this.age;
    }
    public String getPosition(){
        return this.position;
    }

    public String toString(){
        return "Имя: " + name + "\nВозраст: " + age + "\nДолжность: " + position;
    }
}
