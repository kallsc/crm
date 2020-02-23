package com.kallsc.crm.common.domain;

import java.math.BigDecimal;

public class MonthIncome {
    private String date;
    private BigDecimal total;
    private Integer income;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }
}
