package cz.czechitas.java2webapps.ukol7.controler;

import ch.qos.logback.core.model.Model;
import cz.czechitas.java2webapps.ukol7.entity.Post;
import cz.czechitas.java2webapps.ukol7.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public ModelAndView listPosts(Model model) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("posts", postService.list());
        return modelAndView;
    }

    @GetMapping("/post/{slug}")
    public ModelAndView viewPost(@PathVariable String slug, Model model) {
        ModelAndView modelAndView = new ModelAndView("post");
        modelAndView.addObject("post", postService.singlePost(slug).get());
        return modelAndView;
    }
}
