package org.example;

import org.example.mh.Member;
import org.example.mh.MemberDB;
import org.example.item.ItemDB;
import org.example.util.Login;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            MemberDB md = new MemberDB();
            ItemDB id = new ItemDB();
            while (true) {

                int select = 0;

                if(Login.member !=null && Login.getRole().equalsIgnoreCase("admin"))

                    select = PrintMenuAdmin();

                else
                    select = PrintMenu();

                if (select == 1) {
                    md.insert();

                } else if (select == 2) {
                    if (!Login.login) {
                        Member dbMember = md.login();
                        System.out.println("dbMember =" + dbMember);
                        if (dbMember != null) {
                            Login.login = true;
                            Login.member = dbMember;
                        }
                    } else {
                        System.out.println("이미 로그인하셨습니다.");
                    }

                }
                    else if(select== 3){
                        if(!Login.login){
                            System.out.println("로그인 하셔야 로그아웃 할 수 있습니다.");
                        }else{
                            Login.login = false;
                            Login.member = null;
                            System.out.println("로그아웃 하셨습니다.");
                        }
                    }
                else if (select == 7) {
                    System.out.println("종료됩니다");
                    System.exit(0);
                }
                 else if (select == 8 && Login.member !=null && Login.getRole().equalsIgnoreCase("admin")) {
                    try {
                        id.insert();
                        System.out.println("상품등록 완료되었습니다.");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        //user로 로그인 하면 상품 등록 x
        //admin으로 로그인하면 상품 등록 o
        public static int PrintMenu() {

            System.out.println("1번 회원가입");
            System.out.println("2번 로그인");
            System.out.println("3번 로그아웃");
            System.out.println("4번 물품보기");
            System.out.println("5번 장바구니");
            System.out.println("6번 주문목록");
            System.out.println("7번 종료");

            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();
            return menu;
        }

        public static int PrintMenuAdmin() {

            System.out.println("1번 회원가입");
            System.out.println("2번 로그인");
            System.out.println("3번 로그아웃");
            System.out.println("4번 물품보기");
            System.out.println("5번 장바구니");
            System.out.println("6번 주문목록");
            System.out.println("7번 종료");
            System.out.println("8번 상품등록");
            System.out.println("9번 회원목록");

            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();
            return menu;
        }
    }