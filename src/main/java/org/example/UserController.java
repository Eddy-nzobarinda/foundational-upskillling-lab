package org.example;


@RestController
@RequestMapping("/api/users")
public class UserController {

    // Field injection with @Autowired
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }
//
    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }
}
