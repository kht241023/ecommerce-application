package com.kht.ecommerce.ecommerce_application.controller;


import com.kht.ecommerce.ecommerce_application.dto.KHTBook;
import com.kht.ecommerce.ecommerce_application.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api") // 모든 url 앞에 /books url 자동 추가
@RestController
public class ApiBookController {

    // jquery ajax 를 활용해서 html 데이터를 주고 받는 json 형식으로 전송
    @Autowired
    BookServiceImpl bookService;
// /books로 GET 요청을 받아 책 목록 데이터를 반환
    @GetMapping("/bookList")
    public List<KHTBook> findAll() {
        return bookService.findAll();
    }


// /books/{id}로 GET 요청을 받아 특정 책의 상세 정보를 반환
// /books/{id}/update  POST 요청을 받아 특정 책 정보를 수정
}
