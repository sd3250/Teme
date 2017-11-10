package ro.sci.service;

import ro.sci.domain.Cauciuc;

public class CauciucService {
    private Cauciuc[] cauciucuri;

    public CauciucService() {

        initCauciucuri();
    }

    public Cauciuc findCauciuc (int wide, int hight, int round, boolean winter, String maker) {

     Cauciuc findCauciuc = null;
     for (Cauciuc c: cauciucuri){
         if ((wide == c.wide) && ( hight == c.hight ) && ( round == c.round) && (winter == c.winter)&& (maker.equals(c.maker))) {
             findCauciuc = c;
             break;

         }


        }
        return findCauciuc;
    }

    private void initCauciucuri () {

        Cauciuc c1 = new Cauciuc(205, 55, 16, true, "continental");
        Cauciuc c2 = new Cauciuc(225, 45, 18, true, "continental");

        cauciucuri = new Cauciuc[] {c1, c2};


    }
}
