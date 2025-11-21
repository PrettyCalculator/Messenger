
    public class User {
        public User() {

        }

        private String phoneNumber;
        private String userName;
        private File image = new File("skibidi.png");

        public setNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
        public setImage(File image) {
            this.image = image;
        }
        public setUsername(String userName) {
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
}
