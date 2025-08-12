package com.MapMyTour.project.SimpleTourPackageAPI.Exceptions;

public class NoTourPackagesFoundException extends RuntimeException {
    public NoTourPackagesFoundException() {
        super("No tour packages found");
    }

    public NoTourPackagesFoundException(int Message) {
        super("No tour packages found with id: " + Message );
    }
}
