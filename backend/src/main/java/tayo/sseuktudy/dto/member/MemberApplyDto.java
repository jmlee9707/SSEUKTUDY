package tayo.sseuktudy.dto.member;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@ToString
public class MemberApplyDto {
    int studyId;
    String userId;
    String userStatus;
    String userNickname;
    String userIntroduction;
    Map<String, String> preQuestions;
}