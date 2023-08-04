package com.holidaycalendar.holidaycalendar.controller;

import com.holidaycalendar.holidaycalendar.service.BusinessDayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calendar")
public class CalendarController {

    private final BusinessDayService businessDayService;

    @GetMapping("/{data}")
    public ResponseEntity<Boolean> isBusinessDay( @PathVariable("data") String data) {
        LocalDate localDate = LocalDate.parse(data);

        boolean isDiaUtil = businessDayService.isDiaUtil(localDate);
        return ResponseEntity.ok(isDiaUtil);

    }
}
