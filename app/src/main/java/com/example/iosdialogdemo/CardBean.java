package com.example.iosdialogdemo;

public class CardBean {

    /*
    模块大小 11  12  21   22 等等
    模块位置     0 1 2 3 4 5 6 7 8
    默认所有按钮全部隐藏  然后在代码里设置显示
       "Id": 0,
    "studentName": "第一个card",
    "location": 0,
    "size": 11,
    "isShow": true
     */

    private int id;
    private String studentName;

    private int location;
    private int size;
    private boolean isShow;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }
}
