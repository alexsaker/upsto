package com.cnaf.upto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-27T08:19:42.829809+01:00[Europe/Paris]")

@Controller
@RequestMapping("${openapi.Upsto.base-path:/ds-api}")
public class DatasetApiController implements DatasetApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DatasetApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
