package com.enviiro.assessment.grad001.leratophetle.InvestorWithdrawal.Utils;

public class WidthDrawalDTO {
    private String withdrawlName;
    private Long ProductId;
    private double Amount;

    public WidthDrawalDTO() {
    }

    public WidthDrawalDTO(String withdrawlName, Long productId, double amount) {
        this.withdrawlName = withdrawlName;
        ProductId = productId;
        Amount = amount;
    }

    public String getWithdrawlName() {
        return withdrawlName;
    }

    public void setWithdrawlName(String withdrawlName) {
        this.withdrawlName = withdrawlName;
    }

    public Long getProductId() {
        return ProductId;
    }

    public void setProductId(Long productId) {
        ProductId = productId;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }
}
