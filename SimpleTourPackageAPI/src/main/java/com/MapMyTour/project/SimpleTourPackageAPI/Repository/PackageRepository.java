package com.MapMyTour.project.SimpleTourPackageAPI.Repository;

import com.MapMyTour.project.SimpleTourPackageAPI.Entity.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<TourPackage,Integer> {
}
