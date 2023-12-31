package io.github.tatiramoos.quarkussocial.rest.dto;

import io.github.tatiramoos.quarkussocial.domain.model.Post;
import lombok.Data;
import org.jboss.logging.annotations.Pos;

import java.time.LocalDateTime;

@Data
public class PostResponse {

    private String text;
    private LocalDateTime dateTime;

    public static PostResponse fromEntity (Post post) {

        var response = new PostResponse();
        response.setText(post.getText());
        response.setDateTime(post.getDateTime());
        return response;
    }
}
