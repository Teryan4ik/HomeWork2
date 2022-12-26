package app;


public class Employee {

   private String FullName;
   private String position;
   private String email;
   private String phone;
   private int age;


    public Employee(String fullName, String position, String email, String phone, int age) {
        this.FullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }
    public String getFullName() {
        return FullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
}
