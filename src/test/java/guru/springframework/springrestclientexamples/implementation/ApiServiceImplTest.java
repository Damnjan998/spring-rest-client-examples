package guru.springframework.springrestclientexamples.implementation;

import guru.springframework.api.domain.User;
import guru.springframework.springrestclientexamples.services.ApiService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest extends TestCase {

    @Autowired
    ApiService apiService;

    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testGetUsers() throws Exception {

        List<User> users = apiService.getUsers(3);
        assertEquals(4, users.size());
    }
}