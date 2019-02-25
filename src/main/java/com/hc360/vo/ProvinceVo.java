package com.hc360.vo;

import java.io.Serializable;

/**
 * @Auther: Administrator
 * @Date: 2019/2/25 20:27
 * @Description:
 */
public class ProvinceVo implements Serializable {
    private Long id;

    private String name;

    private Long countryId;

    private String shortName;

    private Long shortValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Long getShortValue() {
        return shortValue;
    }

    public void setShortValue(Long shortValue) {
        this.shortValue = shortValue;
    }
}
