package com.restinit.restapitut;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    private List<HotelBooking> bookings;

    public BookingController() {

        bookings = new ArrayList<>();

        bookings.add(new HotelBooking("Marriot", 200.33, 3));
        bookings.add(new HotelBooking("Radisson", 11.22, 2));
        bookings.add(new HotelBooking("Bonvoy", 11, 1));

    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<HotelBooking> getAll() {
        return bookings;
    }
}
