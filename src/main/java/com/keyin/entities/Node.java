package com.keyin.entities;

import jakarta.persistence.*;

@Entity
public class Node {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int value;

    @OneToOne(cascade=CascadeType.ALL)
    private Node left;

    @OneToOne(cascade=CascadeType.ALL)
    private Node right;


    public Node(int value) {
        this.value = value;
    }

    public Node() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
