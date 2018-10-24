package com.zak;
import java.util.regex.*;

public class Logic extends IllegalCredentialsException {
    private String username, password;


    public void setUsername(String username) {
        try {
            int x = username.length();
            if (x < 6 || x > 12) {
                throw new IllegalCredentialsException();
            } else if (username.contains(" ")) {
                throw new IllegalCredentialsException();
            } else {
                this.username = username;
            }
        } catch (IllegalCredentialsException e) {
            System.out.println("UserName: " + e.getMessage());
        }

    }

    public String getUsername() {
        return username;
    }


    public void setPassword(String password) {
        try {
            int x = password.length();
            boolean b, c;
            if (x < 8) {
                throw new IllegalCredentialsException();
            } else {
                for (int r = 0; r < password.length(); r++) {
                    if (Character.isDigit(password.charAt(r))) {
                        b = true;
                    }
                }
                Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
                Matcher m = p.matcher(password);
                c = m.find();

                if (b = true) {
                    if (c = true) {
                        this.password = password;
                    } else {
                        throw new IllegalCredentialsException();
                    }
                } else {
                    throw new IllegalCredentialsException();
                }
            }
        } catch (IllegalCredentialsException e) {
            System.out.println("Password: " + e.getMessage());
        }

    }

    public String getPassword() {
        return password;
    }

    public Logic(String username, String password) {
        this.username = username;
        this.password = password;
    }
}