package fr.wildcodeschool.githubtracker.model;

import java.util.ArrayList;
import java.util.List;

public class Githubers {
    private long id;
    private String name;
    private String email;
    private String login;
    private String avatarUrl;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Githubers(long id, String name, String email, String login, String avatarUrl) {
        this.id=id;
        this.name=name;
        this.email=email;
        this.login=login;
        this.avatarUrl=avatarUrl;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}