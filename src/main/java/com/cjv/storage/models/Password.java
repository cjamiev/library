package com.cjv.storage.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Password {
    @Id
    private String id;
    private String username;
    private String password;
    private String url;
    private String createdDate;
    private String tags;
    private String history;
    private String notes;

    public Password(String id, String username, String password, String url, String createdDate, String tags, String history, String notes) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.url = url;
        this.createdDate = createdDate;
        this.tags = tags;
        this.history = history;
        this.notes = notes;
    }

    public static Password getEmptyPassword() {
        return new Password("", "", "", "", "", "", "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "{\"id\": \"" + id
                + "\", \"username\":\"" + username
                + "\", \"password\":\"" + password
                + "\", \"url\":\"" + url
                + "\", \"createdDate\":\"" + createdDate
                + "\", \"tags\":\"" + tags
                + "\", \"history\":\"" + history
                + "\", \"notes\":\"" + notes
                + "\"}";
    }
}
