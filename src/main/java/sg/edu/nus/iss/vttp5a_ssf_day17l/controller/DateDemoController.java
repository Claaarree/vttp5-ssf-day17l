package sg.edu.nus.iss.vttp5a_ssf_day17l.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.service.annotation.GetExchange;

@Controller
@RequestMapping("/datedemo")
public class DateDemoController {
    
    @GetExchange()
    public String displayDate(Model model) throws ParseException {
        String date = "2008-09-12 12:21:03";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date testDate = sdf.parse(date);

        model.addAttribute("date", testDate);

        return "showDate";
    }
}
