public class Students {
	private String name, gender;
     private int age;
   

 public Students(String name, int age, String gender) {
     this.name = name;
     this.age = age;
     this.gender = gender;
 }


public String getName() { return name; }
public int getAge() { return age; }
public String getGender() { return gender; }


public String toString() {
	return "Студент: "+name+" пол: "+gender+" возраст: "+age;  }

}
