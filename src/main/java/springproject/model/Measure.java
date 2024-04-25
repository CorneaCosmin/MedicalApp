package springproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "measures")
public class Measures {

    @Id
    @Column(name = "measure_id")
    private Long id;

    @Column(name = "temperature")
    private double temperature;

    @Column(name = "saturation")
    private double saturation;

    @Column(name = "pulse")
    private double pulse;

}
