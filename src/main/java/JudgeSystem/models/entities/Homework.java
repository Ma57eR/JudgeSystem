package JudgeSystem.models.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "homework")
public class Homework extends BaseEntity{

    @Column(name = "added_on")
    private LocalDateTime addedOn;

    @Column(name = "git_address", nullable = false, unique = true)
    private String gitAddress;

    @ManyToOne
    private User author;

    @ManyToOne
    private Exercise exercise;

    public Homework() {
    }

    public LocalDateTime getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(LocalDateTime addedOn) {
        this.addedOn = addedOn;
    }

    public String getGitAddress() {
        return gitAddress;
    }

    public void setGitAddress(String gitAddress) {
        this.gitAddress = gitAddress;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }
}
