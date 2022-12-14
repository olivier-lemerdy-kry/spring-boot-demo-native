package se.kry.springboot.demo.data;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class PersonRepositoryTest {

  @Autowired
  private PersonRepository repository;

  @Test
  void save() {
    var toSave = new Person("John Doe");
    var saved = repository.save(toSave);
    assertThat(saved.getId()).isNotNull();
  }

}