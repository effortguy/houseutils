package com.effortguy.houseutils.policy;

public interface BrokeragePolicy {

    BrokerageRule getBrokerageRule(Long price);

    default Long calculate(Long price) {
        BrokerageRule rule = getBrokerageRule(price);
        return rule.calcMaxBrokerage(price);
    }
}
