package com.sandesh.kinmel.formatter;

import com.sandesh.kinmel.model.Authority;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AuthorityStringToListFormatter implements Converter <String, List<Authority>> {
    @Override
    public List<Authority> convert(String role) {
        return Arrays.asList(new Authority(role));
    }
}
