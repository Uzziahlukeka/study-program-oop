/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.propara;
import java.util.*;


/**
 *
 * @author Uzziah_Lukeka
 */
public class ProPara {

    public static void main(String[] args) {

        System.out.println("WELCOME TO OUR CINEMA , HERE DOWN FIND THE MOVIES");

        String[] movie = {"Naruto", "One piece red", "Kuroko's basket", "my hero academia"};
        List<Movies> movi;
        movi = new ArrayList<>();

        for (String movie1 : movie) {
            Movies z = new Movies();
            z.setmovie(movie1);
            movi.add(z);
        }
        for (Movies u : movi) {
            System.out.println(u.getmovie());
        }

        System.out.println("1 to 4 according to the presentation");
        System.out.println("SELECT YOUR MOVIE : ");

        Scanner uzh = new Scanner(System.in);
        int Mov = 0;
        boolean yth = true;

        while (yth) {
            try {
                do {
                    Mov = uzh.nextInt();
                    switch (Mov) {
                        case 1 -> System.out.println("you choose Naruto");
                        case 3 -> System.out.println("you choose Kuroko's basket");
                        case 4 -> System.out.println("you choose My hero academia");
                        case 2 -> System.out.println("you choose One piece red");
                        //default -> System.out.println("\033[31mSorry you type wrongly , please choose one of the movies up there and type the same name\033[0m");
                    }
                    if (Mov < 1 || Mov > 4) {
                        System.out.println(" please type correctly the number (from 1 to 4) ");
                    }
                    yth = false;
                } while (Mov < 1 || Mov > 4);
            } catch (InputMismatchException e) {
                System.out.print(" type a number according to the presentation : ");
                uzh.next();
            }
        }
        int number;
        Scanner lkk = new Scanner(System.in);
        System.out.println("Do you want to continue ? (press 1 for yes and 0 for no) : ");

        boolean bowa=true;
        while(bowa){
        try {
            number = lkk.nextInt();
            if (number == 1) {
                System.out.println("""
                        we have 3 kind of rooms we have VIP : we give you food , drink , table and you can choose you seat and it costs 150 pln 
                        we have Normal :we offert you drink , a table and you can choose your seat and it costs 100 pln 
                        our last option is Discount room : we don't offert you anything it costs 50""");

                System.out.println(" Choose 1 for VIP "
                        + "2 for Normal "
                        + "3 for discount");
                Vip vip = new Vip();
                Normal normal = new Normal();
                MovieRoom discount = new MovieRoom();
                Scanner choice = new Scanner(System.in);
                int choix;
                choix = 0;
                String color = "Blue";
                int chaise;
                boolean stop = true;
                while (stop) {
                    try {
                        choix = choice.nextInt();
                        Scanner choisir = new Scanner(System.in);
                        switch (choix) {
                            case 1 -> {
                                System.out.println("WELCOME TO OUR VIP ROOM!!");
                                vip.drinks();
                                vip.foods();
                                System.out.println("""
                                        Do you know where is your table ?
                                         press 1 for YES and 0 for NO""");
                                do {
                                    chaise = choisir.nextInt();
                                    switch (chaise) {
                                        case 0:
                                            vip.whereismytable();
                                        case 1:
                                            System.out.println("Thank you for your confirmation!");
                                            //default : System.out.println("Please choose 1 or 0 ");
                                            if (chaise < 0 || chaise > 1) {
                                                System.out.println("Please choose 1 or 0 ");
                                            }
                                    }
                                } while (chaise < 0 || chaise > 1);
                            }
                            case 2 -> {
                                System.out.println("""
                                        WELCOME TO OUR NORMAL ROOM
                                           We offert possibility to choose one drink among
                                           redbull , fanta and ice tea ___PLEASE TYPE YOUR DRINK___""");
                                Scanner boiss = new Scanner(System.in);
                                String boire;
                                boire = boiss.nextLine();
                                normal.drinks(boire);
                                normal.foods();
                                System.out.println("""
                                        Do you know where is your table ?
                                         press 1 for YES and 0 for NO""");
                                do {
                                    chaise = choisir.nextInt();
                                    switch (chaise) {
                                        case 1:
                                            System.out.println("Thank you for your confirmation!");
                                        case 0:
                                            normal.whereismytable();

                                            //default : System.out.println("Please choose 1 or 0 ");
                                            if (chaise < 0 || chaise > 1) {
                                                System.out.println("Please choose 1 or 0 ");
                                            }
                                    }
                                } while (chaise < 0 || chaise > 1);
                            }
                            case 3 -> {
                                System.out.println("WELCOME TO OUR DISCOUNT ROOM");
                                discount.seat();
                                discount.foods();
                                discount.buydrink();
                            }
                        }
                        stop = false;
                    } catch (InputMismatchException i) {
                        System.out.println("Please type number 1-3");
                        choice.next();
                    }
                }
                System.out.println("Do you want to continue Y / N ?");
                //Scanner oui = new Scanner(System.in);
                Scanner ji = new Scanner(System.in);
                char lol;
                boolean ath = true;

                while (ath) {
                    lol = ji.next().charAt(0);
                    if (lol == 'Y' || lol == 'y') {
                        Human per = new Human();
                        Scanner nom = new Scanner(System.in);
                        Scanner surnom = new Scanner(System.in);
                        System.out.println("Write your name");
                        String djina = nom.nextLine();
                        per.setname(djina);
                        System.out.println("Write your surname");
                        String nani = surnom.nextLine();
                        per.setsurname(nani);
                        System.out.println("WELCOME " + per.yourfullname());
                        System.out.println("""
                                please remember type room: 1. VIP=150pln  2. Normal=100pln 3.Discount=50 pln
                                Welcome,""" + per.yourfullname() + " you choose " + choix + " as your room Thank you for you choix");
                        System.out.println("Your ticket is for : ");
                        System.out.println(movi.get(Mov - 1).getmovie() + " type room : " + choix + " person's name " + per.yourname());
                        System.out.println("WELCOME AND HAVE FUN !!!");
                        ath = false;

                    } else if (lol == 'N' || lol == 'n') {
                        System.out.println("THANK YOU we hope to see you again !!");
                        ath = false;
                    } else {
                        System.out.println("Please type Y or N");
                    }
                    // yth = false;
                }
                bowa=false;
            } else if (number == 0) {
                System.out.println("We hope to see you again soon");
                bowa=false;
            } else {
                System.out.println("you type a character different of what presented to you Please choose 1 to CONTINUE and 0 to END ");
            }
        } catch (InputMismatchException e){
            System.out.println("please choose 1 to continue and 0 to end");
            lkk.next();
        }
        }
    }
}