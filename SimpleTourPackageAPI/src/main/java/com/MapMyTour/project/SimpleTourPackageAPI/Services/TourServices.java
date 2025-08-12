package com.MapMyTour.project.SimpleTourPackageAPI.Services;

import com.MapMyTour.project.SimpleTourPackageAPI.DTOs.TourPackageRequestDTO;
import com.MapMyTour.project.SimpleTourPackageAPI.DTOs.TourPackageResponseDTO;
import com.MapMyTour.project.SimpleTourPackageAPI.Entity.TourPackage;
import com.MapMyTour.project.SimpleTourPackageAPI.Exceptions.NoTourPackagesFoundException;
import com.MapMyTour.project.SimpleTourPackageAPI.Exceptions.TourAlreadyExistsExecption;
import com.MapMyTour.project.SimpleTourPackageAPI.Repository.PackageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourServices {

    private final PackageRepository pr;
    private final Mapper mapper;

    public TourServices(PackageRepository pr, Mapper mapper) {
        this.pr = pr;
        this.mapper = mapper;
    }

    public List<TourPackageResponseDTO> getAllPackages() {
        List<TourPackage> packages = pr.findAll();
        if (packages.isEmpty()) {
            throw new NoTourPackagesFoundException();

        }
        return packages.stream()
                .map(mapper::toResponseDTO)
                .toList();
    }

    public TourPackageResponseDTO findById(int id) {
        TourPackage pkg = pr.findById(id)
                .orElseThrow(() -> new NoTourPackagesFoundException(id));
        return mapper.toResponseDTO(pkg);
    }

    public TourPackageResponseDTO addNewPackage(TourPackageRequestDTO dto) {
        if (pr.findById(dto.getId()).isPresent()) {
            throw new TourAlreadyExistsExecption(dto.getId());
        }
        TourPackage entity = mapper.toEntity(dto);
        TourPackage saved = pr.save(entity);
        return mapper.toResponseDTO(saved);
    }
}
