package com.example.demo.service;

import com.example.demo.repo.FakeRepo;
import org.junit.jupiter.api.Test;

public class UserServiceTests {

    @Test
    public void testAddUser() {
        UserService userService = new UserServiceImpl(new FakeRepo());
        userService.addUser("Tsakane", "Makhubele");
    }

}
@Test
public void testGetUser() {
    UserServiceImpl service = new UserServiceImpl(new FakeRepo());
    service.addUser("Gabaza", "Makhubele");
    service.getUser(1);
}
