public class User {
        private int userID;
        private String name;
        private String email;

        public User(int id, String n, String e) {
            userID = id;
            name = n;
            email = e;
        }

        public int getUserID() {
            return userID;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public void setName(String n) {
            name = n;
        }

        public void setEmail(String e) {
            email = e;
        }
    }


