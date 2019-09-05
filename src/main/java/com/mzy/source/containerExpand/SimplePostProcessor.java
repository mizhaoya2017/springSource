package com.mzy.source.containerExpand;

public class SimplePostProcessor {
    private String connectionString;
    private String password;
    private String username;
    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getConnectionString() {
        return connectionString;
    }
    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }
    @Override
    public String toString() {
        return "connectionString: " + connectionString + ",password: " + password + ",username: " + username;
    }
}
