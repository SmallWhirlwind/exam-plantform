package exam.blankQuizContext.userInterface;

import exam.blankQuizContext.domain.model.blankQuiz.BlankQuiz;

public class BlankQuizDTO {
    public static BlankQuizDTO from(BlankQuiz blankQuiz) {
        return new BlankQuizDTO();
    }

    public static BlankQuiz to(BlankQuizDTO blankQuizDTO) {
        return new BlankQuiz();
    }
}
