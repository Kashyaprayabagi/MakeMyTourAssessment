package com.MapMyTour.project.SimpleTourPackageAPI.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tour_packages")
public class TourPackage {

    @Id
    @NotNull()
    private Integer id;

    @NotBlank(message = "Image URL cannot be empty")
    private String image;

    @Positive(message = "Discount percentage must be positive")
    private String discountPercentage;

    @NotBlank(message = "title cannot be empty")
    private String title;

    @NotBlank(message = "Description cannot be empty")
    private String description;

    @NotBlank(message = "Duration cannot be empty")
    private String duration;

    @Positive(message = "Actual price must be greater than zero")
    private String actualPrice;

    @Positive(message = "Discounted price must be greater than zero")
    private String discountedPrice;

    public TourPackage(Integer id, String image, String discountPercentage,String title, String description,
                       String duration, String actualPrice, String discountedPrice) {
        this.id = id;
        this.image = image;
        this.discountPercentage = discountPercentage;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.actualPrice = actualPrice;
        this.discountedPrice = discountedPrice;
    }

    @Override
    public String toString() {
        return "TourPackage{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", discountPercentage=" + discountPercentage +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration='" + duration + '\'' +
                ", actualPrice=" + actualPrice +
                ", discountedPrice=" + discountedPrice +
                '}';
    }
}
