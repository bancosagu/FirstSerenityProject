package org.testfasttrackit.features.search;

import org.junit.Test;

public class SearchTest extends BaseTest{


    @Test
    public void searchProductTest(){
//        loginSteps
        searchSteps.doSearch("necklace");
    }
}
