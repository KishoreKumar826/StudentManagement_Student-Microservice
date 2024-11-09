package com.example.demo.Repository;
import com.example.demo.Domain.student;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface Repo extends JpaRepository<student, Integer> {// pass the entity class and data tyep of primary key

}
