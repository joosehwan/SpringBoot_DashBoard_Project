package com.example.DashBoard.service;

import com.example.DashBoard.domain.Board;
import com.example.DashBoard.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper boardMapper;

    public List<Board> findAll() {
        // ✅ DB 없이 임시 더미 데이터 리턴
        Board dummy1 = new Board(1L, "첫 번째 글", "내용입니다", "홍길동", LocalDateTime.now(), LocalDateTime.now());
        Board dummy2 = new Board(2L, "두 번째 글", "두 번째 내용", "김개발", LocalDateTime.now(), LocalDateTime.now());

        return Arrays.asList(dummy1, dummy2);
    }
}
