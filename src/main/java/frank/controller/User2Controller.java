package frank.controller;

import frank.Service.ArticleService;
import frank.Service.UserService;
import frank.model.Article;
import frank.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user2")
public class User2Controller {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private UserService userService;
    @RequestMapping("/insert")
    @ResponseBody
    public User insert(User user){
        int num=userService.insert(user);
        return user;
    }
    @RequestMapping("/query")
    @ResponseBody
    public User queryById(Long id){
        return userService.query(id);
    }
    @RequestMapping("/queryArticle")
    public String queryArticleById(Long id, Model model){
        Article article=articleService.queryArticleById(id);
        model.addAttribute("article",article);
        return "/info";
    }
}
