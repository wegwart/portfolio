package name.abuchen.portfolio.online.portfolioreport;

public class PRSecurity
{
    private long id;
    private String name;
    private String uuid;
    private String currencyCode;
    private String isin;
    private String wkn;
    private String symbol;
    private boolean active;
    private String note;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUuid()
    {
        return uuid;
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }

    public String getCurrencyCode()
    {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode)
    {
        this.currencyCode = currencyCode;
    }

    public String getIsin()
    {
        return isin;
    }

    public void setIsin(String isin)
    {
        this.isin = isin;
    }

    public String getWkn()
    {
        return wkn;
    }

    public void setWkn(String wkn)
    {
        this.wkn = wkn;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public void setSymbol(String symbol)
    {
        this.symbol = symbol;
    }

    public boolean isActive()
    {
        return active;
    }

    public void setActive(boolean active)
    {
        this.active = active;
    }

    public String getNote()
    {
        return note;
    }

    public void setNote(String note)
    {
        this.note = note;
    }

}