package com.mysite.sbb.comment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
@RequestMapping("/comment")
public class CommentController {
    @GetMapping("/detail")
    @ResponseBody
    public String detail() {
        return "detail test";
    }
}
