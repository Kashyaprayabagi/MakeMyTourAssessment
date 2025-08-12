package com.MapMyTour.project.SimpleTourPackageAPI.Controller;

import com.MapMyTour.project.SimpleTourPackageAPI.DTOs.TourPackageRequestDTO;
import com.MapMyTour.project.SimpleTourPackageAPI.DTOs.TourPackageResponseDTO;
import com.MapMyTour.project.SimpleTourPackageAPI.Services.TourServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TourController {

    private final TourServices ts;

    public TourController(TourServices ts) {
        this.ts = ts;
    }

    @GetMapping("/tours")
    public List<TourPackageResponseDTO> getAllTours() {
        return ts.getAllPackages();
    }

    @PostMapping("/tours")
    public ResponseEntity<TourPackageResponseDTO> createNewPackage(
            @RequestBody TourPackageRequestDTO dto) {

        TourPackageResponseDTO createdPackage = ts.addNewPackage(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdPackage);
    }

    @GetMapping("/tours/{id}")
    public ResponseEntity<TourPackageResponseDTO> getDTOById(@PathVariable int id) {
        return ResponseEntity.ok(ts.findById(id));
    }

}
