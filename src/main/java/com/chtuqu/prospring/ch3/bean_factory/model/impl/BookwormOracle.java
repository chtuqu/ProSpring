package com.chtuqu.prospring.ch3.bean_factory.model.impl;

import com.chtuqu.prospring.ch3.bean_factory.model.Oracle;

class BookwormOracle implements Oracle {
    @Override
    public String defineMeaningOfLife() {
        return "Encyclopedias are a waste of money - use the Internet";
    }
}
