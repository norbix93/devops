package at.nacs.devopscontinuousintegration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.Assert.assertEquals;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class MessageEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;

    String url = "/";

    @Test
    void get() {
        String actual = restTemplate.getForObject(url, String.class);
        String expected = "I am living the dream!";
        assertEquals(expected, actual);
    }
}