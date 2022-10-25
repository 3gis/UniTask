import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 56130
 */
public class User {

    int id;
    String firstName;
    String lastName;
    int age;
    String profession;
    ArrayList<User> children = new ArrayList<>();

    public User(int id, String firstName, String lastName, int age, String profession) {

  
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;

    }

    public String getChildName(User child) throws Exception {
        if (!this.children.contains(child)) {
            throw new Exception("Invalid argument!");
        } else {
            String name = "";
            if (child.getFirstName() != null) {
                name = child.getFirstName();
            }
            if (name.equals("Harry")) {
                name = name.replace('r', 'p');
            }
            return name.concat(child.getLastName());
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
