package ch18_static.builders;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
public class PersonLombok {
    private String name;
    private int age;
    private String address;
}
