package com.example.servingwebcontent.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Root {
    private Integer id;
    private String name;
    private String tagline;
    private String firstBrewed;
    private String description;
    private String imageUrl;
    private Double abv;
    private Integer ibu;
    private Integer targetFg;
    private Integer targetOg;
    private Integer ebc;
    private Integer srm;
    private Double ph;
    private Integer attenuationLevel;
    private Volume volume;
    private BoilVolume boilVolume;
    private Method method;
    private Ingredients ingredients;
    private List<String> foodPairing = null;
    private String brewersTips;
    private String contributedBy;
}
