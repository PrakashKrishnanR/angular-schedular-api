package com.prradhak.scheduler.controller;

import com.prradhak.scheduler.responseDTO.ScheduleDetails;
import com.prradhak.scheduler.service.ScheduleDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/")
public class SchedulerDetailsController {

    @Autowired
    ScheduleDetailService scheduleDetailService;

    @GetMapping("schedules")
    public List<ScheduleDetails> getScheduleDetails(){
        return scheduleDetailService.getScheduleDetails();
    }
}
