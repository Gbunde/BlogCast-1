package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import services.BlogEntryService;

@RestController
public class TimelineController {
    @Autowired

    private BlogEntryService blogEntryService;



}
