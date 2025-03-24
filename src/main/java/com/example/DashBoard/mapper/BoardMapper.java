package com.example.DashBoard.mapper;

import com.example.DashBoard.domain.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    // 게시글 전체 조회
    List<Board> findAll();

    // 나중에 쓸 수도 있는 메서드들 (현재는 주석 처리)
    /*
    Board findById(Long id);
    void save(Board board);
    void update(Board board);
    void delete(Long id);
    */
}