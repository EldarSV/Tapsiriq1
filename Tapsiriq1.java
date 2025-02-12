import java.util.Scanner;

public class Tapsiriq1 {

    public static void main(String[] args) {

        //Məsələ 1:
        // İstifadəçidən iki ədəd alın və bu ədədlərin bir-birinə bərabər olub-olmamasını yoxlayın. Əgər bərabərsə,
        // "Ədədlər bərabərdir" mesajını, əks halda "Ədədlər bərabər deyil" mesajını yazdırın.
        //int num1=1;
        //int num2=2;
        //if (num1==num2) System.out.println("Ədədlər bərabərdir");
        //else System.out.println("Ədədlər bərabər deyil");

        //Məsələ 2:
        //Bir ədəd alın və həmin ədədin sadə, ya da mürəkkəb olduğunu yoxlayan bir proqram yazın.
       /* int num=9;
        int i=2;
        boolean flag=false;
         if (num<=1) flag=true;
         while (i<=num/2){
             if (num%i==0) {
                 flag = true;
                 break;
             }
             ++i;
             }
         if (!flag) System.out.println ("Sadə Ədəddir");
         else System.out.println ("Mürəkkəb Ədəddir");*/

        // Məsələ 3:
        //  Bir ədəd alın və həmin ədədin tək, ya da cüt olduğunu yoxlayan bir proqram yazın.
        /*int num=4;
        if (num%2==0) System.out.println ("Cüt Ədəddir");
        else System.out.println ("Tək Ədəddir");*/

        // Məsələ 4:
        // İstifadəçidən iki ədəd və bir əməliyyat işarəsi (+, -, *, /) alın. Bu əməliyyatı yerinə yetirin və nəticəni yazdırın.
        // Əgər istifadəçi səhv əməliyyat işarəsi daxil edərsə, "Yanlış əməliyyat" mesajını yazdırın.
       /* int num1=1;
        int num2=2;
        String emeliyyat="+";
        if (emeliyyat=="+") System.out.println (num1+num2);
        else if (emeliyyat=="-") System.out.println (num1-num2);
        else if (emeliyyat=="*") System.out.println (num1-num2);
        else if (emeliyyat=="/") System.out.println (num1/num2);
        else System.out.println ("Yanlış əməliyyat");*/

        // 2. switch-case:
        // Məsələ 1:
        // İstifadəçidən bir aylıq nömrə (1-12 arası) alın və həmin ayın adını (Yanvar, Fevral, və s.) ekrana yazdırın.

     /*  int nomre =5;
       switch (nomre){
           case 1:System.out.println ("yanvar");break;
           case 2:System.out.println ("fevral");break;
           case 3:System.out.println ("mart");break;
           case 4:System.out.println ("aprel");break;
           case 5:System.out.println ("may");break;
           case 6:System.out.println ("iyun");break;
           case 7:System.out.println ("iyul");break;
           case 8:System.out.println ("avqust");break;
           case 9:System.out.println ("sentyabr");break;
           case 10:System.out.println ("oktyabr");break;
           case 11:System.out.println ("noyabr");break;
           case 12:System.out.println ("dekabr");break;
       }*/

        //  Məsələ 2:
        //  İstifadəçidən bir məktub (A, B, C, D və s.) alın və
        //  bu məktubun qiymət dərəcəsini yazdırın (A-Əla, B-Yaxşı, C-Kafi, D-Zəif).
      /*  char nomre ='A';
        switch (nomre) {
            case 'A':
                System.out.println("Əla");
                break;
            case 'B':
                System.out.println("Çox yaxşı");
                break;
            case 'C':
                System.out.println("Yaxşı");
                break;
            case 'D':
                System.out.println("Orta");
                break;
            case 'E':
                System.out.println("Kafi");
                break;
            case 'F':
                System.out.println("Qeyri Kafi");
                break;
        }*/
        //  Məsələ 3:
        //  İstifadəçidən iki ədəd və bir əməliyyat işarəsi (+, -, *, /) alın.
        //  Bu əməliyyatı yerinə yetirin və nəticəni yazdırın. Əgər istifadəçi səhv əməliyyat işarəsi daxil edərsə,
        //  "Yanlış əməliyyat" mesajını yazdırın.
      /*  char emeliyyat ='+';
        int num1=1;
        int num2=2;
        switch (emeliyyat) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1*num2);
                break;
            default  :  System.out.println("Yanlış əməliyyat");
        }*/

        //3. for Dövrəsi:
        //Məsələ 1:
        // 1-dən 100-ə qədər olan bütün tək ədədləri ekrana yazdırın.
       /* for (int i=0;i<=100; i++) {
            if (i%2!=0) System.out.println(i);
        }*/

        // Məsələ 2:
        // İstifadəçidən bir ədəd alın və həmin ədədə qədər olan bütün ədədlərin cəmini hesablayan bir proqram yazın.
     /*  int a=15,cem=0;
        for (int i=0;i<a;i++){
            cem=cem+i;
        }
        System.out.println(cem);*/

        //Məsələ 3:
        //Bir ədəd alın və bu ədədə qədər olan bütün ədədlərin faktorialını hesablamaq üçün bir proqram yazın.
      /* int a=6,fact=1;
        for (int i=1;i<a;i++){
            fact=fact*i;
            System.out.println(i+"!="+fact);
        }*/

        // Məsələ 4:
        // İstifadəçidən bir ədəd alın və həmin ədədin hər bir rəqəmini ayrı-ayrılıqda ekrana yazdırın.
        // (Məsələn: 345 daxil edildikdə, 3, 4, 5 yazdırılmalıdır.)

       /* int a=893;
        for (int i=1;i<=String.valueOf(a).length();i++){
            System.out.println(String.valueOf(a).substring(i-1,i));
        }*/

        //  4. while Dövrəsi:
        //  Məsələ 1:
        //  İstifadəçidən bir ədəd alın və bu ədədin asal olub olmadığını yoxlayın. Əgər asal ədədirsə,
        //  "Asal ədəddir", əks halda "Asal ədəd deyil" mesajını yazdırın.
       /* int num=9;
        int i=2;
        boolean flag=false;
         if (num<=1) flag=true;
         while (i<=num/2){
             if (num%i==0) {
                 flag = true;
                 break;
             }
             ++i;
             }
         if (!flag) System.out.println ("Sadə Ədəddir");
         else System.out.println ("Mürəkkəb Ədəddir");*/

        //  Məsələ 2:
        //  İstifadəçidən bir ədəd alın və bu ədədə qədər olan bütün müsbət tam ədədlərin cəmini hesablayın.
        //  (0 daxil edilənə qədər davam etsin.)
/*        Scanner sc = new Scanner(System.in);
        int cem=0,i=0;
         while (true) {System.out.println("Reqem daxil edin");
             int num = sc.nextInt();
             if (num == 0) break;
             while (i < num) {
                 if (num > 0) cem = cem + i;
                 ++i;
             }
             System.out.println(cem);
             cem=0;
             i=0;
         }*/

        //  Məsələ 3:
        //  Kullanıcıdan bir ədəd alın və bu ədədin daxilindəki rəqəmlərin cəmini tapın.
        //  (Məsələn: 567 daxil edilərsə, 5+6+7 = 18 olacaq.)
    /* int a=893,cem=0;
        for (int i=1;i<=String.valueOf(a).length();i++){
            cem=cem+Integer.parseInt(String.valueOf(a).substring(i-1,i));
        }
        System.out.println(cem);*/

        //  Məsələ 4:
        //  Bir neçə ədəd daxil edin və bu ədədlərin cəmindən sonra onların ortalamasını hesablayan bir proqram yazın.
        //  İstifadəçi sıfır daxil edərək prosesi sonlandırsın.
      /*  Scanner sc = new Scanner(System.in);
        int cem = 0, avg = 0, i = 0;
        while (true)
        {
            System.out.println("Reqem daxil edin");
            int num = sc.nextInt();

            if (num == 0) break;
            i = i + 1;
            cem = cem + num;
        }
        avg = cem / i;
        System.out.println(avg);*/

        //  5. do-while Dövrəsi:
        //  Məsələ 1:
        //  İstifadəçidən bir şifrə daxil etməsini istəyin. Şifrə doğru daxil edilənə qədər bu prosesi təkrarlayın.
        //  Şifrə düzgün olduqda "Giriş uğurla tamamlandı" mesajını yazdırın.
       /* Scanner sc = new Scanner(System.in);
        String password = "Eldar";
        do {
            System.out.println("Parol daxil edin");
            if (sc.nextLine().equals(password)) {
                System.out.println("Giriş uğurla tamamlandı");
                break;
            }
        }
        while (!sc.nextLine().equals(password));*/

      //  Məsələ 2:
      //  İstifadəçidən bir ədəd daxil etməsini istəyin və bu ədədin kvadratını hesablamağa davam edin,
        //  amma daxil edilən ədəd 0 olduqda dövrə dayansın.
      /*  Scanner sc = new Scanner(System.in);
        int hesabla = 0;
        int num = 0;
        do {
            System.out.println("Reqem daxil edin");
            num=sc.nextInt();
            hesabla=num * num;
            System.out.println(hesabla);
            if (num==0) {
                break;
            }
        }
        while (num!=0);*/

       // Məsələ 3:
      //  İstifadəçidən ardıcıl olaraq ədədlər alın və bunların daxilindəki ən böyük ədədi tapın.
      //  İstifadəçi 0 daxil etdikdə dövrə dayansın.
      /*  Scanner sc = new Scanner(System.in);
        int enboyuk = Integer.MIN_VALUE;
        int num = 0;
        do {
            System.out.println("Reqem daxil edin");
            num=sc.nextInt();
           if(num>enboyuk) enboyuk=num;
            System.out.println("En boyuk reqem "+enboyuk);
            if (num==0) {
                break;
            }
        }
        while (true);*/

      //  Məsələ 4:
      //  Bir neçə ədəd daxil edin və bu ədədlərdən hansının ən kiçik olduğunu tapın.
          //      İstifadəçi sıfır daxil etdikdə dövrə dayansın.

     /*  Scanner sc = new Scanner(System.in);
        int enkicik = Integer.MAX_VALUE;
        int num = 0;
        do {
            System.out.println("Reqem daxil edin");
            num=sc.nextInt();
           if(num<enkicik) enkicik=num;
            System.out.println("En kicik reqem "+enkicik);
            if (num==0) {
                break;
            }
        }
        while (true);*/
    }
}
