package ro.sci.controller;

import ro.sci.domain.Cauciuc;
import ro.sci.domain.CauciucRequest;
import ro.sci.service.CauciuSearchService;
import ro.sci.service.CauciucService;

public class CauciucController {
    private CauciuSearchService cauciuSearchService = new CauciuSearchService();

    public Cauciuc handleCauciuRequest(CauciucRequest cauciucRequest){
        Cauciuc cauciuc = this.cauciuSearchService.find( cauciucRequest);
        return cauciuc;
    }
}
