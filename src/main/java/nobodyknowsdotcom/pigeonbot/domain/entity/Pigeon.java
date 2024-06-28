package nobodyknowsdotcom.pigeonbot.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Table(name = "pigeons")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@RequiredArgsConstructor
public class Pigeon {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    UUID id;

    @Column(name = "name")
    String name;

    @Column(name = "image_url")
    String imageUrl;
}
