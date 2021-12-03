package com.amigoscode.amigoscode.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "groups")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String groupName;
    @OneToOne
    private Student groupLeader;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students;

    public Group(String groupName, Student groupLeader, List<Student> students) {
        this.groupName = groupName;
        this.groupLeader = groupLeader;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", groupLeader=" + groupLeader +
                ", students=" + students +
                '}';
    }
}
