package com.example.quockystring;

public class QuocKy {
    int co;
    String ten;

    public int getCo() {
        return co;
    }

    public void setCo(int co) {
        this.co = co;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "QuocKy{" +
                "co=" + co +
                ", ten='" + ten + '\'' +
                '}';
    }
}
