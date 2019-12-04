package vo.Single;

import java.sql.Date;

public class Report {
    private int petId;
    private Date date;
    private String content;
    private String summary;
    private int vetId;

    public Report(int petId, Date date, String content) {
        this.petId = petId;
        this.date = date;
        this.content = content;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getVetId() {
        return vetId;
    }

    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Report() {
    }
}
