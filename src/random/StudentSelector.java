package random;

public class StudentSelector {
    public static void main(String[] args) {
        String[] students = {
                "Abdallah",
                "Abdul R.",
                "Ahmet A.",
                "Ahmet K.",
                "Aileen",
                "Aika",
                "Alex",
                "Alexis",
                "Ali",
                "Alma",
                "Amal",
                "Anastasiya",
                "Anatolii",
                "Andre",
                "Andrii",
                "Ashraf",
                "Ayah",
                "Bajis",
                "Bashar",
                "Beyza",
                "Branko",
                "Burim",
                "Christina",
                "Dwayne",
                "Emily",
                "Engin",
                "Eren",
                "Erkan",
                "Filiz",
                "Hadi",
                "Hamza",
                "Hazal",
                "Ibrahim E.",
                "Ibrahim O.",
                "Ibrahim T.",
                "Ipek",
                "Islomjon",
                "Jeremiah",
                "Kyial",
                "Malek",
                "Marko",
                "Mehmet",
                "Merve",
                "Mihail",
                "Milena",
                "Mohammad",
                "Mouayed",
                "Newer",
                "Nuriia",
                "Olena",
                "Othman",
                "Ozan",
                "Ozge",
                "Pinar",
                "Regina",
                "Saeed",
                "Saltanat",
                "Samir",
                "Selda",
                "Seyma",
                "Seymur",
                "Suzanne",
                "Tamara",
                "Valentyna",
                "Viktoriya L.",
                "Viktoriia M.",
                "Vladyslav",
                "Yetkin",
                "Yildiz",
                "Yoanna",
                "Yousef"
        };

        System.out.println("The lucky student is = " + students[(int) (Math.random() * 71)].toUpperCase());
    }
}