import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<User> myArrayList = new ArrayList<User>();
        String UserName = null;
        int UserAge = 0;
        for (int i = 1; i <= 5; i++ ) {
            System.out.println("Введите имя пользователя " + i + ":");
            UserName = in.nextLine();
            System.out.println("Введите возраст пользователя " + i + ":");
            UserAge = in.nextInt();
            User human = new User(UserName, UserAge);
            myArrayList.add(human);
            in.nextLine();
            
        }
         Collections.sort(myArrayList, new Comparator<User>() {
            public int compare (User human1, User human2) {
                return human1.getAge()-(human2.getAge());
            }
         });
         for (User human : myArrayList) {
            System.out.println(human.toString());
         }
    
        
        
        
    }
}

class User {
    private String name;
    private int age;
    public User(String name, int age) {
        this.name =  name;
        this.age = age;
     }
    public void setName(String UserName){
        name = UserName;
        
    }
    public String getName(){
        return name;
    }
    public void setAge(int UserAge) {
        age = UserAge;
    }
    public int getAge() {
        return age;
    }

    public String toString() {
        return (name + "," + " возраст " + age + " лет");

    }
}
