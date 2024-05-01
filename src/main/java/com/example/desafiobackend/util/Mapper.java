package com.example.desafiobackend.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Mapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static <T> List<T> mapperList(List<?> objects, Class<T> dto) {
        return objects.stream()
                .map(o -> modelMapper.map(o, dto))
                .toList();
    }

    public static <T> T mapper(Object o, Class<T> dto) {
        return modelMapper.map(o, dto);
    }
}
