package springproject.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MeasurePostRequestDto {

    private double temperature;
    private double saturation;
    private double pulse;
    private LocalDateTime time;

}
