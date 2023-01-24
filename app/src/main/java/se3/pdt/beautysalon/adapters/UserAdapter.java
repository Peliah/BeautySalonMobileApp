package se3.pdt.beautysalon.adapters;

public class UserAdapter {
    private  Integer custid;
    private  int phonenumber;
    private  String username;
    private  String passwd;
    private String email;
    private String firstname;
    private String lastname;

    public UserAdapter() {
    }

    public UserAdapter(Integer custid) {
        this.custid = custid;
    }

    public UserAdapter(Integer custid, String firstname, String lastname, int phonenumber, String email, String username, String passwd) {
        this.custid = custid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.email = email;
        this.username = username;
        this.passwd = passwd;
    }

    public Integer getCustid() {
        return custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

}