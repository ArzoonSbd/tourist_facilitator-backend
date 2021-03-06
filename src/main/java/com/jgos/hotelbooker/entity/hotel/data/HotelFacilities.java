package com.jgos.hotelbooker.entity.hotel.data;



import javax.persistence.*;

@Entity
public class HotelFacilities {
    //Dining,Vending,Exercise,Recreation,SwimmingPool,Parking
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    @Column(nullable = false)
    private String name;

    public HotelFacilities() {
    }

    public HotelFacilities(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }


    @Override
    public String toString() {
        return "HotelFacilities{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
