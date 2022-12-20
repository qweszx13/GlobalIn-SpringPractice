package edu.global.ex.controller;

import edu.global.ex.service.BoardService;
import edu.global.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/boards")
public class RestBoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public List<BoardVO> list(Model model){
        log.info("list() ..");

        return boardService.getList();
    }
    //http://localhost:8282/naords/{905}
    //restful 이란 URl을 파라미터화 하는것
    @DeleteMapping("/{bid}")//받는법 3가지 RequestParam,BoardVO 에 직접 넣기,HttpServeletRequset req req.getParam(이렇겐안함)
    public int delete(BoardVO boardVO){
        log.info("delete() ..");
        int rn = boardService.remove(boardVO);

        return rn;
    }
}