package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Timeline {
    @Id
    @GeneratedValue
    private String title;
    private Object body;
    private Date timeStamp;
    private Long id;
    @OneToMany
    private List<BlogEntry> AllBlogs = new ArrayList<>();
    private User author;

    public Timeline() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public User getAuthor() {
        return author;
    }
    public void setAuthor(User author) {
        this.author = author;
    }
    public Timeline(List<BlogEntry> allBlogs) {
        AllBlogs = (ArrayList<BlogEntry>) allBlogs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<BlogEntry> getAllBlogs() {
        return AllBlogs;
    }

    public void setAllBlogs(List<BlogEntry> allBlogs) {
        AllBlogs = (ArrayList<BlogEntry>) allBlogs;
    }
}
