package org.example.DataSets;

import org.testng.annotations.DataProvider;

public class Products {
    @DataProvider(name = "product")
    public Object [][] productName(){
        return new Object [][]{{"Little Story - Market Shopping Cart Toy Set - 56pcs - Green"}};
    }
}
