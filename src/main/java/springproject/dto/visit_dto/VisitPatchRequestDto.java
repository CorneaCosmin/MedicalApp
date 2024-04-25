package springproject.dto.visit_dto;

import lombok.Builder;
import lombok.Data;
import springproject.model.Doctor;

import java.util.Date;

@Data
@Builder
public class VisitPostRequestDto {

    private String doctorName;
    private Date date;
    private String note;

}
