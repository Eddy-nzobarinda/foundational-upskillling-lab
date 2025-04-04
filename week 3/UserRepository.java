// UserRepository.java
@Repository
public class UserRepository {

    public User findById(Long id) {
        // Simulated database access
        return new User(id, "user" + id, "user" + id + "@example.com");
    }

    public void save(User user) {
        // Simulated database save
        System.out.println("Saving user: " + user);
    }
}