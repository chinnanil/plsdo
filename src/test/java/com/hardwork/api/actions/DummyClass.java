package com.hardwork.api.actions;

public class DummyClass {
    public static void main(String[] args) {
        // System.out.println(new SignUpApi().fetchRegisterNonceValue());
// System.out.println(new SignUpApi().register());
// System.out.println(new SignUpApi().getCookies());
SignUpApi register =new SignUpApi();
register.register();
System.out.println(new CartApi(register.getCookies()).addToCart());
    }
     
}
