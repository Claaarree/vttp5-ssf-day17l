package sg.edu.nus.iss.vttp5a_ssf_day17l.model;

public class Carpark {
    
    private Integer id;
    private String address;
    private String category;
    private String weekdaysRate1;
    private String weekdaysRate2;
    private String saturdayRate;
    private String sundayNPUbhol;
    
    public Carpark() {
    }

    public Carpark(Integer id, String address, String category, String weekdaysRate1, String weekdaysRate2,
            String saturdayRate, String sundayNPUbhol) {
        this.id = id;
        this.address = address;
        this.category = category;
        this.weekdaysRate1 = weekdaysRate1;
        this.weekdaysRate2 = weekdaysRate2;
        this.saturdayRate = saturdayRate;
        this.sundayNPUbhol = sundayNPUbhol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getWeekdaysRate1() {
        return weekdaysRate1;
    }

    public void setWeekdaysRate1(String weekdaysRate1) {
        this.weekdaysRate1 = weekdaysRate1;
    }

    public String getWeekdaysRate2() {
        return weekdaysRate2;
    }

    public void setWeekdaysRate2(String weekdaysRate2) {
        this.weekdaysRate2 = weekdaysRate2;
    }

    public String getSaturdayRate() {
        return saturdayRate;
    }

    public void setSaturdayRate(String saturdayRate) {
        this.saturdayRate = saturdayRate;
    }

    public String getSundayNPUbhol() {
        return sundayNPUbhol;
    }

    public void setSundayNPUbhol(String sundayNPUbhol) {
        this.sundayNPUbhol = sundayNPUbhol;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + ((weekdaysRate1 == null) ? 0 : weekdaysRate1.hashCode());
        result = prime * result + ((weekdaysRate2 == null) ? 0 : weekdaysRate2.hashCode());
        result = prime * result + ((saturdayRate == null) ? 0 : saturdayRate.hashCode());
        result = prime * result + ((sundayNPUbhol == null) ? 0 : sundayNPUbhol.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carpark other = (Carpark) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (category == null) {
            if (other.category != null)
                return false;
        } else if (!category.equals(other.category))
            return false;
        if (weekdaysRate1 == null) {
            if (other.weekdaysRate1 != null)
                return false;
        } else if (!weekdaysRate1.equals(other.weekdaysRate1))
            return false;
        if (weekdaysRate2 == null) {
            if (other.weekdaysRate2 != null)
                return false;
        } else if (!weekdaysRate2.equals(other.weekdaysRate2))
            return false;
        if (saturdayRate == null) {
            if (other.saturdayRate != null)
                return false;
        } else if (!saturdayRate.equals(other.saturdayRate))
            return false;
        if (sundayNPUbhol == null) {
            if (other.sundayNPUbhol != null)
                return false;
        } else if (!sundayNPUbhol.equals(other.sundayNPUbhol))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return id + "," + address + "," + category + ","
                + weekdaysRate1 + "," + weekdaysRate2 + "," + saturdayRate
                + "," + sundayNPUbhol;
    }

    
}
