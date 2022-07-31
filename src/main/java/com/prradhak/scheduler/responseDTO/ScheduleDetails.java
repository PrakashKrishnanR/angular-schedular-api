package com.prradhak.scheduler.responseDTO;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class ScheduleDetails {


    private String schedule_id;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Kolkata")
    private LocalDateTime start_timestamp;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Kolkata")
    private LocalDateTime end_timestamp;
    private String title;
    private String content;

    public String getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(String schedule_id) {
        this.schedule_id = schedule_id;
    }

    public LocalDateTime getStart_timestamp() {
        return start_timestamp;
    }

    public void setStart_timestamp(LocalDateTime start_timestamp) {
        this.start_timestamp = start_timestamp;
    }

    public LocalDateTime getEnd_timestamp() {
        return end_timestamp;
    }

    public void setEnd_timestamp(LocalDateTime end_timestamp) {
        this.end_timestamp = end_timestamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
