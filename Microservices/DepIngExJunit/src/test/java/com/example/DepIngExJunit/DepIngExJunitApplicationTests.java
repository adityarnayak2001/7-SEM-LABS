package com.example.DepIngExJunit;
import com.example.DepIngExJunit.controller.DepIngExJunitController;
import com.example.DepIngExJunit.service.GreetingService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@SpringBootTest

public class DepIngExJunitApplicationTests {

    ////********* Testing using Mockito *************//
    @Mock
    private GreetingService greetingService;
    @InjectMocks
	//@InjectMock creates an instance of the class and 
	//injects the mocks that are marked with the annotations @Mock into it
    private DepIngExJunitController depController;
    @BeforeEach
    void setMockOutput() {
        when(greetingService.greet()).thenReturn("Dependency Injection & Testing");
    }
    @Test
    public void shouldReturnDefaultMessage() {
        String response = depController.home();
        assertThat(response).isEqualTo("Dependency Injection & Testing!!");
    }

    //***********  Junit Test  ************//

    @Test
    public void testGreeting() {
        String greeting = depController.home();
        assertEquals(greeting, "Dependency Injection & Testing");    //assertEquals(expected, actual)
    }

}