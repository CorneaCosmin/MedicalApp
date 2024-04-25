package springproject.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class MeasurePostResponseDto {

    private long measureId;
    private double temperature;
    private double saturation;
    private double pulse;
    private LocalDateTime time;

}
