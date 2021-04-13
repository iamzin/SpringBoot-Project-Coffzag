package com.mini.coffzag.response;

import com.mini.coffzag.entity.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class ReturnProduct {
    private boolean ok;
    private List<Product> results = new ArrayList<>();
}