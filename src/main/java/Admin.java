public class Admin {
    int admin_ID;
    String first_name;
    String last_name;
    String email;

    public Admin(int admin_ID, String first_name, String last_name, String email) {
        this.admin_ID = admin_ID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public int getAdmin_ID() {
        return admin_ID;
    }

    public void setAdmin_ID(int admin_ID) {
        this.admin_ID = admin_ID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
