package CustomExceptions.user;

import CustomExceptions.exception.AuthenticationFailedException;

public class UserService {

    public void login(String username, String password)
            throws AuthenticationFailedException {

        if (!username.equals("admin") || !password.equals("345")) {
            throw new AuthenticationFailedException("Invalid credentials");
        }

        System.out.println("Login successful");
    }
}