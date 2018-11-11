package com.coders.istanbul.withmockmvc.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void it_should_get_user_by_id() throws Exception {
        //Arrange
        final Long userId = 1L;

        //Act
        ResultActions result = mockMvc.perform(get("/users/" + userId)
                .contentType(MediaType.APPLICATION_JSON));

        //Assert
        result.andExpect(status().is2xxSuccessful());
        result.andExpect(jsonPath("$.id").value(1));
        result.andExpect(jsonPath("$.userName").value("enes.acikoglu"));
        result.andExpect(jsonPath("$.mail").value("enes.acikoglu@gmail.com"));
    }
}