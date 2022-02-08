package com.example.springjdbc;

import com.example.springjdbc.dao.MyUserDAO;
import com.example.springjdbc.dao.SimpleBbsDAO;
import com.example.springjdbc.dto.MyUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MyController {

    @Autowired
    private MyUserDAO dao;

    @Autowired
    private SimpleBbsDAO bbsDAO;

    @RequestMapping("/")
    public @ResponseBody String root() {
        return "JdbcTemplate 사용하기";
    }

    @RequestMapping("/user")
//    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String userListPage(Model model) {
        List<MyUserDTO> list = dao.getList();
        model.addAttribute("list", list);
        return "userList";
    }

    @RequestMapping("/bbsList")
    public String bbsListPage(Model model) {
        model.addAttribute("bbsList", bbsDAO.getList());
        return "bbsListResult";
    }

    @RequestMapping("/bbsView")
    public String bbsView(HttpServletRequest req, Model model) {
        String id = req.getParameter("id");
        model.addAttribute("dto", bbsDAO.view(id));
        return "bbsViewResult";
    }

    @RequestMapping("/bbsWriteForm")
    public String bbsWriteForm() {
        return "bbsWriteForm";
    }

    @RequestMapping("bbsWrite")
    public String bbsWrite(Model model, HttpServletRequest req) {
        bbsDAO.write(
                req.getParameter("writer"),
                req.getParameter("title"),
                req.getParameter("content")
        );
        return "redirect:bbsList";
    }

    @RequestMapping("/bbsDelete")
    public String bbsDelete(HttpServletRequest req, Model model) {
        bbsDAO.delete(req.getParameter("id"));
        return "redirect:bbsList";
    }
}
