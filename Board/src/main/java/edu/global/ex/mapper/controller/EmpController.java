package edu.global.ex.mapper.controller;


import edu.global.ex.page.Criteria;
import edu.global.ex.service.BoardService;
import edu.global.ex.vo.BoardVO;
import edu.global.ex.vo.PageVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class EmpController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/emp")
    public String emp(Model model){
        log.info("emp() ..");
        model.addAttribute("deptBoard",boardService.getEmp_DeptList());
        return "tables";
    }

}
