package com.example.desafiobackend.fixture;

import com.example.desafiobackend.entrypoint.controller.response.DetailResponse;

public class DetailResponseFixture {
    public static DetailResponse detailResponse() {
        DetailResponse detailResponse = new DetailResponse();
        detailResponse.setDirector("Irvin Kershner");
        detailResponse.setProducer("Gary Kurtz, Rick McCallum");
        detailResponse.setDuration("1h 50m");
        return detailResponse;
    }
}
