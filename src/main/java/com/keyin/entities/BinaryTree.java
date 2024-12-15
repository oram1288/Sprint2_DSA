package com.keyin.entities;

import jakarta.persistence.*;

@Entity
public class BinaryTree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String inputNumbers;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String treeStructure;

    public BinaryTree() {

    }

    public BinaryTree(Long id, String inputNumbers, String treeStructure) {
        this.id = id;
        this.inputNumbers = inputNumbers;
        this.treeStructure = treeStructure;
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

    public String getTreeStructure() {
        return treeStructure;
    }

    public void setTreeStructure(String treeStructure) {
        this.treeStructure = treeStructure;
    }
}
