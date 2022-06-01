package practicesectionthree;
import  javax.swing.JOptionPane;

public class PracticeSectionThree {
    
    public static void main(String[] args) {
        pemberiSalam();
        String nama = question1();
        int umur = question2()-10;
        String makanan = question3();
        String tempat = question4();
        String minuman = question5();
        double angka = question6();
        String hobi = question7();
        String hewan = question8();
        String warna = question9();
        String harapan = question10();
        
        
        JOptionPane.showMessageDialog(null, 
                "Di sebuah "+ tempat + ", hiduplah seorang yang miskin bernama " + nama + ". " + "\n" +
                "Dia hanya memiliki uang sebesar " + (int)(angka*1000+5000)/2 + " rupiah. \n" +
                "Pada suatu hari ia bertemu dengan seorang yang kaya. " + "\n" +
                "Orang itu memberikannya uang sebesar " + umur + " miliar. " + nama + "\n" +
                "pun menggunakannya untuk membeli banyak " + makanan + " dan " + minuman + ". \n" +
                "Tidak hanya itu, ia juga membeli rumah dengan warna " + warna + " dan binatang " + hewan + ". \n" +
                "Setelah memiliki semua itu, ia hanya melakukan hobinya yaitu " + hobi + " dan berjudi.\n" +
                "Akhirnya ia pun kembali miskin dan kehilangan segalanya. Dia pun menyesal dan memutukan untuk " + harapan);
        }
    
    public static String question10(){
        String myHope;
        myHope =(String)JOptionPane.showInputDialog(null, "Apa harapan anda?", "Question 10", 3);
        checkExitProgram(myHope);
        return myHope;
    }
    
    public static String question9(){
        String favColor;
        favColor = (String)JOptionPane.showInputDialog(null, "Apa warna kesukaan anda?", "Question 9", 3);
        checkExitProgram(favColor);
        return favColor;
    }
    
    public static String question8(){
       String favAnimal;
       favAnimal = (String)JOptionPane.showInputDialog(null, "Apa hewan kesukaan anda?", "Question 8", 3);
       checkExitProgram(favAnimal);
       return favAnimal;
    }
    
    public static String question7(){
        String myHobby;
        myHobby = (String)JOptionPane.showInputDialog(null, "Apa hobi anda?", "Question 7", 3);
        checkExitProgram(myHobby);
        return myHobby;
    }
    
    public static double question6(){
        String chooseNum;
        chooseNum = (String)JOptionPane.showInputDialog(null, "Pilih 1 atau 0", "Question 6", 3);
        checkExitProgram(chooseNum);
        return Double.parseDouble(chooseNum);
    }
    
    public static String question5(){
        String favThing;
        favThing = (String)JOptionPane.showInputDialog(null, "Minuman apa yang anda sukai?", "Question 5", 3);
        checkExitProgram(favThing);
        return favThing;
    }
    
    public static String question4(){
        String[] input = {"Kali", "Hutan", "Desa"};
        String favPlace;
        favPlace = String.valueOf(JOptionPane.showOptionDialog(null, "Pilih Salah Satu!", "Question 4", 0, 3, null, input, input[0]));
        if(favPlace.equals("1") || favPlace.equals("2")){
        } else {
            checkExitProgram(favPlace);
        }
        return input[Integer.parseInt(favPlace)];
    }
    
    public static String question3(){
        String favFood;
        favFood = (String)JOptionPane.showInputDialog(null, "Makanan Apa yang anda sukai?", "Question 3", 3);
        checkExitProgram(favFood);
        return favFood;
    }
    
    public  static int question2(){
        String myAge;
        myAge = JOptionPane.showInputDialog(null, "Berapa umur anda sekarang?", "Question 2", 3);   
        return Integer.parseInt(myAge);
    }
    
    public static String question1(){
        String myName;
        myName = (String)JOptionPane.showInputDialog(null, "Masukkan nama!", "Question 1", 3);
        checkExitProgram(myName);
        return myName;
    }
    
    public static void pemberiSalam(){
        String yesOrNo;
        yesOrNo = String.valueOf(JOptionPane.showConfirmDialog(null, "Hai! Selamat Datang di PENYESALAN TIADA TARA. Kamu memiliki 10 pertanyaan yang harus dijawab. Apakah kamu siap?", "Halo", 0, -1));
        checkExitProgram(yesOrNo);
    }
    
    public static void checkExitProgram(String a){
        if(a == null || a.equals("1") || a.equals("-1")){
            JOptionPane.showMessageDialog(null, "Semoga kamu kembali lagi!", "Yah, Kamu BERUNTUNG Sekali!", -1);
            System.exit(0);
        }
    }
    
}
