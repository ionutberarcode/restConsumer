package com.example.servingwebcontent.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Method {
    private List<Mash_temp> mash_temp;
    private Fermentation fermentation;
    private String twist;
}
