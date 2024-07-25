package com.example.back_end_SPRING_REST.repository;

import com.example.back_end_SPRING_REST.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}