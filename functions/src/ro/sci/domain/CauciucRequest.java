package ro.sci.domain;

public class CauciucRequest {
    public int wide;
    public int hight;
    public int round;
    public boolean winter;
    public String maker;

    public CauciucRequest(int wide, int hight, int round, boolean winter, String maker) {
        this.wide = wide;
        this.hight = hight;
        this.round = round;
        this.winter = winter;
        this.maker = maker;
    }
}
