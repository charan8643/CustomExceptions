package ExceptionHandling;

public class InvalidAgeException {
    void register(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is invalid");
        }
        System.out.println("Success");
    }

    public static void main(String[] args) {
        User u = new User();
        try {
            u.register(16);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}