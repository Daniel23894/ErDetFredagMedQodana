package com.example.thymeleafopgaveerdetfredag.controller;

import com.example.thymeleafopgaveerdetfredag.controller.FridayController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(FridayController.class)
class FridayControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void setUp(){

    }

    @AfterEach
    void tearDown(){

    }

    @Test
    public void simpleTest() {
        System.out.println("Test runs!");
    }

    @Test
    public void testWelcome()throws Exception{
        mockMvc.perform(get("/friday"))
                .andExpect(status().isOk())
                .andExpect(view().name("friday"));
    }


}