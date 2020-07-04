package exam.blankQuizContext.userInterface;

import exam.blankQuizContext.domain.model.blankQuiz.BlankQuiz;
import exam.blankQuizContext.domain.service.BlankQuizServices;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BlankQuizController {
    private final BlankQuizServices blankQuizService;

    public BlankQuizController(BlankQuizServices blankQuizService) {
        this.blankQuizService = blankQuizService;
    }

    @PostMapping("/blankQuiz")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    BlankQuizDTO create(@RequestBody BlankQuizDTO blankQuizDTO) {
        BlankQuiz blankQuiz = blankQuizService.create(BlankQuizDTO.to(blankQuizDTO));
        return BlankQuizDTO.from(blankQuiz);
    }

    @GetMapping("/blankQuizs")
    List<BlankQuizDTO> getAll() {
        List<BlankQuiz> blankQuizs = blankQuizService.getAll();
        return blankQuizs.stream()
                .map(BlankQuizDTO::from)
                .collect(Collectors.toList());
    }
}
