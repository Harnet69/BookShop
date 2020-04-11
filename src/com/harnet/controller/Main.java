package com.harnet.controller;

import com.harnet.model.Shop;

public class Main {

    public static void main(String[] args) {
        System.out.println(Shop.getInstance().getName());
        System.out.println(Shop.getInstance().getDescription());
    }
}
