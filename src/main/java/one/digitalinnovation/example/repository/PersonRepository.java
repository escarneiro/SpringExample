package one.digitalinnovation.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.example.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
