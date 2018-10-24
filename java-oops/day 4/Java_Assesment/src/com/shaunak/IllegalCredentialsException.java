package com.shaunak;

public class IllegalCredentialsException extends RuntimeException {
    private final String userId;

        public IllegalCredentialsException(String message, String userId) {
            super(message);
            this.userId = userId;
        }

        public IllegalCredentialsException(String message, Throwable error, String userId) {
            super(message, error);
            this.userId = userId;
        }

        public IllegalCredentialsException(Throwable e, String userId) {
            super(e);
            this.userId = userId;
        }

        public String getUserId() {
            return userId;
        }
    }
