package com.muhammedokumus;

/**
 * Concrete factory, creates TPX type planes
 */
public class PlaneFactory {

    /**
     * Builds and returns a TPX100 type plane
     * @return PlaneTPX100 type plane
     */
    public static Plane buildTPX100(){
        return new PlaneTPX100("Domestic Flights", "Aluminum Alloy", "Single Jet Engine", "50");
    }
    /**
     * Builds and returns a TPX200 type plane
     * @return PlaneTPX200 type plane
     */
    public static Plane buildTPX200(){
        return new PlaneTPX200("Domestic and International Flights", "Nickel Alloy", "Twin Jet Engines", "100");
    }
    /**
     * Builds and returns a TPX300 type plane
     * @return PlaneTPX300 type plane
     */
    public static Plane buildTPX300(){
        return new PlaneTPX300("Transatlantic Flights", "Titanium Alloy", "Quadruple Jet Engines", "250");
    }
}
