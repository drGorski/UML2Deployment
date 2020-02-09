package pl.gdynia.amw.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import pl.gdynia.amw.dictionary.GenerationStatusEnum;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class GenerationResult {

    @Getter private GenerationStatusEnum status;
    @Getter private String msg;
}
