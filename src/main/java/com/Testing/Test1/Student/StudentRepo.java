package com.Testing.Test1.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<student,Integer> {
}
