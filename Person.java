import java.util.Calendar;
import java.util.Date;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;

    public Person (String name, String middleName, String familyName, int age){
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }
    public int getAge() {return age;}
    public void setAge(int age) {
        this.age = age;
    }
    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void printName() {
        System.out.println("Имя: " + name);
    }
    public void printAge() {
        System.out.println("Возраст: " + age);
    }
    public int getBornYear() {
        Calendar currentYear = Calendar.getInstance();
        int result = currentYear.getWeekYear() - age;
        return result;
    }
    @Override
    public String toString() {
        return name + " " + middleName + " " + familyName + ", Возраст: " + age ;
    }
}

