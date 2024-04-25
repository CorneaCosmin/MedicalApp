package springproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import springproject.model.Measure;
import springproject.model.User;
import springproject.model.Visit;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class MedicalFolderGetResponseDto {

    private String folderId;
    private List<Visit> visits;
    private List<Measure> measures;
    private String medicalHistory;

}
