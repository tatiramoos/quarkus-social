package io.github.tatiramoos.quarkussocial.domain.model;

import com.sun.jdi.PrimitiveValue;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "followers")
@Data
public class Followers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User follower;
}
