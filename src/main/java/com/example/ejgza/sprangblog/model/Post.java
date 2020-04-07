package com.example.ejgza.sprangblog.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

@Entity
@Table
public class Post {
    // Primary key for our table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Title of a Post
    /**
     * Annotated element must not be null and must contain at least one non-whitespace character. 
     * We do this because we don't want to accept an empty string or invisible title as a post.
     */
    @NotBlank 
    @Column
    private String title;

    // Content/Body of a Post
    @Lob // suggest to store as a large object in DB
    @Column
    @NotEmpty
    private String content;

    // These two define the timestamp when a Post is created or updated.
    @Column
    private Instant createdOn;
    @Column
    private Instant updatedOn;

    // This is the username of the entity doing a Post.
    @Column
    @NotBlank
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public Instant getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Instant updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}