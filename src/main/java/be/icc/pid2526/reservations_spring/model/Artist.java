package be.icc.pid2526.reservations_spring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="artists")
@Data
@NoArgsConstructor
public class Artist {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "The firstname must not be empty.")
    @Size(min=2, max=60, message = "The firstname must be between 2 and 60 characters long.")
    private String firstname;
    @NotBlank(message = "The lasttname must not be empty.")
    @Size(min=2, max=60, message = "The firstname must be between 2 and 60 characters long.")
    private String lastname;

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }

}
