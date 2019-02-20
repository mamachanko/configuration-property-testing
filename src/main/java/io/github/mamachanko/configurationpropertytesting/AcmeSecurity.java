package io.github.mamachanko.configurationpropertytesting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcmeSecurity {

    private String password;

    private List<String> levels;
}
