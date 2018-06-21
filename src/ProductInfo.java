public class ProductInfo {

    public int sumPrice(Product[] products) {
        int result = 0;
        for (Product product : products) {
            result = +product.getPrice();
        }
        return result;
    }

    public String mostExpensiveProductName(Product[] products) {
        int maxPrice = 0;
        for (Product product : products) {
            if (maxPrice < product.getPrice()) {
                maxPrice = product.getPrice();
            }
        }
        String expensiveProductNames = "";
        for (Product product : products) {
            if(product.getPrice()==maxPrice){
                if(expensiveProductNames == "") {
                    expensiveProductNames = product.getName();
                } else {
                    expensiveProductNames = expensiveProductNames + " , " + product.getName();
                }
            }
        }
    return expensiveProductNames;
    }

}
