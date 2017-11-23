package ro.sci.service;

import ro.sci.domain.Cauciuc;
import ro.sci.domain.CauciucRequest;

public class CauciuSearchService {
    private CauciucService cauciucService = new CauciucService();

    public Cauciuc find(CauciucRequest cauciucRequest){
        Cauciuc validCauciu = null;

        if (cauciucRequest != null ){

            Cauciuc cauciuc = this.cauciucService.findCauciuc(cauciucRequest.wide,cauciucRequest.hight,cauciucRequest.round,cauciucRequest.winter,cauciucRequest.maker);

            if (cauciuc != null && cauciuc.winter == cauciucRequest.winter && cauciuc.hight == cauciucRequest.hight && cauciuc.maker == cauciucRequest.maker && cauciuc.wide == cauciucRequest.wide) {
                validCauciu = cauciuc;
            }
        }

        return validCauciu;
    }



}
