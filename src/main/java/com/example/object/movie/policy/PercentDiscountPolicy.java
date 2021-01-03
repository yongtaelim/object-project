package com.example.object.movie.policy;

import com.example.object.movie.condition.DiscountCondition;
import com.example.object.movie.Money;
import com.example.object.movie.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
