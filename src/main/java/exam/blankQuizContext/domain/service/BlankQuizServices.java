package exam.blankQuizContext.domain.service;

import exam.blankQuizContext.domain.model.blankQuiz.BlankQuiz;
import exam.blankQuizContext.domain.model.blankQuiz.BlankQuizId;
import exam.blankQuizContext.domain.model.blankQuiz.BlankQuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlankQuizServices {

    private final BlankQuizRepository blankQuizRepository;

    public BlankQuizServices(BlankQuizRepository blankQuizRepository) {
        this.blankQuizRepository = blankQuizRepository;
    }

    public BlankQuiz create(BlankQuiz blankQuiz) {
        return null;
    }

    public void delete(BlankQuizId blankQuizId) {

    }

    public List<BlankQuiz> getAll() {
        return null;
    }
}
