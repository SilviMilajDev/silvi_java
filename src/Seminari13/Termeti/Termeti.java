package Seminari13.Termeti;

public class Termeti
{
    private double magnituda;

    Termeti(double magnituda) {
        this.magnituda = magnituda;
    }

    public double getMagnituda() {
        return magnituda;
    }

    public String getDescription() {
        if (magnituda >= 8.0)
            return "Most Structures fall";

        if (magnituda >= 7.0)
            return "Many buildings destroyed";

        if (magnituda >= 6.0)
            return "Many buildings considerably damaged, some collapsed";

        if (magnituda >= 4.5)
            return "Damage to partly constructed buildings";

        if (magnituda >= 3.5)
            return "Felt by many people, no destruction";

        if (magnituda >= 0)
            return "Generally not felt by people";

        return "Negative numbers are not valid";
    }
}
