package com.WealthVision.sprinboot.model;

public class Company {
    private String Symbol;
    private String Name;
    private String Description;
    private String MarketCapitalization;
    private String EPS;
    private String DilutedEPSTTM;
    private String PERatio;
    private String TrailingPE;
    private String ForwardPE;
    private String RevenueTTM;
    private String ProfitMargin;
    private String OperatingMarginTTM;

    private String DividendPerShare;
    private String DividendYield;

    private String QuarterlyEarningsGrowthYOY;
    private String QuarterlyRevenueGrowthYOY;

    public Company() {

    }

    public Company(String symbol, String name, String Description, String marketCapitalization, String EPS,
            String dilutedEPSTTM, String PERatio, String trailingPE, String forwardPE, String revenueTTM,
            String profitMargin, String operatingMarginTTM, String dividendPerShare, String dividendYield,
            String quarterlyEarningsGrowthYOY, String quarterlyRevenueGrowthYOY) {
        this.Symbol = symbol;
        this.Name = name;
        this.Description = Description;
        this.MarketCapitalization = marketCapitalization;
        this.EPS = EPS;
        this.DilutedEPSTTM = dilutedEPSTTM;
        this.PERatio = PERatio;
        this.TrailingPE = trailingPE;
        this.ForwardPE = forwardPE;
        this.RevenueTTM = revenueTTM;
        this.ProfitMargin = profitMargin;
        this.OperatingMarginTTM = operatingMarginTTM;
        this.DividendPerShare = dividendPerShare;
        this.DividendYield = dividendYield;
        this.QuarterlyEarningsGrowthYOY = quarterlyEarningsGrowthYOY;
        this.QuarterlyRevenueGrowthYOY = quarterlyRevenueGrowthYOY;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMarketCapitalization() {
        return MarketCapitalization;
    }

    public void setMarketCapitalization(String marketCapitalization) {
        MarketCapitalization = marketCapitalization;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public String getDilutedEPSTTM() {
        return DilutedEPSTTM;
    }

    public void setDilutedEPSTTM(String dilutedEPSTTM) {
        DilutedEPSTTM = dilutedEPSTTM;
    }

    public String getPERatio() {
        return PERatio;
    }

    public void setPERatio(String PERatio) {
        this.PERatio = PERatio;
    }

    public String getTrailingPE() {
        return TrailingPE;
    }

    public void setTrailingPE(String trailingPE) {
        TrailingPE = trailingPE;
    }

    public String getForwardPE() {
        return ForwardPE;
    }

    public void setForwardPE(String forwardPE) {
        ForwardPE = forwardPE;
    }

    public String getRevenueTTM() {
        return RevenueTTM;
    }

    public void setRevenueTTM(String revenueTTM) {
        RevenueTTM = revenueTTM;
    }

    public String getProfitMargin() {
        return ProfitMargin;
    }

    public void setProfitMargin(String profitMargin) {
        ProfitMargin = profitMargin;
    }

    public String getOperatingMarginTTM() {
        return OperatingMarginTTM;
    }

    public void setOperatingMarginTTM(String operatingMarginTTM) {
        OperatingMarginTTM = operatingMarginTTM;
    }

    public String getDividendPerShare() {
        return DividendPerShare;
    }

    public void setDividendPerShare(String dividendPerShare) {
        DividendPerShare = dividendPerShare;
    }

    public String getDividendYield() {
        return DividendYield;
    }

    public void setDividendYield(String dividendYield) {
        DividendYield = dividendYield;
    }

    public String getQuarterlyEarningsGrowthYOY() {
        return QuarterlyEarningsGrowthYOY;
    }

    public void setQuarterlyEarningsGrowthYOY(String quarterlyEarningsGrowthYOY) {
        QuarterlyEarningsGrowthYOY = quarterlyEarningsGrowthYOY;
    }

    public String getQuarterlyRevenueGrowthYOY() {
        return QuarterlyRevenueGrowthYOY;
    }

    public void setQuarterlyRevenueGrowthYOY(String quarterlyRevenueGrowthYOY) {
        QuarterlyRevenueGrowthYOY = quarterlyRevenueGrowthYOY;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
