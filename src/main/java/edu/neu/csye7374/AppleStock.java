package edu.neu.csye7374;

public class AppleStock extends StockAPI {
    public AppleStock(String id, String name, Double price, String description) {
        super(id, name, price, description);
    }

    @Override
    public void setBid(String bid) {
        Double currPrice = this.getPrice();
        Double currBid = Double.parseDouble(bid);
        setMetric((int) ((currBid - currPrice) * 3));
        if(currBid < currPrice)
            setPrice(currPrice - currBid * 0.2);
        else
            setPrice(currPrice + currBid * 0.2);
    }
    
}
