package com.keyin.entities;

import jakarta.persistence.*;

@Entity
public class BinaryTree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String inputNumbers;

//    @Column(nullable = false, columnDefinition = "TEXT")
    @OneToOne(cascade = CascadeType.ALL)
//    private Node treeStructure;
    private Node root;

    public BinaryTree() {

    }

    public BinaryTree(Long id, String inputNumbers, Node root) {
        this.id = id;
        this.inputNumbers = inputNumbers;
        this.root = root;
//        this.treeStructure = treeStructure;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInputNumbers() {
        return inputNumbers;
    }

    public void setInputNumbers(String inputNumbers) {
        this.inputNumbers = inputNumbers;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    //    public Node getTreeStructure() {
//        return treeStructure;
//    }
//
//    public void setTreeStructure(Node treeStructure) {
//        this.treeStructure = treeStructure;
//    }
}
