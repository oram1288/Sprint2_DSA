package com.keyin;

import com.keyin.entities.BinaryTree;
import com.keyin.entities.Node;
import com.keyin.repository.BinaryTreeRepository;
import com.keyin.service.BinaryTreeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class TreeTests {

    @Mock
    private BinaryTreeRepository treeRepository;

    @InjectMocks
    private BinaryTreeService treeService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testProcessNumbers() {
        List<Integer> numbers = Arrays.asList(3, 5, 11, 4, 1);
        BinaryTree result = treeService.processNumbers(numbers);

        assertNotNull(result);
        assertNotNull(result.getRoot());
    }

//    @Test
//    public void testProcessNumbers() {
//        List<Integer> numbers = List.of(5, 3, 8, 1, 4);
//        BinaryNode treeEntity = treeService.processNumbers(numbers);
//        assertNotNull(treeEntity.getLeft());
//    }
//
//    @Test
//    public void testGetAllTrees() {
//        List<TreeEntity> trees = treeService.getAllTrees();
//        assertNotNull(trees);
//    }

//    @Test
//    public void testCreateTreeWithEmptyInput() {
//        List<Integer> numbers = Collections.emptyList();
//
//        TreeEntity result = treeService.processNumbers(numbers);
//
//        assertNotNull(result);
//        assertTrue(result.getInputNumbers().isEmpty());
//        assertEquals("", result.getTreeStructure());
//    }

//    @Test
//    public void testTreeSerialization() {
//        List<Integer> numbers = List.of(10, 6, 15);
//        TreeEntity treeEntity = treeService.processNumbers(numbers);
//        String expectedTree = "10,6,null,null,15,null,null";
//        assertEquals(expectedTree, treeEntity.getTreeStructure());
//    }
}
