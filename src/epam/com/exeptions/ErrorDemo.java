package epam.com.exeptions;


/**
 * Created by ermek on 3/12/17.
 */
public class ErrorDemo {

    public void method1() {
        this.method2();
    }


    public void method2() {
        this.method1();
    }


    public void validate(int age) throws InvalidAgeException {
        if (age < 21) {
            throw new InvalidAgeException("age is not valid");
        } else {
            System.out.println("user passed age validation");
        }
    }
}
