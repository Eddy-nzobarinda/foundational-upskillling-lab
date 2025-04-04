// UserService.java
package org.example.week3;
@Service
public class UserService {

    private final UserRepository userRepository;

    // Constructor injection - This is where DI happens
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long id) {
        return userRepository.findById(id);
    }

    public void createUser(User user) {
        userRepository.save(user);
    }
}