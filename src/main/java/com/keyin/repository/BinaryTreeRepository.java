package com.keyin.repository;

import com.keyin.entities.BinaryTree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BinaryTreeRepository extends JpaRepository<BinaryTree, Long> {
}
