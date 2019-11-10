package com.muhammedokumus;

/**
 * Defines an abstract Plane(product)
 */
abstract class Plane {
    /**
     * return a string of information about planes capabilities
     * @return Domestic, International or Transatlantic...
     */
    public abstract String getPurpose();

    /**
     * return a string of information about skeletons material
     * @return Aluminum alloy, Titanium alloy...
     */
    public abstract String getSkeleton();

    /**
     * return a string of information about engines type
     * @return Single Jet, Twin Jet, Quadruple Jet...
     */
    public abstract String getEngine();

    /**
     * return a string of information about seats
     * @return 50, 100, 250...
     */
    public abstract String getSeats();

    @Override
    public String toString(){
        return  "\nCode: " + this.getClass().getName() +
                "\nPurpose: " + this.getPurpose() +
                "\nSkeleton: " + this.getSkeleton()+
                "\nEngine: " + this.getEngine() +
                "\nSeats: "+ this.getSeats();
    }

}
