package com.MapMyTour.project.SimpleTourPackageAPI.Exceptions;

import com.MapMyTour.project.SimpleTourPackageAPI.Services.TourServices;

public class TourAlreadyExistsExecption extends RuntimeException{
    public TourAlreadyExistsExecption(int id) {
        super("Tour with id: " +id +" already exists");
    }
}
