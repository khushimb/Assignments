class Runner13{
public static void main(String[] args)
{ 
 Train train1 = new Train();
        Train train2 = new Train();
        Train train3 = new Train();
        Train train4 = new Train();
        Train train5 = new Train();

        train1.name = "Bullet Train"; train1.speed = 300; train1.capacity = 600; train1.electric = true;
        train2.name = "Metro"; train2.speed = 100; train2.capacity = 1000; train2.electric = true;
        train3.name = "Freight Train"; train3.speed = 80; train3.capacity = 5000; train3.electric = false;
        train4.name = "Passenger Train"; train4.speed = 120; train4.capacity = 800; train4.electric = false;
        train5.name = "Maglev"; train5.speed = 500; train5.capacity = 700; train5.electric = true;

        System.out.println("Train 1: " + train1.name + ", Speed: " + train1.speed + " km/h, Capacity: " + train1.capacity + ", Electric: " + train1.electric);
        System.out.println("Train 2: " + train2.name + ", Speed: " + train2.speed + " km/h, Capacity: " + train2.capacity + ", Electric: " + train2.electric);
        System.out.println("Train 3: " + train3.name + ", Speed: " + train3.speed + " km/h, Capacity: " + train3.capacity + ", Electric: " + train3.electric);
        System.out.println("Train 4: " + train4.name + ", Speed: " + train4.speed + " km/h, Capacity: " + train4.capacity + ", Electric: " + train4.electric);
        System.out.println("Train 5: " + train5.name + ", Speed: " + train5.speed + " km/h, Capacity: " + train5.capacity + ", Electric: " + train5.electric);
}
}