package kotova.sda.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistrationList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userName;
    private String gender;
    private String email;
    private String password;
    private String password_2;





}
