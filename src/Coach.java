
/**
 *
 * @author Asus
 */
public class Coach {
    String id;
    String name;
    String email;
    String mobilePhone;

    public Coach() {
    }

    public Coach(String id, String name, String email, String mobilePhone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobilePhone = mobilePhone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Override
    public String toString() {
        return "Coach{" + "id=" + id + ", name=" + name + ", email=" + email + ", mobilePhone=" + mobilePhone + '}';
    }
    
    
}
