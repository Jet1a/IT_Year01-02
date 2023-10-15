package objJet;

public class Obj016 {
    private static String id016;
    private String nameJet;
    private double value016;


    public Obj016(String id016, String nameJet, double value016) {
        this.nameJet = nameJet;
        this.value016 = value016;
        this.id016 = id016;
    }

    public static String getId016() {
        return id016;
    }

    public static void setId016(String id016) {
        Obj016.id016 = id016;
    }

    public String getNameJet() {
        return nameJet;
    }

    public void setNameJet(String nameJet) {
        this.nameJet = nameJet;
    }

    public double getValue016() {
        return value016;
    }

    public void setValue016(double value016) {
        this.value016 = value016;
    }

    @Override
    public String toString() {
        return "Obj016{" +
                "id016= " + id016 +
                "nameJet='" + nameJet + '\'' +
                ", value016=" + value016 +
                '}';
    }

    public static int compare(Obj016 o1, Obj016 o2) {
        if (o1.getValue016() == o2.getValue016()) return 0;
        if (o1.getValue016() < o2.getValue016()) return -1;
        return 1;
    }

    public boolean isGreaterThan(Obj016 o) {
        if (o.getValue016() < value016) {
            return true;
        } else return false;
    }
}
