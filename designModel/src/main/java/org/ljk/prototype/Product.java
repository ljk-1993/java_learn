package org.ljk.prototype;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 14:11
 */
public class Product implements Cloneable{
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;
    private BaseInfo baseInfo;

    public Product(String attribute1, String attribute2, String attribute3, String attribute4,BaseInfo baseInfo) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
        this.attribute4 = attribute4;
        this.baseInfo = baseInfo;
    }

    public Product() {
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "attribute1='" + attribute1 + '\'' +
                ", attribute2='" + attribute2 + '\'' +
                ", attribute3='" + attribute3 + '\'' +
                ", attribute4='" + attribute4 + '\'' +
                ", baseInfo=" + baseInfo +
                '}';
    }

    //实现clone方法

    @Override
    protected Product clone() throws CloneNotSupportedException {
        Product clone = ((Product) super.clone());
        BaseInfo clone1 = (BaseInfo) clone.baseInfo.clone();
        clone.baseInfo = clone1;
        return clone;
    }
}
