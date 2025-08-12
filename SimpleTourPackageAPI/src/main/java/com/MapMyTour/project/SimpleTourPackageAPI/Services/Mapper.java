package com.MapMyTour.project.SimpleTourPackageAPI.Services;

import com.MapMyTour.project.SimpleTourPackageAPI.DTOs.TourPackageRequestDTO;
import com.MapMyTour.project.SimpleTourPackageAPI.DTOs.TourPackageResponseDTO;
import com.MapMyTour.project.SimpleTourPackageAPI.Entity.TourPackage;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public TourPackage toEntity(TourPackageRequestDTO dto) {
        TourPackage entity = new TourPackage();
        entity.setId(dto.getId());
        entity.setImage(dto.getImage());
        entity.setDiscountPercentage(dto.getDiscountInPercentage());
        entity.setTitle(dto.getTitle());
        entity.setDescription(dto.getDescription());
        entity.setDuration(dto.getDuration());
        entity.setActualPrice(dto.getActualPrice());
        entity.setDiscountedPrice(dto.getDiscountedPrice());
        return entity;
    }

    public TourPackageResponseDTO toResponseDTO(TourPackage entity) {
        return new TourPackageResponseDTO(
                entity.getId(),
                entity.getImage(),
                entity.getDiscountPercentage(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getDuration(),
                entity.getActualPrice(),
                entity.getDiscountedPrice()
        );
    }

}
