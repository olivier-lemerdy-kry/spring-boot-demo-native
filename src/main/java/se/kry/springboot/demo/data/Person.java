package se.kry.springboot.demo.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;
import se.kry.springboot.demo.domain.PersonConstants;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person extends AbstractPersistable<UUID> {

  @NotBlank
  @Size(max = PersonConstants.Sizes.NAME)
  @Column(length = PersonConstants.Sizes.NAME)
  private String name;
}
