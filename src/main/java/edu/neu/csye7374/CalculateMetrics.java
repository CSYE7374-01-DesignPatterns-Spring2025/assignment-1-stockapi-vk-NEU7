package edu.neu.csye7374;

public class CalculateMetrics {
    private static CalculateMetrics instance = null;

    private CalculateMetrics() {
    }

    // Lazy singleton class instance with thread safety double check with and without synchronization
    public static CalculateMetrics getInstance() {
        if (instance == null) {
            synchronized (CalculateMetrics.class) {
                if (instance == null) {
                    instance = new CalculateMetrics();
                }
            }
        }
        return instance;
    }

    public void calculateMetrics() {
        AdobeStock adobeStock = new AdobeStock("ADB", "Adobe", 131.5, "Adobe Stock");
        System.out.println(adobeStock);
        adobeStock.setBid("138");
        System.out.println(adobeStock.getName() + " Current price based on latest bid 138: " + adobeStock.getPrice());
        System.out.println(adobeStock.getName() + " Current metric based on latest bid 138: " + adobeStock.getMetric());

        adobeStock.setBid("100");
        System.out.println(adobeStock.getName() + " Current price based on latest bid 100: " + adobeStock.getPrice());
        System.out.println(adobeStock.getName() + " Current metric based on latest bid 100: " + adobeStock.getMetric());


        adobeStock.setBid("120");
        System.out.println(adobeStock.getName() + " Current price based on latest bid 120: " + adobeStock.getPrice());
        System.out.println(adobeStock.getName() + " Current metric based on latest bid 120: " + adobeStock.getMetric());

        adobeStock.setBid("140");
        System.out.println(adobeStock.getName() + " Current price based on latest bid 140: " + adobeStock.getPrice());
        System.out.println(adobeStock.getName() + " Current metric based on latest bid 140: " + adobeStock.getMetric());

        adobeStock.setBid("90");
        System.out.println(adobeStock.getName() + " Current price based on latest bid 90: " + adobeStock.getPrice());
        System.out.println(adobeStock.getName() + " Current metric based on latest bid 90: " + adobeStock.getMetric());

        adobeStock.setBid("160");
        System.out.println(adobeStock.getName() + " Current price based on latest bid 160: " + adobeStock.getPrice());
        System.out.println(adobeStock.getName() + " Current metric based on latest bid 160: " + adobeStock.getMetric());


        // Adding a new stock to calculate metrics for Apple
        System.out.println("");
        System.out.println("----------------************************************New Stock Start************************************----------------");
        System.out.println("");

        AppleStock appleStock = new AppleStock("AAPL", "Apple", 190.5, "Apple Stock");
        System.out.println(appleStock);
        appleStock.setBid("200");
        System.out.println(appleStock.getName() + " Current price based on latest bid 200: " + appleStock.getPrice());
        System.out.println(appleStock.getName() + " Current metric based on latest bid 200: " + appleStock.getMetric());

        appleStock.setBid("180");
        System.out.println(appleStock.getName() + " Current price based on latest bid 180: " + appleStock.getPrice());
        System.out.println(appleStock.getName() + " Current metric based on latest bid 180: " + appleStock.getMetric());

        appleStock.setBid("210");
        System.out.println(appleStock.getName() + " Current price based on latest bid 210: " + appleStock.getPrice());
        System.out.println(appleStock.getName() + " Current metric based on latest bid 210: " + appleStock.getMetric());

        appleStock.setBid("170");
        System.out.println(appleStock.getName() + " Current price based on latest bid 170: " + appleStock.getPrice());
        System.out.println(appleStock.getName() + " Current metric based on latest bid 170: " + appleStock.getMetric());

        appleStock.setBid("220");
        System.out.println(appleStock.getName() + " Current price based on latest bid 220: " + appleStock.getPrice());
        System.out.println(appleStock.getName() + " Current metric based on latest bid 220: " + appleStock.getMetric());

        appleStock.setBid("160");
        System.out.println(appleStock.getName() + " Current price based on latest bid 160: " + appleStock.getPrice());
        System.out.println(appleStock.getName() + " Current metric based on latest bid 160: " + appleStock.getMetric());
    }

}
