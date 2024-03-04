package hibernate.example.webapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @OneToMany(mappedBy = "classes")
    private ArrayList<Enrollment> enrollments;
}
