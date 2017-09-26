package discount;

public class DiscountCalculator {

    public void apply(BasketCase basketCase) {
        boolean ret = discountByProduct(basketCase);
        if(!ret) discountByAmount(basketCase);
    }

    private boolean discountByProduct(BasketCase basketCase) {
        if(basketCase.has("MACBOOK") && basketCase.has("IPHONE")) {
            basketCase.reduce(basketCase.getPrice() * 0.15);
            return true;
        }

        if(basketCase.has("NOTEBOOK") && basketCase.has("WINDOWS PHONE")) {
            basketCase.reduce(basketCase.getPrice() * 0.12);
            return true;
        }

        if(basketCase.has("XBOX")) {
            basketCase.reduce(basketCase.getPrice() * 0.7);
            return true;
        }

        return false;
    }

    private void discountByAmount(BasketCase basketCase) {

        if(basketCase.getPrice()<=1000 && basketCase.qtyItems() <= 2) {
            basketCase.reduce(basketCase.getPrice() * 0.02);
        }

        else if(basketCase.getPrice() > 3000 && basketCase.qtyItems() < 5 && basketCase.qtyItems() > 2) {
            basketCase.reduce(basketCase.getPrice() * 0.05);
        }

        else if(basketCase.getPrice() > 3000 && basketCase.qtyItems() >= 5) {
            basketCase.reduce(basketCase.getPrice() * 0.06);
        }
    }
}
