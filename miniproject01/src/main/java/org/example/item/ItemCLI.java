package org.example.item;

import java.util.Scanner;

public class ItemCLI {
    public Item inputItem() {

        Scanner scan = new Scanner(System.in);
        System.out.println("상품이름을 입력하세요");
        String nm = scan.nextLine();
        System.out.println("상품설명을 입력하세요");
        String detail = scan.nextLine();
        System.out.println("상품 판매여부를 입력하세요");
        String sell_status = scan.nextLine();
        System.out.println("상품 가격을 입력하세요");
        int price = scan.nextInt();
        System.out.println("재고");
        int stock = scan.nextInt();

        return Item.builder()
                .item_nm(nm)
                .item_detail(detail)
                .item_sell_status(sell_status)
                .price(price)
                .stock_number(stock)
                .build();
    }
    }

