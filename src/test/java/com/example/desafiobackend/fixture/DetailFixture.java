package com.example.desafiobackend.fixture;

import com.example.desafiobackend.external.model.Detail;

public class DetailFixture {
    public static Detail detail() {
        Detail detail = new Detail();
        detail.setDirector("Irvin Kershner");
        detail.setProducer("Gary Kurtz, Rick McCallum");
        detail.setDuration("1h 50m");
        return detail;
    }
}
