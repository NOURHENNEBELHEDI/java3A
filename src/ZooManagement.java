import java.util.Scanner;

public class ZooManagement {

        int nbrCages = 20;
        String zooName = "myZoo";

        public static void main(String[] args) {
            //Instruction 1
            ZooManagement zm = new ZooManagement();
            System.out.println(zm.zooName + " comporte " + zm.nbrCages);
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez saisir le nombre de cages souhaité:");
            int nbrCagesSaisie = sc.nextInt();
            ZooManagement zm1 = new ZooManagement();
            zm1.nbrCages = nbrCagesSaisie;
}
    }


