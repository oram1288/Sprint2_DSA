package com.keyin;

import com.keyin.service.BinaryTreeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TreeTests {

    @Autowired
    private BinaryTreeService treeService;

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
