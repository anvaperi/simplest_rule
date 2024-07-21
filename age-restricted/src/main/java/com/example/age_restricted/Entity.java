// src/main/java/com/example/age_restricted/ResponseMessage.java
package com.example.age_restricted;

public class Entity {
    private String message;
    private boolean underAge;

    public Entity(boolean underAge) {
        this.message = "Access granted!";
        this.underAge = underAge;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setUnderAge(boolean underAge) { this.underAge = underAge; }
    public boolean isUnderAge() { return underAge; }
}
