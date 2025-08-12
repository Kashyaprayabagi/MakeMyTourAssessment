package com.MapMyTour.project.SimpleTourPackageAPI.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TourPackageResponseDTO {
    private Integer id;
    private String image;
    private String discountInPercentage;
    private String title;
    private String description;
    private String duration;
    private String actualPrice;
    private String discountedPrice;
}

