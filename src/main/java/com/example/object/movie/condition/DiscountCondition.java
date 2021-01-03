package com.example.object.movie.condition;

import com.example.object.movie.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
