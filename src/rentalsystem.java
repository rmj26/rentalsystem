public class rentalsystem {

    public static void main (String [] args)
    {
        rent rawalpindi = new rent(5, 11,250,12);
        rent islamabad = new rent (4,8,300,12);
        System.out.println("Average rent for rawalpindi is \t" + rawalpindi.averagerent());
        System.out.println("Average rent for islamabad is \t" + islamabad.averagerent());
        System.out.println("Total rent for rawlapind is \t" + rawalpindi.totalrent());
        System.out.println("Total rent for islamabad is \t" + islamabad.totalrent());
        System.out.println("Average expected for rawalpindi is \t"+rawalpindi.difference() );
        System.out.println("Average expected for islamabad is \t" + islamabad.difference());


    }
}

class rent {
    int room;
    int occupants;
    double rentz;
    double rent_value;

    rent( int rm, int occ, double rnt, double rcyle )
    {
        room=rm;
        occupants=occ;
        rentz=rnt;
        rent_value=rcyle;

    }

     double totalrent()
     {
         double totalrent=room*rentz;
         return totalrent;
     }
    double averagerent ( )
    {
        double averagerent=totalrent()/occupants;
        return averagerent;
    }

    double difference ( )
    {
        double difference=totalrent()/averagerent();
        return difference;

    }
}