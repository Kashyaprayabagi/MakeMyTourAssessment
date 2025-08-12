package com.MapMyTour.project.SimpleTourPackageAPI.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TourPackageRequestDTO {

    @NotNull(message = "ID cannot be null")
    private Integer id;

    @NotBlank(message = "Image URL cannot be empty")
    private String image;

    @NotBlank(message = "Discount percentage cannot be empty")
    private String discountInPercentage;

    @NotBlank(message = "Title cannot be empty")
    private String title;

    @NotBlank(message = "Description cannot be empty")
    private String description;

    @NotBlank(message = "Duration cannot be empty")
    private String duration;

    @NotBlank(message = "Actual price cannot be empty")
    private String actualPrice;

    @NotBlank(message = "Discounted price cannot be empty")
    private String discountedPrice;
}

