package com.keyin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keyin.controller.BinaryTreeController;
import com.keyin.entities.BinaryTree;
import com.keyin.entities.Node;
import com.keyin.service.BinaryTreeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BinaryTreeController.class)
public class TreeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BinaryTreeService treeService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testGetPreviousTrees() throws Exception {
        Node root = new Node(3);
        root.setLeft(new Node(1));
        Node right = new Node(5);
        right.setLeft(new Node(4));
        right.setRight(new Node(11));
        root.setRight(right);

        List<BinaryTree> expectedTrees = Arrays.asList(
                new BinaryTree(null, "[3, 5, 11, 4, 1]", root)
        );

        when(treeService.getAllTrees()).thenReturn(expectedTrees);

        mockMvc.perform(get("/api/trees/previousTrees"))
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(expectedTrees)));
    }
}
