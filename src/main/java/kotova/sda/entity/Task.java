package kotova.sda.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Task {
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

    public Task() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Date getPlannedEndDate() {
        return plannedEndDate;
    }

    public void setPlannedEndDate(Date plannedEndDate) {
        this.plannedEndDate = plannedEndDate;
    }

    public Date getDayX() {
        return dayX;
    }

    public void setDayX(Date dayX) {
        this.dayX = dayX;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
