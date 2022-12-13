package edu.global.ex.page;


import edu.global.ex.service.BoardService;
import edu.global.ex.vo.BoardVO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@ToString
@Getter
@Setter
public class Criteria {
    private int pageNum;
    private int amount;

    public Criteria(){
        this(1,10);
    }
    public Criteria(int pageNum,int amount){
        this.pageNum = pageNum;
        this.amount = amount;
    }
}
