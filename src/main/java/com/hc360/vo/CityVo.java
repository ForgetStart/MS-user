package com.hc360.vo;

import java.io.Serializable;

/**
 * @Auther: Administrator
 * @Date: 2019/2/25 20:16
 * @Description:
 */
public class CityVo implements Serializable {
    private Long id;

    private String name;

    private String cityCode;

    private Long provinceId;

    private String isDirect;

    private String shortName;

    private Long isAgent;

    private String pinyInhead;

    private Long flag;

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

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getIsDirect() {
        return isDirect;
    }

    public void setIsDirect(String isDirect) {
        this.isDirect = isDirect;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Long getIsAgent() {
        return isAgent;
    }

    public void setIsAgent(Long isAgent) {
        this.isAgent = isAgent;
    }

    public String getPinyInhead() {
        return pinyInhead;
    }

    public void setPinyInhead(String pinyInhead) {
        this.pinyInhead = pinyInhead;
    }

    public Long getFlag() {
        return flag;
    }

    public void setFlag(Long flag) {
        this.flag = flag;
    }
}
