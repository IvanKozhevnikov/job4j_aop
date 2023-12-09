package ru.job4j.aop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.job4j.aop.model.Comment;

@Component
public class ProcessComment {
    private static final Logger LOG = LoggerFactory.getLogger(ProcessComment.class.getName());

    public void publishingComment(Comment comment) {
        System.out.println("Выполняем публикацию комментария : " + comment.getComment());
    }

    public int deleteComment(int commentId) {
        System.out.println("Выполняем удаление комментария : " + commentId);
        return commentId;
    }
}
