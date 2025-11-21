package org.example;

import java.io.File;

public class User {
        public User() {

        }
        public User(String phoneNumber, String userName){
            this.userName = userName;
            this.phoneNumber = phoneNumber;
        }

        private String phoneNumber;
        private String userName;
        private File image = new File("skibidi.png");

        public void setNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
        public void setImage(File image) {
            this.image = image;
        }
        public void setUsername(String userName) {
            this.userName = userName;
        }

        public String getNumber(String phoneNumber) {
            return phoneNumber;
        }
        public File getImage(File image) {
            return image;
        }
        public String getUsername(String userName) {
            return userName;
        }

}

