public class User {
    String name, email, password;
    String role; // customer or repairer

    public User(String name, String email, String password, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
