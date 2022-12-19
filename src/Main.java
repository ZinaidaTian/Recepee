public class Main {
    public static void main(String[] args) {

        int eaters = 5; // ñêîëüêî ëþäåé áóäóò åñòü

        int water = 3000; // ìèëëèëèòðîâ âîäû
        int potatoes = 5; // êàðòîôåëèí
        int chicken = 6; // êóðèíûõ á¸äåð
        int spices = 10; // ëîæåê ñïåöèé

        System.out.println("Ñâàðèëè ñóï. Íà îäíîãî ÷åëîâåêà âûøëî:");
        System.out.println((water / eaters) + " ìèëëèëèòðîâ âîäû");
        System.out.println((potatoes / eaters) + " êàðòîôåëèí(à)");
        System.out.println((chicken / eaters) + " êóðèíûõ(îå) á¸äåð(ðî)");
        System.out.println((spices / eaters) + " ëîæåê(êà) ñïåöèé");

    }
}
