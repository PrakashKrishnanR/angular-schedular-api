package com.prradhak.scheduler.service;

import com.prradhak.scheduler.responseDTO.ScheduleDetails;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ScheduleDetailService {


    public List<ScheduleDetails> getScheduleDetails(){

        ScheduleDetails scheduleDetails1 = new ScheduleDetails();
        scheduleDetails1.setSchedule_id("12");
        scheduleDetails1.setStart_timestamp(LocalDateTime.of(2022, Month.AUGUST, 1, 9,15, 0));
        scheduleDetails1.setEnd_timestamp(LocalDateTime.of(2022, Month.AUGUST, 1, 9,45, 0));
        scheduleDetails1.setTitle("Meeting with Prakash !!");
        scheduleDetails1.setContent("Meeting Content");

        ScheduleDetails scheduleDetails2 = new ScheduleDetails();
        scheduleDetails2.setSchedule_id("13");
        scheduleDetails2.setStart_timestamp(LocalDateTime.of(2022, Month.AUGUST, 1, 10,15, 0));
        scheduleDetails2.setEnd_timestamp(LocalDateTime.of(2022, Month.AUGUST, 1, 10,30, 0));
        scheduleDetails2.setTitle("Meeting with Prakash 2 !!");
        scheduleDetails2.setContent("Meeting Content 2");

        ScheduleDetails scheduleDetails3 = new ScheduleDetails();
        scheduleDetails3.setSchedule_id("14");
        scheduleDetails3.setStart_timestamp(LocalDateTime.of(2022, Month.AUGUST, 1, 12,0, 0));
        scheduleDetails3.setEnd_timestamp(LocalDateTime.of(2022, Month.AUGUST, 1, 12,45, 0));
        scheduleDetails3.setTitle("Meeting with Prakash 3!!");
        scheduleDetails3.setContent("Meeting Content 3");

        ScheduleDetails scheduleDetails4 = new ScheduleDetails();
        scheduleDetails4.setSchedule_id("15");
        scheduleDetails4.setStart_timestamp(LocalDateTime.of(2022, Month.AUGUST, 2, 14,0, 0));
        scheduleDetails4.setEnd_timestamp(LocalDateTime.of(2022, Month.AUGUST, 2, 15,0, 0));
        scheduleDetails4.setTitle("Meeting with Prakash  4!!");
        scheduleDetails4.setContent("Meeting Content 4");

        ScheduleDetails scheduleDetails5 = new ScheduleDetails();
        scheduleDetails5.setSchedule_id("16");
        scheduleDetails5.setStart_timestamp(LocalDateTime.of(2022, Month.AUGUST, 2, 16,15, 0));
        scheduleDetails5.setEnd_timestamp(LocalDateTime.of(2022, Month.AUGUST, 2, 16,45, 0));
        scheduleDetails5.setTitle("Meeting with Prakash 5 !!");
        scheduleDetails5.setContent("Meeting Content 5");

        ScheduleDetails scheduleDetails6 = new ScheduleDetails();
        scheduleDetails6.setSchedule_id("17");
        scheduleDetails6.setStart_timestamp(LocalDateTime.of(2022, Month.AUGUST, 4, 9,15, 0));
        scheduleDetails6.setEnd_timestamp(LocalDateTime.of(2022, Month.AUGUST, 4, 9,45, 0));
        scheduleDetails6.setTitle("Meeting with Prakash 6 !!");
        scheduleDetails6.setContent("Meeting Content 6");

        ScheduleDetails scheduleDetails7 = new ScheduleDetails();
        scheduleDetails7.setSchedule_id("18");
        scheduleDetails7.setStart_timestamp(LocalDateTime.of(2022, Month.AUGUST, 5, 10,15, 0));
        scheduleDetails7.setEnd_timestamp(LocalDateTime.of(2022, Month.AUGUST, 5, 10,45, 0));
        scheduleDetails7.setTitle("Meeting with Prakash 7!!");
        scheduleDetails7.setContent("Meeting Content 7");

        ScheduleDetails scheduleDetails8 = new ScheduleDetails();
        scheduleDetails8.setSchedule_id("19");
        scheduleDetails8.setStart_timestamp(LocalDateTime.of(2022, Month.AUGUST, 5, 11,15, 0));
        scheduleDetails8.setEnd_timestamp(LocalDateTime.of(2022, Month.AUGUST, 5, 11,45, 0));
        scheduleDetails8.setTitle("Meeting with Prakash !!");
        scheduleDetails8.setContent("Meeting Content");

        ScheduleDetails scheduleDetails9 = new ScheduleDetails();
        scheduleDetails9.setSchedule_id("20");
        scheduleDetails9.setStart_timestamp(LocalDateTime.of(2022, Month.AUGUST, 7, 13,15, 0));
        scheduleDetails9.setEnd_timestamp(LocalDateTime.of(2022, Month.AUGUST, 7, 13,45, 0));
        scheduleDetails9.setTitle("Meeting with Prakash !!");
        scheduleDetails9.setContent("Meeting Content");

       List<ScheduleDetails> scheduleDetailsList = new ArrayList<>();

       scheduleDetailsList.add(scheduleDetails1);
       scheduleDetailsList.add(scheduleDetails2);
       scheduleDetailsList.add(scheduleDetails3);
       scheduleDetailsList.add(scheduleDetails4);
       scheduleDetailsList.add(scheduleDetails5);
       scheduleDetailsList.add(scheduleDetails6);
       scheduleDetailsList.add(scheduleDetails7);
       scheduleDetailsList.add(scheduleDetails8);
       scheduleDetailsList.add(scheduleDetails9);


       return scheduleDetailsList;
    }
}
