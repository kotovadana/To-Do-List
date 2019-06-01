package kotova.sda.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class ToDoList {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String taskName;
    private String comments;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date creationDate;
    private String reason;
    //
    private String priority;
    //
    @DateTimeFormat (pattern = "yyyy-MM-dd HH:mm")
    private Date plannedEndDate;
    @DateTimeFormat (pattern = "yyyy-MM-dd HH:mm")
    private  Date dayX;
    private String status;
    //
}
