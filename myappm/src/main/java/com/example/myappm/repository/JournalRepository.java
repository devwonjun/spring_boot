package com.example.myappm.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.myappm.domain.Journal;

/*
public class JournalRepository {

}
*/
public interface JournalRepository extends JpaRepository <Journal , Long> {} 
