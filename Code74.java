//  java program to access private members of the class 
/**
 * Code74
 */
class Test {
    // private variables
    private int age;
    private String name;

    // initialize age
    public void setAge(int age) {
        this.age = age;
    }

    // initialize name
    public void setName(String name) {
        this.name = name;
    }

    // access age
    public int getAge() {
        return this.age;
    }

    // access name
    public String getName() {
        return this.name;
    }

}

/**
 * Code74
 */
public class Code74 {

    public static void main(String[] args) {
        // Crate an object of test
        Test test = new Test();
        test.setAge(20);
        test.setName("NeerajSingh");

        // get value of private variables
        System.out.println("Age : " + test.getAge());
        System.out.println("Name : " + test.getName());

    }
}
