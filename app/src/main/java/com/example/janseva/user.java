package com.example.janseva;

public class user {
    String profilepic;
    String lastmessage;
    String username;
    String mail;
    String password;
    String userId;

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String feedback) {
        Feedback = feedback;
    }

    public user(String toString, String s, String feedback) {
        Feedback = feedback;
    }

    String Feedback;

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getLastmessage() {
        return lastmessage;
    }

    public void setLastmessage(String lastmessage) {
        this.lastmessage = lastmessage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public user(String mail, String password, String userId, String feedback) {
        this.mail = mail;
        this.password = password;
        this.userId = userId;
        this.Feedback = feedback;
    }
}
