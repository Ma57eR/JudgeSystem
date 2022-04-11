package JudgeSystem.models.entities;

import javax.persistence.*;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "comments")
public class Comment extends BaseEntity {


    @Positive
    @Column(nullable = false)
    private Integer score;

    @Column(name = "text_content", columnDefinition = "TEXT")
    private String textContent;


    @ManyToOne
    @JoinColumn(name = "author_id")

    private User author;


    @ManyToOne
    @JoinColumn(name = "homework_id")
    private Homework homework;


    public Comment() {
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Homework getHomework() {
        return homework;
    }

    public void setHomework(Homework homework) {
        this.homework = homework;
    }
}
