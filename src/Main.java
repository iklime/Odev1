public class Main {
    public static void main(String[] args) {

        String[]names={"Kadir","Gökhan " ,"Hakan","Suzan","Pınar","Mehmet","Ali","Emel","Fırat","James",
                "Jale","Ersin","Deniz","Gözde","Anıl","Burak"};

        int[]degree ={341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};


        maraton  Maraton  = new maraton(degree,names);

        Maraton.sortNames();
        Maraton.birinci();
        Maraton.ikinci();
        Maraton.üçüncü();
        Maraton.rankNames();

    }
}
