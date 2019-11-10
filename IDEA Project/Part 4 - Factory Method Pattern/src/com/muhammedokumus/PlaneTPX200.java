package com.muhammedokumus;

/**
 * TPX200 plane
 */
class PlaneTPX200 extends Plane {
    private String purpose;
    private String skeleton;
    private String engine;
    private String seats;

    public PlaneTPX200(String purpose, String skeleton, String engine, String seats) {
        try{
            System.out.println("Build process started for TPX200");
            this.purpose = purpose;
            System.out.println("Installing skeleton(" + skeleton + ")...");
            Thread.sleep(1000);
            this.skeleton = skeleton;
            System.out.println("Installing engine(" + engine + ")...");
            Thread.sleep(1000);
            this.engine = engine;
            System.out.println("Installing seats(" + seats + ")...");
            Thread.sleep(1000);
            this.seats = seats;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Build process failed");
        }
        System.out.println("TPX200 is ready.");
    }

    /**
     * return a string of information about planes capabilities
     * @return Domestic, International or Transatlantic...
     */
    @Override
    public String getPurpose() {
        return purpose;
    }
    /**
     * return a string of information about skeletons material
     * @return Aluminum alloy, Titanium alloy...
     */
    @Override
    public String getSkeleton() {
        return skeleton;
    }
    /**
     * return a string of information about engines type
     * @return Single Jet, Twin Jet, Quadruple Jet...
     */
    @Override
    public String getEngine() {
        return engine;
    }
    /**
     * return a string of information about seats
     * @return 50, 100, 250...
     */
    @Override
    public String getSeats() {
        return seats;
    }
}
