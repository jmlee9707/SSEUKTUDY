package tayo.sseuktudy.dto.member;

import lombok.Getter;
import lombok.Setter;
import tayo.sseuktudy.dto.question.QuestionInfoAnswerDto;

import java.util.List;
import java.util.Map;

@Setter
@Getter
public class MemberInfoDto {
    String userId;
    String userNickname;
    String userIntroduction;
    String userStatus;
    int studyId;
    List<QuestionInfoAnswerDto> questionInfoAnswerDtos;
}