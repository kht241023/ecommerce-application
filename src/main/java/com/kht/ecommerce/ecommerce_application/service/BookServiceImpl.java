package com.kht.ecommerce.ecommerce_application.service;

import com.kht.ecommerce.ecommerce_application.dto.KHTBook;
import com.kht.ecommerce.ecommerce_application.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 실질적으로 서비스 기능을 하고 있는 파일은
// Impl 구현 목록을 받아 상세기능을 작성한 class 파일이기 때문에
// Impl 붙은 파일에 @Service 어노테이션 설정
@Service
public class BookServiceImpl implements BookService {
    // 세부 기능을 구현하고, 특정 sql문으로 기능 작동을 수행하기 위해
    // @Autowired 를 사용
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<KHTBook> findAll() {
        return bookMapper.findAll();
    }
}
