package com.example.azxca.pr01;

public class DataForm {
    //원하는 데이터의 형태
    private String name;
    private int imageNumber;

    public DataForm(String name, int imageNumber) {
        this.name = name;
        this.imageNumber = imageNumber;
    }

    public String getName() {
        return name;
    }

    public int getImageNumber() {
        return imageNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageNumber(int imageNumber) {
        this.imageNumber = imageNumber;
    }
}
