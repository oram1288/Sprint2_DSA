package com.keyin.service;

import com.keyin.entities.BinaryTree;
import com.keyin.entities.Node;
import com.keyin.repository.BinaryTreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BinaryTreeService {

    @Autowired
    private BinaryTreeRepository treeRepository;

    public BinaryTree processNumbers(List<Integer> numbers) {
        Node root = null;
        for (int num : numbers) {
            root = insertNode(root, num);
        }
        String treeStructure = serializeTree(root);

        BinaryTree tree = new BinaryTree(null, numbers.toString(), treeStructure);
        return treeRepository.save(tree);
    }

    public List<BinaryTree> getAllTrees() {
        return treeRepository.findAll();
    }

    private Node insertNode(Node root, int value) {
        if (root == null) return new Node(value);
        if (value < root.getValue()) root.setLeft(insertNode(root.getLeft(), value));
        else root.setRight(insertNode(root.getRight(), value));
        return root;
    }

    private String serializeTree(Node root) {
        if (root == null) return "null";
        return root.getValue() + "," + serializeTree(root.getLeft()) + "," + serializeTree(root.getRight());
    }

}
